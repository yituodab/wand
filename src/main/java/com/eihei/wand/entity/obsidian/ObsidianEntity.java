package com.eihei.wand.entity.obsidian;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ObsidianEntity extends Mob implements IAnimatable{

    //TODO Auto-generated constructor stub
    // TODO Auto-generated method st
    // TODO Auto-generated m
  

public ObsidianEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
    super(p_21368_, p_21369_);
    //TODO Auto-generated constructor stub
  }


@Override
public void registerControllers(AnimationData data) {
  // TODO Auto-generated method stub
}
  // TODO Auto-generated method stub

@Override
public void travel(Vec3 arg0) {
  // TODO Auto-generated method stub
  super.travel(arg0);
}


public static AttributeSupplier.Builder registerAttributes() {
  return Mob.createMobAttributes();
  // TODO Auto-generated method stub
}


@Override
public AnimationFactory getFactory() {
  // TODO Auto-generated method stub
  return null;
}


  // TODO Auto-generated method stub
}

