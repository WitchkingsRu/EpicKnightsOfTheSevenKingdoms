package net.ekotsk.item;

import net.ekotsk.config.ArmorConfig;
import com.magistuarmory.item.armor.ArmorType;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorTypes {
    public static DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.ARMOR_MATERIAL);
    public static final ArmorConfig ARMOR_CONFIG = ASOIAFMod.CONFIG.armor;
    public static final ArmorType LANNISTER_HELMET = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_helmet"), ResourceLocation.parse("ekotsk:lannister_helmet"), ARMOR_CONFIG.get("lannister_helmet"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType LANNISTER_CHESTPLATE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_chestplate"), ResourceLocation.parse("ekotsk:lannister_chestplate"), ARMOR_CONFIG.get("lannister_chestplate"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType LANNISTER_LEGGINGS = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_leggings"), ResourceLocation.parse("ekotsk:lannister_leggings"), ARMOR_CONFIG.get("lannister_leggings"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType FANCY_BOOTS = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fancy_boots"), ResourceLocation.parse("ekotsk:fancy_boots"), ARMOR_CONFIG.get("fancy_boots"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:leather");

    public static final ArmorType LANNISTER_LORD_HELMET = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_lord_helmet"), ResourceLocation.parse("ekotsk:lannister_lord_helmet"), ARMOR_CONFIG.get("lannister_lord_helmet"), SoundEvents.ARMOR_EQUIP_GOLD, false, "c:ingots/steel");
    public static final ArmorType LANNISTER_LORD_CHESTPLATE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_lord_chestplate"), ResourceLocation.parse("ekotsk:lannister_lord_chestplate"), ARMOR_CONFIG.get("lannister_lord_chestplate"), SoundEvents.ARMOR_EQUIP_GOLD, false, "c:ingots/steel");
    public static final ArmorType LANNISTER_LORD_LEGGINGS = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "lannister_lord_leggings"), ResourceLocation.parse("ekotsk:lannister_lord_leggings"), ARMOR_CONFIG.get("lannister_lord_leggings"), SoundEvents.ARMOR_EQUIP_GOLD, false, "c:ingots/steel");

    public static final ArmorType VALYRIAN_STEEL_HELMET = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "valyrian_steel_helmet"), ResourceLocation.parse("ekotsk:valyrian_steel_helmet"), ARMOR_CONFIG.get("valyrian_steel_helmet"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");
    public static final ArmorType VALYRIAN_STEEL_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "valyrian_steel_armor"), ResourceLocation.parse("ekotsk:valyrian_steel_armor"), ARMOR_CONFIG.get("valyrian_steel_armor"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");

    public static final ArmorType HOTD_KINGSGUARD_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "hotd_kingsguard_armor"), ResourceLocation.parse("ekotsk:hotd_kingsguard_armor"), ARMOR_CONFIG.get("hotd_kingsguard_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType KOTSK_KINGSGUARD_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "kotsk_kingsguard_armor"), ResourceLocation.parse("ekotsk:kotsk_kingsguard_armor"), ARMOR_CONFIG.get("kotsk_kingsguard_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType KINGSGUARD_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "kingsguard_armor"), ResourceLocation.parse("ekotsk:kingsguard_armor"), ARMOR_CONFIG.get("kingsguard_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType KINGSGUARD_2_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "kingsguard_2_armor"), ResourceLocation.parse("ekotsk:kingsguard_2_armor"), ARMOR_CONFIG.get("kingsguard_2_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/gilded_steel");

    public static final ArmorType GOLD_CLOAK_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_armor"), ResourceLocation.parse("ekotsk:gold_cloak_armor"), ARMOR_CONFIG.get("gold_cloak_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/blacked_steel");
    public static final ArmorType KOTSK_GOLD_CLOAK_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_armor_kotsk"), ResourceLocation.parse("ekotsk:gold_cloak_armor_kotsk"), ARMOR_CONFIG.get("gold_cloak_armor_kotsk"), SoundEvents.ARMOR_EQUIP_CHAIN, false, "c:ingots/gilded_steel");
    public static final ArmorType GOT_GOLD_CLOAK_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_armor_got"), ResourceLocation.parse("ekotsk:gold_cloak_armor_got"), ARMOR_CONFIG.get("gold_cloak_armor_got"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/gilded_steel");

    public static final ArmorType DORNISH_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "dornish_armor"), ResourceLocation.parse("ekotsk:dornish_armor"), ARMOR_CONFIG.get("dornish_armor"), SoundEvents.ARMOR_EQUIP_IRON, true, "c:ingots/steel");
    public static final ArmorType NORTHERN_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "northern_armor"), ResourceLocation.parse("ekotsk:northern_armor"), ARMOR_CONFIG.get("northern_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType GREYJOY_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "greyjoy_armor"), ResourceLocation.parse("ekotsk:greyjoy_armor"), ARMOR_CONFIG.get("greyjoy_armor"), SoundEvents.ARMOR_EQUIP_CHAIN, false, "c:ingots/steel");
    public static final ArmorType NIGHT_WATCH_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "night_watch_armor"), ResourceLocation.parse("ekotsk:night_watch_armor"), ARMOR_CONFIG.get("night_watch_armor"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:ingots/blacked_steel");

    public static final ArmorType HAND_SIGN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "hand_sign"), ResourceLocation.parse("ekotsk:hand_sign"), ARMOR_CONFIG.get("hand_sign"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gilded_steel");
    public static final ArmorType AEGON_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "aegon_crown"), ResourceLocation.parse("ekotsk:aegon_crown"), ARMOR_CONFIG.get("aegon_crown"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");
    public static final ArmorType FANCY_CAPE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fancy_cape"), ResourceLocation.parse("ekotsk:fancy_cape"), ARMOR_CONFIG.get("fancy_cape"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");
    public static final ArmorType NIGHT_WATCH_CAPE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "night_watch_cape"), ResourceLocation.parse("ekotsk:night_watch_cape"), ARMOR_CONFIG.get("night_watch_cape"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType GOLD_CLOAK_RIGHT = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_right"), ResourceLocation.parse("ekotsk:gold_cloak_right"), ARMOR_CONFIG.get("gold_cloak_right"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");
    public static final ArmorType GOLD_CLOAK_LEFT = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_left"), ResourceLocation.parse("ekotsk:gold_cloak_left"), ARMOR_CONFIG.get("gold_cloak_left"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");

    //    public static final ArmorType LANNISTER_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_helmet"), new ResourceLocation("ekotsk:lannister_helmet"), 0.5f, 0.0f, new Integer[] { 0, 0, 0, 240 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType LANNISTER_LORD_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_helmet"), new ResourceLocation("ekotsk:lannister_lord_helmet"), 1.3f, 0.5f, new Integer[] { 0, 0, 0, 275 }, new Integer[] { 0, 0, 0, 3 }, 10, SoundEvents.ARMOR_EQUIP_GOLD, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType LANNISTER_CHESTPLATE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_chestplate"), new ResourceLocation("ekotsk:lannister_chestplate"), 0.5f, 0.0f, new Integer[] { 0, 0, 290, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType LANNISTER_LORD_CHESTPLATE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_chestplate"), new ResourceLocation("ekotsk:lannister_lord_chestplate"), 1.3f, 0.5f, new Integer[] { 0, 0, 340, 0 }, new Integer[] { 0, 0, 8, 0 }, 10, SoundEvents.ARMOR_EQUIP_GOLD, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType LANNISTER_LEGGINGS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_leggings"), new ResourceLocation("ekotsk:lannister_leggings"), 0.5f, 0.0f, new Integer[] { 0, 235, 0, 0 }, new Integer[] { 0, 5, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType LANNISTER_LORD_LEGGINGS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_leggings"), new ResourceLocation("ekotsk:lannister_lord_leggings"), 1.3f, 0.5f, new Integer[] { 0, 315, 0, 0 }, new Integer[] { 0, 5, 0, 0 }, 10, SoundEvents.ARMOR_EQUIP_GOLD, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType FANCY_BOOTS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "fancy_boots"), new ResourceLocation("ekotsk:fancy_boots"), 0.0f, 0.0f, new Integer[] { 200, 0, 0, 0 }, new Integer[] { 2, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:leather" : "c:leather");
