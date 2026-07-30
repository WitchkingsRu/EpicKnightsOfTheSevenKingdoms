package net.ekotsk.fabric.client;

import net.ekotsk.ASOIAFModClient;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.renderer.RenderType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ASOIAFModFabricClient implements ClientModInitializer {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK Fabric");
    @Override
    public void onInitializeClient() {
        ASOIAFModClient.clientInit();
        ModModels.blockEntityRender();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEIRWOOD_SAPLING.get(), RenderType.cutout());
        LOGGER.info("Renderers registered.");
        ParticleFactoryRegistry.getInstance().register(
                ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);
        LOGGER.info("Particles registered.");
        LOGGER.info("Client initialized successfully.");
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
