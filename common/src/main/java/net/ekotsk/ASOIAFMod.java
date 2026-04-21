package net.ekotsk;

import dev.architectury.platform.Platform;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.item.ModItems;
import net.ekotsk.misc.ModBannerPatterns;
import net.ekotsk.misc.ModCreativeTabs;
import net.fabricmc.api.EnvType;

public final class ASOIAFMod {
    public static final String MOD_ID = "ekotsk";


    public static void init() {
        ModBannerPatterns.init();
        ModItems.INSTANCE.init();
        ModCreativeTabs.init();
        if (Platform.getEnv() == EnvType.CLIENT)
            ModModels.INSTANCE.init(ModItems.INSTANCE);
        //ModLootEntries.register();
    }
}
