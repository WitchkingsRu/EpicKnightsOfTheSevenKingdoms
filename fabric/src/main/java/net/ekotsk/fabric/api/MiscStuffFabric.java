package net.ekotsk.fabric.api;

import net.ekotsk.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MiscStuffFabric {
    public static void init() {
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_LOG.get(),
                ModBlocks.STRIPPED_WEIRWOOD_LOG.get());
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_LOG.get(), 5, 5);

    }
}
