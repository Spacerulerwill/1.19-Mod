package com.spacerulerwill.testingmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;


public class ModTiers {
    public static final ForgeTier CRIMSON = new ForgeTier(
            2, 250, 6.0F, 2.0F, 20, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(new ItemLike[]{Items.CRIMSON_PLANKS}) );
}
