package net.ekotsk.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.BLOCK_ENTITY_TYPE);
    public static final RegistrySupplier<BlockEntityType<WeirwoodSignBlockEntity>> WEIRWOOD_SIGN = BLOCK_ENTITY_TYPES.register("weirwood_sign", () -> BlockEntityType.Builder.of(WeirwoodSignBlockEntity::new,
            ModBlocks.WEIRWOOD_SIGN.get(), ModBlocks.WEIRWOOD_WALL_SIGN.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<WeirwoodHangingSignBlockEntity>> WEIRWOOD_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("weirwood_hanging_sign", () -> BlockEntityType.Builder.of(WeirwoodHangingSignBlockEntity::new,
            ModBlocks.WEIRWOOD_HANGING_SIGN.get(), ModBlocks.WEIRWOOD_WALL_HANGING_SIGN.get()).build(null));

    public static void init() {
        BLOCK_ENTITY_TYPES.register();
    }
}
