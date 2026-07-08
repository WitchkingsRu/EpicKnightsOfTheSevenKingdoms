package net.ekotsk.neoforge;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.entry.UniqueLootPoolEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.neoforged.bus.api.IEventBus;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModLootEntriesImpl {

    private static final DeferredRegister<LootPoolEntryType> LOOT_ENTRIES =
            DeferredRegister.create(Registries.LOOT_POOL_ENTRY_TYPE, ASOIAFMod.MOD_ID);

    public static final DeferredHolder<LootPoolEntryType, LootPoolEntryType> UNIQUE_LOOT =
            LOOT_ENTRIES.register("unique_loot", () ->
                    new LootPoolEntryType(UniqueLootPoolEntry.CODEC));
    public static Supplier<LootPoolEntryType> uniqueLootEntry() {
        return UNIQUE_LOOT;
    }
    public static void register(IEventBus modEventBus) {
        LOOT_ENTRIES.register(modEventBus);
    }
}
