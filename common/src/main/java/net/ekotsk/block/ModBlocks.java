package net.ekotsk.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> WEIRWOOD_LOG = BLOCKS.register("weirwood_log", () -> new WeirwoodLogBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_GRIM = BLOCKS.register("weirwood_face_grim", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_HAPPY = BLOCKS.register("weirwood_face_happy", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_ROBLOX = BLOCKS.register("weirwood_face_easter_egg", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
    public static final RegistrySupplier<Block> STRIPPED_WEIRWOOD_LOG = BLOCKS.register("stripped_weirwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final RegistrySupplier<Block> WEIRWOOD_LEAVES = BLOCKS.register("weirwood_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .replaceable()
                    .noCollission()
                    .randomTicks()
                    .ignitedByLava()
                    .sound(SoundType.GRASS)
                    .pushReaction(PushReaction.DESTROY)));
}
