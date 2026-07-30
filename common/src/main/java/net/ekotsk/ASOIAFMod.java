package net.ekotsk;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.ekotsk.block.ModBlockEntities;
import net.ekotsk.client.render.model.ModModels;

import net.ekotsk.config.ArmorConfig;
import net.ekotsk.config.ModConfig;
import net.ekotsk.init.CommonEvents;
import net.ekotsk.item.ModArmorTypes;
import net.ekotsk.item.ModItems;

import net.ekotsk.misc.ModCreativeTabs;
import net.ekotsk.misc.ModReloadListenerRegistry;
import net.ekotsk.worldgen.ModConfiguredFeatures;
import net.ekotsk.worldgen.ModPlacedFeature;
import net.ekotsk.worldgen.ModWorldGen;
import net.fabricmc.api.EnvType;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

import static net.ekotsk.block.ModBlocks.BLOCKS;
import static net.ekotsk.entity.ModEntityTypes.ENTITY_TYPES;
import static net.ekotsk.item.ModItems.ITEMS;
import static net.ekotsk.misc.ModParticles.PARTICLES;
import static net.ekotsk.worldgen.ModConfiguredFeatures.CONFIGURED_FEATURES;
import static net.ekotsk.worldgen.ModFeatures.FEATURES;
import static net.ekotsk.worldgen.ModPlacedFeature.PLACED_FEATURES;


public final class ASOIAFMod {
    public static final String MOD_ID = "ekotsk";
    public static final ModConfig CONFIG;
    public static final ArmorConfig ARMOR_CONFIG;

    static
    {
        AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        CONFIG = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        ARMOR_CONFIG = CONFIG.armor;

    }
    public static void init() {
        if (Platform.getEnv() == EnvType.CLIENT)
            ModModels.INSTANCE.init(ModItems.INSTANCE);
        ModArmorTypes.init();
        PARTICLES.register();
        BLOCKS.register();
        ModBlockEntities.init();
        ITEMS.register();
        ModItems.INSTANCE.init();
        ENTITY_TYPES.register();
        CommonEvents.init();
        ModCreativeTabs.init();
        ModReloadListenerRegistry.init();
        FEATURES.register();
        ModWorldGen.init();

    }
}
