package com.spacerulerwill.testingmod.init;

import com.spacerulerwill.testingmod.TestingMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TestingMod.MOD_ID);

    public static final RegistryObject<SimpleParticleType> LEECHING_PARTICLES = PARTICLE_TYPES.register("leeching_particles",
            () -> new SimpleParticleType(true));
}
