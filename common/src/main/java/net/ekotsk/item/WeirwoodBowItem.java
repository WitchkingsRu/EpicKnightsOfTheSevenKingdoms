package net.ekotsk.item;

import com.magistuarmory.item.IHasModelProperty;
import dev.architectury.platform.Mod;
import dev.architectury.registry.item.ItemPropertiesRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.function.Predicate;

public class WeirwoodBowItem extends BowItem implements IHasModelProperty {
    private final int pullTime;
    private final float projectileSpeed;
    public static final Predicate<ItemStack> WEIRWOOD_ARROW_ONLY = (arg) -> arg.is(ModItems.WEIRWOOD_ARROW.get());

    public WeirwoodBowItem(Properties properties, float projectileSpeed, int pullTime) {
        super(properties.stacksTo(1));
        this.projectileSpeed = projectileSpeed;
        this.pullTime = pullTime;
    }

    @Override
    public Predicate<ItemStack> getSupportedHeldProjectiles() {
        return WEIRWOOD_ARROW_ONLY;
    }
    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return WEIRWOOD_ARROW_ONLY;
    }

    @Override
    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        if (livingEntity instanceof Player player) {
            ItemStack realAmmo = player.getProjectile(itemStack);

            int j = this.getUseDuration(itemStack, livingEntity) - i;
            float f = this.getPower(j);

            if (!((double)f < 0.1D)) {
                if (realAmmo.isEmpty() && !player.getAbilities().instabuild) {
                    return;
                }
                ItemStack effectiveAmmo = realAmmo.isEmpty() ? new ItemStack(ModItems.WEIRWOOD_ARROW.get()) : realAmmo;

                List<ItemStack> list = this.draw(itemStack, effectiveAmmo, player);
                ItemStack weirwoodArrow = new ItemStack(ModItems.WEIRWOOD_ARROW.get());
                for (int k = 0; k < list.size(); k++) {
                    list.set(k, weirwoodArrow);
                }

                if (level instanceof ServerLevel serverLevel) {
                    this.shoot(serverLevel, player, player.getUsedItemHand(), itemStack, list, f * this.projectileSpeed, 1.0F, f == 1.0F, null);
                }

                level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                player.awardStat(Stats.ITEM_USED.get(this));
            }
        }
    }

    public float getPower(int charge) {
        float f = (float)charge / this.pullTime;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F)
            f = 1.0F;
        return f;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void registerModelProperty() {
        ItemPropertiesRegistry.register(this, ResourceLocation.withDefaultNamespace("pulling"), (stack, level, entity, i) ->
                entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);

        ItemPropertiesRegistry.register(this, ResourceLocation.withDefaultNamespace("pull"), (stack, level, entity, i) -> {
            if (entity == null)
                return 0.0F;
            else
                return entity.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / this.pullTime;
        });
    }
}