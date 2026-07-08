package net.ekotsk.neoforge;


import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddReloadListenerEvent;

@Mod(ASOIAFMod.MOD_ID)
public final class ASOIAFModNeoForge {
    public static IEventBus MOD_EVENT_BUS;
    public ASOIAFModNeoForge(IEventBus modEventBus) {
        MOD_EVENT_BUS = modEventBus;

        ASOIAFMod.init();

        ModLootEntriesImpl.register(modEventBus);

        NeoForge.EVENT_BUS.addListener(this::onReloadListeners);
    }

    @SubscribeEvent
    private void onReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new UniqueLootReloadListener());
    }
}
