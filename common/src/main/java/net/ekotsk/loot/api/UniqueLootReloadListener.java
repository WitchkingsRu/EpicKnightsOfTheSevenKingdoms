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

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class UniqueLootReloadListener extends SimpleJsonResourceReloadListener  {

    private static final Logger LOGGER = LogUtils.getLogger();

    public UniqueLootReloadListener() {
        super(new Gson(), "unique_loot");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> map,
                         ResourceManager manager,
                         ProfilerFiller profiler) {
        LOGGER.info("[UniqueLoot] Reload started. Found {} entries", map.size());
        UniqueLootManager.get().clear();
        LOGGER.info("[UniqueLoot] Manager cleared");

        for (var entry : map.entrySet()) {
            JsonObject json = entry.getValue().getAsJsonObject();

            ResourceLocation id = new ResourceLocation(GsonHelper.getAsString(json, "id"));

            LOGGER.info("[UniqueLoot] Loading entry: {}", id);
            ResourceLocation itemId = new ResourceLocation(GsonHelper.getAsString(json, "item"));

            Item item = BuiltInRegistries.ITEM.get(itemId);

            Set<ResourceLocation> structures = GsonHelper.getAsJsonArray(json, "structures")
                    .asList()
                    .stream()
                    .map(e -> new ResourceLocation(e.getAsString()))
                    .collect(Collectors.toSet());

            int weight = GsonHelper.getAsInt(json, "weight", 1);

            UniqueLootEntry lootEntry = new UniqueLootEntry(
                    id,
                    new ItemStack(item),
                    structures,
                    weight
            );

            UniqueLootManager.get().register(lootEntry);

            LOGGER.info("[UniqueLoot] Registered entry {} with {} structures and weight {}",
                    id,
                    structures.size(),
                    weight
            );
            LOGGER.info("[UniqueLoot] Reload completed. Total entries: {}",
                    UniqueLootManager.get().size());
        }
    }
}
