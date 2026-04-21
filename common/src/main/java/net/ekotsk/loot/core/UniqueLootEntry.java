package net.ekotsk.loot.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.Set;

public class UniqueLootEntry {
    private final ResourceLocation id;
    private final ItemStack stack;
    final Set<ResourceLocation> structures;

    public UniqueLootEntry(ResourceLocation id, ItemStack stack, Set<ResourceLocation> structures) {
        this.id = id;
        this.stack = stack;
        this.structures = structures;
    }

    public ResourceLocation getId() {
        return id;
    }

    public ItemStack createStack() {
        return stack.copy();
    }

    public boolean isAllowedIn(ResourceLocation structure) {
        return structures.contains(structure);
    }
}
