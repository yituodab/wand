package com.eihei.wand.items;

import org.antlr.v4.parse.ANTLRParser.labeledAlt_return;

import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class LightningWand extends Item{
    public LightningWand(Properties properties)
    {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
            HitResult hitResult = player.pick(50,0,false);
            Vec3 location = hitResult.getLocation();
            LightningBolt Light = new LightningBolt(null, level);
            level.addFreshEntity(Light);

        return super.use(level, player, useHand);
    }



    
}