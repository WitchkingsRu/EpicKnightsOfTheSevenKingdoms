package net.ekotsk.misc;

import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ModBannerPatternTags {
    public static final TagKey<BannerPattern> SPEAR_PATTERN = create("spear");
    public static final TagKey<BannerPattern> DORNISH_SUN_PATTERN = create("dornish_sun");
    private static TagKey<BannerPattern> create(String name) {
        return TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(ASOIAFMod.MOD_ID, "pattern_item/" + name));
    }
}
