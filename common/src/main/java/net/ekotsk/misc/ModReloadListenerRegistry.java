package net.ekotsk.misc;

import dev.architectury.registry.ReloadListenerRegistry;
import net.ekotsk.ASOIAFMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;

public class ModReloadListenerRegistry {

    public static void init() {
        ReloadListenerRegistry.register(
                PackType.SERVER_DATA,
                new HeraldryReloadListener(),
                ResourceLocation.fromNamespaceAndPath(ASOIAFMod.MOD_ID, "heraldry")
        );
    }
}
