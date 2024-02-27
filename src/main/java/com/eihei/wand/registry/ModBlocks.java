package com.eihei.wand.registry;

import com.eihei.wand.wand;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, wand.MODID);
    public static final RegistryObject<Block> SHIT = BLOCKS.register("shit",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    
    public static final RegistryObject<Block> TPDOOR = BLOCKS.register("tpdoor",
            ()->new Block(BlockBehaviour.Properties.copy(BLOCKS.AIR)));
}
