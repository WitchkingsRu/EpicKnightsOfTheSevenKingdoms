package net.ekotsk.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.misc.ModWoodTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> WEIRWOOD_LOG = BLOCKS.register("weirwood_log", () -> new WeirwoodLogBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_GRIM = BLOCKS.register("weirwood_face_grim", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_HAPPY = BLOCKS.register("weirwood_face_happy", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
    ));
    public static final RegistrySupplier<Block> WEIRWOOD_FACE_ROBLOX = BLOCKS.register("weirwood_face_easter_egg", () -> new WeirwoodFaceBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
    ));
    public static final RegistrySupplier<Block> STRIPPED_WEIRWOOD_LOG = BLOCKS.register("stripped_weirwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistrySupplier<Block> WEIRWOOD_LEAVES = BLOCKS.register("weirwood_leaves", () ->
            new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final RegistrySupplier<Block> WEIRWOOD_SAPLING = BLOCKS.register("weirwood_sapling",
            () -> new WeirwoodSaplingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final RegistrySupplier<Block> WEIRWOOD_WOOD = BLOCKS.register("weirwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistrySupplier<Block> STRIPPED_WEIRWOOD_WOOD = BLOCKS.register("stripped_weirwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistrySupplier<Block> WEIRWOOD_PLANKS = BLOCKS.register("weirwood_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final Supplier<BlockState> WEIRWOOD_PLANKS_STATE =
            () -> ModBlocks.WEIRWOOD_PLANKS.get().defaultBlockState();
    public static final RegistrySupplier<Block> WEIRWOOD_STAIRS = BLOCKS.register("weirwood_stairs",
            () -> new StairBlock(WEIRWOOD_PLANKS_STATE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final RegistrySupplier<Block> WEIRWOOD_SLAB = BLOCKS.register("weirwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final RegistrySupplier<Block> WEIRWOOD_FENCE = BLOCKS.register("weirwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final RegistrySupplier<Block> WEIRWOOD_FENCE_GATE = BLOCKS.register("weirwood_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final RegistrySupplier<Block> WEIRWOOD_TRAPDOOR = BLOCKS.register("weirwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final RegistrySupplier<Block> WEIRWOOD_DOOR = BLOCKS.register("weirwood_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final RegistrySupplier<Block> WEIRWOOD_PRESSURE_PLATE = BLOCKS.register("weirwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistrySupplier<Block> WEIRWOOD_BUTTON = BLOCKS.register("weirwood_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));
    public static final RegistrySupplier<Block> WEIRWOOD_HANGING_SIGN = BLOCKS.register("weirwood_hanging_sign",
            () -> new WeirwoodCeilingHangingSignBlock(ModWoodTypes.WEIRWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final RegistrySupplier<Block> WEIRWOOD_WALL_HANGING_SIGN = BLOCKS.register("weirwood_wall_hanging_sign",
            () -> new WeirwoodWallHangingSignBlock(ModWoodTypes.WEIRWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final RegistrySupplier<Block> WEIRWOOD_SIGN = BLOCKS.register("weirwood_sign",
            () -> new WeirwoodStandingSignBlock(ModWoodTypes.WEIRWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final RegistrySupplier<Block> WEIRWOOD_WALL_SIGN = BLOCKS.register("weirwood_wall_sign",
            () -> new WeirwoodWallSignBlock(ModWoodTypes.WEIRWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));

}

