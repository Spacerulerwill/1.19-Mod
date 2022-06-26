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

    // gilded diamond armor
    public static final RegistryObject<Item> GILDED_DIAMOND_HELMET = ITEMS.register("gilded_diamond_helmet", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_DIAMOND, EquipmentSlot.HEAD,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
    ));
    public static final RegistryObject<Item> GILDED_DIAMOND_CHESTPLATE = ITEMS.register("gilded_diamond_chestplate", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_DIAMOND, EquipmentSlot.CHEST,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
    ));
    public static final RegistryObject<Item> GILDED_DIAMOND_LEGGINGS = ITEMS.register("gilded_diamond_leggings", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_DIAMOND, EquipmentSlot.LEGS,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
    ));
    public static final RegistryObject<Item> GILDED_DIAMOND_BOOTS = ITEMS.register("gilded_diamond_boots", () -> new GildedArmorItem(ArmorMaterialsInit.GILDED_DIAMOND, EquipmentSlot.FEET,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
    ));
}
