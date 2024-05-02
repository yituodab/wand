package com.eihei.wand.entity.obsidian;

import com.eihei.wand.wand;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ObsidianArrowModel extends AnimatedGeoModel<ObsidianArrow>{

  @Override
  public ResourceLocation getAnimationResource(ObsidianArrow animatable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResourceLocation getModelResource(ObsidianArrow object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"geo/block.geo.json");
  }

  @Override
  public ResourceLocation getTextureResource(ObsidianArrow object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"textures/blocks/obsidian.png");
  }
  

}
