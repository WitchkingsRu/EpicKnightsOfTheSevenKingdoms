package net.ekotsk.fabric.client;

import net.ekotsk.block.ModBlocks;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.renderer.RenderType;

public final class ASOIAFModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(
                ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEIRWOOD_SAPLING.get(), RenderType.cutout());
                // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
