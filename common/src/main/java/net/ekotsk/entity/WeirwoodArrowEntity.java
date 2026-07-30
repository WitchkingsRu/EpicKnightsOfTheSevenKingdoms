package net.ekotsk.entity;

import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;

public class WeirwoodArrowEntity extends AbstractArrow {
    private static final int EXPOSED_POTION_DECAY_TIME = 600;
    private static final int NO_EFFECT_COLOR = -1;
    private static final EntityDataAccessor<Integer> ID_EFFECT_COLOR;
    private static final byte EVENT_POTION_PUFF = 0;
    public static final Supplier<EntityType<WeirwoodArrowEntity>> WEIRWOOD_ARROW = Suppliers.memoize(() -> EntityType.Builder.<WeirwoodArrowEntity>of(WeirwoodArrowEntity::new, MobCategory.MISC)
            .sized(0.25F, 0.25F)
            .clientTrackingRange(4)
            .updateInterval(10)
            .build("weirwood_arrow")
    );
    public WeirwoodArrowEntity(EntityType<? extends WeirwoodArrowEntity> entityType, Level level) {
        super(entityType, level);
        this.setBaseDamage(3.5);
    }

    public WeirwoodArrowEntity(Level level, double d, double e, double f, ItemStack itemStack, @Nullable ItemStack itemStack2) {
        super(ModEntityTypes.WEIRWOOD_ARROW.get(), d, e, f, level, itemStack, itemStack2);
        this.updateColor();
        this.setBaseDamage(3.5);
    }

    public WeirwoodArrowEntity(Level level, LivingEntity livingEntity, ItemStack itemStack, @Nullable ItemStack itemStack2) {
        super(ModEntityTypes.WEIRWOOD_ARROW.get(), livingEntity, level, itemStack, itemStack2);
        this.updateColor();
        this.setBaseDamage(3.5);
    }

    private PotionContents getPotionContents() {
        return (PotionContents)this.getPickupItemStackOrigin().getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
    }

    private void setPotionContents(PotionContents potionContents) {
        this.getPickupItemStackOrigin().set(DataComponents.POTION_CONTENTS, potionContents);
        this.updateColor();
    }

    protected void setPickupItemStack(ItemStack itemStack) {
        super.setPickupItemStack(itemStack);
        this.updateColor();
    }

    private void updateColor() {
        PotionContents potionContents = this.getPotionContents();
        this.entityData.set(ID_EFFECT_COLOR, potionContents.equals(PotionContents.EMPTY) ? -1 : potionContents.getColor());
    }

    public void addEffect(MobEffectInstance mobEffectInstance) {
        this.setPotionContents(this.getPotionContents().withEffectAdded(mobEffectInstance));
    }

    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(ID_EFFECT_COLOR, -1);
    }

    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            if (this.inGround) {
                if (this.inGroundTime % 5 == 0) {
                    this.makeParticle(1);
                }
            } else {
                this.makeParticle(2);
            }
        } else if (this.inGround && this.inGroundTime != 0 && !this.getPotionContents().equals(PotionContents.EMPTY) && this.inGroundTime >= 600) {
            this.level().broadcastEntityEvent(this, (byte)0);
            this.setPickupItemStack(new ItemStack(ModItems.WEIRWOOD_ARROW.get()));
        }

    }

    private void makeParticle(int i) {
        int j = this.getColor();
        if (j != -1 && i > 0) {
            for(int k = 0; k < i; ++k) {
                this.level().addParticle(ColorParticleOption.create(ParticleTypes.ENTITY_EFFECT, j), this.getRandomX((double)0.5F), this.getRandomY(), this.getRandomZ((double)0.5F), (double)0.0F, (double)0.0F, (double)0.0F);
            }

        }
    }

    public int getColor() {
        return (Integer)this.entityData.get(ID_EFFECT_COLOR);
    }

    protected void doPostHurtEffects(LivingEntity livingEntity) {
        super.doPostHurtEffects(livingEntity);
        Entity entity = this.getEffectSource();
        PotionContents potionContents = this.getPotionContents();
        if (potionContents.potion().isPresent()) {
            for(MobEffectInstance mobEffectInstance : ((Potion)((Holder)potionContents.potion().get()).value()).getEffects()) {
                livingEntity.addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), Math.max(mobEffectInstance.mapDuration((i) -> i / 8), 1), mobEffectInstance.getAmplifier(), mobEffectInstance.isAmbient(), mobEffectInstance.isVisible()), entity);
            }
        }

        for(MobEffectInstance mobEffectInstance : potionContents.customEffects()) {
            livingEntity.addEffect(mobEffectInstance, entity);
        }

    }

    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.WEIRWOOD_ARROW.get());
    }

    public void handleEntityEvent(byte b) {
        if (b == 0) {
            int i = this.getColor();
            if (i != -1) {
                float f = (float)(i >> 16 & 255) / 255.0F;
                float g = (float)(i >> 8 & 255) / 255.0F;
                float h = (float)(i >> 0 & 255) / 255.0F;

                for(int j = 0; j < 20; ++j) {
                    this.level().addParticle(ColorParticleOption.create(ParticleTypes.ENTITY_EFFECT, f, g, h), this.getRandomX((double)0.5F), this.getRandomY(), this.getRandomZ((double)0.5F), (double)0.0F, (double)0.0F, (double)0.0F);
                }
            }
        } else {
            super.handleEntityEvent(b);
        }

    }

    static {
        ID_EFFECT_COLOR = SynchedEntityData.defineId(WeirwoodArrowEntity.class, EntityDataSerializers.INT);
    }
}

