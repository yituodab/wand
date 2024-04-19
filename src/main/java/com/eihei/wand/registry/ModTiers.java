package com.eihei.wand.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier WAND_PICKAXE = new ForgeTier(2, 100000000, 10.0f, 2f, 0, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BLOCK_WAND.get()));
}
