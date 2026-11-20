package net.ekotsk.block;

import net.ekotsk.recipe.ModRecipes;
import net.ekotsk.screen.QohorySmelteryMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class QohorySmelteryBlockEntity extends AbstractFurnaceBlockEntity {
    public QohorySmelteryBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.QOHORY_SMELTERY_ENTITY.get(), blockPos, blockState, ModRecipes.QOHORY_SMELTERY_RECIPE.get());
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.ekotsk.qohory_smeltery");
    }
    @Override
    protected int getBurnDuration(ItemStack itemStack) {
        return super.getBurnDuration(itemStack) / 3;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.ekotsk.qohory_smeltery");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new QohorySmelteryMenu(i, inventory, this, this.dataAccess);
    }


}
