package net.ekotsk.fabric.api;

import net.ekotsk.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MiscStuffFabric {
    public static void init() {
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_LOG.get(),
                ModBlocks.STRIPPED_WEIRWOOD_LOG.get());
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_LOG.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_GRIM.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_ROBLOX.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_HAPPY.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_LEAVES.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), 5, 5);

    }
}
