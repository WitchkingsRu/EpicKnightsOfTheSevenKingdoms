package net.ekotsk.loot.api;

import net.minecraft.resources.ResourceLocation;

public interface UniqueLootStorage {

    boolean isClaimed(ResourceLocation id);

    boolean tryClaim(ResourceLocation id);
}