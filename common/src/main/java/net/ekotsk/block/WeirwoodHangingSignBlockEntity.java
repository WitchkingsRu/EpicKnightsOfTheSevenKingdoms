package net.ekotsk.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WeirwoodHangingSignBlockEntity extends HangingSignBlockEntity {
    public WeirwoodHangingSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }
    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.WEIRWOOD_HANGING_SIGN.get();
    }
}
