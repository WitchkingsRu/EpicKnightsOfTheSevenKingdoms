package net.ekotsk.forge; // ✅ Тот же пакет, что и в common!

import net.ekotsk.loot.api.UniqueLootStorage;
import net.ekotsk.loot.storage.UniqueLootSavedData;
import net.minecraft.server.level.ServerLevel;

// ✅ Никаких аннотаций — Architectury найдёт сам по имени и пакету
public class UniqueLootPlatformImpl {

    public static UniqueLootStorage getStorage(ServerLevel level) {
        return UniqueLootSavedData.get(level);
    }
}