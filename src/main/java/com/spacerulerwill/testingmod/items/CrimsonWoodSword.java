package com.spacerulerwill.testingmod.items;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.Random;

public class CrimsonWoodSword extends SwordItem {

    public CrimsonWoodSword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity entity1, LivingEntity entity2) {
        ServerLevel lvl = (ServerLevel)entity1.level;

        Random rand = new Random();

        float chance = rand.nextFloat();

        if (chance < 0.1){
            entity1.setSecondsOnFire(5);
        }

        for(int i = 0; i < 5; i++) {

            double xr = rand.nextDouble(-0.5, 0.5);
            double zr = rand.nextDouble(-0.5, 0.5);

            lvl.sendParticles(ParticleTypes.LAVA,
                    entity1.getX() + 0.5 + xr, entity1.getY() + entity1.getEyeHeight(), entity1.getZ() + 0.5 + zr,
                    1, 0D, 0D, 0D, 0D);
        }

        return super.hurtEnemy(p_43278_, entity1, entity2);
    }
}
