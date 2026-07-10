package net.ekotsk;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.ekotsk.client.render.model.ModModels;

import net.ekotsk.config.ArmorConfig;
import net.ekotsk.config.ModConfig;
import net.ekotsk.init.CommonEvents;
import net.ekotsk.item.ModArmorTypes;
import net.ekotsk.item.ModItems;

import net.ekotsk.misc.ModCreativeTabs;
import net.ekotsk.misc.ModReloadListenerRegistry;
import net.fabricmc.api.EnvType;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;


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
        ModItems.INSTANCE.init();
        CommonEvents.init();
        ModCreativeTabs.init();
        ModReloadListenerRegistry.init();

    }
}
