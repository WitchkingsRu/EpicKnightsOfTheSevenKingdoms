package net.ekotsk.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.ItemRegistryHelper;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.DyeableMedievalArmorItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.WearableArmorDecorationItem;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.misc.ModBannerPatternTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;

public class ModItems extends ModItemsProvider {
    public static ModItems INSTANCE = new ModItems();
    public static ModItemTier VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 11.0F, 5.5F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);
    public static ModItemTier FINE_VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 12.0F, 6.0F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);
    public static ModItemTier WEAK_VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 10.0F, 5.0F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);

    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ICE = INSTANCE.addMedievalWeaponItem("ice", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> BLACKFYRE = INSTANCE.addMedievalWeaponItem("blackfyre", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DARK_SISTER = INSTANCE.addMedievalWeaponItem("dark_sister", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> AEGON_DAGGER = INSTANCE.addMedievalWeaponItem("aegon_dagger", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.STILETTO);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> CRAB_PINCER = INSTANCE.addMedievalWeaponItem("crab_pincer", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.LOCHABER_AXE);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DAWN = INSTANCE.addMedievalWeaponItem("dawn", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LAMENTATION = INSTANCE.addMedievalWeaponItem("lamentation", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LONGCLAW = INSTANCE.addMedievalWeaponItem("longclaw", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> NIGHTFALL = INSTANCE.addMedievalWeaponItem("nightfall", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ESTOC);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> BRIGHTROAR = INSTANCE.addMedievalWeaponItem("brightroar", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> RED_RAIN = INSTANCE.addMedievalWeaponItem("red_rain", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ROBERT_HAMMER = INSTANCE.addMedievalWeaponItem("robert_hammer", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.LUCERNE_HAMMER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> TRUTH = INSTANCE.addMedievalWeaponItem("truth", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> VIGILANCE = INSTANCE.addMedievalWeaponItem("vigilance", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LADY_FORLORN = INSTANCE.addMedievalWeaponItem("lady_forlorn", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> HEARTSBANE = INSTANCE.addMedievalWeaponItem("heartsbane", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> SANDOQ = INSTANCE.addMedievalWeaponItem("sandoq", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_HELMET = INSTANCE.addMedievalArmorItem("lannister_helmet", ModArmorTypes.LANNISTER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_HELMET = INSTANCE.addMedievalArmorItem("lannister_lord_helmet", ModArmorTypes.LANNISTER_LORD_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_chestplate", ModArmorTypes.LANNISTER_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_lord_chestplate", ModArmorTypes.LANNISTER_LORD_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_leggings", ModArmorTypes.LANNISTER_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_lord_leggings", ModArmorTypes.LANNISTER_LORD_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> FANCY_BOOTS = INSTANCE.addMedievalArmorItem("fancy_boots", ModArmorTypes.FANCY_BOOTS, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> VALYRIAN_STEEL_HELMET = INSTANCE.addMedievalArmorItem("valyrian_steel_helmet", ModArmorTypes.VALYRIAN_STEEL_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> VALYRIAN_STEEL_CHESTPLATE = INSTANCE.addMedievalArmorItem("valyrian_steel_chestplate", ModArmorTypes.VALYRIAN_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> VALYRIAN_STEEL_LEGGINGS = INSTANCE.addMedievalArmorItem("valyrian_steel_leggings", ModArmorTypes.VALYRIAN_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> VALYRIAN_STEEL_BOOTS = INSTANCE.addMedievalArmorItem("valyrian_steel_boots", ModArmorTypes.VALYRIAN_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> NIGHT_WATCH_CHESTPLATE = INSTANCE.addMedievalArmorItem("night_watch_chestplate", ModArmorTypes.NIGHT_WATCH_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> NIGHT_WATCH_LEGGINGS = INSTANCE.addMedievalArmorItem("night_watch_leggings", ModArmorTypes.NIGHT_WATCH_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> NIGHT_WATCH_BOOTS = INSTANCE.addMedievalArmorItem("night_watch_boots", ModArmorTypes.NIGHT_WATCH_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> NORTHERN_HELMET = INSTANCE.addMedievalArmorItem("northern_helmet", ModArmorTypes.NORTHERN_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> NORTHERN_CHESTPLATE = INSTANCE.addMedievalArmorItem("northern_chestplate", ModArmorTypes.NORTHERN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> NORTHERN_LEGGINGS = INSTANCE.addMedievalArmorItem("northern_leggings", ModArmorTypes.NORTHERN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> NORTHERN_BOOTS = INSTANCE.addMedievalArmorItem("northern_boots", ModArmorTypes.NORTHERN_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOLD_CLOAK_HELMET = INSTANCE.addMedievalArmorItem("gold_cloak_helmet", ModArmorTypes.GOLD_CLOAK_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOLD_CLOAK_CHESTPLATE = INSTANCE.addMedievalArmorItem("gold_cloak_chestplate", ModArmorTypes.GOLD_CLOAK_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOLD_CLOAK_LEGGINGS = INSTANCE.addMedievalArmorItem("gold_cloak_leggings", ModArmorTypes.GOLD_CLOAK_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOLD_CLOAK_BOOTS = INSTANCE.addMedievalArmorItem("gold_cloak_boots", ModArmorTypes.GOLD_CLOAK_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_GOLD_CLOAK_HELMET = INSTANCE.addMedievalArmorItem("kotsk_gold_cloak_helmet", ModArmorTypes.KOTSK_GOLD_CLOAK_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_GOLD_CLOAK_CHESTPLATE = INSTANCE.addMedievalArmorItem("kotsk_gold_cloak_chestplate", ModArmorTypes.KOTSK_GOLD_CLOAK_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_GOLD_CLOAK_LEGGINGS = INSTANCE.addMedievalArmorItem("kotsk_gold_cloak_leggings", ModArmorTypes.KOTSK_GOLD_CLOAK_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_GOLD_CLOAK_BOOTS = INSTANCE.addMedievalArmorItem("kotsk_gold_cloak_boots", ModArmorTypes.KOTSK_GOLD_CLOAK_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOT_GOLD_CLOAK_HELMET = INSTANCE.addMedievalArmorItem("got_gold_cloak_helmet", ModArmorTypes.GOT_GOLD_CLOAK_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOT_GOLD_CLOAK_CHESTPLATE = INSTANCE.addMedievalArmorItem("got_gold_cloak_chestplate", ModArmorTypes.GOT_GOLD_CLOAK_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOT_GOLD_CLOAK_LEGGINGS = INSTANCE.addMedievalArmorItem("got_gold_cloak_leggings", ModArmorTypes.GOT_GOLD_CLOAK_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GOT_GOLD_CLOAK_BOOTS = INSTANCE.addMedievalArmorItem("got_gold_cloak_boots", ModArmorTypes.GOT_GOLD_CLOAK_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> HOTD_KINGSGUARD_HELMET = INSTANCE.addMedievalArmorItem("hotd_kingsguard_helmet", ModArmorTypes.HOTD_KINGSGUARD_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> HOTD_KINGSGUARD_CHESTPLATE = INSTANCE.addMedievalArmorItem("hotd_kingsguard_chestplate", ModArmorTypes.HOTD_KINGSGUARD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> HOTD_KINGSGUARD_LEGGINGS = INSTANCE.addMedievalArmorItem("hotd_kingsguard_leggings", ModArmorTypes.HOTD_KINGSGUARD_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> HOTD_KINGSGUARD_BOOTS = INSTANCE.addMedievalArmorItem("hotd_kingsguard_boots", ModArmorTypes.HOTD_KINGSGUARD_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_KINGSGUARD_HELMET = INSTANCE.addMedievalArmorItem("kotsk_kingsguard_helmet", ModArmorTypes.KOTSK_KINGSGUARD_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_KINGSGUARD_CHESTPLATE = INSTANCE.addMedievalArmorItem("kotsk_kingsguard_chestplate", ModArmorTypes.KOTSK_KINGSGUARD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_KINGSGUARD_LEGGINGS = INSTANCE.addMedievalArmorItem("kotsk_kingsguard_leggings", ModArmorTypes.KOTSK_KINGSGUARD_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KOTSK_KINGSGUARD_BOOTS = INSTANCE.addMedievalArmorItem("kotsk_kingsguard_boots", ModArmorTypes.KOTSK_KINGSGUARD_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_HELMET = INSTANCE.addMedievalArmorItem("kingsguard_helmet", ModArmorTypes.KINGSGUARD_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_CHESTPLATE = INSTANCE.addMedievalArmorItem("kingsguard_chestplate", ModArmorTypes.KINGSGUARD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_LEGGINGS = INSTANCE.addMedievalArmorItem("kingsguard_leggings", ModArmorTypes.KINGSGUARD_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_BOOTS = INSTANCE.addMedievalArmorItem("kingsguard_boots", ModArmorTypes.KINGSGUARD_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_2_HELMET = INSTANCE.addMedievalArmorItem("kingsguard_baratheon_helmet", ModArmorTypes.KINGSGUARD_2_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_2_CHESTPLATE = INSTANCE.addMedievalArmorItem("kingsguard_baratheon_chestplate", ModArmorTypes.KINGSGUARD_2_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_2_LEGGINGS = INSTANCE.addMedievalArmorItem("kingsguard_baratheon_leggings", ModArmorTypes.KINGSGUARD_2_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> KINGSGUARD_2_BOOTS = INSTANCE.addMedievalArmorItem("kingsguard_baratheon_boots", ModArmorTypes.KINGSGUARD_2_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> DORNISH_HELMET = INSTANCE.addDyeableMedievalArmorItem("dornish_helmet", ModArmorTypes.DORNISH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties(), 0xFF6A00);
    public static final @Nullable RegistrySupplier<MedievalArmorItem> DORNISH_CHESTPLATE = INSTANCE.addDyeableMedievalArmorItem("dornish_chestplate", ModArmorTypes.DORNISH_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFF6A00);
    public static final @Nullable RegistrySupplier<MedievalArmorItem> DORNISH_LEGGINGS = INSTANCE.addDyeableMedievalArmorItem("dornish_leggings", ModArmorTypes.DORNISH_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties(),0xFF6A00);
    public static final @Nullable RegistrySupplier<MedievalArmorItem> DORNISH_BOOTS = INSTANCE.addDyeableMedievalArmorItem("dornish_boots", ModArmorTypes.DORNISH_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties(),0xFF6A00);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> GREYJOY_HELMET = INSTANCE.addMedievalArmorItem("greyjoy_helmet", ModArmorTypes.GREYJOY_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GREYJOY_CHESTPLATE = INSTANCE.addMedievalArmorItem("greyjoy_chestplate", ModArmorTypes.GREYJOY_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GREYJOY_LEGGINGS = INSTANCE.addMedievalArmorItem("greyjoy_leggings", ModArmorTypes.GREYJOY_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> GREYJOY_BOOTS = INSTANCE.addMedievalArmorItem("greyjoy_boots", ModArmorTypes.GREYJOY_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final RegistrySupplier<WearableArmorDecorationItem> HAND_SIGN_DECORATION = INSTANCE.addWearableArmorDecorationItem("hand_sign_decoration", ModArmorTypes.HAND_SIGN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> AEGON_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("aegon_crown_decoration", ModArmorTypes.AEGON_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<DyeableArmorDecorationItem> FANCY_CAPE_DECORATION = INSTANCE.addDyeableArmorDecorationItem("fancy_cape_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "fancy_cape"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
    public static final RegistrySupplier<ArmorDecorationItem> NIGHT_WATCH_CAPE_DECORATION = INSTANCE.addArmorDecorationItem("night_watch_cape_decoration", () -> new ArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "night_watch_cape"), new Item.Properties(), ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<DyeableArmorDecorationItem> LANNISTER_CAPE_DECORATION = INSTANCE.addDyeableArmorDecorationItem("lannister_cape_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "fancy_cape"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xB02E26));
    public static final RegistrySupplier<DyeableArmorDecorationItem> GOLD_CLOAK_LEFT_DECORATION = INSTANCE.addDyeableArmorDecorationItem("gold_cloak_left_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_left"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> GOLD_CLOAK_RIGHT_DECORATION = INSTANCE.addDyeableArmorDecorationItem("gold_cloak_right_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_right"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
    public static final RegistrySupplier<ArmorDecorationItem> DRAGON_DECORATION = INSTANCE.addArmorDecorationItem("dragon_decoration", () -> new ArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "dragon"), new Item.Properties(), ArmorItem.Type.HELMET));


    public static final RegistrySupplier<Item> SPEAR_PATTERN = INSTANCE.addIngredientItem("spear_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SPEAR_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> DORNISH_SUN_PATTERN = INSTANCE.addIngredientItem("dornish_sun_pattern", () -> new BannerPatternItem(ModBannerPatternTags.DORNISH_SUN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SUNS_PATTERN = INSTANCE.addIngredientItem("suns_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SUNS_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> MOONS_PATTERN = INSTANCE.addIngredientItem("moons_pattern", () -> new BannerPatternItem(ModBannerPatternTags.MOONS_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> BRIGHT_SUN_PATTERN = INSTANCE.addIngredientItem("bright_sun_pattern", () -> new BannerPatternItem(ModBannerPatternTags.BRIGHT_SUN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> STARK_PATTERN = INSTANCE.addIngredientItem("stark_pattern", () -> new BannerPatternItem(ModBannerPatternTags.STARK_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> KRAKEN_PATTERN = INSTANCE.addIngredientItem("kraken_pattern", () -> new BannerPatternItem(ModBannerPatternTags.KRAKEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> LANNISTER_PATTERN = INSTANCE.addIngredientItem("lannister_pattern", () -> new BannerPatternItem(ModBannerPatternTags.LANNISTER_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> TARGARYEN_PATTERN = INSTANCE.addIngredientItem("targaryen_pattern", () -> new BannerPatternItem(ModBannerPatternTags.TARGARYEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> STAG_PATTERN = INSTANCE.addIngredientItem("stag_pattern", () -> new BannerPatternItem(ModBannerPatternTags.STAG_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> ARRYN_PATTERN = INSTANCE.addIngredientItem("arryn_pattern", () -> new BannerPatternItem(ModBannerPatternTags.ARRYN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> ROSE_PATTERN = INSTANCE.addIngredientItem("rose_pattern", () -> new BannerPatternItem(ModBannerPatternTags.ROSE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> FISH_PATTERN = INSTANCE.addIngredientItem("fish_pattern", () -> new BannerPatternItem(ModBannerPatternTags.FISH_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> FALLEN_STAR_PATTERN = INSTANCE.addIngredientItem("fallen_star_pattern", () -> new BannerPatternItem(ModBannerPatternTags.FALLEN_STAR_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SWORD_PATTERN = INSTANCE.addIngredientItem("sword_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SWORD_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> ARROWS_PATTERN = INSTANCE.addIngredientItem("arrows_pattern", () -> new BannerPatternItem(ModBannerPatternTags.ARROWS_PATTERN, new Item.Properties().stacksTo(1)));



    public ModItems() {
        super(ASOIAFMod.MOD_ID);
    }
}
