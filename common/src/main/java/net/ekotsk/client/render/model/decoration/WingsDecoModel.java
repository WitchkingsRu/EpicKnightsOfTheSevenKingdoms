package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class WingsDecoModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wing1 = head.addOrReplaceChild("wing1", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = wing1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 3).addBox(-0.2458F, -0.5666F, -1.0811F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6972F, -6.479F, 1.6038F, -0.5531F, -0.7534F, -0.0761F));

		PartDefinition cube_r2 = wing1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, -5).addBox(-0.2469F, -3.5666F, -1.08F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2531F, -9.1334F, 1.6807F, -0.0568F, -0.8195F, -0.1721F));

		PartDefinition cube_r3 = wing1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 0).addBox(0.0081F, -1.5666F, -1.08F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2531F, -9.1334F, 0.6807F, -0.0396F, -0.2093F, -0.2053F));

		PartDefinition cube_r4 = wing1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -5.0F, 0.0F, -0.4821F, -0.2129F, -0.3838F));

		PartDefinition wing2 = head.addOrReplaceChild("wing2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r5 = wing2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 3).mirror().addBox(0.2458F, -0.5666F, -1.0811F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.6972F, -6.479F, 1.6038F, -0.5531F, 0.7534F, 0.0761F));

		PartDefinition cube_r6 = wing2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 0).mirror().addBox(-1.0081F, -1.5666F, -1.08F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.2531F, -9.1334F, 0.6807F, -0.0396F, 0.2093F, 0.2053F));

		PartDefinition cube_r7 = wing2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -5.0F, 0.0F, -0.4821F, 0.2129F, 0.3838F));

		PartDefinition cube_r8 = wing2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, -5).mirror().addBox(0.2469F, -3.5666F, -1.08F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.2531F, -9.1334F, 1.6807F, -0.0568F, 0.8195F, 0.1721F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}