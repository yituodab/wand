package com.eihei.wand.registry;

import com.eihei.wand.items.EndBlockWandItem;
import com.eihei.wand.items.MinecraftIconItem;
import com.eihei.wand.items.NetheriteBlockWandItem;
import com.eihei.wand.wand;
import com.eihei.wand.items.TNTWandItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, wand.MODID);

    public static final RegistryObject<Item> WAND_BODY = ITEMS.register("wand_body",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> WAND_HEAD = ITEMS.register("wand_head",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> SHIT = ITEMS.register("shit",
            ()->new BlockItem(ModBlocks.SHIT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAND_INGOT = ITEMS.register("wand_ingot",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> COMMAND_WAND = ITEMS.register("command_wand",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> WAND_CONCENTRATE_INGOT_PROEMBRYO = ITEMS.register("concentratewandingotproembryo",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> WAND_CONCENTRATE_INGOT = ITEMS.register("concentratewandingot",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> NETHERITE_BLOCK_WAND = ITEMS.register("netherite_block_wand",
            ()->new NetheriteBlockWandItem(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> MINECRAFT_ICON = ITEMS.register("minecraft_icon",
            ()->new MinecraftIconItem(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> END_BLOCK_WAND = ITEMS.register("end_block_wand",
            ()->new EndBlockWandItem(new Item.Properties().tab(ModCreativeTabs.WAND)));

    public static final RegistryObject<Item> BLOCK_WAND = ITEMS.register("block_wand",
            ()->new PickaxeItem(ModTiers.WAND_PICKAXE,2, 1.5F,new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> END_BLOCK_WAND = ITEMS.register("end_block_wand",
		                ()->new TNTWandItem(new Item.Properties().tab(ModCreativeTabs.WAND)));


}
