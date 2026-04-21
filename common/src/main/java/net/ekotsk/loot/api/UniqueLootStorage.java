package net.ekotsk.loot.api;

import net.minecraft.resources.ResourceLocation;

public interface UniqueLootStorage {
    boolean tryClaim(ResourceLocation id);
}