//
//    public static final ArmorType VALYRIAN_STEEL_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "valyrian_steel_helmet"), new ResourceLocation("ekotsk:valyrian_steel_helmet"), 4.0f, 0.3f, new Integer[] { 0, 0, 0, 5000 }, new Integer[] { 0, 0, 0, 4 }, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, true, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots");
//    public static final ArmorType VALYRIAN_STEEL_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "valyrian_steel_armor"), new ResourceLocation("ekotsk:valyrian_steel_armor"), 4.0f, 0.3f, new Integer[] { 5000, 7000, 10000, 0 }, new Integer[] { 4, 7, 9, 0 }, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, true, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots");
//
//    public static final ArmorType HOTD_KINGSGUARD_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "hotd_kingsguard_armor"), new ResourceLocation("ekotsk:hotd_kingsguard_armor"), 1.3f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType KOTSK_KINGSGUARD_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "kotsk_kingsguard_armor"), new ResourceLocation("ekotsk:kotsk_kingsguard_armor"), 1.3f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType KINGSGUARD_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "kingsguard_armor"), new ResourceLocation("ekotsk:kingsguard_armor"), 1.3f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType KINGSGUARD_2_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "kingsguard_2_armor"), new ResourceLocation("ekotsk:kingsguard_2_armor"), 1.3f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//
//    public static final ArmorType GOLD_CLOAK_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_armor"), new ResourceLocation("ekotsk:gold_cloak_armor"), 0.5f, 0.1f, new Integer[] { 210, 300, 320, 250 }, new Integer[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/blacked_steel" : "c:blacked_steel_ingots");
//    public static final ArmorType KOTSK_GOLD_CLOAK_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_armor_kotsk"), new ResourceLocation("ekotsk:gold_cloak_armor_kotsk"), 0.5f, 0.1f, new Integer[] { 150, 230, 250, 205 }, new Integer[] { 1, 4, 5, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, true, Platform.isForge() ? "forge:ingots/gilded_steel" : "c:gilded_steel_ingots");
//    public static final ArmorType GOT_GOLD_CLOAK_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_armor_got"), new ResourceLocation("ekotsk:gold_cloak_armor_got"), 0.5f, 0.1f, new Integer[] { 0, 235, 290, 240 }, new Integer[] { 0, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, true, Platform.isForge() ? "forge:ingots/gilded_steel" : "c:gilded_steel_ingots");
//
//    public static final ArmorType DORNISH_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "dornish_armor"), new ResourceLocation("ekotsk:dornish_armor"), 0.5f, 0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 4, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType GREYJOY_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "greyjoy_armor"), new ResourceLocation("ekotsk:greyjoy_armor"), 0.5f, 0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 4, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//    public static final ArmorType NIGHT_WATCH_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "night_watch_armor"), new ResourceLocation("ekotsk:night_watch_armor"), 0.5f, 0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 5, 6, 1 }, 8, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:ingots/blacked_steel" : "c:blacked_steel_ingots");
//    public static final ArmorType NORTHERN_ARMOR = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "northern_armor"), new ResourceLocation("ekotsk:northern_armor"), 0.5f, 0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
//
//
//    public static final ArmorType HAND_SIGN = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "hand_sign"), new ResourceLocation("ekotsk:hand_sign"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 1, 0 }, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, true, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");
//    public static final ArmorType FANCY_CAPE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "cape"), new ResourceLocation("ekotsk:cape"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");
//    public static final ArmorType NIGHT_WATCH_CAPE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "night_watch_cape"), new ResourceLocation("ekotsk:night_watch_cape"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");
//    public static final ArmorType GOLD_CLOAK_LEFT = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_left"), new ResourceLocation("ekotsk:gold_cloak_left"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");
//    public static final ArmorType GOLD_CLOAK_RIGHT = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "gold_cloak_right"), new ResourceLocation("ekotsk:gold_cloak_right"), 0.0f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, true, Platform.isForge() ? "forge:ingots/bronze" : "c:bronze_ingots");
//
//    public static final ArmorType AEGON_CROWN = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "aegon_crown"), new ResourceLocation("ekotsk:aegon_crown"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 5000 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_NETHERITE, true, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots");
    private static ArmorType create(DeferredRegister<ArmorMaterial> armorMaterial,
                                    ResourceLocation location,
                                    ResourceLocation modelLocation,
                                    ArmorConfig.ArmorTypeConfig config,
                                    Holder<SoundEvent> equipSound,
                                    boolean dyeable,
                                    String repairItemTag) {
        return new ArmorType(armorMaterial, location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, config.enabled, dyeable, repairItemTag);
    }

    private static ArmorType create(DeferredRegister<ArmorMaterial> armorMaterial,
                                    ResourceLocation location,
                                    ResourceLocation modelLocation,
                                    ArmorConfig.ArmorTypeConfig config,
                                    Holder<SoundEvent> equipSound,
                                    boolean dyeable,
                                    Supplier<Ingredient> ingredientSupplier) {
        return new ArmorType(armorMaterial, location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, config.enabled, dyeable, ingredientSupplier);
    }

    private static ArmorType create(DeferredRegister<ArmorMaterial> armorMaterial,
                                    ResourceLocation location,
                                    ResourceLocation modelLocation,
                                    ArmorConfig.ArmorTypeConfig config,
                                    Holder<SoundEvent> equipSound,
                                    boolean dyeable) {
        return new ArmorType(armorMaterial, location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, dyeable, config.enabled);
    }

    public static void init() {
        ARMOR_MATERIALS.register();
    }
}
