package com.eihei.wand.items;

import com.eihei.wand.tool.Pos;
import com.eihei.wand.tool.Ways;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleDescription;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.NoiseChunk.BlockStateFiller;
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
            double x = location.x-player.getX();
            double y = location.y-player.getY();
            double z = location.z-player.getZ();
            Vec3 vec = Pos.main(1, player);
            double Line = vec.distanceTo(location);
            double X = x/Line/4;
            double Y = y/Line/4;
            double Z = z/Line/4;
            Vec3 add = new Vec3(X,Y,Z);
            for(double line = 0;line<Line;line = line + 0.25,vec = vec.add(add)){
                level.addParticle(ParticleTypes.FALLING_LAVA, vec.x, vec.y, vec.z, vec.x, vec.y, vec.z);
            }
            BlockPos Location = new BlockPos(location.x, location.y, location.z);
            level.setBlock(Location, Blocks.AIR.defaultBlockState(), 0);
            Entity entity = Ways.getPointedEntity(player, Line);
            if(entity != null){
            entity.hurt(DamageSource.MAGIC, 20);
        	}
            Block block = level.getBlockState(Location).getBlock();
            if(block.equals(Blocks.AMETHYST_BLOCK)){
        	}
        // TODO Auto-generated method stub
        return super.use(level,player,useHand);
    }
}
