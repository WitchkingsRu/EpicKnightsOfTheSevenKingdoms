package net.ekotsk.loot.registry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.ekotsk.loot.entry.UniqueLootPoolEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class UniqueLootSerializer extends LootPoolEntryContainer.Serializer<UniqueLootPoolEntry> {

    @Override
    public UniqueLootPoolEntry deserializeCustom(JsonObject json,
                                                 JsonDeserializationContext context,
                                                 LootItemCondition[] conditions) {

        int weight = GsonHelper.getAsInt(json, "weight", 1);
        int quality = GsonHelper.getAsInt(json, "quality", 0);

        ResourceLocation structure = new ResourceLocation(
                GsonHelper.getAsString(json, "structure")
        );

        return new UniqueLootPoolEntry(
                weight,
                quality,
                conditions,
                new LootItemFunction[0],
                structure
        );
    }

    @Override
    public void serializeCustom(JsonObject json,
                                UniqueLootPoolEntry entry,
                                JsonSerializationContext context) {
        // MVP: пусто
    }
}