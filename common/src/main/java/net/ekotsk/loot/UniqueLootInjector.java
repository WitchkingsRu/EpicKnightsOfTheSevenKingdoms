package net.ekotsk.loot;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;

public class UniqueLootInjector {

    private static final String PREFIX = "minecraft:chests/";

    public static void modifyLootTable(ResourceLocation id, LootEvent.LootTableModificationContext context) {
        String name = id.toString();

        if (!name.startsWith(PREFIX)) return;

        String structure = name.substring(PREFIX.length());

        if (shouldInject(structure)) {
            context.addPool(getPool(structure));
        }
    }

    private static boolean shouldInject(String structure) {
        return switch (structure) {
            case "desert_pyramid",
                 "shipwreck_treasure",
                 "ancient_city",
                 "ancient_city_ice_box",
                 "bastion_treasure",
                 "buried_treasure",
                 "end_city_treasure",
                 "jungle_temple",
                 "nether_bridge",
                 "pillager_outpost",
                 "underwater_ruin_big",
                 "underwater_ruin_small",
                 "woodland_mansion",
                 "stronghold_library",
                 "stronghold_crossing",
                 "stronghold_corridor" -> true;
            default -> false;
        };
    }

    private static LootPool getPool(String structure) {
        return LootPool.lootPool()
                .add(getPoolEntry(structure))
                .build();
    }

    private static LootPoolEntryContainer.Builder<?> getPoolEntry(String structure) {
        ResourceLocation table = new ResourceLocation("ekotsk", "chests/" + structure);
        return LootTableReference.lootTableReference(table);
    }
}
