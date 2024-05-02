package com.eihei.wand.entity.obsidian;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ObsidianArrow extends Arrow implements IAnimatable{
    @SuppressWarnings("removal")
    public AnimationFactory factory = new AnimationFactory(this);

    public ObsidianArrow(EntityType<? extends Arrow> p_36858_, Level p_36859_) {
        super(p_36858_, p_36859_);
        //TODO Auto-generated constructor stub
    }
    @Override
    protected void onHit(HitResult hit) {
        Level level = this.getLevel();
  		for(double x=this.getX()-1.5;x<this.getX()+1.5;x++){
    		for(double y=this.getY()-1.5;y<this.getY()+1.5;y++){
      			for(double z=this.getZ()-1.5;z<this.getZ()+1.5;z++){
        			level.setBlock(new BlockPos(x,y,z), Blocks.OBSIDIAN.defaultBlockState(), 0);
     		 	}
    		}
		}
        // TODO Auto-generated method stub
        super.onHit(hit);
    }
    @Override
    public void registerControllers(AnimationData data) {
        // TODO Auto-generated method stub
    }
    @Override
    public AnimationFactory getFactory() {
        // TODO Auto-generated method stub
        return factory;
    }
    public static AttributeSupplier.Builder registerAttributes(){
        return Mob.createMobAttributes();
    }
}
