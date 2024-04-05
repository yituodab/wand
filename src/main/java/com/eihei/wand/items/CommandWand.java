package com.eihei.wand.items;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import com.eihei.wand.wand;
import com.eihei.wand.tool.Ways;
import com.ibm.icu.text.CaseMap.Title;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.commands.arguments.ComponentArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.commands.TitleCommand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wand.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommandWand extends Item{

  public CommandWand(Properties properties) {
    super(properties);
    //TODO Auto-generated constructor stub
  }
  /*public static int i = 1;
  public static final KeyMapping CommandKey =
  new KeyMapping("key", 82, Component.keybind("key").getString());
  @SubscribeEvent
  public static void key(RegisterKeyMappingsEvent event){
    event.register(CommandKey);
  }
  @SubscribeEvent
  @OnlyIn(Dist.CLIENT)
  public static void Commandkey(InputEvent.Key event){
    i += 1;
    Component a = Component.keybind("Fire Block");
    Component b = Component.keybind("TP Player");
    Component c = Component.keybind("Fill Block");
    Component d = Component.keybind("Fill Block(For)");
    if(i==1)player.sendSystemMessage(b);
    if(i==2)player.sendSystemMessage(c);
    if(i==3)player.sendSystemMessage(d);
    if(i==4)player.sendSystemMessage(a);
    if(i==5){
      i = 1;
    }
  }*/
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    
    Entity locationplayer = Ways.getPointedEntity(player, 50);
   /* if(i == 1){
    }
    if(i == 2){*/
        HitResult hitResult = player.pick(10, 0, false);
        Vec3 location = hitResult.getLocation();
        locationplayer.teleportTo(location.x,location.y,location.z);
        if(locationplayer instanceof Player play){
        play.teleportTo(location.x, location.y, location.z);
    /*  }
    }*/
  }
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }
}
