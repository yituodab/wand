package com.eihei.wand.entity.bedrock;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BedrockEntityRanderer extends GeoEntityRenderer<BedrockEntity> {
  public BedrockEntityRanderer(EntityRendererProvider.Context renderManager) {
    super(renderManager, new BedrockEntityModel());
    this.shadowRadius = 1F;
  }
}
