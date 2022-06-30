package com.spacerulerwill.testingmod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.common.Tags;

import java.util.Random;

public class CrimsonTool extends DiggerItem {
    public CrimsonTool(float p_204108_, float p_204109_, Tier p_204110_, TagKey<Block> p_204111_, Properties p_204112_) {
        super(p_204108_, p_204109_, p_204110_, p_204111_, p_204112_);
    }

    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity p_41002_) {
        ServerLevel lvl  = ((ServerLevel) level);
        if (!lvl.isClientSide()){
            for(int i = 0; i < 5; i++) {
                Random rand = new Random();
                double xr = rand.nextDouble(-0.5, 0.5);
                double zr = rand.nextDouble(-0.5, 0.5);


                lvl.sendParticles(ParticleTypes.LARGE_SMOKE,
                        blockPos.getX() + 0.5 + xr, blockPos.getY() + 0.5, blockPos.getZ() + 0.5 + zr,
                        00, 0D, 0D, 0D, 0D);
            }
        }

        if (blockState.is(Tags.Blocks.ORES) && super.isCorrectToolForDrops(itemStack, blockState)) {
            System.out.println("Smelting");
        }
        return super.mineBlock(itemStack, level, blockState, blockPos, p_41002_);
    }
}
