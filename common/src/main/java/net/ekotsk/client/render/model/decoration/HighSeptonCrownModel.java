package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class HighSeptonCrownModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.24F))
				.texOffs(0, 9).addBox(-4.0F, -6.7F, -4.0F, 8.0F, 1.4F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spike7 = bone.addOrReplaceChild("spike7", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -2.6084F, -0.8257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 25).addBox(-0.5F, -4.1084F, -0.8257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 3.0F, 0.1309F, 3.1416F, 0.0F));

		PartDefinition cube_r1 = spike7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 21).addBox(3.5F, 0.0F, -3.09F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.6084F, 1.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike6 = bone.addOrReplaceChild("spike6", CubeListBuilder.create().texOffs(0, 19).addBox(-1.2F, -2.6084F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.18F))
				.texOffs(0, 25).addBox(-1.2F, -4.1084F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -7.0F, 3.0F, 0.1309F, 2.3562F, 0.0F));

		PartDefinition cube_r2 = spike6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 21).mirror().addBox(2.8F, -0.3F, -1.3743F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -0.6084F, 0.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike4 = bone.addOrReplaceChild("spike4", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -2.6084F, -0.8257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 25).addBox(0.0F, -4.1084F, -0.8257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -7.0F, 0.0F, 0.1309F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = spike4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 21).addBox(4.0F, 0.0F, -3.09F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.6084F, 1.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike3 = bone.addOrReplaceChild("spike3", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -2.6084F, -0.8257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 25).addBox(-1.0F, -4.1084F, -0.8257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, 0.0F, 0.1309F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = spike3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 21).addBox(3.0F, 0.0F, -3.09F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.6084F, 1.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike = bone.addOrReplaceChild("spike", CubeListBuilder.create().texOffs(0, 19).addBox(-0.25F, -2.6084F, -0.8257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 25).addBox(-0.25F, -4.1084F, -0.8257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -7.0F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = spike.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 21).addBox(3.75F, 0.0F, -3.09F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.6084F, 1.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike2 = bone.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.75F, -2.6084F, -0.8257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 25).addBox(-0.75F, -4.1084F, -0.8257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -7.0F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = spike2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 21).mirror().addBox(3.25F, 0.0F, -3.09F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -0.6084F, 1.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spike5 = bone.addOrReplaceChild("spike5", CubeListBuilder.create().texOffs(0, 19).addBox(-1.2F, -2.6084F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.18F))
				.texOffs(0, 25).addBox(-1.2F, -4.1084F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, 4.0F, 0.1309F, -2.3562F, 0.0F));

		PartDefinition cube_r7 = spike5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 21).addBox(2.8F, -0.3F, -1.3743F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.6084F, 0.9743F, -0.1745F, 0.0F, 0.0F));

		PartDefinition central_spike = bone.addOrReplaceChild("central_spike", CubeListBuilder.create().texOffs(10, 19).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 19).addBox(-1.0F, -10.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(19, 24).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 30).addBox(-0.5F, -12.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 29).addBox(-0.5F, -14.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = central_spike.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 27).addBox(-0.5F, -0.545F, -2.9997F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.0F, 3.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r9 = central_spike.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 27).addBox(0.2F, -0.4F, 0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0F, -9.0F, 3.0F, -2.7489F, -0.7854F, 3.1416F));

		PartDefinition cube_r10 = central_spike.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 27).mirror().addBox(-1.2F, -0.4F, 0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -9.0F, 3.0F, -2.7489F, 0.7854F, -3.1416F));

		PartDefinition cube_r11 = central_spike.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 27).mirror().addBox(0.0F, -0.4F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -9.0F, 0.0F, 0.48F, 1.4835F, 0.0F));

		PartDefinition cube_r12 = central_spike.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 27).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -9.0F, -3.0F, 0.6333F, 0.2489F, 0.1789F));

		PartDefinition cube_r13 = central_spike.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, -0.4F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0F, -9.0F, 0.0F, 0.48F, -1.4835F, 0.0F));

		PartDefinition cube_r14 = central_spike.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -9.0F, -3.0F, 0.6333F, -0.2489F, -0.1789F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}