package com.eihei.wand.items;

import com.eihei.wand.tool.Ways;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class CommandWand extends Item{

  public CommandWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  private int i;
  public int a(){
    return i;
  }
  public void b(int i){
    this.i = i;
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    Entity locationplayer = Ways.getPointedEntity(player, 50);
    if(i == 1){

    }
    if(i == 2){
      if(locationplayer instanceof Player play){
        HitResult hitResult = player.pick(10, 0, false);
        Vec3 location = hitResult.getLocation();
        play.teleportTo(location.x, location.y, location.z);
      }
    }

    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }
  

}
