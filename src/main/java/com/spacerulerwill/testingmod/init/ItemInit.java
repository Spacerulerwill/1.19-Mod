package com.spacerulerwill.testingmod.init;

import com.spacerulerwill.testingmod.TestingMod;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    public static final RegistryObject<Item> TESTING_ITEM = ITEMS.register("test_item", () -> new Item(
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3000, 15), 1.0f)
                            .build()
    )));
}
