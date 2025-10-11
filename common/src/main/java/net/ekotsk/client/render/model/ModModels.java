package net.ekotsk.client.render.model;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.client.render.model.armor.LannisterChestplateModel;
import net.ekotsk.client.render.model.armor.LannisterHelmetModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModels extends ModModelsProvider {
    public static ModModels INSTANCE = new ModModels(ASOIAFMod.MOD_ID);

    public static final ModelLayerLocation LANNISTER_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_helmet", LannisterHelmetModel::createLayer);
    public static final ModelLayerLocation LANNISTER_CHESTPLATE_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_chestplate", LannisterChestplateModel::createLayer);


    public ModModels(String modId)
    {
        super(modId);
    }
}
