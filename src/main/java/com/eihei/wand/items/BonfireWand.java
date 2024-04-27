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
    HitResult hitResult = player.pick(10, 0, false);
    Vec3 location = hitResult.getLocation();
    double X = (location.x-player.getX());
    double Y = (location.y-player.getY());
    double Z = (location.z-player.getZ());
    double Line = PlayerPos.distanceTo(location);
    double lx = (X/Line)/2;
    double ly = (Y/Line)/2;
    double lz = (Z/Line)/2;
    Vec3 add = new Vec3(lx, ly, lz);
    for(int a=0;a<2;a++){
    for(double i = 0;i<Line;i=i+0.5,PlayerPos=PlayerPos.add(add)){
      double x = PlayerPos.x;
      double y = PlayerPos.y;
      double z = PlayerPos.z;
      level.addParticle (ParticleTypes.LAVA, x, y, z, x, y, z);
      level.addParticle (ParticleTypes.LAVA, x, y+1, z, x, y+1, z);
      level.addParticle (ParticleTypes.LAVA, x, y-1, z, x, y-1, z);
      level.addParticle (ParticleTypes.LAVA, x+1, y, z, x+1, y, z);
      level.addParticle (ParticleTypes.LAVA, x-1, y, z, x-1, y, z);
      level.addParticle (ParticleTypes.LAVA, x, y, z+1, x, y, z+1);
      level.addParticle (ParticleTypes.LAVA, x, y, z-1, x, y, z-1);
      if(i>=2){
        level.addParticle (ParticleTypes.LAVA, x+2, y, z, x+2, y, z);
        level.addParticle (ParticleTypes.LAVA, x-2, y, z, x-2, y, z);
        level.addParticle (ParticleTypes.LAVA, x, y+2, z, x, y+2, z);
        level.addParticle (ParticleTypes.LAVA, x, y-2, z, x, y-2, z);
        level.addParticle (ParticleTypes.LAVA, x, y, z+2, x, y, z+2);
        level.addParticle (ParticleTypes.LAVA, x, y, z-2, x, y, z-2);
      }
      if(i>=3){
        level.addParticle (ParticleTypes.LAVA, x+3, y, z, x+3, y, z);
        level.addParticle (ParticleTypes.LAVA, x-3, y, z, x-3, y, z);
        level.addParticle (ParticleTypes.LAVA, x, y+3, z, x, y+3, z);
        level.addParticle (ParticleTypes.LAVA, x, y-3, z, x, y-3, z);
        level.addParticle (ParticleTypes.LAVA, x, y, z+3, x, y, z-3);
        level.addParticle (ParticleTypes.LAVA, x, y, z-3, x, y, z-3);
      }
    }
    }
    Entity entity = Ways.getPointedEntity(player, Line);
    if(entity != null){
      entity.hurt(DamageSource.ON_FIRE, 5);
      entity.isOnFire();
      if(entity instanceof Player play){
      play.hasEffect(MobEffects.FIRE_RESISTANCE);
    }
  }
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }
  public static final int MAX_STACK_SIZE = 1;
}