package com.eihei.wand.items;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import org.apache.commons.lang3.ObjectUtils.Null;

import com.eihei.wand.wand;
import com.eihei.wand.event.ClientEvent;
import com.eihei.wand.tool.Pos;
import com.eihei.wand.tool.Ways;
import com.ibm.icu.text.CaseMap.Title;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.commands.arguments.ComponentArgument;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.level.block.Blocks;
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
  private int click = ClientEvent.level;
  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
    Vec3 PlayerPos = Pos.main(1,player);
    Vec3 location = Pos.main(50, player);
    double line = PlayerPos.distanceTo(location);
    double X = location.x-player.getX();
    double Y = location.y-player.getY();
    double Z = location.z-player.getZ();
    double x = X/line;
    double y = Y/line;
    double z = Z/line;
    if(click == 1){
      Vec3 add = new Vec3(x,y,z);
      for(int i=1;i<line;i++,PlayerPos=PlayerPos.add(add)){
        level.setBlock(new BlockPos(PlayerPos), Blocks.OBSIDIAN.defaultBlockState(), 0);
      }
    }
    	Entity locationplayer = Ways.getPointedEntity(player, 50);
    	if(locationplayer != null){
    	locationplayer.teleportTo(location.x,location.y,location.z);
    	}
    // TODO Auto-generated method stub
    return super.use(level, player, useHand);
  }

  public static final int MAX_STACK_SIZE = 1;
}
