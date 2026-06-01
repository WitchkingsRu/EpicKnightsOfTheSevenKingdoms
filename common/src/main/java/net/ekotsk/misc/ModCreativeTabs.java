package net.ekotsk.misc;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.magistuarmory.misc.ModCreativeTabs.append;
import static com.magistuarmory.misc.ModCreativeTabs.createTab;
import static dev.architectury.registry.CreativeTabRegistry.appendStack;

public class ModCreativeTabs {
    static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.CREATIVE_MODE_TAB);
    static final RegistrySupplier<CreativeModeTab> ASOIAF_WEAPONS = createTab("asoiaf_weapons", ModItems.ICE);
    static final RegistrySupplier<CreativeModeTab> ASOIAF_ARMOR = createTab("asoiaf_armor", ModItems.LANNISTER_HELMET);
    public static final ResourceKey<CreativeModeTab> INGRIDIENTS_RESOURCE_KEY = CreativeModeTabs.INGREDIENTS;

    public static final ResourceKey<CreativeModeTab> WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ASOIAFMod.MOD_ID, "asoiaf_weapons"));

    public static void init() {
        TABS.register();
        append(ASOIAF_WEAPONS, ModItems.AEGON_DAGGER);
        append(ASOIAF_WEAPONS, ModItems.BLACKFYRE);
        append(ASOIAF_WEAPONS, ModItems.DARK_SISTER);
        append(ASOIAF_WEAPONS, ModItems.ICE);
        append(ASOIAF_WEAPONS, ModItems.CRAB_PINCER);
        append(ASOIAF_WEAPONS, ModItems.DAWN);
        append(ASOIAF_WEAPONS, ModItems.LAMENTATION);
        append(ASOIAF_WEAPONS, ModItems.LONGCLAW);
        append(ASOIAF_WEAPONS, ModItems.NIGHTFALL);
        append(ASOIAF_WEAPONS, ModItems.OATHKEEPER);
        append(ASOIAF_WEAPONS, ModItems.RED_RAIN);
        append(ASOIAF_WEAPONS, ModItems.ROBERT_HAMMER);
        append(ASOIAF_WEAPONS, ModItems.TRUTH);
        append(ASOIAF_WEAPONS, ModItems.VIGILANCE);
        append(ASOIAF_WEAPONS, ModItems.LADY_FORLORN);
        append(ASOIAF_WEAPONS, ModItems.HEARTSBANE);
        append(ASOIAF_WEAPONS, ModItems.SANDOQ);

        append(ASOIAF_ARMOR, ModItems.LANNISTER_HELMET);
        appendStack(ASOIAF_ARMOR, LANNISTER_CHESTPLATE_SUPPLIER);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.FANCY_BOOTS);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LORD_HELMET);
        appendStack(ASOIAF_ARMOR, LANNISTER_LORD_CHESTPLATE_SUPPLIER);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LORD_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.VALYRIAN_STEEL_HELMET);
        append(ASOIAF_ARMOR, ModItems.VALYRIAN_STEEL_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.VALYRIAN_STEEL_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.VALYRIAN_STEEL_BOOTS);
        append(ASOIAF_ARMOR, ModItems.NIGHT_WATCH_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.NIGHT_WATCH_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.NIGHT_WATCH_BOOTS);
        append(ASOIAF_ARMOR, ModItems.NORTHERN_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.NORTHERN_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.NORTHERN_BOOTS);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_HELMET);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_BOOTS);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_HELMET);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_BOOTS);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_2_HELMET);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_2_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_2_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.KINGSGUARD_2_BOOTS);
        append(ASOIAF_ARMOR, ModItems.DORNISH_HELMET);
        append(ASOIAF_ARMOR, ModItems.DORNISH_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.DORNISH_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.DORNISH_BOOTS);

        append(ASOIAF_ARMOR, ModItems.HAND_SIGN_DECORATION);
        append(ASOIAF_ARMOR, ModItems.FANCY_CAPE_DECORATION);
        append(ASOIAF_ARMOR, ModItems.NIGHT_WATCH_CAPE_DECORATION);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_LEFT_DECORATION);
        append(ASOIAF_ARMOR, ModItems.GOLD_CLOAK_RIGHT_DECORATION);
        append(ASOIAF_ARMOR, ModItems.AEGON_CROWN_DECORATION);
        append(ASOIAF_ARMOR, ModItems.DRAGON_DECORATION);

        append(INGRIDIENTS_RESOURCE_KEY, ModItems.SPEAR_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.DORNISH_SUN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.STARK_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.KRAKEN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.LANNISTER_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.TARGARYEN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.STAG_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.ARRYN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.ROSE_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.FISH_PATTERN);

    }
    static Supplier<ItemStack> LANNISTER_CHESTPLATE_SUPPLIER
            = () -> ModItems.getDecoratedStack(ModItems.LANNISTER_CHESTPLATE, ModItems.LANNISTER_CAPE_DECORATION);
    static Supplier<ItemStack> LANNISTER_LORD_CHESTPLATE_SUPPLIER
            = () -> ModItems.getDecoratedStack(ModItems.LANNISTER_LORD_CHESTPLATE, ModItems.LANNISTER_CAPE_DECORATION);
}
