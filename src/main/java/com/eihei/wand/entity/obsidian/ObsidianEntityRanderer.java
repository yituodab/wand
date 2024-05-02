package com.eihei.wand.entity.obsidian;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ObsidianEntityRanderer extends GeoEntityRenderer<ObsidianEntity>{
    public ObsidianEntityRanderer(Context renderManager) {
        super(renderManager, new ObsidianModel());
        this.shadowRadius = 1.0F;
        //TODO Auto-generated constructor stub
    }

}
