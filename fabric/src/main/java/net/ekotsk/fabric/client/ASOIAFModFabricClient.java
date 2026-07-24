package net.ekotsk.fabric.client;

import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public final class ASOIAFModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(
                ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
