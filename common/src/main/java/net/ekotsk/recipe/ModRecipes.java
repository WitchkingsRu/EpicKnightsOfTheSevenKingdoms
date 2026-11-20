package net.ekotsk.recipe;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.RECIPE_SERIALIZER);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.RECIPE_TYPE);

    public static final RegistrySupplier<RecipeSerializer<QohorySmelteryRecipe>> QOHORY_SMELTERY_SERIALIZER = SERIALIZERS.register("qohory_smeltery", ()-> new QohorySmelteryRecipe.Serializer(500));
    public static final RegistrySupplier<RecipeType<QohorySmelteryRecipe>> QOHORY_SMELTERY_RECIPE = RECIPE_TYPES.register("qohory_smeltery", QohorySmelteryRecipe.Type::new);

}
