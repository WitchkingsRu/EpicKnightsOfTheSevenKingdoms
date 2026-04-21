package net.ekotsk.fabric;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.registry.UniqueLootSerializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;

import java.util.function.Supplier;

public class ModLootEntriesImpl {

    private static LootPoolEntryType UNIQUE_LOOT;

    public static Supplier<LootPoolEntryType> uniqueLootEntry() {
        return () -> UNIQUE_LOOT;
    }

    public static void register() {
        UNIQUE_LOOT = Registry.register(
                BuiltInRegistries.LOOT_POOL_ENTRY_TYPE,
                new ResourceLocation(ASOIAFMod.MOD_ID, "unique_loot"),
                new LootPoolEntryType(new UniqueLootSerializer())
        );
    }
}
