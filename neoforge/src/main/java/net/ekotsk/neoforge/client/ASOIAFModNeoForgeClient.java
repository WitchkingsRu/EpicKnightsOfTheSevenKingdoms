package net.ekotsk.neoforge.client;

import net.ekotsk.ASOIAFModClient;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.ModWoodTypes;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ASOIAFModNeoForgeClient {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK NeoForge Client");

    public static void init(IEventBus bus) {
        ASOIAFModClient.clientInit();
        bus.addListener(ASOIAFModNeoForgeClient::setup);
        bus.addListener(ASOIAFModNeoForgeClient::renderers);
        bus.addListener(ASOIAFModNeoForgeClient::registerParticles);
        LOGGER.info("Client initialized successfully.");
    }

    static void setup(FMLClientSetupEvent event) {
        ASOIAFModClient.clientSetup();
    }

    static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.WEIRWOOD_SAP.get(), WeirwoodSapParticle.Provider::new);
        Sheets.addWoodType(ModWoodTypes.WEIRWOOD);
        LOGGER.info("Particles registered.");
    }

    static void renderers(EntityRenderersEvent.RegisterRenderers event) {
        ModModels.blockEntityRender();
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEIRWOOD_SAPLING.get(), RenderType.cutoutMipped());

        LOGGER.info("Renderers registered.");
    }
}
