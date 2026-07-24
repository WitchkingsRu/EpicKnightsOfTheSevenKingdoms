package net.ekotsk.block;

import net.ekotsk.worldgen.WeirwoodTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WeirwoodSaplingBlock extends SaplingBlock {

    public WeirwoodSaplingBlock(BlockBehaviour.Properties properties) {
        super(new WeirwoodTreeGrower(), properties);
    }
}