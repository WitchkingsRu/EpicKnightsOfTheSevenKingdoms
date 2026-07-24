package net.ekotsk.forge.api;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.block.ModBlocks;
import net.ekotsk.misc.ModParticles;
import net.ekotsk.misc.WeirwoodSapParticle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FireBlock;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = ASOIAFMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    // Горючесть + компостер
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            try {
                FireBlock fire = (FireBlock) Blocks.FIRE;
                java.lang.reflect.Method setFlammable = FireBlock.class.getDeclaredMethod(
                        "setFlammable", Block.class, int.class, int.class);
                setFlammable.setAccessible(true);

                setFlammable.invoke(fire, ModBlocks.WEIRWOOD_LOG.get(), 5, 5);
                setFlammable.invoke(fire, ModBlocks.STRIPPED_WEIRWOOD_LOG.get(), 5, 5);
            } catch (Exception e) {
            }

//            ComposterBlock.COMPOSTABLES.put(ModBlocks.WEIRWOOD_FACE.get().asItem(), 0.3F);
        });
    }

    // Регистрация партикла
    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.WEIRWOOD_SAP.get(),
                WeirwoodSapParticle.Provider::new);
    }

}
