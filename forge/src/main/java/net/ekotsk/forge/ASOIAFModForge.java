package net.ekotsk.forge;

import dev.architectury.platform.forge.EventBuses;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.fml.common.Mod;
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

        ModLootEntriesImpl.register();

        MinecraftForge.EVENT_BUS.addListener(this::onReloadListeners);

        System.out.println("[EKOTSK Unique Loot] CONSTRUCTOR END");
    }

    private void onReloadListeners(AddReloadListenerEvent event) {
        System.out.println("[EKOTSK Unique Loot] Registering reload listener");

        event.addListener(new UniqueLootReloadListener());
    }
}