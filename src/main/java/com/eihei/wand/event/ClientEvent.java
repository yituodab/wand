package com.eihei.wand.event;

import com.eihei.wand.wand;
import com.eihei.wand.items.CommandWand;
import com.eihei.wand.registry.ModItems;
import com.eihei.wand.utils.Keybind;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.InputEvent;

public class ClientEvent {
  @Mod.EventBusSubscriber(modid = wand.MODID,value = Dist.CLIENT)
  public static class ClientForgeEvents{
      @SubscribeEvent
      public static void onKeyInput(InputEvent.Key event){
          if(Keybind.COMMAND_KEY.consumeClick()){
          Player player = Minecraft.getInstance().player;
          if(player.getItemInHand(InteractionHand.MAIN_HAND).equals(ModItems.COMMAND_WAND)){
            CommandWand.click = CommandWand.click + 1;
            int level = CommandWand.click;
          if(level == 1){
            player.sendSystemMessage(Component.literal("Obsidian Line"));
            System.out.println("level = 1");
          }
          if(level == 2){
            player.sendSystemMessage(Component.literal("Control Entity"));
            System.out.println("level = 2");
          }
          if(level == 3){
            player.sendSystemMessage(Component.literal("Launch Block"));
            System.out.println("level = 3");
          }
            if(level == 6){CommandWand.click = 1;System.out.print("level = 1");}
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
