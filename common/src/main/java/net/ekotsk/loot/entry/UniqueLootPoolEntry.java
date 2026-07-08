package net.ekotsk.loot.entry;

import com.mojang.serialization.MapCodec;
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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ExtraCodecs;

public class UniqueLootPoolEntry extends LootPoolSingletonContainer {

    // ✅ Codec для парсинга из JSON loot table
    public static final MapCodec<UniqueLootPoolEntry> CODEC = RecordCodecBuilder.mapCodec(inst ->
            inst.group(
                    ExtraCodecs.POSITIVE_INT.optionalFieldOf("weight", 1).forGetter(e -> 1),
                    ExtraCodecs.POSITIVE_INT.optionalFieldOf("quality", 0).forGetter(e -> 0),
                    ResourceLocation.CODEC.fieldOf("structure").forGetter(UniqueLootPoolEntry::getStructure) // ✅ геттер
            ).apply(inst, UniqueLootPoolEntry::new) // ✅ конструктор без protected
    );

    private final ResourceLocation structure;

    // ✅ Конструктор для Codec
    public UniqueLootPoolEntry(int weight, int quality, ResourceLocation structure) {
        super(weight, quality, List.of(), List.of()); // условия/функции добавляются отдельно
        this.structure = structure;
    }
    public ResourceLocation getStructure() {
        return structure;
    }
    // ✅ Конструктор для билдера (с условиями)
    protected UniqueLootPoolEntry(int weight, int quality,
                                  List<LootItemCondition> conditions,
                                  List<LootItemFunction> functions,
                                  ResourceLocation structure) {
        super(weight, quality, conditions, functions);
        this.structure = structure;
    }

    @Override
    protected void createItemStack(Consumer<ItemStack> output, LootContext context) {
        ServerLevel level = context.getLevel();
        if (level == null) return;

        UniqueLootStorage storage = UniqueLootPlatform.getStorage(level);

        UniqueLootEntry entry = UniqueLootManager.get().roll(structure, context.getRandom(), storage);
        if (entry == null) return;

        if (!storage.tryClaim(entry.getId())) return;

        output.accept(entry.createStack());
    }

    @Override
    public LootPoolEntryType getType() {
        return ModLootEntries.uniqueLootEntry().get();
    }

    // ✅ FIX: кастомный Builder с setStructure()
    public static class Builder extends LootPoolSingletonContainer.Builder<Builder> {
        private ResourceLocation structure = ResourceLocation.parse("minecraft:empty");

        public Builder setStructure(ResourceLocation structure) {
            this.structure = structure;
            return this;
        }

        @Override
        protected Builder getThis() { return this; }

        @Override
        public UniqueLootPoolEntry build() {
            // Конвертируем List в массив для вызова protected конструктора
            return new UniqueLootPoolEntry(
                    this.weight,
                    this.quality,
                    new ArrayList<>(this.getConditions()),
                    new ArrayList<>(this.getFunctions()),
                    this.structure
            );
        }
    }

    public static Builder builder() { return new Builder(); }
}