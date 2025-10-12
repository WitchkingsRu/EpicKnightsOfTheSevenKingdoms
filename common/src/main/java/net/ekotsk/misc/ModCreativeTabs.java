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

import static com.magistuarmory.misc.ModCreativeTabs.append;
import static com.magistuarmory.misc.ModCreativeTabs.createTab;

public class ModCreativeTabs {
    static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.CREATIVE_MODE_TAB);
    static final RegistrySupplier<CreativeModeTab> ASOIAF_WEAPONS = createTab("asoiaf_weapons", ModItems.ICE);
    static final RegistrySupplier<CreativeModeTab> ASOIAF_ARMOR = createTab("asoiaf_armor", ModItems.LANNISTER_HELMET);
    public static final ResourceKey<CreativeModeTab> INGRIDIENTS_RESOURCE_KEY = CreativeModeTabs.INGREDIENTS;

    public static final ResourceKey<CreativeModeTab> WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ASOIAFMod.MOD_ID, "asoiaf_weapons"));

    public static void init() {
        TABS.register();
        append(ASOIAF_WEAPONS, ModItems.ICE);

        append(ASOIAF_ARMOR, ModItems.LANNISTER_HELMET);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LEGGINGS);
        append(ASOIAF_ARMOR, ModItems.FANCY_BOOTS);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LORD_HELMET);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LORD_CHESTPLATE);
        append(ASOIAF_ARMOR, ModItems.LANNISTER_LORD_LEGGINGS);

        append(INGRIDIENTS_RESOURCE_KEY, ModItems.SPEAR_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.DORNISH_SUN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.STARK_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.KRAKEN_PATTERN);
        append(INGRIDIENTS_RESOURCE_KEY, ModItems.LANNISTER_PATTERN);
    }

}
