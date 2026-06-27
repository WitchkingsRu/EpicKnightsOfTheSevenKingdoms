package net.ekotsk.loot.entry;

import net.ekotsk.UniqueLootPlatform;
import net.ekotsk.loot.api.UniqueLootStorage;
import net.ekotsk.loot.core.UniqueLootEntry;
import net.ekotsk.loot.core.UniqueLootManager;
import net.ekotsk.ModLootEntries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.function.Consumer;

public class UniqueLootPoolEntry extends LootPoolSingletonContainer {
    private final ResourceLocation structure;
    public UniqueLootPoolEntry(int weight,
                               int quality,
                               LootItemCondition[] conditions,
                               LootItemFunction[] functions,
                               ResourceLocation structure) {
        super(weight, quality, conditions, functions);
        this.structure = structure;
    }

    @Override
    protected void createItemStack(Consumer<ItemStack> output, LootContext context) {

        ServerLevel level = context.getLevel();
        if (level == null) return;

        UniqueLootStorage storage = UniqueLootPlatform.getStorage(level);

        UniqueLootEntry entry = UniqueLootManager.get().roll(
                structure,
                context.getRandom(),
                storage
        );

        if (entry == null) return;

        if (!storage.tryClaim(entry.getId())) return;

        output.accept(entry.createStack());
    }

    @Override
    public LootPoolEntryType getType() {
        return ModLootEntries.uniqueLootEntry().get();
    }
}