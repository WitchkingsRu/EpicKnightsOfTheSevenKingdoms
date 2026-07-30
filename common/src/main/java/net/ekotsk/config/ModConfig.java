package net.ekotsk.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.ekotsk.client.render.WeirwoodArrowRender;

@Config(name = "ekotsk")
public class ModConfig extends PartitioningSerializer.GlobalData
{
    @ConfigEntry.Gui.CollapsibleObject
    public ArmorConfig armor;
    public WeaponConfig weapons;

    public ModConfig() {
        this.armor = new ArmorConfig();
        this.weapons = new WeaponConfig();

    }
}