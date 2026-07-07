package net.ekotsk.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "armor")
public class ArmorConfig implements ConfigData
{
    @ConfigEntry.Gui.CollapsibleObject
    public Map<String, ArmorTypeConfig> armor = new LinkedHashMap<>() {{
        put("lannister_helmet", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 0, 0, 0, 240 }, new Integer[] { 0, 0, 0, 2 }, 9, true));

    }};

    public ArmorTypeConfig get(String name) {
        return this.armor.get(name);
    }

    public static class ArmorTypeConfig {
        @ConfigEntry.Gui.RequiresRestart
        public float toughness;
        @ConfigEntry.Gui.RequiresRestart
        public float knockbackResistance;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDurability;
        @ConfigEntry.Gui.RequiresRestart
        public int bootsDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int leggingsDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int chestplateDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int helmetDefense;
        @ConfigEntry.Gui.RequiresRestart
        public int enchantmentValue;
        @ConfigEntry.Gui.RequiresRestart
        public boolean enabled;

        private ArmorTypeConfig() {}

        public static ArmorTypeConfig of(
                float toughness,
                float knockbackResistance,
                Integer[] durability,
                Integer[] defenseForSlot,
                int enchantmentValue,
                boolean enabled) {
            ArmorTypeConfig cfg = new ArmorTypeConfig();
            cfg.toughness = toughness;
            cfg.knockbackResistance = knockbackResistance;
            cfg.bootsDurability = durability[0];
            cfg.leggingsDurability = durability[1];
            cfg.chestplateDurability = durability[2];
            cfg.helmetDurability = durability[3];
            cfg.bootsDefense = defenseForSlot[0];
            cfg.leggingsDefense = defenseForSlot[1];
            cfg.chestplateDefense = defenseForSlot[2];
            cfg.helmetDefense = defenseForSlot[3];
            cfg.enchantmentValue = enchantmentValue;
            cfg.enabled = enabled;
            return cfg;
        }

        public static ArmorTypeConfig of(
                ArmorMaterial material,
                Integer[] durability,
                boolean enabled) {

            return of(
                    material.toughness(),
                    material.knockbackResistance(),
                    durability,
                    new Integer[]{
                            material.getDefense(ArmorItem.Type.BOOTS),
                            material.getDefense(ArmorItem.Type.LEGGINGS),
                            material.getDefense(ArmorItem.Type.CHESTPLATE),
                            material.getDefense(ArmorItem.Type.HELMET)
                    },
                    material.enchantmentValue(),
                    enabled
            );
        }
    }
}