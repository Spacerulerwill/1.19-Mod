package com.spacerulerwill.testingmod.init;

import com.spacerulerwill.testingmod.TestingMod;
import com.spacerulerwill.testingmod.enchantment.LeechingEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
        DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TestingMod.MOD_ID);

    public static RegistryObject<Enchantment> LEECHING = ENCHANTMENTS.register("leeching", () -> new LeechingEnchantment(
            Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND
    ));
}
