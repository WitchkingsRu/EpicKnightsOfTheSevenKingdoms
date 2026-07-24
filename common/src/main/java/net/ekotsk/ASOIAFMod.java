package net.ekotsk;

import dev.architectury.platform.Platform;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.init.CommonEvents;
import net.ekotsk.item.ModItems;
import net.ekotsk.misc.ModBannerPatterns;
import net.ekotsk.misc.ModCreativeTabs;
import net.ekotsk.worldgen.ModWorldGen;
import net.fabricmc.api.EnvType;
import static net.ekotsk.block.ModBlocks.BLOCKS;
import static net.ekotsk.item.ModItems.ITEMS;
import static net.ekotsk.misc.ModParticles.PARTICLES;
import static net.ekotsk.worldgen.ModFeatures.FEATURES;
public final class ASOIAFMod {
    public static final String MOD_ID = "ekotsk";


    public static void init() {
        ModBannerPatterns.init();
        PARTICLES.register();
        BLOCKS.register();
        ModItems.INSTANCE.init();
        ITEMS.register();
        CommonEvents.init();
        ModCreativeTabs.init();
        FEATURES.register();
        ModWorldGen.init();
        if (Platform.getEnv() == EnvType.CLIENT)
            ModModels.INSTANCE.init(ModItems.INSTANCE);
    }
}
