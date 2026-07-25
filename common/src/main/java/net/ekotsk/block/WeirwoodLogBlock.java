package net.ekotsk.block;

import net.ekotsk.misc.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;

public class WeirwoodLogBlock extends RotatedPillarBlock {

    public static final IntegerProperty CARVINGS = IntegerProperty.create("carvings", 0, 4);
    public static final EnumProperty<Direction> LAST_HIT_SIDE = EnumProperty.create("last_hit_side", Direction.class);

    public WeirwoodLogBlock(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any()
                .setValue(CARVINGS, 0)
                .setValue(LAST_HIT_SIDE, Direction.UP)
                .setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CARVINGS, LAST_HIT_SIDE, AXIS);
    }
    @Override
    public SoundType getSoundType(BlockState state) {
        return SoundType.WOOD;
    }
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {

        ItemStack stack = player.getItemInHand(hand);

        if (stack.getItem() instanceof SwordItem) {
            if (level.isClientSide()) return InteractionResult.SUCCESS;
            int carvings = state.getValue(CARVINGS);
            if (carvings < 4) {
                Direction hitSide = hit.getDirection();

                if (hitSide.getAxis() == Direction.Axis.Y) {
                    return InteractionResult.PASS;
                }

                Direction carvingSide;
                if (carvings == 0) {
                    carvingSide = hitSide;
                } else {
                    carvingSide = state.getValue(LAST_HIT_SIDE);
                }

                BlockState newState = state
                        .setValue(CARVINGS, carvings + 1)
                        .setValue(LAST_HIT_SIDE, carvingSide);

                level.setBlock(pos, newState, 3);
                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
                level.playSound(null, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);

                spawnActiveCarvingParticles(level, pos, carvingSide, player, level.getRandom());

                return InteractionResult.CONSUME;
            }
        }
        return InteractionResult.PASS;
    }

    public static void spawnActiveCarvingParticles(Level level, BlockPos pos, Direction hitSide,
                                                   Player player, RandomSource random) {
        if (!level.isClientSide()) return;

        int count = 8 + random.nextInt(5);
        for (int i = 0; i < count; i++) {
            double x = pos.getX() + 0.5;
            double y = pos.getY() + 0.5;
            double z = pos.getZ() + 0.5;

            double offsetX = hitSide.getStepX() * 0.6;
            double offsetY = hitSide.getStepY() * 0.6;
            double offsetZ = hitSide.getStepZ() * 0.6;

            x += offsetX + (random.nextDouble() - 0.5) * 0.3;
            y += offsetY + (random.nextDouble() - 0.5) * 0.3;
            z += offsetZ + (random.nextDouble() - 0.5) * 0.3;

            double dx = player.getX() - x;
            double dy = player.getY() + 1.5 - y;
            double dz = player.getZ() - z;

            double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
            double speed = 0.15 + random.nextDouble() * 0.1;

            double vx = (dx / distance) * speed;
            double vy = (dy / distance) * speed;
            double vz = (dz / distance) * speed;

            level.addParticle(ModParticles.WEIRWOOD_SAP.get(), x, y, z, vx, vy, vz);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!level.isClientSide()) return;

        if (state.getValue(AXIS) != Direction.Axis.Y) return;

        int carvings = state.getValue(CARVINGS);
        if (carvings == 0) return;

        if (random.nextInt(3) == 0) {
            Direction lastHitSide = state.getValue(LAST_HIT_SIDE);
            spawnPassiveCarvingParticles(level, pos, lastHitSide, random);
        }
    }

    public static void spawnPassiveCarvingParticles(Level level, BlockPos pos, Direction side, RandomSource random) {
        if (!level.isClientSide()) return;

        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.5;
        double z = pos.getZ() + 0.5;

        double offsetX = side.getStepX() * 0.55;
        double offsetY = side.getStepY() * 0.55;
        double offsetZ = side.getStepZ() * 0.55;

        x += offsetX + (random.nextDouble() - 0.5) * 0.4;
        y += offsetY + (random.nextDouble() - 0.5) * 0.4;
        z += offsetZ + (random.nextDouble() - 0.5) * 0.4;

        double vx = (random.nextDouble() - 0.5) * 0.02;
        double vy = -0.05 - random.nextDouble() * 0.03;
        double vz = (random.nextDouble() - 0.5) * 0.02;

        level.addParticle(ModParticles.WEIRWOOD_SAP.get(), x, y, z, vx, vy, vz);
    }
}
