package com.eihei.wand.utils;

import net.minecraft.nbt.DoubleTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;

public interface EntityUtil {
    public static ListTag newDoubleList(double... Double) {
        ListTag listtag = new ListTag();
        for(double d0 : Double) {
            listtag.add(DoubleTag.valueOf(d0));
        }

        return listtag;
    }
    public static ListTag newStringList(String... string) {
        ListTag listtag = new ListTag();
        for(String s0 : string) {
            listtag.add(StringTag.valueOf(s0));
        }
        return listtag;
    }
}
