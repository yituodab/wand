package com.eihei.wand.items;

import org.antlr.v4.codegen.model.decl.CodeBlock;

import com.eihei.wand.tool.Pos;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
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

public class TestItem extends Item{

  public TestItem(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    	Vec3 location = Pos.main(10, player);
			double a = 0;
			double b = 0;
			double r = 2;
			double fr = 3;
			for (int i = 0;i<3;i++){
				b = b + 0.1;
				r = r + b;
				fr = fr + b;
				for (int j = 0; j < 200; j++) {
					a = a + 0.01 * Math.PI;
					double x = location.x + r * Math.cos(a);
					double z = location.z + r * Math.sin(a);
					double fx = location.x + fr * Math.cos(a);
					double fz = location.z + fr * Math.sin(a);
					level.addParticle(ParticleTypes.CLOUD,fx-x,location.y,fz-z,fx-x,location.y,fz-z);
        }
      }
		return InteractionResultHolder.success(player.getItemInHand(useHand));
  }

}
