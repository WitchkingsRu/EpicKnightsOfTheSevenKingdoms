package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class StripeModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(13, 0).addBox(-5.0F, 10.5F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition deco = body.addOrReplaceChild("deco", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r1 = deco.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-4.0F, -12.0F, -1.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.9403F, 6.9347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = deco.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -8.0F, -1.1F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3284F, 18.9806F, 7.8668F, 0.0859F, 0.0151F, -0.1739F));

		PartDefinition cube_r3 = deco.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -8.0F, -0.9F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3284F, 19.137F, 0.1657F, -0.0859F, -0.0151F, -0.1739F));

		PartDefinition cube_r4 = deco.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 5).addBox(-4.0F, -12.0F, -1.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7999F, 1.0096F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r5 = deco.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-4, 0).mirror().addBox(-4.0F, 0.7F, -1.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4329F, 4.2078F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = deco.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-4, 0).addBox(-4.0F, 0.7F, -1.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);

	}

}