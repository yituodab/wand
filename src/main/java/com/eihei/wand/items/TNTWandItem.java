package com.eihei.wand.items;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;

import com.eihei.wand.utils.EntityUtil;
import com.ibm.icu.impl.TZDBTimeZoneNames;
import com.ibm.icu.util.ULocale.Type;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
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
    public static final EntityDataAccessor<String> TAGGET = SynchedEntityData.defineId(PrimedTnt.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> TAGSET = SynchedEntityData.defineId(PrimedTnt.class, EntityDataSerializers.BOOLEAN);
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
            PrimedTnt tnt = new PrimedTnt(level, player.getX(), player.getY() + 2, player.getZ(), player);
            tnt.setFuse(40);
            CompoundTag tag = new CompoundTag();
            tag.put("Motion", EntityUtil.newDoubleList(1.0, 1.0, 0.0));
            tnt.getEntityData().set(TAGGET, "tag");
            tnt.getEntityData().set(TAGSET, false);
            tnt.getEntityData().set(TAGGET, tag.getString("Motion"));
            level.addFreshEntity(tnt);
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
