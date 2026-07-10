package net.ekotsk.loot.storage;

import net.ekotsk.loot.api.UniqueLootStorage;
import net.ekotsk.loot.core.UniqueLootClaimManager;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.level.saveddata.SavedData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;
import java.util.Set;

public class UniqueLootSavedData extends SavedData implements UniqueLootStorage {
    private static final String DATA_NAME = "ekotsk_unique_loot_data";
    public static final ResourceLocation ID = ResourceLocation.parse("ekotsk:unique_loot_data");
    private static final Logger LOGGER = LoggerFactory.getLogger("EKOTSK.UniqueLoot.SavedData");
    private final Set<ResourceLocation> claimed = new HashSet<>();

    @Override
    public boolean tryClaim(ResourceLocation id) {
        if (claimed.contains(id)) return false;
        claimed.add(id);
        setDirty();
        return true;
    }

    @Override
    public boolean isClaimed(ResourceLocation id) {
        return claimed.contains(id);
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider provider) {
        ListTag list = new ListTag();
        for (ResourceLocation id : claimed) {
            list.add(StringTag.valueOf(id.toString()));
        }
        tag.put("claimed", list);
        return tag;
    }

    public static UniqueLootSavedData load(CompoundTag tag, HolderLookup.Provider provider) {
        UniqueLootSavedData data = new UniqueLootSavedData();
        ListTag list = tag.getList("claimed", Tag.TAG_STRING);

        for (int i = 0; i < list.size(); i++) {
            ResourceLocation id = ResourceLocation.parse(list.getString(i));
            data.claimed.add(id);
            UniqueLootClaimManager.get().claimedCache.put(id, true);
        }

        LOGGER.info("Loaded {} claimed unique items from world data", list.size());
        return data;
    }

    public static final SavedData.Factory<UniqueLootSavedData> TYPE =
            new SavedData.Factory<>(
                    UniqueLootSavedData::new,
                    UniqueLootSavedData::load,
                    DataFixTypes.LEVEL
            );

    public static UniqueLootSavedData get(ServerLevel level) {
        return level.getDataStorage().computeIfAbsent(TYPE, DATA_NAME);
    }
}