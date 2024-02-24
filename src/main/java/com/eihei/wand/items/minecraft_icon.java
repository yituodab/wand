package com.eihei.wand.items;

import com.eihei.wand.wand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wand.MODID)
public class minecraft_icon extends Item {
    public minecraft_icon(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if (level.isClientSide()) {
            return super.use(level, player, useHand);
        }
        ServerLevel serverLevel = level.getServer().getLevel(Level.OVERWORLD);
        ServerPlayer serverPlayer;//= player instanceof ServerPlayer ? (ServerPlayer) player:null;
        if (player instanceof ServerPlayer) {
            serverPlayer = (ServerPlayer) player;
        } else {
            serverPlayer = null;
        }
        if (serverPlayer != null && serverLevel != null && player.isCreative()) {
            ((ServerPlayer) player).setGameMode(GameType.SURVIVAL);
            return InteractionResultHolder.success(player.getItemInHand(useHand));
        }
        if (serverPlayer != null && serverLevel != null) {
            player.isCreative();
            ((ServerPlayer) player).setGameMode(GameType.CREATIVE);
        }
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
