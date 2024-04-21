package com.eihei.wand.items;

import java.util.Random;

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
      int i = new Random().nextInt(40);
      int n = new Random().nextInt(6);
      if (i==1)onhand.enchant(Enchantments.ALL_DAMAGE_PROTECTION, n);
    }
    
    // TODO Auto-generated method stub
    return InteractionResultHolder.success(player.getItemInHand(useHand));
  }
  public static final int MAX_STACK_SIZE = 1;
}
