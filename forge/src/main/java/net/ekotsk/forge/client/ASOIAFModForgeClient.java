package net.ekotsk.forge.client;

import net.ekotsk.ASOIAFModClient;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.ModWoodTypes;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ASOIAFModForgeClient {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK Forge");
    public static void init(IEventBus bus) {
        ASOIAFModClient.clientInit();
        bus.addListener(ASOIAFModForgeClient::setup);
        bus.addListener(ASOIAFModForgeClient::renderers);
        bus.addListener(ASOIAFModForgeClient::registerParticles);
//        bus.addListener(ASOIAFModForgeClient::modelLayers);
        LOGGER.info("Client initialized successfully.");
    }

    static void setup(FMLClientSetupEvent event) {
        ASOIAFModClient.clientSetup();
    }
    static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);

        Sheets.addWoodType(ModWoodTypes.WEIRWOOD);
        LOGGER.info("Particles registered.");
    }
//    static void modelLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
//        ModModels.registerLayers(event::registerLayerDefinition);
//    }

    static void renderers(EntityRenderersEvent.RegisterRenderers event) {
        ModModels.blockEntityRender();
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEIRWOOD_SAPLING.get(), RenderType.cutoutMipped());
        LOGGER.info("Renderers registered.");

    }

}
