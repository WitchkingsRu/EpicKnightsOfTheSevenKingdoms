package net.ekotsk.loot.storage;

import net.ekotsk.loot.api.UniqueLootStorage;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;
import java.util.HashSet;
import java.util.Set;

public class UniqueLootSavedData extends SavedData implements UniqueLootStorage {

    private static final String DATA_NAME = "unique_loot_data";
    private final Set<ResourceLocation> claimed = new HashSet<>();

    @Override
    public boolean tryClaim(ResourceLocation id) {
        if (claimed.contains(id)) return false;
        claimed.add(id);
        setDirty();
        return true;
    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        ListTag list = new ListTag();
        for (ResourceLocation id : claimed) {
            list.add(StringTag.valueOf(id.toString()));
        }
        tag.put("claimed", list);
        return tag;
    }

    public static UniqueLootSavedData load(CompoundTag tag) {
        UniqueLootSavedData data = new UniqueLootSavedData();
        ListTag list = tag.getList("claimed", Tag.TAG_STRING);
        for (int i = 0; i < list.size(); i++) {
            data.claimed.add(new ResourceLocation(list.getString(i)));
        }
        return data;
    }

    public static UniqueLootSavedData get(ServerLevel level) {
        return level.getDataStorage().computeIfAbsent(
                UniqueLootSavedData::load,
                UniqueLootSavedData::new,
                DATA_NAME
        );
    }
}