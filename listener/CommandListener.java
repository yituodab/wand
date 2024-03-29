package com.eihei.wand.listener;

import com.eihei.wand.wand;
import com.eihei.wand.items.CommandWand;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wand.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommandListener {
    //TODO Auto-generated constructor stub
    public static final KeyMapping Key =
    new KeyMapping("key", 82, null);
    @SubscribeEvent
    public static void key(RegisterKeyMappingsEvent event){
        event.register(Key);
    }
    private CommandWand i;
    public CommandWand A(){
        return i;
    }
    public void B(CommandWand i){
        this.i = i;
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void Key(InputEvent.Key event){
        CommandListener wandi = new CommandListener();
        int x = wandi.A().a();
        x++;
    }
}
