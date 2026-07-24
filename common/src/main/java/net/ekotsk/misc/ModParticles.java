package net.ekotsk.misc;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.client.particle.Particle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.PARTICLE_TYPE);
    public static final RegistrySupplier<SimpleParticleType> WEIRWOOD_SAP = PARTICLES.register("weirwood_sap", () ->
            new WeirwoodSapParticleType(false));

}
