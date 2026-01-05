package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GoldCloakArmorModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F))
				.texOffs(33, 6).addBox(-3.0F, -9.3F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(1.0F))
				.texOffs(0, 0).addBox(-1.0F, -8.0F, -5.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F))
				.texOffs(46, 14).addBox(-2.0F, 3.5F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(1.0F))
				.texOffs(46, 38).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(1.0F))
				.texOffs(36, 14).addBox(-2.0F, 4.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(1.0F))
				.texOffs(46, 42).addBox(-4.0F, 0.5F, -2.8F, 8.0F, 2.0F, 1.0F, new CubeDeformation(1.01F))
				.texOffs(24, 16).addBox(-5.0F, 1.0F, -3.21F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 29).addBox(-5.0F, 1.0F, 2.11F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(22, 42).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
				.texOffs(40, 58).addBox(-4.0F, -1.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.8F))
				.texOffs(48, 39).addBox(-3.0F, 4.0F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(1.2F))
				.texOffs(40, 58).addBox(-3.0F, 8.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(1.2F))
				.texOffs(52, 47).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(1.11F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(22, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
				.texOffs(52, 47).mirror().addBox(1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(1.11F)).mirror(false)
				.texOffs(40, 58).mirror().addBox(1.0F, 8.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(1.2F)).mirror(false)
				.texOffs(48, 39).mirror().addBox(1.0F, 4.0F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(1.2F)).mirror(false)
				.texOffs(40, 58).mirror().addBox(2.0F, -1.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cloak = left_arm.addOrReplaceChild("cloak", CubeListBuilder.create(), PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = cloak.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 16).addBox(-1.3F, -15.5F, -0.5F, 3.0F, 16.0F, 5.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(9.0F, 15.0F, -2.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
				.texOffs(16, 58).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.2F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -5.5F, -1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
				.texOffs(16, 58).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.2F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r3 = left_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -5.5F, -1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.0F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}