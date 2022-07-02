package com.spacerulerwill.testingmod.init;

import com.spacerulerwill.testingmod.TestingMod;
import com.spacerulerwill.testingmod.items.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    // gilded netherite armor
    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));
    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET,
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)
                    .fireResistant()
    ));

    //crimson tools
    public static final RegistryObject<Item> CRIMSON_WOOD_PICKAXE = ITEMS.register("crimson_wood_pickaxe", () -> new CrimsonWoodPickaxe(
            ModTiers.CRIMSON, 1, -2.8f, new Item.Properties()
                    .tab(CreativeModeTab.TAB_TOOLS)
                    .fireResistant()
    ));

    public static final RegistryObject<Item> CRIMSON_WOOD_AXE = ITEMS.register("crimson_wood_axe", () -> new CrimsonWoodAxe(
            ModTiers.CRIMSON, 6, -3.1f, new Item.Properties()
            .tab(CreativeModeTab.TAB_TOOLS)
            .fireResistant()
    ));

    public static final RegistryObject<Item> CRIMSON_WOOD_SWORD = ITEMS.register("crimson_wood_sword", () -> new CrimsonWoodSword(
            ModTiers.CRIMSON, 3, -2.4f, new Item.Properties()
            .tab(CreativeModeTab.TAB_COMBAT)
            .fireResistant()
    ));

    public static final RegistryObject<Item> CRIMSON_WOOD_SHOVEL = ITEMS.register("crimson_wood_shovel", () -> new CrimsonWoodShovel(
            ModTiers.CRIMSON, 0, -1f, new Item.Properties()
            .tab(CreativeModeTab.TAB_TOOLS)
            .fireResistant()
    ));

    public static final RegistryObject<Item> CRIMSON_WOOD_HOE = ITEMS.register("crimson_wood_hoe", () -> new CrimsonWoodHoe(
            ModTiers.CRIMSON, -2, -1f, new Item.Properties()
            .tab(CreativeModeTab.TAB_TOOLS)
            .fireResistant()
    ));
}
