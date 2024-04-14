package com.eihei.wand.items;

import java.util.function.Supplier;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;

public class WandItem extends Item{

  public WandItem(Properties properties) {
    super(properties);
  }
  @Override
  public ItemStack finishUsingItem(ItemStack p_41409_, Level p_41410_, LivingEntity p_41411_) {
    // TODO Auto-generated method stub
    return super.finishUsingItem(p_41409_, p_41410_, p_41411_);
  }
  
}