package net.ekotsk.config;

import com.magistuarmory.item.RangedWeaponType;
import com.magistuarmory.item.WeaponType;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.ConfigData;

import java.util.LinkedHashMap;
import java.util.Map;

@Config(name = "weapons")
public class WeaponConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    private Map<String, RangedWeaponType> rangedWeapons = new LinkedHashMap<>() {{
        put("weirwood_longbow", RangedWeaponType.of(550, 45, 5.0f, true));
    }};

    public RangedWeaponType getRanged(String name) {
        return rangedWeapons.get(name);
    }
}

