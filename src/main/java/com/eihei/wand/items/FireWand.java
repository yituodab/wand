package com.eihei.wand.items;

import com.eihei.wand.tool.Pos;
import com.eihei.wand.utils.EntityUtil;

import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.Tags.EntityTypes;

public class FireWand extends Item{

    public FireWand(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        ItemStack inHand = player.getItemInHand(InteractionHand.OFF_HAND);
        CompoundTag tag = new CompoundTag();
        tag.put("Motion", EntityUtil.newDoubleList(1.0, 0, 0));
        Vec3 pos = Pos.main(1, player);
        if(inHand.equals(Items.ARROW)){
            Arrow arrow = new Arrow(level,pos.x,pos.y,pos.z);
            arrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 10.0F, 0.0F);
            level.addFreshEntity(arrow);
        }
        if(inHand.equals(Items.SNOWBALL)){
            Snowball snow = new Snowball(level, pos.x, pos.y, pos.z);
            snow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 10.0F, 0.0F);
            level.addFreshEntity(snow);
        }
        return super.use(level, player, useHand);
    }
}
