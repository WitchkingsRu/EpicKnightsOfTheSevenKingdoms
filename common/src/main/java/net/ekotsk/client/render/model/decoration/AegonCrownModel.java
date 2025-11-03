package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonCrownModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead = bipedHead.addOrReplaceChild("armorHead", CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(-4.4F, -7.2F, -4.4F, 8.8F, 1.4F, 8.8F, new CubeDeformation(0.0F))
				.texOffs(33, 0).addBox(-4.4F, -8.4F, -4.4F, 8.8F, 1.4F, 8.8F, new CubeDeformation(0.0F))
				.texOffs(51, 45).addBox(-4.0F, -7.5F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(15, 56).addBox(-3.75F, -7.25F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(20, 56).addBox(2.25F, -7.25F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(25, 56).addBox(-0.75F, -7.25F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(54, 31).addBox(2.0F, -7.5F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(54, 34).addBox(-1.0F, -7.5F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 58).addBox(2.25F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(5, 56).addBox(2.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).addBox(-3.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(54, 28).addBox(-4.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(10, 56).addBox(-1.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(5, 59).addBox(-0.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = armorHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 52).addBox(2.25F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(51, 54).addBox(2.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(56, 55).addBox(-3.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(51, 51).addBox(-4.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-1.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(51, 57).addBox(-0.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = armorHead.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 43).addBox(2.25F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(54, 37).addBox(2.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(56, 46).addBox(-3.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(51, 48).addBox(-4.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(54, 40).addBox(-1.0F, -1.0F, -4.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(56, 49).addBox(-0.75F, -0.75F, -4.625F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

}