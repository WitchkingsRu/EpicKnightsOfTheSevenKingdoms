package net.ekotsk.loot.core;

import net.ekotsk.ASOIAFMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Set;

public class UniqueLootManager {

    private static final UniqueLootManager INSTANCE = new UniqueLootManager();

    public static UniqueLootManager get() {
        return INSTANCE;
    }

    private UniqueLootEntry entry;

    public void init(Item item) {
        System.out.println("[UniqueLoot] ⚙️ UniqueLootManager.init() ENTER");
        System.out.println("[UniqueLoot] ⚙️ item param: " + item);
        System.out.println("[UniqueLoot] ⚙️ INSTANCE: " + INSTANCE);

        if (item == null) {
            System.out.println("[UniqueLoot] ❌ item is NULL — aborting init!");
            return;
        }

        entry = new UniqueLootEntry(
                new ResourceLocation(ASOIAFMod.MOD_ID, "unique_sword"),
                new ItemStack(item),
                Set.of(new ResourceLocation("minecraft", "desert_pyramid"))
        );

        System.out.println("[UniqueLoot] ✅ Manager initialized");
        System.out.println("[UniqueLoot] ✅ entry.structures: " + entry.structures);
        System.out.println("[UniqueLoot] ⚙️ UniqueLootManager.init() EXIT");
    }

    public UniqueLootEntry tryRoll(ResourceLocation structure) {
        System.out.println("[UniqueLoot] === tryRoll DEBUG ===");
        System.out.println("[UniqueLoot] structure param: " + structure);
        System.out.println("[UniqueLoot] entry is null: " + (entry == null));

        if (entry != null) {
            System.out.println("[UniqueLoot] entry.id: " + entry.getId());
            System.out.println("[UniqueLoot] entry.structures: " + entry.structures);
            System.out.println("[UniqueLoot] isAllowedIn result: " + entry.isAllowedIn(structure));
        }

        if (entry != null && entry.isAllowedIn(structure)) {
            System.out.println("[UniqueLoot] Entry allowed: " + entry.getId());
            return entry;
        }

        System.out.println("[UniqueLoot] No valid entry");
        System.out.println("[UniqueLoot] === END DEBUG ===");
        return null;
    }
}
