package fr.xenohart.xeno.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;

public class ColoredRedstoneWireBlock extends RedstoneWireBlock {
    private final DyeColor wireColor;

    public ColoredRedstoneWireBlock(DyeColor wireColor) {
        super(AbstractBlock.Settings.copy(Blocks.REDSTONE_WIRE));
        this.wireColor = wireColor;
    }

    public MapColor getDefaultMapColor(ItemStack stack) {
        return wireColor.getMapColor();
    }
}
