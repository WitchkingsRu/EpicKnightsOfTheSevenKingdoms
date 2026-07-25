package net.ekotsk.worldgen;

import com.mojang.serialization.Codec;
import net.ekotsk.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.ekotsk.block.WeirwoodFaceBlock;

import java.util.ArrayList;
import java.util.List;

public class WeirwoodTreeFeature extends Feature<TreeConfiguration> {

    private static final Direction[] HORIZONTAL_DIRECTIONS = {
            Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST
    };

    public WeirwoodTreeFeature(Codec<TreeConfiguration> codec) {
        super(TreeConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
        LevelAccessor level = context.level();
        RandomSource random = context.random();
        BlockPos origin = context.origin();
        TreeConfiguration config = context.config();

        if (!level.getBlockState(origin.below()).is(net.minecraft.tags.BlockTags.DIRT)) {
            return false;
        }

        List<BlockPos> mainTrunkPositions = new ArrayList<>();
        List<BlockPos> branchEndPositions = new ArrayList<>();

        generateTrunkAndBranches(level, origin, random, config, mainTrunkPositions, branchEndPositions);
        if (mainTrunkPositions.isEmpty()) return false;

        generateRoots(level, origin, random, config);

        generateFoliage(level, mainTrunkPositions, random, config, 4);

        for (BlockPos branchEnd : branchEndPositions) {
            generateFoliageAroundPoint(level, branchEnd, random, config, 2);
        }

        if (random.nextFloat() < 0.20f) {
            addFaceToTrunk(level, mainTrunkPositions, random, origin);
        }

        return true;
    }

    private void generateTrunkAndBranches(LevelAccessor level, BlockPos origin, RandomSource random,
                                          TreeConfiguration config, List<BlockPos> mainTrunk, List<BlockPos> branchEnds) {
        int height = 7 + random.nextInt(4);

        for (int y = 0; y < height; y++) {
            BlockPos blockPos = origin.above(y);
            if (canPlaceLog(level, blockPos, config)) {
                setBlock(level, blockPos, config.trunkProvider.getState(random, blockPos));
                mainTrunk.add(blockPos);
            }

            if (y >= 4 && random.nextFloat() < 0.5f) {
                Direction branchDir = HORIZONTAL_DIRECTIONS[random.nextInt(4)];
                int branchLength = 2 + random.nextInt(3);
                int currentYOffset = 0;

                BlockPos lastBranchPos = blockPos;

                for (int b = 1; b <= branchLength; b++) {
                    if (random.nextFloat() < 0.65f) {
                        currentYOffset++;
                    }

                    BlockPos branchPos = blockPos.relative(branchDir, b).above(currentYOffset);

                    if (canPlaceLog(level, branchPos, config)) {
                        BlockState logState = config.trunkProvider.getState(random, branchPos);
                        if (logState.hasProperty(RotatedPillarBlock.AXIS)) {
                            logState = logState.setValue(RotatedPillarBlock.AXIS, branchDir.getAxis());
                        }
                        setBlock(level, branchPos, logState);
                        lastBranchPos = branchPos;
                    }
                }

                branchEnds.add(lastBranchPos);
            }
        }
    }

    private void generateRoots(LevelAccessor level, BlockPos origin, RandomSource random, TreeConfiguration config) {
        for (Direction rootDir : HORIZONTAL_DIRECTIONS) {
            if (random.nextFloat() < 0.7f) {
                int rootLength = 1 + random.nextInt(2);

                BlockPos currentRoot = origin.relative(rootDir);

                if (canPlaceLog(level, currentRoot, config)) {
                    BlockState logState = config.trunkProvider.getState(random, currentRoot);
                    if (logState.hasProperty(RotatedPillarBlock.AXIS)) {
                        logState = logState.setValue(RotatedPillarBlock.AXIS, rootDir.getAxis());
                    }
                    setBlock(level, currentRoot, logState);
                }

                for (int r = 1; r < rootLength; r++) {
                    currentRoot = currentRoot.relative(rootDir).below();

                    if (canPlaceLog(level, currentRoot, config)) {
                        BlockState logState = config.trunkProvider.getState(random, currentRoot);
                        if (logState.hasProperty(RotatedPillarBlock.AXIS)) {
                            logState = logState.setValue(RotatedPillarBlock.AXIS, rootDir.getAxis());
                        }
                        setBlock(level, currentRoot, logState);
                    }
                }
            }
        }
    }

    private void generateFoliage(LevelAccessor level, List<BlockPos> mainTrunkPositions, RandomSource random,
                                 TreeConfiguration config, int radius) {
        if (mainTrunkPositions.isEmpty()) return;

        BlockPos topPos = mainTrunkPositions.stream()
                .max((a, b) -> Integer.compare(a.getY(), b.getY()))
                .orElse(mainTrunkPositions.get(0))
                .below(1);

        for (int x = -radius; x <= radius; x++) {
            for (int y = -2; y <= 2; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos leafPos = topPos.offset(x, y, z);

                    double distance = Math.sqrt(x * x + y * y + z * z);

                    if (distance > radius + 0.5) continue;

                    if (!canPlaceLeaf(level, leafPos, config)) continue;

                    float chance;
                    if (distance < radius * 0.6) {
                        chance = 1.0f;
                    } else if (distance < radius * 0.85) {
                        chance = 0.85f;
                    } else {
                        chance = 0.75f;
                    }

                    if (random.nextFloat() < chance) {
                        placeLeaf(level, leafPos, random, config);
                    }
                }
            }
        }
    }

