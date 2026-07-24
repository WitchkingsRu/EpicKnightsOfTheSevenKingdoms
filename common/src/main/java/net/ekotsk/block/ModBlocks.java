package net.ekotsk.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> WEIRWOOD_LOG = BLOCKS.register("weirwood_log", () -> new WeirwoodLogBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD) // или MapColor.TERRACOTTA_BROWN и т.д.
                    .instrument(NoteBlockInstrument.BASS) // Звук нотного блока
                    .strength(3.0F) // Прочность как у обычного дерева
                    .sound(SoundType.WOOD) // Звук ломания/ходьбы
                    .ignitedByLava() // Если это дерево Незера, убери это
    ));
    public static final RegistrySupplier<Block> STRIPPED_WEIRWOOD_LOG = BLOCKS.register("stripped_weirwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final RegistrySupplier<Block> WEIRWOOD_LEAVES = BLOCKS.register("weirwood_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
}
