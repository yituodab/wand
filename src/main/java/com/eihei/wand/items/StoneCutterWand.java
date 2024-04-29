package com.eihei.wand.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class StoneCutterWand extends Item {
    public StoneCutterWand(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public InteractionResult useOn(UseOnContext use){
        BlockPos pos = use.getClickedPos();
        Level level = use.getLevel();
        level.setBlock(pos, Blocks.AIR.defaultBlockState(), 0);
        return InteractionResult.SUCCESS;
    }
    public static final int MAX_STACK_SIZE = 1;
}
