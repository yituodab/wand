package com.eihei.wand.items;

import com.eihei.wand.utils.EntityUtil;

import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class FireWand extends Item{

    public FireWand(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        ItemStack inHand = player.getItemInHand(useHand);
        if(level.isClientSide())
        {
            Arrow arrow = new Arrow(level, player.getX(), player.getY(), player.getZ());
            CompoundTag tag = new CompoundTag();
            tag.put("Motion", EntityUtil.newDoubleList(1.0d, 0d, 0d));
            arrow.deserializeNBT(tag);
            level.addFreshEntity(arrow);
        }
        return super.use(level, player, useHand);
    }
}
