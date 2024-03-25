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
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class RedBlockWand extends Item{

    public RedBlockWand(Properties properties) {
        super(properties);
        //TODO Auto-generated constructor stub
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if(level.isClientSide){
            HitResult hitResult = player.pick(100, 0, false);
            Vec3 location = hitResult.getLocation();
            level.addParticle(ParticleTypes.FALLING_OBSIDIAN_TEAR, location.x, location.y, location.z, player.getX(), player.getY(), player.getZ());
            level.setBlock(new BlockPos(location), Blocks.AIR.defaultBlockState(), 3);
            BlockPos Location = new BlockPos(location.x, location.y, location.z);
            Block block = level.getBlockState(Location).getBlock();
            if(block.getDescriptionId().equals("block.minecraft.amethyst_block")){
            }
        }
        // TODO Auto-generated method stub
        return super.use(level, player, useHand);
    }
}
