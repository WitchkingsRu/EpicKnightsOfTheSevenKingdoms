package net.ekotsk;

import net.ekotsk.item.ModItems;
import net.ekotsk.misc.ModBannerPatterns;
import net.ekotsk.misc.ModCreativeTabs;

public final class ASOIAFMod {
    public static final String MOD_ID = "ekotsk";

    public static void init() {
        ModBannerPatterns.init();
        ModItems.INSTANCE.init();
        ModCreativeTabs.init();
    }
}
