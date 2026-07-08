package net.ekotsk.loot.storage;

import net.ekotsk.loot.api.UniqueLootStorage;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.HashSet;
import java.util.Set;

public class UniqueLootSavedData extends SavedData implements UniqueLootStorage {

    private static final String DATA_NAME = "ekotsk:unique_loot_data";
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

    // ✅ load() с ровно 2 параметрами — сигнатура ВАЖНА для Factory
    public static UniqueLootSavedData load(CompoundTag tag, HolderLookup.Provider provider) {
        UniqueLootSavedData data = new UniqueLootSavedData();
        ListTag list = tag.getList("claimed", Tag.TAG_STRING);
        for (int i = 0; i < list.size(); i++) {
            data.claimed.add(ResourceLocation.parse(list.getString(i)));
        }
        return data;
    }

    // ✅ Factory — 3 аргумента: constructor, deserializer, DataFixTypes
    public static final SavedData.Factory<UniqueLootSavedData> TYPE =
            new SavedData.Factory<>(
                    UniqueLootSavedData::new,                    // Supplier<T>
                    UniqueLootSavedData::load,                   // BiFunction<CompoundTag, HolderLookup.Provider, T>
                    DataFixTypes.LEVEL                     // DataFixTypes (третий аргумент!)
            );

    // ✅ computeIfAbsent — 2 аргумента: Factory + name
    public static UniqueLootSavedData get(ServerLevel level) {
        return level.getDataStorage().computeIfAbsent(TYPE, DATA_NAME);
    }
}