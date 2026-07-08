package net.ekotsk.neoforge;

import dev.architectury.platform.neoforge.EventBuses;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.event.AddReloadListenerEvent;

@Mod(ASOIAFMod.MOD_ID)
public final class ASOIAFModNeoForge {

    public ASOIAFModNeoForge() {
        // 1. Architectury event bus
        EventBuses.registerModEventBus(
                ASOIAFMod.MOD_ID,
                FMLJavaModLoadingContext.get().getModEventBus()
        );

        // 2. Common init
        ASOIAFMod.init();

        // 3. Регистрация loot entry
        ModLootEntriesImpl.register();

        // 4. Подписка на событие reload listener
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onReloadListeners);
    }

    @SubscribeEvent
    private void onReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new UniqueLootReloadListener());
    }
}
