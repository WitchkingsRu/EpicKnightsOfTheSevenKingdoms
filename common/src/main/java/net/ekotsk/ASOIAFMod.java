package net.ekotsk;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.ekotsk.block.ModBlockEntities;
import net.ekotsk.client.render.model.ModModels;
import net.ekotsk.config.ModConfig;
import net.ekotsk.init.CommonEvents;
import net.ekotsk.item.ModItems;
import net.ekotsk.misc.ModBannerPatterns;
import net.ekotsk.misc.ModCreativeTabs;
import net.ekotsk.worldgen.ModWorldGen;
import net.fabricmc.api.EnvType;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import static net.ekotsk.block.ModBlocks.BLOCKS;
import static net.ekotsk.item.ModItems.ITEMS;
import static net.ekotsk.entity.ModEntityTypes.ENTITY_TYPES;
import static net.ekotsk.misc.ModParticles.PARTICLES;
import static net.ekotsk.worldgen.ModFeatures.FEATURES;
public final class ASOIAFMod {
    public static final String MOD_ID = "ekotsk";
    public static ModConfig CONFIG;
    static {
        AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        CONFIG = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
    public static void init() {
        ModBannerPatterns.init();
        PARTICLES.register();
        BLOCKS.register();
        ModBlockEntities.init();
        ModItems.INSTANCE.init();
        ITEMS.register();
        ENTITY_TYPES.register();
        CommonEvents.init();
        ModCreativeTabs.init();
        FEATURES.register();
        ModWorldGen.init();
        if (Platform.getEnv() == EnvType.CLIENT)
            ModModels.INSTANCE.init(ModItems.INSTANCE);

    }

}
