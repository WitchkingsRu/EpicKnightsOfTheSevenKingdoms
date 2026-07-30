package net.ekotsk.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WeirwoodHangingSignBlockEntity extends SignBlockEntity {
    private static final int MAX_TEXT_LINE_WIDTH = 60;
    private static final int TEXT_LINE_HEIGHT = 9;
    public WeirwoodHangingSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.WEIRWOOD_HANGING_SIGN.get(), blockPos, blockState);
    }
    public int getTextLineHeight() {
        return 9;
    }

    public int getMaxTextLineWidth() {
        return 60;
    }

    public SoundEvent getSignInteractionFailedSoundEvent() {
        return SoundEvents.WAXED_HANGING_SIGN_INTERACT_FAIL;
    }
    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.WEIRWOOD_HANGING_SIGN.get();
    }
}

