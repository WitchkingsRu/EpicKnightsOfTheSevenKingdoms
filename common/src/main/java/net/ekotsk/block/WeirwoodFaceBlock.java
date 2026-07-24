package net.ekotsk.block;

import net.ekotsk.misc.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext; // <-- Добавлен импорт
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class WeirwoodFaceBlock extends RotatedPillarBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WeirwoodFaceBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        builder.add(AXIS, FACING);
    }

    // === ДОБАВЛЕННЫЙ МЕТОД ДЛЯ АВТОМАТИЧЕСКОГО ПОВОРОТА ===
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // 1. Определяем ось бревна на основе грани, по которой кликнул игрок
        Direction.Axis axis = context.getClickedFace().getAxis();

        // 2. Определяем направление взгляда игрока по горизонтали и берем противоположное,
        // чтобы лицо блока смотрело НА игрока, а не туда, куда смотрит игрок.
        Direction faceDirection = context.getHorizontalDirection().getOpposite();

        // 3. Возвращаем итоговое состояние блока
        return this.defaultBlockState()
                .setValue(AXIS, axis)
                .setValue(FACING, faceDirection);
    }
    // ========================================================

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!level.isClientSide()) return;

        Direction faceSide = state.getValue(FACING);
        spawnFaceParticles(level, pos, faceSide, random);
    }

    private void spawnFaceParticles(Level level, BlockPos pos, Direction faceSide, RandomSource random) {
        int count = 1 + random.nextInt(2);

        for (int i = 0; i < count; i++) {
            double x = pos.getX() + 0.5;
            double y = pos.getY() + 0.5;
            double z = pos.getZ() + 0.5;

            double offsetX = faceSide.getStepX() * 0.55;
            double offsetY = faceSide.getStepY() * 0.55;
            double offsetZ = faceSide.getStepZ() * 0.55;

            x += offsetX + (random.nextDouble() - 0.5) * 0.4;
            y += offsetY + (random.nextDouble() - 0.5) * 0.4;
            z += offsetZ + (random.nextDouble() - 0.5) * 0.4;

            double vx = (random.nextDouble() - 0.5) * 0.02;
            double vy = -0.05 - random.nextDouble() * 0.03;
            double vz = (random.nextDouble() - 0.5) * 0.02;

            level.addParticle(ModParticles.WEIRWOOD_SAP.get(), x, y, z, vx, vy, vz);
        }
    }
}