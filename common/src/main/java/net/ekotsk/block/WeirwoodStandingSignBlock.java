package net.ekotsk.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WeirwoodStandingSignBlock extends StandingSignBlock {
    public WeirwoodStandingSignBlock(WoodType woodType, Properties properties) {
        super(woodType, properties);
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WeirwoodSignBlockEntity(pos, state);
    }
}

