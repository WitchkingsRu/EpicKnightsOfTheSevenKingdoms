package net.ekotsk.item;

import net.ekotsk.entity.WeirwoodArrowEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class WeirwoodArrowItem extends ArrowItem {

    public WeirwoodArrowItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity, @Nullable ItemStack itemStack2) {
        return new WeirwoodArrowEntity(level, livingEntity, itemStack.copyWithCount(1), itemStack2);
    }

    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        WeirwoodArrowEntity arrow = new WeirwoodArrowEntity(level, position.x(), position.y(), position.z(), itemStack.copyWithCount(1), (ItemStack)null);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
    }
}
