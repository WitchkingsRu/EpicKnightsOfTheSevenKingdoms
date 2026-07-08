package net.ekotsk.fabric;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.fabric.api.UniqueLootReloadListenerFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.server.packs.PackType;

public class ASOIAFModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        // 1. Common init
        ASOIAFMod.init();

        // 2. Регистрация loot entry
        ModLootEntriesImpl.register();

        // 3. Регистрация reload listener
        ResourceManagerHelper.get(PackType.SERVER_DATA)
                .registerReloadListener(new UniqueLootReloadListenerFabric());
    }
}