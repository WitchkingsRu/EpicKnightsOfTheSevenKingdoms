package net.ekotsk.worldgen;

import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.ekotsk.ASOIAFMod;

public class ModWorldGen {
    public static void init() {
        LifecycleEvent.SETUP.register(() -> {
            BiomeModifications.addProperties((ctx, mutable) -> {
                if (ctx.hasTag(BiomeTags.IS_FOREST) || ctx.hasTag(BiomeTags.IS_TAIGA)) {
                    mutable.getGenerationProperties().addFeature(
                            GenerationStep.Decoration.VEGETAL_DECORATION,
                            ResourceKey.create(
                                    Registries.PLACED_FEATURE,
                                    new ResourceLocation(ASOIAFMod.MOD_ID, "weirwood")
                            )
                    );
                }
            });
        });
    }
}