package net.ekotsk.screen;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import dev.architectury.registry.menu.MenuRegistry;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.MENU);
    public static final RegistrySupplier<MenuType<QohorySmelteryMenu>> QOHORY_SMELTERY_MENU =
            MENUS.register("qohory_smeltery_menu", () -> MenuRegistry.of(QohorySmelteryMenu::new));

}
