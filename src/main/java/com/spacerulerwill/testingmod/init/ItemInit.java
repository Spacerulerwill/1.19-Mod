package com.spacerulerwill.testingmod.init;

import com.spacerulerwill.testingmod.TestingMod;
import com.spacerulerwill.testingmod.items.GildedArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    // gilded netherite armor
    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_NETHERITE, EquipmentSlot.HEAD,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_NETHERITE, EquipmentSlot.CHEST,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_NETHERITE, EquipmentSlot.LEGS,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_NETHERITE, EquipmentSlot.FEET,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
}
