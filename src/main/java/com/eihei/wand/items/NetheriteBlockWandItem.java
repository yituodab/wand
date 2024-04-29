package com.eihei.wand.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class NetheriteBlockWandItem extends Item {
    public NetheriteBlockWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
            HitResult hitResult = player.pick(5, 0, false);
            Vec3 location = hitResult.getLocation();
            double X = location.x + 3.5;
            double Y = location.y + 3.5;
            double Z = location.z + 3.5;
            for (double x = location.x - 3.5; x < X; x++) {
                for (double y = location.y - 3.5; y < Y; y++) {
                    for (double z = location.z - 3.5; z < Z; z++) {
                        BlockPos blockPos = new BlockPos(x,y,z);
                        level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 0);
                    }
                }
            }
            /*for(double distance=0;distance<3.5;distance=distance+0.5){
                for(int n = 0;n<360;n++){
            		double degree = Math.toRadians(n);
             		double x = location.x+Math.cos(degree)*distance;
            		double z = location.z+Math.sin(degree)*distance;
            		level.addParticle(ParticleTypes.SQUID_INK, x, location.y, z, x, location.y, z);
            	}
    		}*/
	    return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
    public static final int MAX_STACK_SIZE = 1;
}
