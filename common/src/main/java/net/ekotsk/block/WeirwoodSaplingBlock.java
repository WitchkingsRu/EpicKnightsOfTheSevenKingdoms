package net.ekotsk.block;

import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Optional;

import static net.ekotsk.worldgen.ModConfiguredFeatures.WEIRWOOD;
import static net.ekotsk.worldgen.ModConfiguredFeatures.WEIRWOOD_TREE_KEY;
import static net.ekotsk.worldgen.ModFeatures.WEIRWOOD_TREE;

public class WeirwoodSaplingBlock extends SaplingBlock {
    public static final TreeGrower WEIRWOOD_GROWER = new TreeGrower(
            ASOIAFMod.MOD_ID + ":weirwood",
            0.0F,                        // secondaryChance (шанс вторичного дерева)
            Optional.empty(),            // megaTree (гигантское дерево)
            Optional.empty(),            // secondaryMegaTree (вторичное гигантское)
            Optional.of(WEIRWOOD_TREE_KEY), // tree <--- ЭТО ВАША ОСНОВНАЯ ФИЧА!
            Optional.empty(),            // secondaryTree (вторичное дерево)
            Optional.empty(),            // flowers (цветы при генерации)
            Optional.empty()             // secondaryFlowers
    );

    public WeirwoodSaplingBlock(BlockBehaviour.Properties properties) {
        super(WEIRWOOD_GROWER, properties);
    }
}