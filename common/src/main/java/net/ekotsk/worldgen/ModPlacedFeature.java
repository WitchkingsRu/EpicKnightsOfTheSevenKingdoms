package net.ekotsk.worldgen;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeature {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.PLACED_FEATURE);

    public static final RegistrySupplier<PlacedFeature> WEIRWOOD = PLACED_FEATURES.register("weirwood", () -> {
        return new PlacedFeature(
                Holder.direct(ModConfiguredFeatures.WEIRWOOD.get()),
                List.of(
                        RarityFilter.onAverageOnceEvery(10),
                        InSquarePlacement.spread(),
                        SurfaceWaterDepthFilter.forMaxDepth(0),
                        PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                        BiomeFilter.biome(),
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(
                                ModBlocks.WEIRWOOD_SAPLING.get().defaultBlockState(), net.minecraft.core.BlockPos.ZERO))
                )
        );
    });
}