package com.eihei.wand.event;

import com.eihei.wand.wand;
import com.eihei.wand.registry.ModItems;
import com.eihei.wand.utils.Keybind;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.InputEvent;

public class WandEvent {
  public static int level = 1;
  @Mod.EventBusSubscriber(modid = wand.MODID,value = Dist.CLIENT)
  public static class ClientForgeEvents{
      @SubscribeEvent
      public static void onKeyInput(InputEvent.Key event){
          if(Keybind.WAND_KEY.consumeClick()){
          Player player = Minecraft.getInstance().player;
          if(player.getItemInHand(InteractionHand.MAIN_HAND).equals(ModItems.WAND)){
            ItemStack item = player.getItemInHand(InteractionHand.OFF_HAND);
            ItemStack mainitem = player.getItemInHand(InteractionHand.MAIN_HAND);
          if(item.equals(Items.REDSTONE_BLOCK)){
            player.getInventory().removeItem(item);
            player.getInventory().removeItem(mainitem);
            player.addItem(new ItemStack(ModItems.RED_BLOCK_WAND.get()));
          }
          if(level == 2){
            player.sendSystemMessage(Component.literal("Control Entity"));
          }
          if(level == 3){
            player.sendSystemMessage(Component.literal("Launch Block"));
          }
          if(level == 6)level = 1;
        }
      }
      }
  }

  @Mod.EventBusSubscriber(modid = wand.MODID,value = Dist.CLIENT,bus=Mod.EventBusSubscriber.Bus.MOD)
  public static class ClientModBusEvents {
      @SubscribeEvent
      public static void onKeyRegister(RegisterKeyMappingsEvent event){
          event.register(Keybind.COMMAND_KEY);
      }
  }

}
