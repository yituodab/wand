package com.eihei.wand.items;

import org.antlr.v4.codegen.model.decl.CodeBlock;

import com.eihei.wand.tool.Pos;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class CobwebWand extends Item{

  public CobwebWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  private Vec3 block;
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    Vec3 location = Pos.main(50, player);
    Vec3 PlayerPos = new Vec3(player.getX(), player.getY(), player.getZ());
    if(block == null){
      block = location;
      return super
    }
    if(block != null){
      double line = PlayerPos.distanceTo(block); 
      block = null;
      double x = (location.x - player.getX())/line;
      double z = (location.z - player.getZ())/line;
      Vec3 add = new Vec3(x,0,z);
      for(int i=0;i<50;i++,PlayerPos=PlayerPos.add(add)){
        player.moveTo(PlayerPos);
      }
    }
    return super.use(level, player, useHand);
  }

}
