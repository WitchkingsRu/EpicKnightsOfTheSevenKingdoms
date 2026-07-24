package net.ekotsk.fabric;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.fabric.api.MiscStuffFabric;
import net.ekotsk.fabric.api.UniqueLootReloadListenerFabric;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.ekotsk.worldgen.ModConfiguredFeatures;
import net.ekotsk.worldgen.ModPlacedFeature;
import net.ekotsk.worldgen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;

public class ASOIAFModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("[EKOTSK UniqueLoot] CONSTRUCTOR START");

        ASOIAFMod.init();
        MiscStuffFabric.init();
        ModLootEntriesImpl.register();


        ResourceManagerHelper.get(PackType.SERVER_DATA)
                .registerReloadListener(new UniqueLootReloadListenerFabric());

        System.out.println("[EKOTSK UniqueLoot] CONSTRUCTOR FINISH");
    }
}