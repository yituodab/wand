package com.eihei.wand.items;


import com.eihei.wand.registry.ModItems;
import com.eihei.wand.tool.Pos;
import com.eihei.wand.utils.EntityUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class WandItem extends Item{

  public WandItem(Properties properties) {
    super(properties);
  }
    // TODO Auto-generated method stub
  @Override
  public InteractionResult useOn(UseOnContext use) {
    Level level = use.getLevel();
    Player player = use.getPlayer();
    BlockPos pos = use.getClickedPos();
    Block block = level.getBlockState(pos).getBlock();
    ItemStack inHand = player.getItemInHand(use.getHand());
    ItemStack item = new ItemStack(Items.AIR);
    if(block.equals(Blocks.REDSTONE_BLOCK))item = new ItemStack(ModItems.RED_BLOCK_WAND.get());
    if(block.equals(Blocks.REDSTONE_BLOCK)||block.equals(Blocks.NETHERITE_BLOCK)){
      player.getInventory().removeItem(inHand);
      player.addItem(item);
    }
    // TODO Auto-generated method stub
    return InteractionResult.SUCCESS;
  }
  public static final int MAX_STACK_SIZE = 1;
  
}