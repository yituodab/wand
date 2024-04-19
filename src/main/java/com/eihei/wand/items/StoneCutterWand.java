package com.eihei.wand.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class StoneCutterWand extends Item {
    public StoneCutterWand(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
            HitResult hitResult = player.pick(5, 0, false);
            Vec3 location = hitResult.getLocation();
            level.setBlock(new BlockPos(location), Blocks.AIR.defaultBlockState(), 0);
        return super.use(level, player, useHand);
    }
}
