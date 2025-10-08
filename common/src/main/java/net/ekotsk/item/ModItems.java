package net.ekotsk.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.WeaponTypes;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.misc.ModBannerPatternTags;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tiers;

public class ModItems extends ModItemsProvider {
    public static ModItems INSTANCE = new ModItems();
    public static ModItemTier VALYRIAN_STEEL = new ModItemTier("valyrian_steel", 4, 10800, 11.0F, 4.5F, 22, Platform.isForge() ? "forge:ingots/valyrian_steel" : "c:valyrian_steel_ingots", 5);

    public static final @Nullable RegistrySupplier<MedievalWeaponItem> ICE = INSTANCE.addMedievalWeaponItem("ice", new Item.Properties(), VALYRIAN_STEEL, WeaponTypes.ZWEIHANDER);


    public static final RegistrySupplier<Item> SPEAR_PATTERN = INSTANCE.addIngredientItem("spear_pattern", () -> new BannerPatternItem(ModBannerPatternTags.SPEAR_PATTERN, new Item.Properties().stacksTo(1)));
    public static final RegistrySupplier<Item> DORNISH_SUN_PATTERN = INSTANCE.addIngredientItem("dornish_sun_pattern", () -> new BannerPatternItem(ModBannerPatternTags.DORNISH_SUN_PATTERN, new Item.Properties().stacksTo(1)));

    public ModItems() {
        super(ASOIAFMod.MOD_ID);
    }
}
