package com.eihei.wand.entity.obsidian;

import javax.annotation.Nullable;

import org.antlr.v4.parse.ANTLRParser.option_return;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ObsidianEntity extends Mob implements IAnimatable{


  public ObsidianEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
    super(p_21368_, p_21369_);
    //TODO Auto-generated constructor stub
  }


  @SuppressWarnings({ "unused", "removal" })
  private AnimationFactory factory = new AnimationFactory(this);


@Override
public void registerControllers(AnimationData data) {
  // TODO Auto-generated method stub
}
  // TODO Auto-generated method stub

@Override
public void travel(Vec3 vec) {
  this.move(MoverType.SELF, vec);
  // TODO Auto-generated method stub
  super.travel(vec);
}


public static AttributeSupplier.Builder registerAttributes() {
  return Mob.createMobAttributes();
  // TODO Auto-generated method stub
}


@Override
public AnimationFactory getFactory() {
  // TODO Auto-generated method stub
  return factory;
}
public void explosion(){
  Explosion explosion = new Explosion(level, this, this.getX(), this.getY(), this.getZ(), 1.0F, false, Explosion.BlockInteraction.BREAK);
  explosion.getHitPlayers();
  
}
  // TODO Auto-generated method stub

public void blocks(){
  Level level = this.getLevel();
  for(double x=this.getX()-1.5;x<this.getX()+1.5;x++){
    for(double y=this.getY()-1.5;y<this.getY()+1.5;y++){
      for(double z=this.getZ()-1.5;z<this.getZ()+1.5;z++){
        level.setBlock(new BlockPos(x,y,z), Blocks.AIR.defaultBlockState(), 0);
      }
    }
  }
}

  // TODO Auto-generated method stub
}

