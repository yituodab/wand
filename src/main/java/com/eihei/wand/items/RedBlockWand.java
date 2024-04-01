package com.eihei.wand.items;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleDescription;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class RedBlockWand extends Item{

    public RedBlockWand(Properties properties) {
        super(properties);
        //TODO Auto-generated constructor stub
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
            HitResult hitResult = player.pick(100, 0, false);
            Vec3 location = hitResult.getLocation();
            double a = Math.pow(location.x-player.getX(),2);
            double b = Math.pow(location.y-player.getY(),2);
            double c = Math.pow(location.z-player.getZ(), 2);
            double d = a+b+c;
            double Line = Math.sqrt(d);
            Vec3 vec = new Vec3(player.getX(), player.getY(), player.getZ());
            for(double line = 0;line<Line;line = line +1){
                Vec3 Vec = vec.add(line, 0, 0);
                level.addParticle(ParticleTypes.FALLING_LAVA, Vec.x, Vec.y, Vec.z, player.getX(), player.getY(), player.getZ());
            }
            BlockState air = Blocks.AIR.defaultBlockState();
            level.setBlock(new BlockPos(location), air, 1);
            BlockPos Location = new BlockPos(location.x, location.y, location.z);
            Block block = level.getBlockState(Location).getBlock();
            if(block.equals(Blocks.AMETHYST_BLOCK)){
            }
        // TODO Auto-generated method stub
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
