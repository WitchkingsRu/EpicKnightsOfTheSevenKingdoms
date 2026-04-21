package net.ekotsk.forge; // ✅ Тот же пакет, что и в common!

import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.registry.UniqueLootSerializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ModLootEntriesImpl {

    private static final DeferredRegister<LootPoolEntryType> LOOT_ENTRIES =
            DeferredRegister.create(Registries.LOOT_POOL_ENTRY_TYPE, ASOIAFMod.MOD_ID);

    public static final RegistryObject<LootPoolEntryType> UNIQUE_LOOT =
            LOOT_ENTRIES.register("unique_loot", () ->
                    new LootPoolEntryType(new UniqueLootSerializer()));

    // ✅ Возвращаем Supplier через лямбду — просто и работает
    public static Supplier<LootPoolEntryType> uniqueLootEntry() {
        return UNIQUE_LOOT; // RegistryObject implements Supplier<T>
    }

    // ✅ Регистрация через правильный EventBus
    public static void register() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LOOT_ENTRIES.register(bus);
    }
}