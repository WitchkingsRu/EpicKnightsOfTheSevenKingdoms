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
    public static final ArmorType NORTHERN_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "northern_armor"), ResourceLocation.parse("ekotsk:northern_armor"), ARMOR_CONFIG.get("northern_armor"), SoundEvents.ARMOR_EQUIP_CHAIN, false, "c:ingots/steel");
    public static final ArmorType GREYJOY_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "greyjoy_armor"), ResourceLocation.parse("ekotsk:greyjoy_armor"), ARMOR_CONFIG.get("greyjoy_armor"), SoundEvents.ARMOR_EQUIP_CHAIN, false, "c:ingots/steel");
    public static final ArmorType NIGHT_WATCH_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "night_watch_armor"), ResourceLocation.parse("ekotsk:night_watch_armor"), ARMOR_CONFIG.get("night_watch_armor"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:ingots/blacked_steel");

    public static final ArmorType GOLD_CLOAK_OFFICER_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_officer_armor"), ResourceLocation.parse("ekotsk:gold_cloak_officer_armor"), ARMOR_CONFIG.get("gold_cloak_officer_armor"), SoundEvents.ARMOR_EQUIP_GOLD, false, "c:ingots/blacked_steel");
    public static final ArmorType DORNISH_PRINCE_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "dornish_prince_armor"), ResourceLocation.parse("ekotsk:dornish_prince_armor"), ARMOR_CONFIG.get("dornish_prince_armor"), SoundEvents.ARMOR_EQUIP_GOLD, true, "c:ingots/steel");
    public static final ArmorType PLATE_NORTHERN_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "plate_northern_armor"), ResourceLocation.parse("ekotsk:plate_northern_armor"), ARMOR_CONFIG.get("plate_northern_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");
    public static final ArmorType RICH_GREYJOY_ARMOR = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "rich_greyjoy_armor"), ResourceLocation.parse("ekotsk:rich_greyjoy_armor"), ARMOR_CONFIG.get("rich_greyjoy_armor"), SoundEvents.ARMOR_EQUIP_IRON, false, "c:ingots/steel");

    public static final ArmorType HAND_SIGN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "hand_sign"), ResourceLocation.parse("ekotsk:hand_sign"), ARMOR_CONFIG.get("hand_sign"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gilded_steel");
    public static final ArmorType AEGON_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "aegon_crown"), ResourceLocation.parse("ekotsk:aegon_crown"), ARMOR_CONFIG.get("aegon_crown"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");
    public static final ArmorType HOTD_AEGON_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "hotd_aegon_crown"), ResourceLocation.parse("ekotsk:hotd_aegon_crown"), ARMOR_CONFIG.get("hotd_aegon_crown"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");
    public static final ArmorType JAEHAERYS_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "jaehaerys_crown"), ResourceLocation.parse("ekotsk:jaehaerys_crown"), ARMOR_CONFIG.get("jaehaerys_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType HOTD_JAEHAERYS_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "hotd_jaehaerys_crown"), ResourceLocation.parse("ekotsk:hotd_jaehaerys_crown"), ARMOR_CONFIG.get("hotd_jaehaerys_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType AEGON_DRAGONBANE_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "aegon_dragonsbane_crown"), ResourceLocation.parse("ekotsk:aegon_dragonsbane_crown"), ARMOR_CONFIG.get("aegon_dragonsbane_crown"), SoundEvents.ARMOR_EQUIP_GOLD, false, "c:ingots/gold");
    public static final ArmorType AEGON_UNWORTHY_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "aegon_unworthy_crown"), ResourceLocation.parse("ekotsk:aegon_unworthy_crown"), ARMOR_CONFIG.get("aegon_unworthy_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType MAEKAR_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "maekar_crown"), ResourceLocation.parse("ekotsk:maekar_crown"), ARMOR_CONFIG.get("maekar_crown"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/valyrian_steel");
    public static final ArmorType HIGH_SEPTON_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "high_septon_crown"), ResourceLocation.parse("ekotsk:high_septon_crown"), ARMOR_CONFIG.get("high_septon_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType ROBERT_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "robert_crown"), ResourceLocation.parse("ekotsk:robert_crown"), ARMOR_CONFIG.get("robert_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType STANNIS_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "stannis_crown"), ResourceLocation.parse("ekotsk:stannis_crown"), ARMOR_CONFIG.get("stannis_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType RENLY_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "renly_crown"), ResourceLocation.parse("ekotsk:renly_crown"), ARMOR_CONFIG.get("renly_crown"), SoundEvents.ARMOR_EQUIP_DIAMOND, false, "c:ingots/gold");
    public static final ArmorType STARK_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "stark_crown"), ResourceLocation.parse("ekotsk:stark_crown"), ARMOR_CONFIG.get("stark_crown"), SoundEvents.ARMOR_EQUIP_NETHERITE, false, "c:ingots/bronze");
    public static final ArmorType DRIFTWOOD_CROWN = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "driftwood_crown"), ResourceLocation.parse("ekotsk:driftwood_crown"), ARMOR_CONFIG.get("driftwood_crown"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:rods/wooden");

    public static final ArmorType FANCY_CAPE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fancy_cape"), ResourceLocation.parse("ekotsk:fancy_cape"), ARMOR_CONFIG.get("fancy_cape"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");
    public static final ArmorType NIGHT_WATCH_CAPE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "night_watch_cape"), ResourceLocation.parse("ekotsk:night_watch_cape"), ARMOR_CONFIG.get("night_watch_cape"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType FUR_CAPE_PALE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fur_cape_pale"), ResourceLocation.parse("ekotsk:fur_cape_pale"), ARMOR_CONFIG.get("fur_cape_pale"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType FUR_CAPE_WHITE = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fur_cape_white"), ResourceLocation.parse("ekotsk:fur_cape_white"), ARMOR_CONFIG.get("fur_cape_white"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType FUR_CAPE_BLACK = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fur_cape_black"), ResourceLocation.parse("ekotsk:fur_cape_black"), ARMOR_CONFIG.get("fur_cape_black"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType FUR_CAPE_WOODS = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "fur_cape_woods"), ResourceLocation.parse("ekotsk:fur_cape_woods"), ARMOR_CONFIG.get("fur_cape_woods"), SoundEvents.ARMOR_EQUIP_LEATHER, false, "c:woolen_fabric");
    public static final ArmorType GOLD_CLOAK_RIGHT = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_right"), ResourceLocation.parse("ekotsk:gold_cloak_right"), ARMOR_CONFIG.get("gold_cloak_right"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");
    public static final ArmorType GOLD_CLOAK_LEFT = create(ARMOR_MATERIALS, ResourceLocation.fromNamespaceAndPath("ekotsk", "gold_cloak_left"), ResourceLocation.parse("ekotsk:gold_cloak_left"), ARMOR_CONFIG.get("gold_cloak_left"), SoundEvents.ARMOR_EQUIP_LEATHER, true, "c:woolen_fabric");


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
