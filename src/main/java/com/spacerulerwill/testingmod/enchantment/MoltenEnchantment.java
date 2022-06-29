package com.spacerulerwill.testingmod.enchantment;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class MoltenEnchantment extends Enchantment {
    public MoltenEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    public void doPostHurt(LivingEntity attacker, Entity entity, int level) {
        if (!entity.level.isClientSide()) {
            entity.setSecondsOnFire(level);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
