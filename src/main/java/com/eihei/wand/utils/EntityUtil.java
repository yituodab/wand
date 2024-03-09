package com.eihei.wand.utils;

import net.minecraft.nbt.DoubleTag;
import net.minecraft.nbt.ListTag;

public interface EntityUtil {
    public static ListTag newDoubleList(double... p_20064_) {
        ListTag listtag = new ListTag();

        for(double d0 : p_20064_) {
            listtag.add(DoubleTag.valueOf(d0));
        }

        return listtag;
    }
}
