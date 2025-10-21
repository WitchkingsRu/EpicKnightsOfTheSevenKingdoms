package net.ekotsk.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.*;
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
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tiers;

public class ModItems extends ModItemsProvider {
    public static ModItems INSTANCE = new ModItems();
    public static ModItemTier VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 11.0F, 5.5F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);

    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ICE = INSTANCE.addMedievalWeaponItem("ice", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> BLACKFYRE = INSTANCE.addMedievalWeaponItem("blackfyre", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DARK_SISTER = INSTANCE.addMedievalWeaponItem("dark_sister", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> AEGON_DAGGER = INSTANCE.addMedievalWeaponItem("aegon_dagger", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.STILETTO);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> CRAB_PINCER = INSTANCE.addMedievalWeaponItem("crab_pincer", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.LOCHABER_AXE);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DAWN = INSTANCE.addMedievalWeaponItem("dawn", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LAMENTATION = INSTANCE.addMedievalWeaponItem("lamentation", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LONGCLAW = INSTANCE.addMedievalWeaponItem("longclaw", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> NIGHTFALL = INSTANCE.addMedievalWeaponItem("nightfall", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ESTOC);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> OATHKEEPER = INSTANCE.addMedievalWeaponItem("oathkeeper", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> RED_RAIN = INSTANCE.addMedievalWeaponItem("red_rain", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ROBERT_HAMMER = INSTANCE.addMedievalWeaponItem("robert_hammer", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.LUCERNE_HAMMER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> TRUTH = INSTANCE.addMedievalWeaponItem("truth", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> VIGILANCE = INSTANCE.addMedievalWeaponItem("vigilance", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);


    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_HELMET = INSTANCE.addMedievalArmorItem("lannister_helmet", ModArmorTypes.LANNISTER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_HELMET = INSTANCE.addMedievalArmorItem("lannister_lord_helmet", ModArmorTypes.LANNISTER_LORD_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_chestplate", ModArmorTypes.LANNISTER_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_lord_chestplate", ModArmorTypes.LANNISTER_LORD_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_leggings", ModArmorTypes.LANNISTER_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_lord_leggings", ModArmorTypes.LANNISTER_LORD_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> FANCY_BOOTS = INSTANCE.addMedievalArmorItem("fancy_boots", ModArmorTypes.FANCY_BOOTS, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final RegistrySupplier<WearableArmorDecorationItem> HAND_SIGN_DECORATION = INSTANCE.addWearableArmorDecorationItem("hand_sign_decoration", ModArmorTypes.HAND_SIGN, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> AEGON_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("aegon_crown_decoration", ModArmorTypes.AEGON_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<DyeableArmorDecorationItem> FANCY_CAPE_DECORATION = INSTANCE.addDyeableArmorDecorationItem("fancy_cape_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "fancy_cape"), new Item.Properties(), ArmorItem.Type.CHESTPLATE, 0xFFFFFF));
    public static final RegistrySupplier<ArmorDecorationItem> DRAGON_DECORATION = INSTANCE.addArmorDecorationItem("dragon_decoration", () -> new ArmorDecorationItem(new ResourceLocation(ASOIAFMod.MOD_ID, "dragon"), new Item.Properties(), ArmorItem.Type.HELMET));


    public static final RegistrySupplier<Item> SPEAR_PATTERN = INSTANCE.addIngredientItem("spear_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SPEAR_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> DORNISH_SUN_PATTERN = INSTANCE.addIngredientItem("dornish_sun_pattern", () -> new BannerPatternItem(ModBannerPatternTags.DORNISH_SUN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> STARK_PATTERN = INSTANCE.addIngredientItem("stark_pattern", () -> new BannerPatternItem(ModBannerPatternTags.STARK_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> KRAKEN_PATTERN = INSTANCE.addIngredientItem("kraken_pattern", () -> new BannerPatternItem(ModBannerPatternTags.KRAKEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> LANNISTER_PATTERN = INSTANCE.addIngredientItem("lannister_pattern", () -> new BannerPatternItem(ModBannerPatternTags.LANNISTER_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> TARGARYEN_PATTERN = INSTANCE.addIngredientItem("targaryen_pattern", () -> new BannerPatternItem(ModBannerPatternTags.TARGARYEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> STAG_PATTERN = INSTANCE.addIngredientItem("stag_pattern", () -> new BannerPatternItem(ModBannerPatternTags.STAG_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> ARRYN_PATTERN = INSTANCE.addIngredientItem("arryn_pattern", () -> new BannerPatternItem(ModBannerPatternTags.ARRYN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> ROSE_PATTERN = INSTANCE.addIngredientItem("rose_pattern", () -> new BannerPatternItem(ModBannerPatternTags.ROSE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> FISH_PATTERN = INSTANCE.addIngredientItem("fish_pattern", () -> new BannerPatternItem(ModBannerPatternTags.FISH_PATTERN, new Item.Properties().stacksTo(1)));



    public ModItems() {
        super(ASOIAFMod.MOD_ID);
    }
}
