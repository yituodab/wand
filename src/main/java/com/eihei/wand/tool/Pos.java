package com.eihei.wand.tool;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class Pos {
  public static Vec3 main(double distance, Player player){
    HitResult hitResult = player.pick(distance, 0, false);
    Vec3 location = hitResult.getLocation();
    return location;
  }

}
