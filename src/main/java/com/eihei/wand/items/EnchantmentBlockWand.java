package com.eihei.wand.items;

import com.eihei.wand.tool.Ways;

import net.minecraft.server.commands.EnchantCommand;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class EnchantmentBlockWand extends Item {

  public EnchantmentBlockWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand){
    Entity locationplayer = Ways.getPointedEntity(player, 10);
    if(locationplayer != null && locationplayer instanceof Player play)
    {
      ItemStack onhand = play.getItemInHand(InteractionHand.MAIN_HAND);
      int i = (int)Math.random()*39;
      int n = (int)Math.random()*5;
      if (i==1)onhand.enchant(Enchantments.ALL_DAMAGE_PROTECTION, n);
    }
    
    // TODO Auto-generated method stub
    return InteractionResultHolder.success(player.getItemInHand(useHand));
  }

}
