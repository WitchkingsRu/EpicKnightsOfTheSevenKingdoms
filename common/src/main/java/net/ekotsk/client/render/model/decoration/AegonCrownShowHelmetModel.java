package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonCrownShowHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(6, 25).addBox(-1.0F, -5.3F, -5.525F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.25F))
				.texOffs(1, 25).mirror().addBox(-4.6F, -6.0F, -5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(1, 25).mirror().addBox(-4.6F, -6.0F, 5.375F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(1, 25).addBox(2.6F, -6.0F, -5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F))
				.texOffs(1, 25).addBox(2.6F, -6.0F, 5.375F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 25).addBox(-1.5F, -5.8F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(0, 25).addBox(-1.5F, -5.9F, 5.475F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(0, 0).addBox(-5.5F, -5.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 25).addBox(1.35F, -2.0F, -4.825F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.25F, -4.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-5.5F, -2.1F, -4.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(9.5F, -4.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(1.35F, -2.0F, -4.825F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(10.25F, -4.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 25).addBox(-0.69F, -1.4F, -0.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F))
				.texOffs(1, 25).addBox(-0.69F, -1.6F, -11.425F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.25F, -5.0F, 6.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 25).addBox(2.5F, -2.1F, -4.025F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-9.5F, -4.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(-1.05F, -2.15F, -0.725F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(1, 25).addBox(-1.05F, -2.45F, -11.325F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, -5.0F, 6.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(-1.31F, -1.4F, -0.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(1, 25).mirror().addBox(-1.31F, -1.6F, -11.425F, 2.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -5.0F, 6.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 25).addBox(-1.45F, -2.2F, -0.725F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F))
				.texOffs(1, 25).mirror().addBox(-1.45F, -2.5F, -11.325F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -5.0F, 6.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 25).addBox(-3.35F, -2.0F, -4.825F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-10.25F, -4.0F, 6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(-3.35F, -2.0F, -4.825F, 2.0F, 3.0F, 0.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.25F, -4.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}