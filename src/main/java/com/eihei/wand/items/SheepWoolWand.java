package com.eihei.wand.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class SheepWoolWand extends Item{

  public SheepWoolWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    HitResult hitResult = player.pick(5, 0, false);
    Vec3 location = hitResult.getLocation();
    BlockState blockState;
    if(location.y < player.getY())blockState = Blocks.WHITE_CARPET.defaultBlockState();
    else blockState = Blocks.WHITE_WOOL.defaultBlockState();
    level.setBlock(new BlockPos(location), blockState, 0);
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }

}
