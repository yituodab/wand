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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
        Vec3 location = Pos.main(1, player);
        if(inHand.equals(Items.ARROW)){
            /*Arrow arrow = new Arrow(level, player.getX(), player.getY() + 1, player.getZ());
            arrow.save(tag);
            arrow.load(tag);
            arrow.deserializeNBT(tag);
            level.addFreshEntity(arrow);*/
            Projectile _entityToSpawn = new Object() {
				public Projectile getArrow (Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					return entityToSpawn;
                }
				}.getArrow (level, player,2,1);
			_entityToSpawn.setPos(location.x,location.y,location.z);
			_entityToSpawn.shoot(player.getLookAngle().x,player.getLookAngle().y,player.getLookAngle().z, 4, 0);
			level.addFreshEntity(_entityToSpawn);
        }
        if(inHand.equals(Items.SNOWBALL)){
            Snowball snow = new Snowball(level, player.getX(), player.getY(), player.getX());
            snow.save(tag);
            snow.load(tag);
            snow.deserializeNBT(tag);
            level.addFreshEntity(snow);
        }
        return super.use(level, player, useHand);
    }
}
