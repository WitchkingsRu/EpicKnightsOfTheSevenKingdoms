package net.ekotsk.neoforge.api;

import net.ekotsk.block.ModBlocks;
import net.ekotsk.block.WeirwoodLogBlock;
import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ItemAbilities; // ToolActions заменен на ItemAbilities
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiscStuffNeoForge {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK NeoForge");

    public static void init(IEventBus bus) {
        bus.addListener(MiscStuffNeoForge::onCommonSetup);
        NeoForge.EVENT_BUS.addListener(MiscStuffNeoForge::onToolModification);
        NeoForge.EVENT_BUS.addListener(MiscStuffNeoForge::onReloadListeners);
    }

    static void onToolModification(BlockEvent.BlockToolModificationEvent event) {
        // В NeoForge 1.21+ используем ItemAbilities вместо ToolActions
        if (event.getItemAbility() != ItemAbilities.AXE_STRIP) return;

        BlockState state = event.getState();
        if (state.is(ModBlocks.WEIRWOOD_LOG.get())) {
            BlockState stripped = ModBlocks.STRIPPED_WEIRWOOD_LOG.get().defaultBlockState();
            if (state.hasProperty(RotatedPillarBlock.AXIS)) {
                stripped = stripped.setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
            }
            event.setFinalState(stripped);
        }
        if (state.is(ModBlocks.WEIRWOOD_WOOD.get())) {
            BlockState stripped = ModBlocks.STRIPPED_WEIRWOOD_WOOD.get().defaultBlockState();
            if (state.hasProperty(RotatedPillarBlock.AXIS)) {
                stripped = stripped.setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
            }
            event.setFinalState(stripped);
        }
    }

    static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            try {
                FireBlock fire = (FireBlock) Blocks.FIRE;
                java.lang.reflect.Method setFlammable = FireBlock.class.getDeclaredMethod(
                        "setFlammable", Block.class, int.class, int.class);
                setFlammable.setAccessible(true);

                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_LOG.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_GRIM.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_HAPPY.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FACE_ROBLOX.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_LEAVES.get(), 10, 10);
                setFlammable.invoke(fire, ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.STRIPPED_WEIRWOOD_WOOD.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_WOOD.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_PLANKS.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_SLAB.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_STAIRS.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FENCE.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_FENCE_GATE.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_PRESSURE_PLATE.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_BUTTON.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_DOOR.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_TRAPDOOR.get(), 5, 5);
                LOGGER.info("Flammability registered");
            } catch (Exception e) {
                LOGGER.error("Failed to register flammability: " + e.getMessage());
            }
        });
    }

    static void onReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new UniqueLootReloadListener());
    }
}