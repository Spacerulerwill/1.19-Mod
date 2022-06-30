package com.spacerulerwill.testingmod.event;

import com.spacerulerwill.testingmod.TestingMod;
import com.spacerulerwill.testingmod.init.ModParticles;
import com.spacerulerwill.testingmod.particle.LeechingParticle;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value= Dist.CLIENT)
public class ModClientEventBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particleEngine.register(ModParticles.LEECHING_PARTICLES.get(),
                LeechingParticle.Provider::new);
    }
}
