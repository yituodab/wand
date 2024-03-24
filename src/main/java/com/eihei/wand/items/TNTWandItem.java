package com.eihei.wand.items;

import com.eihei.wand.utils.EntityUtil;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TNTWandItem extends Item {
    public TNTWandItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if (level.isClientSide()) {
            PrimedTnt tnt = new PrimedTnt(level, player.getX(), player.getY() + 2, player.getZ(), player);
            tnt.setFuse(40);
            CompoundTag tag = new CompoundTag();
            tag.put("Motion", EntityUtil.newDoubleList(1.0, 1.0, 0.0));
            tnt.getEntityData().set(SynchedEntityData.defineId(PrimedTnt.class, EntityDataSerializers.COMPOUND_TAG), tag);
            tnt.getEntityData().set(null, tag);
            level.addFreshEntity(tnt);
        }
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
