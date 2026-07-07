package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GOTGoldCloakArmorModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
				.texOffs(24, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.3F))
				.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F))
				.texOffs(0, 56).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.7F))
				.texOffs(24, 59).addBox(-2.0F, -10.8F, -2.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition Helmet_r1 = head.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(38, 61).mirror().addBox(-4.31F, -24.6F, -4.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 18.0F, -3.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Helmet_r2 = head.addOrReplaceChild("Helmet_r2", CubeListBuilder.create().texOffs(50, 59).addBox(-0.499F, 1.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.1218F, -2.0526F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Helmet_r3 = head.addOrReplaceChild("Helmet_r3", CubeListBuilder.create().texOffs(50, 60).addBox(-0.501F, 2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, -10.9659F, -3.7412F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Helmet_r4 = head.addOrReplaceChild("Helmet_r4", CubeListBuilder.create().texOffs(38, 61).addBox(0.31F, -24.6F, -4.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.0F, 18.0F, -3.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.6F))
				.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F))
				.texOffs(0, 40).addBox(-4.0F, 2.5F, -2.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.8F))
				.texOffs(0, 40).addBox(-4.0F, 0.5F, 2.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.8F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right2_r1 = right_arm.addOrReplaceChild("right2_r1", CubeListBuilder.create().texOffs(2, 32).addBox(-8.0F, -16.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.61F)), PartPose.offsetAndRotation(4.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right2_r2 = right_arm.addOrReplaceChild("right2_r2", CubeListBuilder.create().texOffs(40, 32).addBox(-9.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_r1 = left_arm.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(5.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition left1_r1 = left_arm.addOrReplaceChild("left1_r1", CubeListBuilder.create().texOffs(2, 32).mirror().addBox(5.0F, -16.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.61F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(0, 49).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r1 = right_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 48).addBox(-1.9F, -4.0F, -1.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-1.1F, 5.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = left_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 48).mirror().addBox(-3.2F, -4.2F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(2.1F, 5.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}