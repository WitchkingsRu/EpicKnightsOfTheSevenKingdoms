package net.ekotsk.client.render.model;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.decoration.SurcoatModel;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.client.render.model.armor.*;
import net.ekotsk.client.render.model.decoration.*;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;

public class ModModels extends ModModelsProvider {
    public static ModModels INSTANCE = new ModModels(ASOIAFMod.MOD_ID);

    public static final ModelLayerLocation LANNISTER_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_helmet", LannisterHelmetModel::createLayer);
    public static final ModelLayerLocation LANNISTER_CHESTPLATE_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_chestplate", LannisterChestplateModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LEGGINGS_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_leggings", LannisterLeggingsModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_CHESTPLATE_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_chestplate", LannisterLordChestplateModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_helmet", LannisterHelmetModel::createLayer);
    public static final ModelLayerLocation LANNISTER_LORD_LEGGINGS_LAYER_LOCATION = INSTANCE.addArmorModel("lannister_lord_leggings", LannisterLeggingsModel::createLayer);

    public static final ModelLayerLocation VALYRIAN_STEEL_HELMET_LAYER_LOCATION = INSTANCE.addArmorModel("valyrian_steel_helmet", ValyrianHelmetModel::createLayer);
    public static final ModelLayerLocation VALYRIAN_STEEL_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("valyrian_steel_armor", ValyrianArmorModel::createLayer);

    public static final ModelLayerLocation NIGHT_WATCH_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("night_watch_armor",NightsWatchArmorModel::createLayer);
    public static final ModelLayerLocation NORTH_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("northern_armor",NorthernArmorModel::createLayer);
    public static final ModelLayerLocation DORNISH_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("dornish_armor", DornishArmorModel::createLayer);
    public static final ModelLayerLocation GREYJOY_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("greyjoy_armor", GreyjoyArmorModel::createLayer);


    public static final ModelLayerLocation GOLD_CLOAK_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("gold_cloak_armor",GoldCloakArmorModel::createLayer);

    public static final ModelLayerLocation HOTD_KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("hotd_kingsguard_armor",HOTDKingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KOTSK_KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kotsk_kingsguard_armor",KOTSKKingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kingsguard_armor",KingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KINGSGUARD_2_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kingsguard_2_armor",KingsguardArmorModel::createLayer);

    public static final LayerDefinition HAND_SIGN = SurcoatModel.createLayer();
    public static final LayerDefinition FANCY_CAPE = CapeModel.createLayer();
    public static final LayerDefinition NIGHT_WATCH_CAPE = NightsWatchCapeModel.createLayer();
    public static final LayerDefinition GOLD_CLOAK_LEFT = GoldCloakLeftDecoModel.createLayer();
    public static final LayerDefinition GOLD_CLOAK_RIGHT = GoldCloakRightDecoModel.createLayer();
    public static final LayerDefinition DRAGON = DragonDecorationModel.createLayer();
    public static final ModelLayerLocation HAND_SIGN_LOCATION = INSTANCE.addArmorModel("hand_sign", SurcoatModel::createLayer);
    public static final ModelLayerLocation HAND_SIGN_DECORATION_LOCATION = INSTANCE.addDecorationModel("hand_sign", SurcoatModel::createLayer);

    public static final ModelLayerLocation AEGON_CROWN_LOCATION = INSTANCE.addArmorModel("aegon_crown", AegonCrownModel::createLayer);
    public static final ModelLayerLocation AEGON_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("aegon_crown", AegonCrownHelmetModel::createLayer);
    public static final ModelLayerLocation DRAGON_DECORATION_LOCATION = INSTANCE.addDecorationModel("dragon", () -> DRAGON);

    public static final ModelLayerLocation FANCY_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fancy_cape", () -> FANCY_CAPE);
    public static final ModelLayerLocation NIGHT_WATCH_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("night_watch_cape", () -> NIGHT_WATCH_CAPE);
    public static final ModelLayerLocation GOLD_CLOAK_LEFT_DECORATION_LOCATION = INSTANCE.addDecorationModel("gold_cloak_left", () -> GOLD_CLOAK_LEFT);
    public static final ModelLayerLocation GOLD_CLOAK_RIGHT_DECORATION_LOCATION = INSTANCE.addDecorationModel("gold_cloak_right", () -> GOLD_CLOAK_RIGHT);
    public static final ModelLayerLocation FANCY_BOOTS_LAYER_LOCATION = INSTANCE.addArmorModel("fancy_boots", FancyBootsModel::createLayer);


    public ModModels(String modId)
    {
        super(modId);
    }
}
