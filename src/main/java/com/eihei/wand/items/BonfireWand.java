package com.eihei.wand.items;

import com.eihei.wand.tool.Ways;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
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
    Vec3 PlayerPos = new Vec3(player.getX(),player.getY(),player.getZ());
    HitResult hitResult = player.pick(3, 0, false);
    Vec3 location = hitResult.getLocation();
    double X = (location.x-player.getX());
    double Y = (location.y-player.getY());
    double Z = (location.z-player.getZ());
    for(int i = 0;i<20;i++){
      double rand = Math.random();
      double lx = X * rand;
      double ly = Y * rand;
      double lz = Z * rand;
      double x = PlayerPos.x + lx;
      double y = PlayerPos.y + ly;
      double z = PlayerPos.z + lz;
      level.addParticle(ParticleTypes.LAVA,x,y,z,x,y,z);
    }
    double Line = location.distanceTo(location);
    Entity entity = Ways.getPointedEntity(player, Line);
    if(entity != null){
      entity.hurt(DamageSource.ON_FIRE, 5);
      entity.isOnFire();
      if(entity instanceof Player play){
      play.setHealth(play.getHealth() - 5);
      play.hasEffect(MobEffects.FIRE_RESISTANCE);
    }
  }
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }

}
