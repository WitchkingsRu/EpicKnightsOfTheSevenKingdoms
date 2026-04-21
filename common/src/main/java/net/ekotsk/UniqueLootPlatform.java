package net.ekotsk;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.ekotsk.loot.api.UniqueLootStorage;
import net.minecraft.server.level.ServerLevel;

public class UniqueLootPlatform {
    @ExpectPlatform
    public static UniqueLootStorage getStorage(ServerLevel level) {
        throw new AssertionError();
    }
}
