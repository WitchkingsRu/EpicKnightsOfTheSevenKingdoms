package net.ekotsk.loot.core;

import net.ekotsk.loot.api.UniqueLootStorage;
import net.ekotsk.loot.api.LootrCompat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class UniqueLootClaimManager {
    private static final Logger LOGGER = LoggerFactory.getLogger("EKOTSK.UniqueLoot.ClaimManager");
    private static final UniqueLootClaimManager INSTANCE = new UniqueLootClaimManager();
    public static UniqueLootClaimManager get() { return INSTANCE; }

    public final ConcurrentHashMap<ResourceLocation, Boolean> claimedCache = new ConcurrentHashMap<>();
    private final ReentrantLock claimLock = new ReentrantLock();

    public boolean tryClaim(ResourceLocation id, UniqueLootStorage storage) {
        if (claimedCache.containsKey(id)) {
            LOGGER.debug("Cache hit: {} already claimed, skipping", id);
            return false;
        }

        LOGGER.debug("Attempting atomic claim for: {}", id);
        claimLock.lock();
        try {
            if (claimedCache.containsKey(id)) {
                LOGGER.debug("Double-check cache hit for: {}, skipping", id);
                return false;
            }
            if (storage.isClaimed(id)) {
                LOGGER.info("Storage already claims {}: syncing to cache", id);
                claimedCache.put(id, true);
                return false;
            }

            boolean claimed = storage.tryClaim(id);
            if (claimed) {
                claimedCache.put(id, true);
                LOGGER.info("Successfully claimed unique item {} in this world", id);
                return true;
            } else {
                LOGGER.warn("Storage.tryClaim() returned false for {} (possible race condition or corruption)", id);
                return false;
            }
        } finally {
            claimLock.unlock();
        }
    }

    public void markAsUniqueIfLoaded(ItemStack stack) {
        if (LootrCompat.isLootrLoaded()) {
            LootrCompat.makeUnique(stack);
        }
    }
}