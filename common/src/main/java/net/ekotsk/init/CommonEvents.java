package net.ekotsk.init;

import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.event.events.common.LootEvent;
import net.ekotsk.loot.UniqueLootInjector;
import net.ekotsk.misc.ModMerchantOffers;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;


public class CommonEvents {

    public static void init() {
        LootEvent.MODIFY_LOOT_TABLE.register(CommonEvents::onModifyLootTable);
        LifecycleEvent.SETUP.register(CommonEvents::onSetup);
    }

    public static void onModifyLootTable(
            ResourceKey<LootTable> key,
            LootEvent.LootTableModificationContext context,
            boolean builtin
    ) {
        ResourceLocation id = key.location();
        UniqueLootInjector.modifyLootTable(id, context);
    }

    private static void onSetup() {
         ModMerchantOffers.setup();
    }
}
