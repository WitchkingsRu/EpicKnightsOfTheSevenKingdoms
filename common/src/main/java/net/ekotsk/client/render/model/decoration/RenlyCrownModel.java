package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class RenlyCrownModel {

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

		PartDefinition deer = head.addOrReplaceChild("deer", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -33.9F, -5.1251F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = deer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -2.5F, -1.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, -31.0F, -3.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = deer.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 19).mirror().addBox(-0.4529F, -0.9505F, -0.1793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4219F, -34.0402F, -4.8458F, -0.0645F, -0.009F, -0.4186F));

		PartDefinition cube_r3 = deer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 19).addBox(-0.5471F, -0.9505F, -0.1793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4219F, -34.0402F, -4.8458F, -0.0645F, 0.009F, 0.4186F));

		PartDefinition cube_r4 = deer.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 18).addBox(-0.99F, -0.1F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -34.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = deer.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -0.9F, -1.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, -33.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition antler2 = deer.addOrReplaceChild("antler2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, -4.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = antler2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-1.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(34, 19).mirror().addBox(-1.61F, 0.0F, 0.4998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-2.1314F, -2.6262F, -0.5743F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition cube_r7 = antler2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-1.71F, -0.2001F, 0.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1314F, -2.6262F, -0.5743F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition cube_r8 = antler2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(29, 19).mirror().addBox(-1.61F, 0.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4219F, -2.0402F, -0.8458F, -0.1909F, -0.0254F, -0.68F));

		PartDefinition cube_r9 = antler2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-1.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-2.0226F, -2.9036F, -0.5392F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition antler = deer.addOrReplaceChild("antler", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0F, -4.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r10 = antler.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 19).addBox(0.61F, 0.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4219F, -2.0402F, -0.8458F, -0.1909F, 0.0254F, 0.68F));

		PartDefinition cube_r11 = antler.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 19).addBox(0.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(2.0226F, -2.9036F, -0.5392F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition cube_r12 = antler.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 19).addBox(0.71F, -0.2001F, 0.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1314F, -2.6262F, -0.5743F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition cube_r13 = antler.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 19).addBox(0.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(34, 19).addBox(0.61F, 0.0F, 0.4998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(2.1314F, -2.6262F, -0.5743F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.2F))
				.texOffs(0, 9).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.03F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(1.6F, -1.0F, -2.7F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 27).mirror().addBox(1.6F, -1.7F, -2.5F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -6.0F, 5.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 29).addBox(-9.6F, -0.7F, -3.5F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 29).addBox(-9.6F, 0.0F, -3.3F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.5F, -7.0F, -7.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 27).addBox(-8.5F, -1.7F, -2.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(1, 27).addBox(-10.0F, -1.0F, -2.7F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.5F, -6.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 27).addBox(-9.6F, -0.7F, -2.5F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 27).addBox(-9.6F, 0.0F, -2.7F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -7.0F, 5.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}