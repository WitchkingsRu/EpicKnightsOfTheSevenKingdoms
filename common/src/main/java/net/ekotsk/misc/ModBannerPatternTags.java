package net.ekotsk.misc;

import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ModBannerPatternTags {
    public static final TagKey<BannerPattern> SPEAR_PATTERN = create("spear");
    public static final TagKey<BannerPattern> DORNISH_SUN_PATTERN = create("dornish_sun");
    public static final TagKey<BannerPattern> BRIGHT_SUN_PATTERN = create("bright_sun");
    public static final TagKey<BannerPattern> SUNS_PATTERN = create("suns");
    public static final TagKey<BannerPattern> MOONS_PATTERN = create("moons");
    public static final TagKey<BannerPattern> QUARTERS_PATTERN = create_loom("no_item_required");
    public static final TagKey<BannerPattern> STARK_PATTERN = create("stark");
    public static final TagKey<BannerPattern> KRAKEN_PATTERN = create("kraken");
    public static final TagKey<BannerPattern> LANNISTER_PATTERN = create("lannister");
    public static final TagKey<BannerPattern> TARGARYEN_PATTERN = create("targaryen");
    public static final TagKey<BannerPattern> STAG_PATTERN = create("stag");
    public static final TagKey<BannerPattern> ARRYN_PATTERN = create("arryn");
    public static final TagKey<BannerPattern> ROSE_PATTERN = create("rose");
    public static final TagKey<BannerPattern> FISH_PATTERN = create("fish");
    public static final TagKey<BannerPattern> FALLEN_STAR_PATTERN = create("fallen_star");
    public static final TagKey<BannerPattern> SWORD_PATTERN = create("sword");
    public static final TagKey<BannerPattern> ARROWS_PATTERN = create("arrows");
    public static final TagKey<BannerPattern> WEIRWOOD_PATTERN = create("weirwood");
    public static final TagKey<BannerPattern> CARRIED_SHIELD_PATTERN = create("carried_shield");
    public static final TagKey<BannerPattern> SEAHORSE_PATTERN = create("seahorse");
    public static final TagKey<BannerPattern> HIGHTOWER_PATTERN = create("hightower");
    public static final TagKey<BannerPattern> BEACON_PATTERN = create("beacon");
    public static final TagKey<BannerPattern> GRAPE_PATTERN = create("grape");
    public static final TagKey<BannerPattern> SCYTHE_PATTERN = create("scythe");
    public static final TagKey<BannerPattern> BONEHAND_PATTERN = create("bonehand");
    public static final TagKey<BannerPattern> HORN_PATTERN = create("horn");
    public static final TagKey<BannerPattern> SEVEN_PATTERN = create("seven");
    public static final TagKey<BannerPattern> WYL_PATTERN = create("wyl");
    public static final TagKey<BannerPattern> PRANCING_HORSE_PATTERN = create("prancing_horse");
    public static final TagKey<BannerPattern> HORSE_HEAD_PATTERN = create("horse_head");
    public static final TagKey<BannerPattern> CIRCLES_PATTERN = create("circles");
    public static final TagKey<BannerPattern> HOG_PATTERN = create("hog");
    public static final TagKey<BannerPattern> SHIELD_PATTERN = create("shield");
    public static final TagKey<BannerPattern> HUNTER_PATTERN = create("hunter");
    public static final TagKey<BannerPattern> TWO_TOWERS_PATTERN = create("two_towers");
    public static final TagKey<BannerPattern> THREE_TOWERS_PATTERN = create("three_towers");
    public static final TagKey<BannerPattern> APPLE_PATTERN = create("apple");
    public static final TagKey<BannerPattern> HIVES_PATTERN = create("hives");
    private static TagKey<BannerPattern> create(String name) {
        return TagKey.create(Registries.BANNER_PATTERN, ResourceLocation.fromNamespaceAndPath(ASOIAFMod.MOD_ID, "pattern_item/" + name));
    }
    private static TagKey<BannerPattern> create_loom(String name) {
        return TagKey.create(Registries.BANNER_PATTERN, ResourceLocation.fromNamespaceAndPath(ASOIAFMod.MOD_ID, name));
    }

}

