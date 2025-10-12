package net.ekotsk.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.WeaponTypes;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.misc.ModBannerPatternTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tiers;

public class ModItems extends ModItemsProvider {
    public static ModItems INSTANCE = new ModItems();
    public static ModItemTier VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 5, 10800, 11.0F, 5.5F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 6);

    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ICE = INSTANCE.addMedievalWeaponItem("ice", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_HELMET = INSTANCE.addMedievalArmorItem("lannister_helmet", ModArmorTypes.LANNISTER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_HELMET = INSTANCE.addMedievalArmorItem("lannister_lord_helmet", ModArmorTypes.LANNISTER_LORD_HELMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_chestplate", ModArmorTypes.LANNISTER_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_CHESTPLATE = INSTANCE.addMedievalArmorItem("lannister_lord_chestplate", ModArmorTypes.LANNISTER_LORD_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_leggings", ModArmorTypes.LANNISTER_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> LANNISTER_LORD_LEGGINGS = INSTANCE.addMedievalArmorItem("lannister_lord_leggings", ModArmorTypes.LANNISTER_LORD_LEGGINGS, ArmorItem.Type.LEGGINGS, new Item.Properties());
    public static final @Nullable RegistrySupplier<MedievalArmorItem> FANCY_BOOTS = INSTANCE.addMedievalArmorItem("fancy_boots", ModArmorTypes.FANCY_BOOTS, ArmorItem.Type.BOOTS, new Item.Properties());



    public static final RegistrySupplier<Item> SPEAR_PATTERN = INSTANCE.addIngredientItem("spear_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SPEAR_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> DORNISH_SUN_PATTERN = INSTANCE.addIngredientItem("dornish_sun_pattern", () -> new BannerPatternItem(ModBannerPatternTags.DORNISH_SUN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> STARK_PATTERN = INSTANCE.addIngredientItem("stark_pattern", () -> new BannerPatternItem(ModBannerPatternTags.STARK_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> KRAKEN_PATTERN = INSTANCE.addIngredientItem("kraken_pattern", () -> new BannerPatternItem(ModBannerPatternTags.KRAKEN_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> LANNISTER_PATTERN = INSTANCE.addIngredientItem("lannister_pattern", () -> new BannerPatternItem(ModBannerPatternTags.LANNISTER_PATTERN, new Item.Properties().stacksTo(1)));



    public ModItems() {
        super(ASOIAFMod.MOD_ID);
    }
}
