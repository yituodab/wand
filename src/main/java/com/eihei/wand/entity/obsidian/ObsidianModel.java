package com.eihei.wand.entity.obsidian;

import com.eihei.wand.wand;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ObsidianModel extends AnimatedGeoModel<ObsidianEntity>{

  @Override
  public ResourceLocation getAnimationResource(ObsidianEntity animatable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResourceLocation getModelResource(ObsidianEntity object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"geo/obsidian.geo.json");
  }

  @Override
  public ResourceLocation getTextureResource(ObsidianEntity object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"textures/blocks/obsidian.png");
  }
  

}
