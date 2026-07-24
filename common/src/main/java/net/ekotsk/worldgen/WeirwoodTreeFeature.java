package net.ekotsk.worldgen; // Твой пакет

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.ekotsk.block.ModBlocks;
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

        // Проверяем землю
        if (!level.getBlockState(origin.below()).is(net.minecraft.tags.BlockTags.DIRT)) {
            return false;
        }

        List<BlockPos> trunkPositions = generateTrunk(level, origin, random, config);
        if (trunkPositions.isEmpty()) return false;

        generateFoliage(level, trunkPositions, random, config);

        // 15% шанс спавна лика на дереве
        if (random.nextFloat() < 0.15f) {
            addFaceToTrunk(level, trunkPositions, random, origin);
        }

        return true;
    }

    private List<BlockPos> generateTrunk(LevelAccessor level, BlockPos origin, RandomSource random, TreeConfiguration config) {
        List<BlockPos> trunkPositions = new ArrayList<>();

        // Высота дерева: 7-9 блоков (выше и массивнее)
        int height = 7 + random.nextInt(3);
        BlockPos currentPos = origin;

        for (int i = 0; i < height; i++) {
            // Первые 2 блока высоты делаем толстыми (2x2)
            if (i < 2) {
                placeThickLogLayer(level, currentPos, config, trunkPositions, random); // <-- ДОБАВИЛИ random
            } else {
                // Выше ствол идет вверх. Шанс изгиба снижен до 5% (почти прямое дерево)
                if (random.nextFloat() < 0.05f) {
                    Direction bend = HORIZONTAL_DIRECTIONS[random.nextInt(4)];
                    currentPos = currentPos.relative(bend);
                }

                if (canPlaceLog(level, currentPos, config)) {
                    setBlock(level, currentPos, config.trunkProvider.getState(random, currentPos));
                    trunkPositions.add(currentPos);
                } else {
                    break;
                }
            }
            currentPos = currentPos.above();
        }
        return trunkPositions;
    }

    private void placeThickLogLayer(LevelAccessor level, BlockPos pos, TreeConfiguration config,
                                    List<BlockPos> trunkPositions, RandomSource random) {
        // Ставим квадрат 2x2 из бревен
        for (int x = 0; x <= 1; x++) {
            for (int z = 0; z <= 1; z++) {
                BlockPos blockPos = pos.offset(x, 0, z);
                if (canPlaceLog(level, blockPos, config)) {
                    setBlock(level, blockPos, config.trunkProvider.getState(random, blockPos));
                    trunkPositions.add(blockPos);
                }
            }
        }
    }

    private void generateFoliage(LevelAccessor level, List<BlockPos> trunkPositions, RandomSource random, TreeConfiguration config) {
        if (trunkPositions.isEmpty()) return;

        // Берем верхнюю точку ствола
        BlockPos topPos = trunkPositions.get(trunkPositions.size() - 1);

        // Листва стала гуще и шире (радиус 3-4 блока)
        int radius = 3 + random.nextInt(2);

        for (int x = -radius; x <= radius; x++) {
            for (int y = -1; y <= 2; y++) { // Чуть выше в высоту
                for (int z = -radius; z <= radius; z++) {
                    BlockPos leafPos = topPos.offset(x, y, z);
                    double distance = Math.sqrt(x * x + y * y + z * z);

                    if (distance > radius + 0.5) continue;

                    // Не заменяем бревна листвой
                    if (level.getBlockState(leafPos).is(config.trunkProvider.getState(random, leafPos).getBlock())) continue;

                    // Чем ближе к центру, тем выше шанс появления листа
                    float chance = (float) (1.0 - (distance / (radius + 1.0)));
                    if (random.nextFloat() < chance) {
                        if (level.getBlockState(leafPos).canBeReplaced()) {
                            setBlock(level, leafPos, config.foliageProvider.getState(random, leafPos));
                        }
                    }
                }
            }
        }
    }

    private void addFaceToTrunk(LevelAccessor level, List<BlockPos> trunkPositions, RandomSource random, BlockPos origin) {
        // Ищем блоки ствола, которые находятся НЕ в основании (чтобы не ломать 2x2) и НЕ на самой верхушке
        List<BlockPos> validTrunkBlocks = new ArrayList<>();
        for (BlockPos pos : trunkPositions) {
            if (pos.getY() > origin.getY() + 1 && pos.getY() < origin.getY() + 5) {
                validTrunkBlocks.add(pos);
            }
        }

        if (validTrunkBlocks.isEmpty()) return;

        // Выбираем случайный подходящий блок ствола
        BlockPos targetPos = validTrunkBlocks.get(random.nextInt(validTrunkBlocks.size()));
        Direction facing = HORIZONTAL_DIRECTIONS[random.nextInt(4)];

        // ВАЖНО: Мы ЗАМЕНЯЕМ блок бревна на блок с ликом.
        // Так лик будет выглядеть как часть ствола, а не как висящий сбоку блок.
        setBlock(level, targetPos, ModBlocks.WEIRWOOD_FACE_GRIM.get().defaultBlockState().setValue(WeirwoodFaceBlock.FACING, facing));
    }

    private boolean canPlaceLog(LevelAccessor level, BlockPos pos, TreeConfiguration config) {
        BlockState state = level.getBlockState(pos);
        return state.canBeReplaced() || state.is(config.trunkProvider.getState(level.getRandom(), pos).getBlock());
    }
}