package net.ekotsk.item;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.config.WeaponsConfig;
import com.magistuarmory.item.RangedWeaponType;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.config.WeaponConfig;

public class ModWeaponTypes {
    public static final WeaponConfig WEAPON_CONFIG;
    public static final RangedWeaponType WEIRWOOD_LONGBOW;
    static {
        WEAPON_CONFIG = ASOIAFMod.CONFIG.weapons;
        WEIRWOOD_LONGBOW = WEAPON_CONFIG.getRanged("weirwood_longbow");
    }

}
