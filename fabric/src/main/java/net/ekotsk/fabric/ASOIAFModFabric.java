package net.ekotsk.fabric;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.fabric.api.UniqueLootReloadListenerFabric;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.server.packs.PackType;

public class ASOIAFModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("[EKOTSK UniqueLoot] CONSTRUCTOR START");

        ASOIAFMod.init();

        ModLootEntriesImpl.register();

        ResourceManagerHelper.get(PackType.SERVER_DATA)
                .registerReloadListener(new UniqueLootReloadListenerFabric());

        System.out.println("[EKOTSK UniqueLoot] CONSTRUCTOR FINISH");
    }
}