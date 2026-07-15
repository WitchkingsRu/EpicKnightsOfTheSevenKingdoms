package net.ekotsk.loot.api;

import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Method;

public class LootrCompat {
    private static final Logger LOGGER = LoggerFactory.getLogger("EKOTSK.UniqueLoot.LootrCompat");
    private static Boolean lootrLoaded = null;
    private static Method makeUniqueMethod = null;

    private static final String[] LOOTR_API_CLASSES = {
            "noobanidus.mods.lootr.common.api.LootrAPI",
            "noobanidus.mods.lootr.api.LootrAPI"
    };

    public static boolean isLootrLoaded() {
        if (lootrLoaded == null) {
            for (String className : LOOTR_API_CLASSES) {
                try {
                    Class.forName(className);
                    lootrLoaded = true;
                    LOGGER.info("Lootr detected! Compatibility enabled.");
                    return true;
                } catch (ClassNotFoundException e) {
                }
            }
            lootrLoaded = false;
            LOGGER.debug("Lootr not found. Running in standard mode.");
        }
        return lootrLoaded;
    }

    public static void makeUnique(ItemStack stack) {
        if (!isLootrLoaded()) return;

        try {
            if (makeUniqueMethod == null) {
                Class<?> apiClass = null;
                for (String className : LOOTR_API_CLASSES) {
                    try {
                        apiClass = Class.forName(className);
                        break;
                    } catch (ClassNotFoundException e) {
                    }
                }
                if (apiClass != null) {
                    makeUniqueMethod = apiClass.getMethod("makeUnique", ItemStack.class);
                }
            }
            if (makeUniqueMethod != null) {
                makeUniqueMethod.invoke(null, stack);
                LOGGER.debug("Successfully called LootrAPI.makeUnique()");
            }
        } catch (NoSuchMethodException e) {
            LOGGER.error("LootrAPI.makeUnique method signature changed or missing. Update mod compatibility.");
        } catch (Exception e) {
            LOGGER.warn("Failed to invoke LootrAPI.makeUnique(): {}", e.getMessage());
        }
    }
}
