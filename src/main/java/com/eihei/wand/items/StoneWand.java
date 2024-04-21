package com.eihei.wand.items;

import org.antlr.v4.codegen.model.decl.CodeBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class StoneWand extends Item{

  public StoneWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    HitResult hitResult = player.pick(5, 0, false);
    Vec3 location = hitResult.getLocation();
    level.setBlock(new BlockPos(location), Blocks.STONE.defaultBlockState(), 0);
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }
  public static final int MAX_STACK_SIZE = 1;
}
