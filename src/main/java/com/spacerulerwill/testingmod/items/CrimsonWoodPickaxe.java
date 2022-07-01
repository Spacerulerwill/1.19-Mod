package com.spacerulerwill.testingmod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;

import java.util.Random;

public class CrimsonWoodPickaxe extends PickaxeItem {
    public CrimsonWoodPickaxe(Tier p_42961_, int p_42962_, float p_42963_, Properties p_42964_) {
        super(p_42961_, p_42962_, p_42963_, p_42964_);
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
            if (blockState.is(Tags.Blocks.ORES)
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
}
