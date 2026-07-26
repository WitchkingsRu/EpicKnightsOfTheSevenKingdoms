package net.ekotsk.forge;

import dev.architectury.platform.Platform;
import dev.architectury.platform.forge.EventBuses;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.block.WeirwoodLogBlock;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.forge.api.MiscStuffForge;
import net.ekotsk.forge.client.ASOIAFModForgeClient;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.ModWoodTypes;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
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
        EventBuses.registerModEventBus(
                ASOIAFMod.MOD_ID,
                FMLJavaModLoadingContext.get().getModEventBus()
        );
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ASOIAFMod.init();
        ModLootEntriesImpl.register();
        MiscStuffForge.init(modEventBus);

        if (Platform.getEnv() == Dist.CLIENT) {
            ASOIAFModForgeClient.init(FMLJavaModLoadingContext.get().getModEventBus());

        }
    }




}