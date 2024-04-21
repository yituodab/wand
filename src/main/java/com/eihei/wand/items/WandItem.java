package com.eihei.wand.items;


import com.eihei.wand.registry.ModItems;
import com.eihei.wand.tool.Pos;
import com.eihei.wand.utils.EntityUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class WandItem extends Item{

  public WandItem(Properties properties) {
    super(properties);
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    BlockPos location = new BlockPos(Pos.main(5, player));
    Block block = level.getBlockState(location).getBlock();
    ItemStack inHand = player.getItemInHand(useHand);
    ItemStack item;
    if(block.equals(Blocks.REDSTONE_BLOCK)){
      player.getInventory().removeItem(inHand);
    	item = new ItemStack(ModItems.RED_BLOCK_WAND.get());
      player.addItem(item);
    }
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }
}