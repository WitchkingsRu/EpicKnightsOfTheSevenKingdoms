package net.ekotsk.loot.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.ekotsk.loot.core.UniqueLootEntry;
import net.ekotsk.loot.core.UniqueLootManager;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueLootReloadListener extends SimpleJsonResourceReloadListener {

    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = new Gson();

    public UniqueLootReloadListener() {
        super(GSON, "unique_loot");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> map,
                         ResourceManager manager,
                         ProfilerFiller profiler) {
        LOGGER.info("[EKOTSK Unique Loot] Reload started. Found {} entries", map.size());
        UniqueLootManager.get().clear();

        for (var entry : map.entrySet()) {
            try {
                JsonObject json = entry.getValue().getAsJsonObject();

                // ✅ FIX: используем parse() вместо конструктора
                ResourceLocation id = ResourceLocation.parse(GsonHelper.getAsString(json, "id"));
                ResourceLocation itemId = ResourceLocation.parse(GsonHelper.getAsString(json, "item"));

                Item item = BuiltInRegistries.ITEM.getOptional(itemId)
                        .orElseThrow(() -> new IllegalArgumentException("Unknown item: " + itemId));

                Set<ResourceLocation> structures = GsonHelper.getAsJsonArray(json, "structures")
                        .asList()
                        .stream()
                        .map(e -> ResourceLocation.parse(e.getAsString()))
                        .collect(Collectors.toSet());

                int weight = GsonHelper.getAsInt(json, "weight", 1);

                UniqueLootEntry lootEntry = new UniqueLootEntry(id, new ItemStack(item), structures, weight);
                UniqueLootManager.get().register(lootEntry);

                LOGGER.info("[EKOTSK Unique Loot] Registered: {} | {} structures | weight: {}",
                        id, structures.size(), weight);
            } catch (Exception e) {
                LOGGER.error("[EKOTSK Unique Loot] Failed to load entry {}", entry.getKey(), e);
            }
        }
        LOGGER.info("[EKOTSK Unique Loot] Reload completed. Total: {}", UniqueLootManager.get().size());
    }
}