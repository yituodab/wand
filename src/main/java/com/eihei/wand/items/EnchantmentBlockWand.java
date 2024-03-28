package com.eihei.wand.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnchantmentBlockWand extends Item {

  public EnchantmentBlockWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand){
    // TODO Auto-generated method stub
    return InteractionResultHolder.success(player.getItemInHand(useHand));
  }

}
