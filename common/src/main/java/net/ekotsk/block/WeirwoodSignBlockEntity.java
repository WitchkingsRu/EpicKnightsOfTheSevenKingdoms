package net.ekotsk.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WeirwoodSignBlockEntity extends SignBlockEntity {
    public WeirwoodSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }
    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.WEIRWOOD_SIGN.get();
    }
}
