package net.ekotsk.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.ItemRegistryHelper;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.DyeableMedievalArmorItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.WearableArmorDecorationItem;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.misc.ModBannerPatternTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.List;

public class ModItems extends ModItemsProvider {
    public static ModItems INSTANCE = new ModItems();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.ITEM);
    public static ModItemTier VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 11.0F, 5.5F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);
    public static ModItemTier FINE_VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 12.0F, 6.0F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);
    public static ModItemTier WEAK_VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 10.0F, 5.0F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);

    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ICE = INSTANCE.addMedievalWeaponItem("ice", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> BLACKFYRE = INSTANCE.addMedievalWeaponItem("blackfyre", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DARK_SISTER = INSTANCE.addMedievalWeaponItem("dark_sister", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> AEGON_DAGGER = INSTANCE.addMedievalWeaponItem("aegon_dagger", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.STILETTO);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> CRAB_PINCER = INSTANCE.addMedievalWeaponItem("crab_pincer", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.LOCHABER_AXE);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> DAWN = INSTANCE.addMedievalWeaponItem("dawn", new Item.Properties(), FINE_VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LAMENTATION = INSTANCE.addMedievalWeaponItem("lamentation", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LONGCLAW = INSTANCE.addMedievalWeaponItem("longclaw", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> NIGHTFALL = INSTANCE.addMedievalWeaponItem("nightfall", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ESTOC);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ORPHANMAKER = INSTANCE.addMedievalWeaponItem("orphanmaker", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> BRIGHTROAR = INSTANCE.addMedievalWeaponItem("brightroar", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> RED_RAIN = INSTANCE.addMedievalWeaponItem("red_rain", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ROBERT_HAMMER = INSTANCE.addMedievalWeaponItem("robert_hammer", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.LUCERNE_HAMMER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> TRUTH = INSTANCE.addMedievalWeaponItem("truth", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> VIGILANCE = INSTANCE.addMedievalWeaponItem("vigilance", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> LADY_FORLORN = INSTANCE.addMedievalWeaponItem("lady_forlorn", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> HEARTSBANE = INSTANCE.addMedievalWeaponItem("heartsbane", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);
    public static final @Nullable RegistrySupplier<MedievalWeaponItem> SANDOQ = INSTANCE.addMedievalWeaponItem("sandoq", new Item.Properties(), WEAK_VALYRIAN_STEEL, WeaponTypes.BASTARD_SWORD);

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

    public static final @Nullable RegistrySupplier<MedievalArmorItem> NIGHT_WATCH_HAT = INSTANCE.addMedievalArmorItem("night_watch_hat", ModArmorTypes.NIGHT_WATCH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties());
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
    public static final RegistrySupplier<WearableArmorDecorationItem> HOTD_AEGON_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("hotd_aegon_crown_decoration", ModArmorTypes.HOTD_AEGON_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> JAEHAERYS_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("jaehaerys_crown_decoration", ModArmorTypes.JAEHAERYS_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> HOTD_JAEHAERYS_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("hotd_jaehaerys_crown_decoration", ModArmorTypes.HOTD_JAEHAERYS_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> AEGON_DRAGONSBANE_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("aegon_dragonsbane_crown_decoration", ModArmorTypes.AEGON_DRAGONSBANE_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> AEGON_UNWORTHY_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("aegon_unworthy_crown_decoration", ModArmorTypes.AEGON_UNWORTHY_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> MAEKAR_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("maekar_crown_decoration", ModArmorTypes.MAEKAR_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> HIGH_SEPTON_CROWN = INSTANCE.addMedievalArmorItem("high_septon_crown", ModArmorTypes.HIGH_SEPTON_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> ROBERT_CROWN_DECORATION = INSTANCE.addWearableArmorDecorationItem("robert_crown_decoration", ModArmorTypes.ROBERT_CROWN, ArmorItem.Type.HELMET, new Item.Properties());
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
    public static final RegistrySupplier<Item> WEIRWOOD_PATTERN = INSTANCE.addIngredientItem("weirwood_pattern", () -> new BannerPatternItem(ModBannerPatternTags.WEIRWOOD_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> CARRIED_SHIELD_PATTERN = INSTANCE.addIngredientItem("carried_shield_pattern", () -> new BannerPatternItem(ModBannerPatternTags.CARRIED_SHIELD_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SEAHORSE_PATTERN = INSTANCE.addIngredientItem("seahorse_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SEAHORSE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HIGHTOWER_PATTERN = INSTANCE.addIngredientItem("hightower_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HIGHTOWER_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> BEACON_PATTERN = INSTANCE.addIngredientItem("beacon_pattern", () -> new BannerPatternItem(ModBannerPatternTags.BEACON_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> GRAPE_PATTERN = INSTANCE.addIngredientItem("grape_pattern", () -> new BannerPatternItem(ModBannerPatternTags.GRAPE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SCYTHE_PATTERN = INSTANCE.addIngredientItem("scythe_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SCYTHE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> BONEHAND_PATTERN = INSTANCE.addIngredientItem("bonehand_pattern", () -> new BannerPatternItem(ModBannerPatternTags.BONEHAND_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HORN_PATTERN = INSTANCE.addIngredientItem("horn_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HORN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SEVEN_PATTERN = INSTANCE.addIngredientItem("seven_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SEVEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> WYL_PATTERN = INSTANCE.addIngredientItem("wyl_pattern", () -> new BannerPatternItem(ModBannerPatternTags.WYL_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> PRANCING_HORSE_PATTERN = INSTANCE.addIngredientItem("prancing_horse_pattern", () -> new BannerPatternItem(ModBannerPatternTags.PRANCING_HORSE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HORSE_HEAD_PATTERN = INSTANCE.addIngredientItem("horse_head_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HORSE_HEAD_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> CIRCLES_PATTERN = INSTANCE.addIngredientItem("wreaths_pattern", () -> new BannerPatternItem(ModBannerPatternTags.CIRCLES_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HOG_PATTERN = INSTANCE.addIngredientItem("hog_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HOG_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> SHIELD_PATTERN = INSTANCE.addIngredientItem("shield_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SHIELD_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HUNTER_PATTERN = INSTANCE.addIngredientItem("hunter_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HUNTER_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> TWO_TOWERS_PATTERN = INSTANCE.addIngredientItem("two_towers_pattern", () -> new BannerPatternItem(ModBannerPatternTags.TWO_TOWERS_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> THREE_TOWERS_PATTERN = INSTANCE.addIngredientItem("three_towers_pattern", () -> new BannerPatternItem(ModBannerPatternTags.THREE_TOWERS_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> APPLE_PATTERN = INSTANCE.addIngredientItem("apple_pattern", () -> new BannerPatternItem(ModBannerPatternTags.APPLE_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> HIVES_PATTERN = INSTANCE.addIngredientItem("hives_pattern", () -> new BannerPatternItem(ModBannerPatternTags.HIVES_PATTERN, new Item.Properties().stacksTo(1)));

    public static final RegistrySupplier<Item> BLACK_LEATHER = INSTANCE.addIngredientItem("black_leather", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_WOOLEN_FABRIC = INSTANCE.addIngredientItem("black_woolen_fabric", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_INGOT = INSTANCE.addIngredientItem("blacked_steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_NUGGET = INSTANCE.addIngredientItem("blacked_steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_PLATE = INSTANCE.addIngredientItem("blacked_steel_plate", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_RING = INSTANCE.addIngredientItem("blacked_steel_ring", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_CHAINMAIL = INSTANCE.addIngredientItem("blacked_steel_chainmail", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_LAMELLAR = INSTANCE.addIngredientItem("blacked_steel_lamellar", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BLACK_STEEL_SMALL_PLATE = INSTANCE.addIngredientItem("blacked_steel_small_plate", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> GILDED_STEEL_INGOT = INSTANCE.addIngredientItem("gilded_steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GILDED_STEEL_NUGGET = INSTANCE.addIngredientItem("gilded_steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GILDED_STEEL_PLATE = INSTANCE.addIngredientItem("gilded_steel_plate", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GILDED_STEEL_RING = INSTANCE.addIngredientItem("gilded_steel_ring", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GILDED_STEEL_CHAINMAIL = INSTANCE.addIngredientItem("gilded_steel_chainmail", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GILDED_STEEL_SMALL_PLATE = INSTANCE.addIngredientItem("gilded_steel_small_plate", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> WEIRWOOD_STICK = INSTANCE.addIngredientItem("weirwood_stick", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> WHITENING_TEMPLATE = INSTANCE.addIngredientItem("whitening_template", () -> new SmithingTemplateItem(Component.translatable("ekotsk.whitening_template.applies_to"), Component.translatable("ekotsk.whitening_template.ingredients"), Component.translatable("ekotsk.whitening_template.upgrade_description"), Component.translatable("ekotsk.whitening_template.base_slot_description"), Component.translatable("ekotsk.whitening_template.additions_slot_description"), List.of(), List.of()));

    public static final RegistrySupplier<Item> WEIRWOOD_LOG_BLOCK = ITEMS.register("weirwood_log", () ->
            new BlockItem(ModBlocks.WEIRWOOD_LOG.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_WOOD_BLOCK = ITEMS.register("weirwood_wood", () ->
            new BlockItem(ModBlocks.WEIRWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> STRIPPED_WEIRWOOD_WOOD_BLOCK = ITEMS.register("stripped_weirwood_wood", () ->
            new BlockItem(ModBlocks.STRIPPED_WEIRWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_FACE_GRIM_BLOCK = ITEMS.register("weirwood_face_grim", () ->
            new BlockItem(ModBlocks.WEIRWOOD_FACE_GRIM.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_FACE_HAPPY_BLOCK = ITEMS.register("weirwood_face_happy", () ->
            new BlockItem(ModBlocks.WEIRWOOD_FACE_HAPPY.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_FACE_EASTER_EGG_BLOCK = ITEMS.register("weirwood_face_easter_egg", () ->
            new BlockItem(ModBlocks.WEIRWOOD_FACE_ROBLOX.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_LEAVES_BLOCK = ITEMS.register("weirwood_leaves", () ->
            new BlockItem(ModBlocks.WEIRWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> STRIPPED_WEIRWOOD_LOG_BLOCK = ITEMS.register("stripped_weirwood_log", () ->
            new BlockItem(ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_SAPLING = ITEMS.register("weirwood_sapling", () ->
            new BlockItem(ModBlocks.WEIRWOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_PLANKS_BLOCK = ITEMS.register("weirwood_planks", () ->
            new BlockItem(ModBlocks.WEIRWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_STAIRS_BLOCK = ITEMS.register("weirwood_stairs", () ->
            new BlockItem(ModBlocks.WEIRWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_SLAB_BLOCK = ITEMS.register("weirwood_slab", () ->
            new BlockItem(ModBlocks.WEIRWOOD_SLAB.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_FENCE_BLOCK = ITEMS.register("weirwood_fence", () ->
            new BlockItem(ModBlocks.WEIRWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_FENCE_GATE_BLOCK = ITEMS.register("weirwood_fence_gate", () ->
            new BlockItem(ModBlocks.WEIRWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_TRAPDOOR_BLOCK = ITEMS.register("weirwood_trapdoor", () ->
            new BlockItem(ModBlocks.WEIRWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_DOOR_BLOCK = ITEMS.register("weirwood_door", () ->
            new BlockItem(ModBlocks.WEIRWOOD_DOOR.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_PRESSURE_PLATE_BLOCK = ITEMS.register("weirwood_pressure_plate", () ->
            new BlockItem(ModBlocks.WEIRWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_BUTTON_BLOCK = ITEMS.register("weirwood_button", () ->
            new BlockItem(ModBlocks.WEIRWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> WEIRWOOD_SIGN_BLOCK = ITEMS.register("weirwood_sign", () ->
            new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WEIRWOOD_SIGN.get(), ModBlocks.WEIRWOOD_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> WEIRWOOD_HANGING_SIGN_BLOCK = ITEMS.register("weirwood_hanging_sign", () ->
            new HangingSignItem(ModBlocks.WEIRWOOD_HANGING_SIGN.get(), ModBlocks.WEIRWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistrySupplier<Item> WEIRWOOD_LONGBOW = INSTANCE.addWeirwoodBowItem("weirwood_longbow", ModWeaponTypes.WEIRWOOD_LONGBOW);
    public static final RegistrySupplier<Item> WEIRWOOD_ARROW = ITEMS.register("weirwood_arrow", () ->
            new WeirwoodArrowItem(new Item.Properties()));

    @Nullable
    public RegistrySupplier<Item> addWeirwoodBowItem(String id, RangedWeaponType type) {
        if (type.isDisabled()) {
            return null;
        } else {
            RegistrySupplier<Item> bow = this.items.register(id, () -> new WeirwoodBowItem((new Item.Properties()).stacksTo(1).defaultDurability(type.getDurability()), type.getProjectileSpeed(), (float)type.getPullTime()));
            this.rangedWeaponItems.add(bow);
            return bow;
        }
    }
    public ModItems() {
        super(ASOIAFMod.MOD_ID);
    }
}
