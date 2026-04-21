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
        System.out.println("[UniqueLoot] 🔵 CONSTRUCTOR START");

        // 1. Architectury mod event bus
        EventBuses.registerModEventBus(
                ASOIAFMod.MOD_ID,
                FMLJavaModLoadingContext.get().getModEventBus()
        );

        // 2. Common init
        ASOIAFMod.init();

        // 3. Loot entry registry (Forge impl)
        ModLootEntriesImpl.register();

        // 4. Forge global event bus (ВАЖНО!)
        MinecraftForge.EVENT_BUS.addListener(this::onReloadListeners);

        System.out.println("[UniqueLoot] 🔵 CONSTRUCTOR END");
    }

    private void onReloadListeners(AddReloadListenerEvent event) {
        System.out.println("[UniqueLoot] 🟢 Registering reload listener");

        event.addListener(new UniqueLootReloadListener());
    }
}