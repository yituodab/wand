package com.eihei.wand.registry;

import java.util.function.Supplier;
import org.openjdk.nashorn.internal.runtime.regexp.joni.constants.CCSTATE;
import com.eihei.wand.wand;
import com.eihei.wand.entity.obsidian.ObsidianEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
  public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = 
  DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, wand.MODID);
  public static final RegistryObject<EntityType<ObsidianEntity>> OBSIDIAN =
            ENTITY_TYPES.register("obsidian",
                       ()->EntityType.Builder.of(ObsidianEntity::new, MobCategory.MISC)
                            .sized(1f,1f) //生成的大小width height
                            .build(new ResourceLocation(wand.MODID,"obsidian").toString()));
  public static void registry(IEventBus eventBus){
    ENTITY_TYPES.register(eventBus);
  }
}
