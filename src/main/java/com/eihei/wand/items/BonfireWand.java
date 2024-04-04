package com.eihei.wand.items;

import com.eihei.wand.tool.Ways;

import net.minecraft.client.particle.Particle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class BonfireWand extends Item{

  public BonfireWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    BlockPos PlayerPos = new BlockPos(player.getX(),player.getY(),player.getZ());
    HitResult hitResult = player.pick(3, 0, false);
    Vec3 location = hitResult.getLocation();
    double x = PlayerPos.getX() - 1;
    double y = PlayerPos.getY() - 1;
    double z = PlayerPos.getZ() - 1;
    for(;x<3;x++)for(;y<3;y++)for(;z<3;z++)level.addParticle(ParticleTypes.FIREWORK,x,y,z,x,y,z);
    Entity entity = Ways.getPointedEntity(player, 6);
    if(entity instanceof Player play){
      play.setHealth(play.getHealth() - 5);
      play.hasEffect(MobEffects.FIRE_RESISTANCE);
    }
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }

}
