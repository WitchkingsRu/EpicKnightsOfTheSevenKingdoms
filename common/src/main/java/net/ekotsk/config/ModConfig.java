package net.ekotsk.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

@Config(name = "ekotsk")
public class ModConfig extends PartitioningSerializer.GlobalData
{
    @ConfigEntry.Gui.CollapsibleObject
    public ArmorConfig armor;

    public ModConfig() {
        this.armor = new ArmorConfig();

    }
}