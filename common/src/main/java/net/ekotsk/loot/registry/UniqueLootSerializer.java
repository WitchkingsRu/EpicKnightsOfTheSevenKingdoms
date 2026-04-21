package net.ekotsk.loot.registry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.ekotsk.loot.entry.UniqueLootPoolEntry;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class UniqueLootSerializer extends LootPoolEntryContainer.Serializer<UniqueLootPoolEntry> {

    @Override
    public UniqueLootPoolEntry deserializeCustom(JsonObject json,
                                                 JsonDeserializationContext context,
                                                 LootItemCondition[] conditions) {
        // parent deserialize() уже распарсил weight/quality и применил их к пулу.
        // Для конструктора entry передаём дефолты — для MVP этого достаточно.
        return new UniqueLootPoolEntry(1, 0, conditions, new LootItemFunction[0]);
    }

    @Override
    public void serializeCustom(JsonObject json,
                                UniqueLootPoolEntry entry,
                                JsonSerializationContext context) {
        // MVP: пусто
    }
}