    private void generateFoliageAroundPoint(LevelAccessor level, BlockPos center, RandomSource random,
                                            TreeConfiguration config, int radius) {
        for (int x = -radius; x <= radius; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos leafPos = center.offset(x, y, z);

                    double distance = Math.sqrt(x * x + y * y + z * z);

                    if (distance > radius + 0.3) continue;

                    if (!canPlaceLeaf(level, leafPos, config)) continue;

                    float chance;
                    if (distance < radius * 0.5) {
                        chance = 1.0f;
                    } else if (distance < radius * 0.8) {
                        chance = 0.85f;
                    } else {
                        chance = 0.65f;
                    }

                    if (random.nextFloat() < chance) {
                        placeLeaf(level, leafPos, random, config);
                    }
                }
            }
        }
    }

    private boolean canPlaceLeaf(LevelAccessor level, BlockPos pos, TreeConfiguration config) {
        BlockState currentState = level.getBlockState(pos);
        if (currentState.is(config.trunkProvider.getState(level.getRandom(), pos).getBlock())) return false;
        if (currentState.is(config.foliageProvider.getState(level.getRandom(), pos).getBlock())) return false;
        return currentState.canBeReplaced();
    }

    private void placeLeaf(LevelAccessor level, BlockPos pos, RandomSource random, TreeConfiguration config) {
        BlockState leafState = config.foliageProvider.getState(random, pos);

        if (leafState.hasProperty(LeavesBlock.PERSISTENT)) {
            leafState = leafState.setValue(LeavesBlock.PERSISTENT, true);
        }

        setBlock(level, pos, leafState);
    }

    private void addFaceToTrunk(LevelAccessor level, List<BlockPos> mainTrunkPositions, RandomSource random, BlockPos origin) {
        List<BlockPos> validTrunkBlocks = new ArrayList<>();
        for (BlockPos pos : mainTrunkPositions) {
            if (pos.getY() > origin.getY() + 1 && pos.getY() < origin.getY() + 3) {
                validTrunkBlocks.add(pos);
            }
        }

        if (validTrunkBlocks.isEmpty()) return;

        BlockPos targetPos = validTrunkBlocks.get(random.nextInt(validTrunkBlocks.size()));
        Direction facing = HORIZONTAL_DIRECTIONS[random.nextInt(4)];

        Block chosenFaceBlock = random.nextBoolean() ? ModBlocks.WEIRWOOD_FACE_HAPPY.get() : ModBlocks.WEIRWOOD_FACE_GRIM.get();
        setBlock(level, targetPos, chosenFaceBlock.defaultBlockState().setValue(WeirwoodFaceBlock.FACING, facing));
    }

    private boolean canPlaceLog(LevelAccessor level, BlockPos pos, TreeConfiguration config) {
        BlockState state = level.getBlockState(pos);
        return state.canBeReplaced() || state.is(config.trunkProvider.getState(level.getRandom(), pos).getBlock());
    }

    private void setBlock(LevelAccessor level, BlockPos pos, BlockState state) {
        level.setBlock(pos, state, 3);
    }
}