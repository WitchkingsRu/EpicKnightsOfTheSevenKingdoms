package net.ekotsk.loot.core;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.loot.api.UniqueLootStorage;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueLootManager {

    private static final UniqueLootManager INSTANCE = new UniqueLootManager();

    public static UniqueLootManager get() {
        return INSTANCE;
    }

    private final Map<ResourceLocation, UniqueLootEntry> entries = new HashMap<>();

    public void register(UniqueLootEntry entry) {
        entries.put(entry.getId(), entry);
    }

    public void clear() {
        entries.clear();
    }

    public UniqueLootEntry roll(ResourceLocation structure,
                                RandomSource random,
                                UniqueLootStorage storage) {

        List<UniqueLootEntry> candidates = entries.values().stream()
                .filter(e -> e.isAllowedIn(structure))
                .filter(e -> !storage.isClaimed(e.getId()))
                .toList();

        if (candidates.isEmpty()) return null;

        int totalWeight = candidates.stream().mapToInt(UniqueLootEntry::getWeight).sum();
        int roll = random.nextInt(totalWeight);

        int current = 0;
        for (UniqueLootEntry entry : candidates) {
            current += entry.getWeight();
            if (roll < current) {
                return entry;
            }
        }

        return null;
    }

    private boolean storageAlreadyClaimed(UniqueLootStorage storage, UniqueLootEntry entry) {
        return !storage.tryClaim(entry.getId());
    }

    public int size() {
        return entries.size();
    }
}