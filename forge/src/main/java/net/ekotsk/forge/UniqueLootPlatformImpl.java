package net.ekotsk.forge;

import net.ekotsk.loot.api.UniqueLootStorage;
import net.ekotsk.loot.storage.UniqueLootSavedData;
import net.minecraft.server.level.ServerLevel;


public class UniqueLootPlatformImpl {

    public static UniqueLootStorage getStorage(ServerLevel level) {
        return UniqueLootSavedData.get(level);
    }
}