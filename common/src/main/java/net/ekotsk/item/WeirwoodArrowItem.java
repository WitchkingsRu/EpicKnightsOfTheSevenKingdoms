package net.ekotsk.item;

import net.ekotsk.entity.WeirwoodArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WeirwoodArrowItem extends Item {

    public WeirwoodArrowItem(Properties properties) {
        super(properties);
    }

    public WeirwoodArrowEntity createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        WeirwoodArrowEntity arrow = new WeirwoodArrowEntity(level, livingEntity);
        arrow.setEffectsFromItem(itemStack);
        return arrow;
    }
}
