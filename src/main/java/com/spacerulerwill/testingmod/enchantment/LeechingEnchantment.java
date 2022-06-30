package com.spacerulerwill.testingmod.enchantment;

;
import com.spacerulerwill.testingmod.init.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Random;

public class LeechingEnchantment extends Enchantment {

    public LeechingEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }
    public void doPostAttack(LivingEntity pAttacker, Entity pEntity, int pLevel) {

        if (!pAttacker.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level);

            Random rand = new Random();
            double r = rand.nextDouble();

            if (r < (0.05 + (0.05 * pLevel))) {
                pAttacker.heal(0.25f * pAttacker.getMaxHealth());

                //spawn particles
                world.sendParticles(ModParticles.LEECHING_PARTICLES.get(),
                        pEntity.getX(), pEntity.getY() + pEntity.getEyeHeight(), pEntity.getZ(),
                        20, 0D, 0D, 0D, 0.05D);
            }
        }

        super.doPostAttack(pAttacker, pEntity, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
