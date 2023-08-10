package fr.xenohart.xeno.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SandBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class QuicksandBlock extends SandBlock {
    public QuicksandBlock() {
        super(1, Settings.copy(net.minecraft.block.Blocks.SAND).ticksRandomly());
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
        if (!world.isClient && entity.isOnGround() && entity.getY() < pos.getY()) {
            // Slow down the entity's movement and sink it into the block
            entity.setVelocity(entity.getVelocity().multiply(0.25, 1.0, 0.25));
            entity.setOnGround(false);
            entity.setOnFireFor(1); // Optional: set the entity on fire when it enters the quicksand
            entity.addVelocity(0, -0.2, 0);
        }
    }
}
