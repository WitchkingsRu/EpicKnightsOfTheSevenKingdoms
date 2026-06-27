package net.ekotsk.fabric.api;

import net.ekotsk.loot.api.UniqueLootReloadListener;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.resources.ResourceLocation;

import java.util.Collection;
import java.util.List;

public class UniqueLootReloadListenerFabric extends UniqueLootReloadListener
        implements IdentifiableResourceReloadListener {

    @Override
    public ResourceLocation getFabricId() {
        return new ResourceLocation("ekotsk", "unique_loot");
    }

    @Override
    public Collection<ResourceLocation> getFabricDependencies() {
        return List.of();
    }
}
