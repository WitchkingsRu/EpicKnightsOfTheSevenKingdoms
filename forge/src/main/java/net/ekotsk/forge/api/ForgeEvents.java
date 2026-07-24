package net.ekotsk.forge.api;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.block.WeirwoodLogBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ASOIAFMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    // Обтёсывание
    @SubscribeEvent
    public static void onToolModification(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() != ToolActions.AXE_STRIP) return; // Используем ToolActions.AXE_STRIP

        BlockState state = event.getState();
        if (state.is(ModBlocks.WEIRWOOD_LOG.get())) {
            int carvings = state.getValue(WeirwoodLogBlock.CARVINGS);
            BlockState stripped = ModBlocks.STRIPPED_WEIRWOOD_LOG.get()
                    .defaultBlockState()
                    .setValue(WeirwoodLogBlock.CARVINGS, carvings);
            if (state.hasProperty(RotatedPillarBlock.AXIS)) {
                stripped = stripped.setValue(RotatedPillarBlock.AXIS,
                        state.getValue(RotatedPillarBlock.AXIS));
            }
            event.setFinalState(stripped);
        }
    }
}
