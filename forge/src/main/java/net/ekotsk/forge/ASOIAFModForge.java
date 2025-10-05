package net.ekotsk.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.ekotsk.ASOIAFMod;

@Mod(ASOIAFMod.MOD_ID)
public final class ASOIAFModForge {
    public ASOIAFModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ASOIAFMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
        // Run our common setup.
        ASOIAFMod.init();
    }
}
