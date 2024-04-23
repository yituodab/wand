package com.eihei.wand.entity.obsidian;

import java.util.List;
import java.util.Map;

import com.eihei.wand.wand;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Either;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.block.model.BlockElement;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.renderer.block.model.ItemOverride;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ObsidianModel extends AnimatedGeoModel{

  @Override
  public ResourceLocation getAnimationResource(Object animatable) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"animation/obsidian.json");
  }

  @Override
  public ResourceLocation getModelResource(Object object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"geo/obsidian.geo.json");
  }

  @Override
  public ResourceLocation getTextureResource(Object object) {
    // TODO Auto-generated method stub
    return new ResourceLocation(wand.MODID,"textures/blocks/obsidian.png");
  }
  

}
