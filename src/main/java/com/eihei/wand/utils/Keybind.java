package com.eihei.wand.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class Keybind {
  public static final String KEY_CATEGORY_WAND = "key.category.wand.wand";
  public static final String KEY_COMMAND =  "key.wand.command";
  public static final String KEY_WAND = "key.wand.wand";

  public static final KeyMapping COMMAND_KEY = new KeyMapping(KEY_COMMAND, KeyConflictContext.IN_GAME,
          InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, KEY_CATEGORY_WAND);
  public static final KeyMapping WAND_KEY = new KeyMapping(KEY_WAND, KeyConflictContext.IN_GAME, 
          InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_X, KEY_CATEGORY_WAND);
}
