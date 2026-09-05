package net.ekotsk.client.render.model;

import net.ekotsk.block.ModBlockEntities;
import net.ekotsk.client.render.WeirwoodArrowRender;
import net.ekotsk.entity.ModEntityTypes;
import net.ekotsk.entity.WeirwoodArrowEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.decoration.SurcoatModel;
import net.ekotsk.ASOIAFMod;
import net.ekotsk.client.render.model.armor.*;
import net.ekotsk.client.render.model.decoration.*;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.TippableArrowRenderer;
import net.minecraft.client.renderer.entity.layers.ArrowLayer;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

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

    public static final ModelLayerLocation DORNISH_PRINCE_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("dornish_prince_armor", DornishPrinceArmorModel::createLayer);
    public static final ModelLayerLocation RICH_GREYJOY_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("rich_greyjoy_armor", RichGreyjoyArmorModel::createLayer);
    public static final ModelLayerLocation GOLD_CLOAK_OFFICER_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("gold_cloak_officer_armor",GoldCloakOfficerArmorModel::createLayer);
    public static final ModelLayerLocation PLATE_NORTH_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("plate_northern_armor",PlateNorthernArmorModel::createLayer);

    public static final ModelLayerLocation GOLD_CLOAK_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("gold_cloak_armor",GoldCloakArmorModel::createLayer);
    public static final ModelLayerLocation KOTSK_GOLD_CLOAK_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("gold_cloak_armor_kotsk",KOTSKGoldCloakArmorModel::createLayer);
    public static final ModelLayerLocation GOT_GOLD_CLOAK_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("gold_cloak_armor_got",GOTGoldCloakArmorModel::createLayer);

    public static final ModelLayerLocation HOTD_KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("hotd_kingsguard_armor",HOTDKingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KOTSK_KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kotsk_kingsguard_armor",KOTSKKingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KINGSGUARD_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kingsguard_armor",KingsguardArmorModel::createLayer);
    public static final ModelLayerLocation KINGSGUARD_2_ARMOR_LAYER_LOCATION = INSTANCE.addArmorModel("kingsguard_2_armor",KingsguardArmorModel::createLayer);

    public static final LayerDefinition HAND_SIGN = SurcoatModel.createLayer();
    public static final LayerDefinition FANCY_CAPE = CapeModel.createLayer();
    public static final LayerDefinition FUR_CAPE_PALE = FurCapeModel.createLayer();
    public static final LayerDefinition FUR_CAPE_WOODS = FurCapeModel.createLayer();
    public static final LayerDefinition FUR_CAPE_WHITE = FurCapeModel.createLayer();
    public static final LayerDefinition FUR_CAPE_BLACK = FurCapeModel.createLayer();
    public static final LayerDefinition NIGHT_WATCH_CAPE = NightsWatchCapeModel.createLayer();
    public static final LayerDefinition GOLD_CLOAK_LEFT = GoldCloakLeftDecoModel.createLayer();
    public static final LayerDefinition GOLD_CLOAK_RIGHT = GoldCloakRightDecoModel.createLayer();
    public static final LayerDefinition DRAGON = DragonDecorationModel.createLayer();
    public static final LayerDefinition WINGS = WingsDecoModel.createLayer();
    public static final LayerDefinition FIN = FinDecoModel.createLayer();
    public static final ModelLayerLocation HAND_SIGN_LOCATION = INSTANCE.addArmorModel("hand_sign", SurcoatModel::createLayer);
    public static final ModelLayerLocation HAND_SIGN_DECORATION_LOCATION = INSTANCE.addDecorationModel("hand_sign", SurcoatModel::createLayer);

    public static final ModelLayerLocation AEGON_CROWN_LOCATION = INSTANCE.addArmorModel("aegon_crown", AegonCrownModel::createLayer);
    public static final ModelLayerLocation AEGON_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("aegon_crown", AegonCrownHelmetModel::createLayer);
    public static final ModelLayerLocation AEGON_CROWN_SHOW_LOCATION = INSTANCE.addArmorModel("hotd_aegon_crown", AegonCrownShowModel::createLayer);
    public static final ModelLayerLocation AEGON_CROWN_SHOW_DECORATION_LOCATION = INSTANCE.addDecorationModel("hotd_aegon_crown", AegonCrownShowHelmetModel::createLayer);
    public static final ModelLayerLocation JAEHAERYS_CROWN_LOCATION = INSTANCE.addArmorModel("jaehaerys_crown", JaehaerysCrownModel::createLayer);
    public static final ModelLayerLocation JAEHAERYS_CROWN_SHOW_LOCATION = INSTANCE.addArmorModel("hotd_jaehaerys_crown", JaehaerysCrownShowModel::createLayer);
    public static final ModelLayerLocation JAEHAERYS_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("jaehaerys_crown", JaehaerysCrownHelmetModel::createLayer);
    public static final ModelLayerLocation JAEHAERYS_CROWN_SHOW_DECORATION_LOCATION = INSTANCE.addDecorationModel("hotd_jaehaerys_crown", JaehaerysCrownShowHelmetModel::createLayer);
    public static final ModelLayerLocation AEGON_DRAGONSBANE_CROWN_LOCATION = INSTANCE.addArmorModel("aegon_dragonsbane_crown", AegonDragonsbaneCrownModel::createLayer);
    public static final ModelLayerLocation AEGON_DRAGONSBANE_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("aegon_dragonsbane_crown", AegonDragonsbaneHelmetModel::createLayer);
    public static final ModelLayerLocation AEGON_UNWORTHY_CROWN_LOCATION = INSTANCE.addArmorModel("aegon_unworthy_crown", AegonUnworthyCrownModel::createLayer);
    public static final ModelLayerLocation AEGON_UNWORTHY_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("aegon_unworthy_crown", AegonUnworthyCrownHelmetModel::createLayer);
    public static final ModelLayerLocation MAEKAR_CROWN_LOCATION = INSTANCE.addArmorModel("maekar_crown", MaekarCrownModel::createLayer);
    public static final ModelLayerLocation MAEKAR_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("maekar_crown", MaekarCrownHelmetModel::createLayer);
    public static final ModelLayerLocation ROBERT_CROWN_LOCATION = INSTANCE.addArmorModel("robert_crown", RobertCrownModel::createLayer);
    public static final ModelLayerLocation ROBERT_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("robert_crown", RobertCrownHelmetModel::createLayer);
    public static final ModelLayerLocation STANNIS_CROWN_LOCATION = INSTANCE.addArmorModel("stannis_crown", StannisCrownModel::createLayer);
    public static final ModelLayerLocation STANNIS_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("stannis_crown", StannisCrownHelmetModel::createLayer);
    public static final ModelLayerLocation RENLY_CROWN_LOCATION = INSTANCE.addArmorModel("renly_crown", RenlyCrownModel::createLayer);
    public static final ModelLayerLocation RENLY_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("renly_crown", RenlyCrownHelmetModel::createLayer);
    public static final ModelLayerLocation STARK_CROWN_LOCATION = INSTANCE.addArmorModel("stark_crown", StarkCrownModel::createLayer);
    public static final ModelLayerLocation STARK_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("stark_crown", StarkCrownHelmetModel::createLayer);
    public static final ModelLayerLocation DRIFTWOOD_CROWN_LOCATION = INSTANCE.addArmorModel("driftwood_crown", DriftwoodCrownModel::createLayer);
    public static final ModelLayerLocation DRIFTWOOD_CROWN_DECORATION_LOCATION = INSTANCE.addDecorationModel("driftwood_crown", DriftwoodCrownHelmetModel::createLayer);

    public static final ModelLayerLocation DRAGON_DECORATION_LOCATION = INSTANCE.addDecorationModel("dragon", () -> DRAGON);
    public static final ModelLayerLocation HIGH_SEPTON_CROWN_LOCATION = INSTANCE.addArmorModel("high_septon_crown", HighSeptonCrownModel::createLayer);

    public static final ModelLayerLocation FANCY_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fancy_cape", () -> FANCY_CAPE);
    public static final ModelLayerLocation PALE_FUR_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fur_cape_pale", () -> FUR_CAPE_PALE);
    public static final ModelLayerLocation WOODS_FUR_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fur_cape_woods", () -> FUR_CAPE_WOODS);
    public static final ModelLayerLocation WHITE_FUR_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fur_cape_white", () -> FUR_CAPE_WHITE);
    public static final ModelLayerLocation BLACK_FUR_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("fur_cape_black", () -> FUR_CAPE_BLACK);
    public static final ModelLayerLocation WINGS_DECORATION_LOCATION = INSTANCE.addDecorationModel("wings", () -> WINGS);
    public static final ModelLayerLocation FIN_DECORATION_LOCATION = INSTANCE.addDecorationModel("fin", () -> FIN);
    public static final ModelLayerLocation NIGHT_WATCH_CAPE_DECORATION_LOCATION = INSTANCE.addDecorationModel("night_watch_cape", () -> NIGHT_WATCH_CAPE);
    public static final ModelLayerLocation GOLD_CLOAK_LEFT_DECORATION_LOCATION = INSTANCE.addDecorationModel("gold_cloak_left", () -> GOLD_CLOAK_LEFT);
    public static final ModelLayerLocation GOLD_CLOAK_RIGHT_DECORATION_LOCATION = INSTANCE.addDecorationModel("gold_cloak_right", () -> GOLD_CLOAK_RIGHT);
    public static final ModelLayerLocation FANCY_BOOTS_LAYER_LOCATION = INSTANCE.addArmorModel("fancy_boots", FancyBootsModel::createLayer);
    public static final ModelLayerLocation WEIRWOOD_ARROW_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(ASOIAFMod.MOD_ID, "weirwood_arrow"), "main");

    public static void blockEntityRender() {
        BlockEntityRenderers.register(ModBlockEntities.WEIRWOOD_SIGN.get(), SignRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.WEIRWOOD_HANGING_SIGN.get(), HangingSignRenderer::new);
        EntityRenderers.register(ModEntityTypes.WEIRWOOD_ARROW.get(), WeirwoodArrowRender::new);
    }

    public ModModels(String modId)
    {
        super(modId);
    }
}
