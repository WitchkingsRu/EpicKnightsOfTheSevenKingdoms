package net.ekotsk.item;

import com.magistuarmory.item.armor.ArmorType;
import dev.architectury.platform.Platform;
import net.ekotsk.ASOIAFMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;

public class ModArmorTypes {

    public static final ArmorType LANNISTER_HELMET = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_helmet"), new ResourceLocation("ekotsk:lannister_helmet"), 0.0f, 0.0f, new Integer[] { 0, 0, 0, 160 }, new Integer[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
    public static final ArmorType LANNISTER_CHESTPLATE = new ArmorType(new ResourceLocation(ASOIAFMod.MOD_ID, "lannister_chestplate"), new ResourceLocation("ekotsk:lannister_chestplate"), 0.0f, 0.0f, new Integer[] { 0, 0, 800, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

}
