package net.ekotsk.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WeirwoodCeilingHangingSignBlock extends CeilingHangingSignBlock {
    public WeirwoodCeilingHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WeirwoodHangingSignBlockEntity(pos, state);
    }
}
