package net.ekotsk.loot.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.Set;

public class UniqueLootEntry {

    private final ResourceLocation id;
    private final ItemStack stack;
    private final Set<ResourceLocation> structures;
    private final int weight;

    public UniqueLootEntry(ResourceLocation id,
                           ItemStack stack,
                           Set<ResourceLocation> structures,
                           int weight) {
        this.id = id;
        this.stack = stack;
        this.structures = structures;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }
}
