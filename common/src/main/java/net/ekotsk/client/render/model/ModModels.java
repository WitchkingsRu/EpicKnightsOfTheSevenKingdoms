package net.ekotsk.client.render.model;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.client.render.model.armor.*;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModels extends ModModelsProvider {
    public static ModModels INSTANCE = new ModModels(ASOIAFMod.MOD_ID);

    public static final ModelLayerLocation LANNISTER_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_helmet", LannisterHelmetModel::createLayer);
    public static final ModelLayerLocation LANNISTER_CHESTPLATE_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_chestplate", LannisterChestplateModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LEGGINGS_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_leggings", LannisterLeggingsModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_CHESTPLATE_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_chestplate", LannisterLordChestplateModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_helmet", LannisterHelmetModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_LEGGINGS_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_leggings", LannisterLeggingsModel::createLayer);



    public static final ModelLayerLocation FANCY_BOOTS_LAYER_LOCATION = INSTANCE.addArmorModel("fancy_boots", FancyBootsModel::createLayer);


    public ModModels(String modId)
    {
        super(modId);
    }
}
