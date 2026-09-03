package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GoldCloakOfficerArmorModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F))
				.texOffs(33, 6).addBox(-3.0F, -9.3F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.75F))
				.texOffs(33, 1).addBox(-2.0F, -10.3F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.75F))
				.texOffs(0, 1).addBox(-1.0F, -7.0F, -5.3F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.81F))
				.texOffs(42, 33).addBox(-4.5F, 0.5F, -3.21F, 9.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 45).addBox(-4.5F, 0.0F, 2.11F, 9.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F))
				.texOffs(0, 56).addBox(-3.6F, -1.3F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.4F))
				.texOffs(19, 56).addBox(-3.6F, -0.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.39F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = right_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 33).addBox(-3.0F, 0.6F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.47F))
				.texOffs(22, 40).addBox(-3.2F, 1.0F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.46F)), PartPose.offsetAndRotation(1.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r2 = right_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 56).addBox(-0.6F, -2.3F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.44F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r3 = right_arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 56).addBox(-0.6F, -2.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(-3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)).mirror(false)
				.texOffs(19, 56).mirror().addBox(-0.4F, -0.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.39F)).mirror(false)
				.texOffs(0, 56).mirror().addBox(-0.4F, -1.3F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r4 = left_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 33).mirror().addBox(1.0F, 0.6F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.47F)).mirror(false)
				.texOffs(22, 40).mirror().addBox(1.2F, 1.0F, -1.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.46F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -4.0F, -1.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-3.4F, -2.3F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.44F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-3.4F, -2.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.45F)).mirror(false), PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F))
				.texOffs(0, 46).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r7 = right_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, -5.2F, -1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false)
				.texOffs(0, 46).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.0F, -5.2F, -1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, -2.0F, 0.0F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}