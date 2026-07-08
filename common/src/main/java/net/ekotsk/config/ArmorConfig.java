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
        put("lannister_chestplate", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 0, 0, 290, 0 }, new Integer[] { 0, 0, 6, 0 }, 9, true));
        put("lannister_leggings", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 0, 235, 0, 0 }, new Integer[] { 0, 5, 0, 0 }, 9, true));
        put("fancy_boots", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 200, 0, 0, 0 }, new Integer[] { 2, 0, 0, 0 }, 9, true));
        put("lannister_lord_helmet", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 0, 0, 0, 275 }, new Integer[] { 0, 0, 0, 3 }, 10, true));
        put("lannister_lord_chestplate", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 0, 0, 340, 0 }, new Integer[] { 0, 0, 8, 0 }, 10, true));
        put("lannister_lord_leggings", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 0, 315, 0, 0 }, new Integer[] { 0, 5, 0, 0 }, 10, true));
        put("valyrian_steel_helmet", ArmorTypeConfig.of(4.00f, 0.3f, new Integer[] { 0, 0, 0, 5000 }, new Integer[] { 0, 0, 0, 4 }, 25, true));
        put("valyrian_steel_armor", ArmorTypeConfig.of(4.00f, 0.3f, new Integer[] { 5000, 7000, 10000, 0 }, new Integer[] { 4, 7, 9, 0 }, 25, true));
        put("hotd_kingsguard_armor", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, true));
        put("kotsk_kingsguard_armor", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, true));
        put("kingsguard_armor", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, true));
        put("kingsguard_2_armor", ArmorTypeConfig.of(1.30f, 0.5f, new Integer[] { 235, 315, 340, 275 }, new Integer[] { 3, 5, 8, 3 }, 10, true));
        put("gold_cloak_armor", ArmorTypeConfig.of(0.50f, 0.1f, new Integer[] { 210, 300, 320, 250 }, new Integer[] { 2, 5, 7, 3 }, 9, true));
        put("gold_cloak_armor_kotsk", ArmorTypeConfig.of(0.50f, 0.1f, new Integer[] { 150, 230, 250, 205 }, new Integer[] { 1, 4, 5, 2 }, 9, true));
        put("gold_cloak_armor_got", ArmorTypeConfig.of(0.50f, 0.1f, new Integer[] { 0, 235, 290, 240 }, new Integer[] { 0, 5, 6, 3 }, 9, true));
        put("dornish_armor", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 4, 6, 2 }, 9, true));
        put("northern_armor", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 5, 6, 2 }, 9, true));
        put("greyjoy_armor", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 4, 6, 2 }, 9, true));
        put("night_watch_armor", ArmorTypeConfig.of(0.50f, 0.0f, new Integer[] { 200, 235, 290, 240 }, new Integer[] { 3, 5, 6, 1 }, 8, true));
        put("aegon_crown", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 0, 5000 }, new Integer[] { 0, 0, 0, 2 }, 25, true));
        put("hand_sign", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 1, 0 }, 9, true));
        put("fancy_cape", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, true));
        put("night_watch_cape", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, true));
        put("gold_cloak_left", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, true));
        put("gold_cloak_right", ArmorTypeConfig.of(0.00f, 0.0f, new Integer[] { 0, 0, 180, 0 }, new Integer[] { 0, 0, 0, 0 }, 9, true));
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