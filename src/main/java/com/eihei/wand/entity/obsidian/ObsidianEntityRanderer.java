package com.eihei.wand.entity.obsidian;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ObsidianEntityRanderer extends GeoEntityRenderer<ObsidianEntity> {
  public ObsidianEntityRanderer(EntityRendererProvider.Context renderManager) {
    super(renderManager, new ObsidianModel());
    this.shadowRadius = 1F;
  }
}
