package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonCrownShowModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 3).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(4, 15).addBox(-4.1F, -7.1F, -3.9F, 8.0F, 1.4F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(9, 27).addBox(-2.75F, -7.5F, -4.325F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-1.0F, -7.5F, 4.575F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(9, 27).addBox(1.75F, -7.5F, 4.375F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(9, 27).addBox(-2.75F, -7.5F, 4.375F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(9, 27).addBox(1.75F, -7.5F, -4.325F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(4, 27).addBox(-0.5F, -7.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(0, 27).addBox(-1.0F, -7.5F, -4.425F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 27).mirror().addBox(3.05F, -1.5F, -3.625F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -6.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 27).mirror().addBox(2.75F, -1.5F, -3.625F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -6.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.1F, -1.5F, -3.625F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(8.0F, -6.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 27).addBox(0.05F, -1.8F, 0.675F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(16, 27).addBox(0.05F, -1.3F, 9.275F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -7.0F, -5.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 26).addBox(-1.2F, 0.0F, -0.225F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(9, 26).addBox(-1.2F, 0.2F, 8.275F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -8.0F, -4.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 26).addBox(-0.8F, 0.0F, -0.225F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(9, 26).addBox(-0.8F, 0.2F, 8.275F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, -4.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 27).addBox(-1.05F, -1.8F, -0.325F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(16, 27).addBox(-1.05F, -1.3F, 8.275F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -7.0F, -4.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 27).addBox(-4.05F, -1.5F, -3.625F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -6.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 27).addBox(-3.75F, -1.5F, -3.625F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -6.0F, 6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 27).addBox(-0.9F, -1.5F, -3.625F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-8.0F, -6.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}