package com.eihei.wand.registry;

import com.eihei.wand.items.BonfireWand;
import com.eihei.wand.items.CobwebWand;
import com.eihei.wand.items.CommandWand;
import com.eihei.wand.items.EndBlockWandItem;
import com.eihei.wand.items.FireWand;
import com.eihei.wand.items.LightningWand;
import com.eihei.wand.items.MinecraftIconItem;
import com.eihei.wand.items.NetheriteBlockWandItem;
import com.eihei.wand.items.RedBlockWand;
import com.eihei.wand.items.SheepWoolWand;
import com.eihei.wand.items.StoneCutterWand;
import com.eihei.wand.items.StoneWand;
import com.eihei.wand.wand;
import com.eihei.wand.items.TNTWandItem;
import com.eihei.wand.items.TestItem;
import com.eihei.wand.items.WandItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.StoneButtonBlock;
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
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            ()->new WandItem(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> COMMAND_WAND = ITEMS.register("command_wand",
            ()->new CommandWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_CONCENTRATE_INGOT_PROEMBRYO = ITEMS.register("concentrateobsidianingotproembryo",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> OBSIDIAN_CONCENTRATE_INGOT = ITEMS.register("concentrateobsidianingot",
            ()->new Item(new Item.Properties().tab(ModCreativeTabs.WAND)));
    public static final RegistryObject<Item> NETHERITE_BLOCK_WAND = ITEMS.register("netherite_block_wand",
            ()->new NetheriteBlockWandItem(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> MINECRAFT_ICON = ITEMS.register("minecraft_icon",
            ()->new MinecraftIconItem(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> END_BLOCK_WAND = ITEMS.register("end_block_wand",
            ()->new EndBlockWandItem(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> STONE_CUTTER_WAND = ITEMS.register("stone_cutter_wand",
            ()->new StoneCutterWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> TNT_WAND = ITEMS.register("tnt_wand",
	    ()->new TNTWandItem(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> RED_BLOCK_WAND = ITEMS.register("redstone_block_wand",
            ()->new RedBlockWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> FIRE_WAND = ITEMS.register("fire_wand",
            ()->new FireWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> BONFIRE_WAND = ITEMS.register("bonfire_wand", 
            ()->new BonfireWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> WHITE_WOOL_WAND = ITEMS.register("white_wool_wand", 
            ()->new SheepWoolWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> STONE_WAND = ITEMS.register("stone_wand", 
    	    ()->new StoneWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> COBWEB_WAND = ITEMS.register("cobweb_wand",
            ()->new CobwebWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> LIGHTNING_WAND = ITEMS.register("lightningblotrod_wand",
            ()->new LightningWand(new Item.Properties().tab(ModCreativeTabs.WAND).stacksTo(1)));
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("test_item", 
   	    ()->new TestItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
}
