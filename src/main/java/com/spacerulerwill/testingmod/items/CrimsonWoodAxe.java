package com.spacerulerwill.testingmod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;

import java.util.Random;

public class CrimsonWoodAxe extends AxeItem {

    public CrimsonWoodAxe(Tier p_40521_, float p_40522_, float p_40523_, Properties p_40524_) {
        super(p_40521_, p_40522_, p_40523_, p_40524_);
    }

    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity entity) {
        ServerLevel lvl  = ((ServerLevel) level);
        if (!lvl.isClientSide()){
            //if it's a block create smoke
            for(int i = 0; i < 5; i++) {
                Random rand = new Random();
                double xr = rand.nextDouble(-0.5, 0.5);
                double zr = rand.nextDouble(-0.5, 0.5);


                lvl.sendParticles(ParticleTypes.LARGE_SMOKE,
                        blockPos.getX() + 0.5 + xr, blockPos.getY() + 0.5, blockPos.getZ() + 0.5 + zr,
                        1, 0D, 0D, 0D, 0D);
            }

            // if it's an ore, create fire particles
            if (blockState.is(BlockTags.LOGS)
                    && super.isCorrectToolForDrops(itemStack, blockState)) {

                for(int i = 0; i < 5; i++) {
                    Random rand = new Random();

                    double xr = rand.nextDouble(-0.5, 0.5);
                    double zr = rand.nextDouble(-0.5, 0.5);


                    lvl.sendParticles(ParticleTypes.LAVA,
                            blockPos.getX() + 0.5 + xr, blockPos.getY() + 0.5, blockPos.getZ() + 0.5 + zr,
                            1, 0D, 0D, 0D, 0D);
                }
            }
        }
        return super.mineBlock(itemStack, level, blockState, blockPos, entity);
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
