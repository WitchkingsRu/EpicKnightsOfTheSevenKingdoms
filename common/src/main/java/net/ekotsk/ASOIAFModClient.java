package net.ekotsk;

import dev.architectury.registry.menu.MenuRegistry;
import net.ekotsk.screen.ModMenuTypes;
import net.ekotsk.screen.QohorySmelteryScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ASOIAFModClient {
    private static final Logger LOGGER = LogManager.getLogger("EKOTSK");
    @Environment(EnvType.CLIENT)
    public static void clientInit() {
        LOGGER.info("Initializing client...");

    }

    public static void clientSetup() {

    }
}