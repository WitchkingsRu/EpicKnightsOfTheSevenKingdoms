package net.ekotsk;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import java.util.function.Supplier;

public class ModLootEntries {

    @ExpectPlatform
    public static Supplier<LootPoolEntryType> uniqueLootEntry() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void register() {
        throw new AssertionError();
    }
}
