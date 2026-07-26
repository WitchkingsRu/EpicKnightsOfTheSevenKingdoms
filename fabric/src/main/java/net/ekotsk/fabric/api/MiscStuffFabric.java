package net.ekotsk.fabric.api;

import net.ekotsk.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiscStuffFabric {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK Fabric");
    public static void init() {
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_LOG.get(),
                ModBlocks.STRIPPED_WEIRWOOD_LOG.get());
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_WOOD.get(),
                ModBlocks.STRIPPED_WEIRWOOD_WOOD.get());
        LOGGER.info("Tool Modifications registered");
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_LOG.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_GRIM.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_ROBLOX.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FACE_HAPPY.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_LEAVES.get(), 10, 10);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_WOOD.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WEIRWOOD_WOOD.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_PLANKS.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_STAIRS.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_SLAB.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FENCE.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_FENCE_GATE.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_BUTTON.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_PRESSURE_PLATE.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_DOOR.get(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEIRWOOD_TRAPDOOR.get(), 5, 5);

        LOGGER.info("Flammability registered");
    }
}
