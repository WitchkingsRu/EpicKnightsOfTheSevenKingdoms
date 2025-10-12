package net.ekotsk.item;

import com.magistuarmory.item.armor.ArmorType;
import dev.architectury.platform.Platform;
import net.ekotsk.ASOIAFMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;

public class ModArmorTypes {

    public static final ArmorType LANNISTER_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_helmet"), new ResourceLocation("ekotsk:lannister_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_LORD_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_helmet"), new ResourceLocation("ekotsk:lannister_lord_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 300 }, new Integer[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_CHESTPLATE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_chestplate"), new ResourceLocation("ekotsk:lannister_chestplate"), 0.0f, 0.0f, new Integer[] { 0, 0, 800, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_LORD_CHESTPLATE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_chestplate"), new ResourceLocation("ekotsk:lannister_lord_chestplate"), 0.0f, 0.0f, new Integer[] { 0, 0, 1000, 0 }, new Integer[] { 0, 0, 8, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_LEGGINGS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_leggings"), new ResourceLocation("ekotsk:lannister_leggings"), 0.0f, 0.0f, new Integer[] { 0, 600, 0, 0 }, new Integer[] { 0, 4, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_LORD_LEGGINGS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_lord_leggings"), new ResourceLocation("ekotsk:lannister_lord_leggings"), 0.0f, 0.0f, new Integer[] { 0, 600, 0, 0 }, new Integer[] { 0, 4, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType FANCY_BOOTS = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "fancy_boots"), new ResourceLocation("ekotsk:fancy_boots"), 0.0f, 0.0f, new Integer[] { 200, 0, 0, 0 }, new Integer[] { 3, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:leather" : "c:leather");

}
