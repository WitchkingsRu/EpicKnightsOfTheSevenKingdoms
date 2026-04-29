package net.ekotsk.init;

import dev.architectury.event.events.common.LootEvent;
import net.ekotsk.loot.UniqueLootInjector;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootDataManager;

public class CommonEvents {

    public static void init() {
        LootEvent.MODIFY_LOOT_TABLE.register(CommonEvents::onModifyLootTable);
    }

    public static void onModifyLootTable(
            LootDataManager lootManager,
            ResourceLocation id,
            LootEvent.LootTableModificationContext context,
            boolean builtin
    ) {
        UniqueLootInjector.modifyLootTable(id, context);
    }
}