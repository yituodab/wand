package com.eihei.wand.entity.bedrock;

import com.eihei.wand.wand;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BedrockEntityModel extends AnimatedGeoModel<BedrockEntity>{

  @Override
  public ResourceLocation getAnimationResource(BedrockEntity animatable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResourceLocation getModelResource(BedrockEntity object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"geo/block.geo.json");
  }

  @Override
  public ResourceLocation getTextureResource(BedrockEntity object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"textures/blocks/obsidian.png");
  }
  

}
