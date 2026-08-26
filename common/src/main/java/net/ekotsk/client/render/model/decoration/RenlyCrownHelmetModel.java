package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class RenlyCrownHelmetModel {

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

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 13).addBox(-5.5F, -6.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.5F, -5.3F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition deer = bone.addOrReplaceChild("deer", CubeListBuilder.create().texOffs(0, 37).addBox(-5.0F, -0.1F, -0.7F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 37).addBox(-5.0F, -0.1F, 10.7F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 37).addBox(-5.0F, -1.1F, 10.2F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 37).addBox(-5.0F, -1.1F, -0.2F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 34).addBox(-1.0F, -3.8F, -1.9251F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -6.0F, -5.0F));

		PartDefinition cube_r1 = deer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 29).mirror().addBox(-0.6781F, -0.9505F, -0.1793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4219F, -4.0402F, -1.8458F, 0.11F, -0.009F, -0.4186F));

		PartDefinition cube_r2 = deer.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -3.0F, -2.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = deer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 29).addBox(-0.3219F, -0.9505F, -0.1793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4219F, -4.0402F, -1.8458F, 0.11F, 0.009F, 0.4186F));

		PartDefinition cube_r4 = deer.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 37).addBox(-11.5F, -2.1F, -6.3F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-11.5F, 1.0F, 11.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = deer.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 37).addBox(-11.5F, -2.1F, -5.7F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.0F, 11.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = deer.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 37).addBox(-11.5F, -2.1F, -3.7F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-9.5F, 2.0F, 11.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = deer.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 37).addBox(-11.5F, -2.1F, -4.2F, 10.0F, 1.0F, 0.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, 2.0F, 11.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = deer.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 27).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.33F)), PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = deer.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition antler = deer.addOrReplaceChild("antler", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r10 = antler.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 29).addBox(0.81F, 0.4999F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8481F, -2.2658F, -0.6806F, -0.1909F, 0.0254F, 0.68F));

		PartDefinition cube_r11 = antler.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 29).addBox(0.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.1886F, -3.4185F, -0.2514F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition cube_r12 = antler.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 29).addBox(0.91F, -0.4001F, 0.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5576F, -2.8519F, -0.4091F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition cube_r13 = antler.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 29).addBox(0.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.3699F, -2.9562F, -0.3098F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition cube_r14 = antler.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(35, 29).addBox(0.61F, -1.0F, 0.4988F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.5159F, -2.4268F, -0.4838F, -0.1532F, 0.1171F, 1.197F));

		PartDefinition antler2 = deer.addOrReplaceChild("antler2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r15 = antler2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(-1.81F, 0.4999F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8481F, -2.2658F, -0.6806F, -0.1909F, -0.0254F, -0.68F));

		PartDefinition cube_r16 = antler2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-1.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.1886F, -3.4185F, -0.2514F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition cube_r17 = antler2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-1.31F, -0.0001F, 0.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.3699F, -2.9562F, -0.3098F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition cube_r18 = antler2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 29).mirror().addBox(-1.61F, -1.0F, 0.4988F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5159F, -2.4268F, -0.4838F, -0.1532F, -0.1171F, -1.197F));

		PartDefinition cube_r19 = antler2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-1.91F, -0.4001F, 0.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5576F, -2.8519F, -0.4091F, -0.1532F, -0.1171F, -1.197F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}