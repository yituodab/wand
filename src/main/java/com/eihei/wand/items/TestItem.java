package com.eihei.wand.items;

import org.antlr.v4.codegen.model.decl.CodeBlock;

import com.eihei.wand.entity.obsidian.ObsidianEntity;
import com.eihei.wand.registry.ModEntityTypes;
import com.eihei.wand.tool.Pos;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class TestItem extends Item{

  public TestItem(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    	Vec3 location = Pos.main(1, player);
      /*for(int i=1;i<5;i++){
        for(int j=0;j<360;j++){
          double n = Math.toRadians(j);
					double x = location.x + Math.cos(n)*i;
          double z = location.z + Math.sin(n)*i;
          level.addParticle(ParticleTypes.LAVA,x,location.y,z,x,location.y,z);
        }
      }*/
      ModEntityTypes.OBSIDIAN.get().spawn((ServerLevel)level, getDefaultInstance(), player, new BlockPos(location), MobSpawnType.COMMAND, false, true);
      //level.addFreshEntity(obsidian);
		return InteractionResultHolder.success(player.getItemInHand(useHand));
  }
  public static final int MAX_STACK_SIZE = 1;
}
