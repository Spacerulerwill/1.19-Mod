package com.spacerulerwill.testingmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;


public class ModTiers {
    public static final ForgeTier CRIMSON = new ForgeTier(
            1, 59, 2.0F, 0.0F, 15, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS) );
}
