package net.ekotsk.recipe;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.ekotsk.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class QohorySmelteryRecipe extends AbstractCookingRecipe {
    public QohorySmelteryRecipe(ResourceLocation resourceLocation, String string, CookingBookCategory cookingBookCategory, Ingredient ingredient, ItemStack itemStack, float f, int i) {
        super(ModRecipes.QOHORY_SMELTERY_RECIPE.get(), resourceLocation, string, cookingBookCategory, ingredient, itemStack, f, i);
    }

    public static QohorySmelteryRecipe createRecipe(ResourceLocation id, String group, CookingBookCategory category,
                                                    Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        return new QohorySmelteryRecipe(id, group, category, ingredient, result, experience, cookingTime);
    }

    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.QOHORY_SMELTERY.get());
    }

    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.QOHORY_SMELTERY_SERIALIZER.get();
    }
    @Override
    public RecipeType<?> getType() {
        return ModRecipes.QOHORY_SMELTERY_RECIPE.get();
    }

    public static class Type implements RecipeType<QohorySmelteryRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "qohory_smeltery";
    }
    public static class Serializer implements RecipeSerializer<QohorySmelteryRecipe> {
        private final int defaultCookingTime;

        public Serializer(int defaultCookingTime) {
            this.defaultCookingTime = defaultCookingTime;
        }

        @Override
        public QohorySmelteryRecipe fromJson(ResourceLocation id, JsonObject json) {
            String group = GsonHelper.getAsString(json, "group", "");
            CookingBookCategory category = CookingBookCategory.CODEC.byName(
                    GsonHelper.getAsString(json, "category", "misc")
            );

            Ingredient ingredient = Ingredient.fromJson(json.get("ingredient"));

            ItemStack result;
            if (json.has("result")) {
                result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
            } else {
                throw new JsonSyntaxException("Missing result, expected to find an object");
            }
            float experience = GsonHelper.getAsFloat(json, "experience", 0.0F);
            int cookingTime = GsonHelper.getAsInt(json, "cookingtime", this.defaultCookingTime);

            return new QohorySmelteryRecipe(id, group, category, ingredient, result, experience, cookingTime);
        }

        @Override
        public QohorySmelteryRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            String group = buf.readUtf();
            CookingBookCategory category = buf.readEnum(CookingBookCategory.class);
            Ingredient ingredient = Ingredient.fromNetwork(buf);
            ItemStack result = buf.readItem();
            float experience = buf.readFloat();
            int cookingTime = buf.readVarInt();

            return new QohorySmelteryRecipe(id, group, category, ingredient, result, experience, cookingTime);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, QohorySmelteryRecipe recipe) {
            buf.writeUtf(recipe.getGroup());
            buf.writeEnum(recipe.category());
            recipe.ingredient.toNetwork(buf);
            buf.writeItem(recipe.result);
            buf.writeFloat(recipe.experience);
            buf.writeVarInt(recipe.cookingTime);
        }
    }
}
