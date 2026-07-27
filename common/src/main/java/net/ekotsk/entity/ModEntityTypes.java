package net.ekotsk.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.ENTITY_TYPE);
    public static final RegistrySupplier<EntityType<WeirwoodArrowEntity>> WEIRWOOD_ARROW = ENTITY_TYPES.register("weirwood_arrow", WeirwoodArrowEntity.WEIRWOOD_ARROW);

}
