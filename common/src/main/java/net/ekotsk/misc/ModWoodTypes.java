package net.ekotsk.misc;

import net.ekotsk.ASOIAFMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType WEIRWOOD = WoodType.register(new WoodType(ASOIAFMod.MOD_ID + ":weirwood", BlockSetType.OAK));
}
