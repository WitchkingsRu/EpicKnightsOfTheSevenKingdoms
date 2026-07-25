package net.ekotsk.forge;

import dev.architectury.platform.forge.EventBuses;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.block.WeirwoodLogBlock;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ASOIAFMod.MOD_ID)
public final class ASOIAFModForge {

    public ASOIAFModForge() {
        System.out.println("[EKOTSK Unique Loot] CONSTRUCTOR START");

        EventBuses.registerModEventBus(
                ASOIAFMod.MOD_ID,
                FMLJavaModLoadingContext.get().getModEventBus()
        );

        ASOIAFMod.init();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLootEntriesImpl.register();

        modEventBus.addListener(this::onCommonSetup);
        modEventBus.addListener(this::registerParticles);

        MinecraftForge.EVENT_BUS.addListener(this::onReloadListeners);
        MinecraftForge.EVENT_BUS.addListener(this::onToolModification);

        MinecraftForge.EVENT_BUS.addListener(this::onReloadListeners);

        System.out.println("[EKOTSK Unique Loot] CONSTRUCTOR END");

    }

    private void onReloadListeners(AddReloadListenerEvent event) {
        System.out.println("[EKOTSK Unique Loot] Registering reload listener");

        event.addListener(new UniqueLootReloadListener());
    }
    private void onCommonSetup(FMLCommonSetupEvent event) {
        System.out.println("[EKOTSK] Common setup");

        event.enqueueWork(() -> {
            try {
                FireBlock fire = (FireBlock) Blocks.FIRE;
                java.lang.reflect.Method setFlammable = FireBlock.class.getDeclaredMethod(
                        "setFlammable", Block.class, int.class, int.class);
                setFlammable.setAccessible(true);

                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_LOG.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_GRIM.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_HAPPY.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_ROBLOX.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_LEAVES.get(), 10, 10);
                setFlammable.invoke(fire, ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), 5, 5);


                System.out.println("[EKOTSK] Flammability registered");
            } catch (Exception e) {
                System.err.println("[EKOTSK] Failed to set flammable: " + e.getMessage());
            }
        });
    }
    private void registerParticles(RegisterParticleProvidersEvent event) {
        System.out.println("[EKOTSK] Registering particles");

        event.registerSpriteSet(ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEIRWOOD_SAPLING.get(), RenderType.cutoutMipped());
    }

    private void onToolModification(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() != ToolActions.AXE_STRIP) return;

        BlockState state = event.getState();
        if (state.is(ModBlocks.WEIRWOOD_LOG.get())) {
            int carvings = state.getValue(WeirwoodLogBlock.CARVINGS);
            Direction lastHitSide = state.getValue(WeirwoodLogBlock.LAST_HIT_SIDE);

            BlockState stripped = ModBlocks.STRIPPED_WEIRWOOD_LOG.get()
                    .defaultBlockState();

            if (state.hasProperty(RotatedPillarBlock.AXIS)) {
                stripped = stripped.setValue(RotatedPillarBlock.AXIS,
                        state.getValue(RotatedPillarBlock.AXIS));
            }
            event.setFinalState(stripped);
        }
    }
}