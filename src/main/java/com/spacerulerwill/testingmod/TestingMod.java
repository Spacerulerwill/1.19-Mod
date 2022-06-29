package com.spacerulerwill.testingmod;

import com.spacerulerwill.testingmod.init.EnchantmentInit;
import com.spacerulerwill.testingmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestingMod.MOD_ID)
public class TestingMod {
    public static final String MOD_ID = "testingmod";
    public TestingMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        EnchantmentInit.ENCHANTMENTS.register(bus);
    }
}
