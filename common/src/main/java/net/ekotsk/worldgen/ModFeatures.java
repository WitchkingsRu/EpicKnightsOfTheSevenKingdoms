package net.ekotsk.worldgen;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.misc.WeirwoodSapParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.FEATURE);
    public static final RegistrySupplier<WeirwoodTreeFeature> WEIRWOOD_TREE = FEATURES.register("weirwood", () ->
            new WeirwoodTreeFeature(TreeConfiguration.CODEC));

}
