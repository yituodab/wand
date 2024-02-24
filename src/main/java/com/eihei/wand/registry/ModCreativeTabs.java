package com.eihei.wand.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
    public static final CreativeModeTab WAND = new CreativeModeTab("wand") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WAND.get());
        }
    };
}
