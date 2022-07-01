package com.spacerulerwill.testingmod;

import com.spacerulerwill.testingmod.event.ModClientEventBusEvents;
import com.spacerulerwill.testingmod.init.ModEnchantments;
import com.spacerulerwill.testingmod.init.ModItems;
import com.spacerulerwill.testingmod.init.ModParticles;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestingMod.MOD_ID)
public class TestingMod {
    public static final String MOD_ID = "testingmod";

    public TestingMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModEnchantments.ENCHANTMENTS.register(bus);
        ModParticles.PARTICLE_TYPES.register(bus);

        MinecraftForge.EVENT_BUS.register(new ModClientEventBusEvents());
    }
}
