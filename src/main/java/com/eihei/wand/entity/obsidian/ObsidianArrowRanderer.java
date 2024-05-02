package com.eihei.wand.entity.obsidian;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;

public class ObsidianArrowRanderer extends GeoProjectilesRenderer<ObsidianArrow> {
  public ObsidianArrowRanderer(EntityRendererProvider.Context renderManager) {
    super(renderManager, new ObsidianArrowModel());
    this.shadowRadius = 1F;
  }
}
