package net.ekotsk.entity;

import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.item.ModItems;
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
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;

import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;

public class WeirwoodArrowEntity extends AbstractArrow {
    private static final int EXPOSED_POTION_DECAY_TIME = 600;
    private static final int NO_EFFECT_COLOR = -1;
    private static final EntityDataAccessor<Integer> ID_EFFECT_COLOR;
    private static final byte EVENT_POTION_PUFF = 0;
    private Potion potion;
    private final Set<MobEffectInstance> effects;
    private boolean fixedColor;
    public static final Supplier<EntityType<WeirwoodArrowEntity>> WEIRWOOD_ARROW = Suppliers.memoize(() -> EntityType.Builder.<WeirwoodArrowEntity>of(WeirwoodArrowEntity::new, MobCategory.MISC)
            .sized(0.25F, 0.25F)
            .clientTrackingRange(4)
            .updateInterval(10)
            .build("weirwood_arrow")
    );
    public WeirwoodArrowEntity(EntityType<? extends WeirwoodArrowEntity> entityType, Level level) {
        super(entityType, level);
        this.potion = Potions.EMPTY;
        this.effects = Sets.newHashSet();
        this.setBaseDamage(3.5);
    }

    public WeirwoodArrowEntity(Level level, double d, double e, double f) {
        super(ModEntityTypes.WEIRWOOD_ARROW.get(), d, e, f, level);
        this.potion = Potions.EMPTY;
        this.effects = Sets.newHashSet();
        this.setBaseDamage(3.5);
    }

    public WeirwoodArrowEntity(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.WEIRWOOD_ARROW.get(), livingEntity, level);
        this.potion = Potions.EMPTY;
        this.effects = Sets.newHashSet();
        this.setBaseDamage(3.5);
    }

    public void setEffectsFromItem(ItemStack itemStack) {
        if (itemStack.is(Items.TIPPED_ARROW)) {
            this.potion = PotionUtils.getPotion(itemStack);
            Collection<MobEffectInstance> collection = PotionUtils.getCustomEffects(itemStack);
            if (!collection.isEmpty()) {
                for(MobEffectInstance mobEffectInstance : collection) {
                    this.effects.add(new MobEffectInstance(mobEffectInstance));
                }
            }

            int i = getCustomColor(itemStack);
            if (i == -1) {
                this.updateColor();
            } else {
                this.setFixedColor(i);
            }
        } else if (itemStack.is(ModItems.WEIRWOOD_ARROW.get())) {
            this.potion = Potions.EMPTY;
            this.effects.clear();
            this.entityData.set(ID_EFFECT_COLOR, -1);
        }

    }

    public static int getCustomColor(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getTag();
        return compoundTag != null && compoundTag.contains("CustomPotionColor", 99) ? compoundTag.getInt("CustomPotionColor") : -1;
    }

    private void updateColor() {
        this.fixedColor = false;
        if (this.potion == Potions.EMPTY && this.effects.isEmpty()) {
            this.entityData.set(ID_EFFECT_COLOR, -1);
        } else {
            this.entityData.set(ID_EFFECT_COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.effects)));
        }

    }

    public void addEffect(MobEffectInstance mobEffectInstance) {
        this.effects.add(mobEffectInstance);
        this.getEntityData().set(ID_EFFECT_COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.effects)));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ID_EFFECT_COLOR, -1);
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
        } else if (this.inGround && this.inGroundTime != 0 && !this.effects.isEmpty() && this.inGroundTime >= 600) {
            this.level().broadcastEntityEvent(this, (byte)0);
            this.potion = Potions.EMPTY;
            this.effects.clear();
            this.entityData.set(ID_EFFECT_COLOR, -1);
        }

    }

    private void makeParticle(int i) {
        int j = this.getColor();
        if (j != -1 && i > 0) {
            double d = (double)(j >> 16 & 255) / (double)255.0F;
            double e = (double)(j >> 8 & 255) / (double)255.0F;
            double f = (double)(j >> 0 & 255) / (double)255.0F;

            for(int k = 0; k < i; ++k) {
                this.level().addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX((double)0.5F), this.getRandomY(), this.getRandomZ((double)0.5F), d, e, f);
            }

        }
    }

    public int getColor() {
        return (Integer)this.entityData.get(ID_EFFECT_COLOR);
    }

    private void setFixedColor(int i) {
        this.fixedColor = true;
        this.entityData.set(ID_EFFECT_COLOR, i);
    }

    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        if (this.potion != Potions.EMPTY) {
            compoundTag.putString("Potion", BuiltInRegistries.POTION.getKey(this.potion).toString());
        }

        if (this.fixedColor) {
            compoundTag.putInt("Color", this.getColor());
        }

        if (!this.effects.isEmpty()) {
            ListTag listTag = new ListTag();

            for(MobEffectInstance mobEffectInstance : this.effects) {
                listTag.add(mobEffectInstance.save(new CompoundTag()));
            }

            compoundTag.put("CustomPotionEffects", listTag);
        }

    }

    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("Potion", 8)) {
            this.potion = PotionUtils.getPotion(compoundTag);
        }

        for(MobEffectInstance mobEffectInstance : PotionUtils.getCustomEffects(compoundTag)) {
            this.addEffect(mobEffectInstance);
        }

        if (compoundTag.contains("Color", 99)) {
            this.setFixedColor(compoundTag.getInt("Color"));
        } else {
            this.updateColor();
        }

    }

    protected void doPostHurtEffects(LivingEntity livingEntity) {
        super.doPostHurtEffects(livingEntity);
        Entity entity = this.getEffectSource();

        for(MobEffectInstance mobEffectInstance : this.potion.getEffects()) {
            livingEntity.addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), Math.max(mobEffectInstance.mapDuration((i) -> i / 8), 1), mobEffectInstance.getAmplifier(), mobEffectInstance.isAmbient(), mobEffectInstance.isVisible()), entity);
        }

        if (!this.effects.isEmpty()) {
            for(MobEffectInstance mobEffectInstance : this.effects) {
                livingEntity.addEffect(mobEffectInstance, entity);
            }
        }

    }

    protected ItemStack getPickupItem() {
        if (this.effects.isEmpty() && this.potion == Potions.EMPTY) {
            return new ItemStack(ModItems.WEIRWOOD_ARROW.get());
        } else {
            ItemStack itemStack = new ItemStack(Items.TIPPED_ARROW);
            PotionUtils.setPotion(itemStack, this.potion);
            PotionUtils.setCustomEffects(itemStack, this.effects);
            if (this.fixedColor) {
                itemStack.getOrCreateTag().putInt("CustomPotionColor", this.getColor());
            }

            return itemStack;
        }
    }

    public void handleEntityEvent(byte b) {
        if (b == 0) {
            int i = this.getColor();
            if (i != -1) {
                double d = (double)(i >> 16 & 255) / (double)255.0F;
                double e = (double)(i >> 8 & 255) / (double)255.0F;
                double f = (double)(i >> 0 & 255) / (double)255.0F;

                for(int j = 0; j < 20; ++j) {
                    this.level().addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX((double)0.5F), this.getRandomY(), this.getRandomZ((double)0.5F), d, e, f);
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
