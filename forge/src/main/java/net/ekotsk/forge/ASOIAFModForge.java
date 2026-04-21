package net.ekotsk.forge;

import dev.architectury.platform.forge.EventBuses;
import net.ekotsk.item.ModItems;
import net.ekotsk.loot.core.UniqueLootManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.ekotsk.ASOIAFMod;

@Mod(ASOIAFMod.MOD_ID)
public final class ASOIAFModForge {

    public ASOIAFModForge() {
        System.out.println("[UniqueLoot] 🔵 CONSTRUCTOR START");

        // 1. Architectury
        EventBuses.registerModEventBus(ASOIAFMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // 2. Common init
        ASOIAFMod.init();

        // 3. Регистрация loot entry
        ModLootEntriesImpl.register();

        // 4. ✅ ПРАВИЛЬНАЯ подписка на FMLCommonSetupEvent
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);

        System.out.println("[UniqueLoot] 🔵 CONSTRUCTOR END");
    }

    // ✅ Метод-обработчик (не нужно @SubscribeEvent!)
    private void onCommonSetup(FMLCommonSetupEvent event) {
        System.out.println("[UniqueLoot] 🟢 FMLCommonSetupEvent FIRED!");

        var iceItem = ModItems.ICE.get();
        System.out.println("[UniqueLoot] 🟢 ModItems.ICE.get() = " + iceItem);

        if (iceItem == null) {
            System.out.println("[UniqueLoot] ❌ ModItems.ICE.get() returned NULL");
            return;
        }

        System.out.println("[UniqueLoot] 🟢 Calling UniqueLootManager.init()");
        UniqueLootManager.get().init(iceItem);
        System.out.println("[UniqueLoot] 🟢 init() completed");
    }
}