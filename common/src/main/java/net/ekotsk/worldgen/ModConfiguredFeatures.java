package net.ekotsk.worldgen;


import net.ekotsk.block.ModBlocks;

import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;


public class ModConfiguredFeatures {
    // Просто объект. Никаких Registrar или DeferredRegister.
    public static final ConfiguredFeature<?, ?> WEIRWOOD = new ConfiguredFeature<>(
            ModFeatures.WEIRWOOD_TREE.get(),
            new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.WEIRWOOD_LOG.get()),
                    new StraightTrunkPlacer(5, 2, 3),
                    BlockStateProvider.simple(ModBlocks.WEIRWOOD_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).ignoreVines().build()
    );
}
