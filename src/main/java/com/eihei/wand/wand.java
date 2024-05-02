package com.eihei.wand;

import com.eihei.wand.entity.bedrock.BedrockEntityModel;
import com.eihei.wand.entity.bedrock.BedrockEntityRanderer;
import com.eihei.wand.entity.obsidian.ObsidianArrowRanderer;
import com.eihei.wand.entity.obsidian.ObsidianEntityRanderer;
import com.eihei.wand.registry.ModBlocks;
import com.eihei.wand.registry.ModEntityTypes;
import com.eihei.wand.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(wand.MODID)
public class wand {
    public static final String MODID = "wand";
    private static final Logger LOGGER = LogUtils.getLogger();
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::registerRenderers);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
    public void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntityTypes.OBSIDIAN.get(), ObsidianEntityRanderer::new);
        event.registerEntityRenderer(ModEntityTypes.BEDROCK.get(), BedrockEntityRanderer::new);
        event.registerEntityRenderer(ModEntityTypes.OBSIARROW.get(), ObsidianArrowRanderer::new);
    }
}
