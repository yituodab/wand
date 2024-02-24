package com.eihei.wand.items;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.apache.logging.log4j.core.jmx.Server;

public class netherite_block_wand extends Item {
    public netherite_block_wand(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if (!level.isClientSide) {
            ServerLevel serverLevel = (ServerLevel) level;
            HitResult hitResult = player.pick(5, 0, false);
            Vec3 location = hitResult.getLocation();
                for (double e = location.x - 3; e < 7; e = e + 1) {
                    for (double f = location.y - 3; f < 7; f = f + 1) {
                        for (double g = location.z - 3; g < 7; g = g + 1) {
                            level.setBlock(new BlockPos(e, f, g), Blocks.AIR.defaultBlockState(), 3);
                        }
                    }
                }
            }
            return InteractionResultHolder.success(player.getItemInHand(useHand));
        }
    }
