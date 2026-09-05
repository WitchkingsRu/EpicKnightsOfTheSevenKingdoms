package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FurCapeModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wolf = body.addOrReplaceChild("wolf", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -5.0F, 4.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition tail = wolf.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, -2.0F));

		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -8.0F, 0.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(15.0F, 3.0F, -3.0F, -1.0973F, -0.8126F, -0.1873F));

		PartDefinition body2 = wolf.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 32).mirror().addBox(-4.5F, -9.0F, -0.9101F, 6.0F, 10.0F, 5.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(1.7575F, -0.09F, -2.3414F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 33).addBox(-3.1511F, -10.0F, 0.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(6.4721F, -1.01F, -7.1376F, -1.5708F, -0.829F, 0.0F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0358F, -4.4288F, -2.5F, 8.0F, 7.0F, 6.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(8.0F, 1.0F, -6.0F, -1.4455F, -1.3953F, -0.0856F));

		PartDefinition head1 = wolf.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(0, 25).addBox(-1.4641F, -1.5F, -5.9622F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(14, 22).addBox(-2.9641F, -4.0F, -3.9622F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.8F))
				.texOffs(35, 29).addBox(1.0359F, -4.5F, -1.0622F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 29).addBox(-2.9641F, -4.5F, -1.0622F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-6.0F, 3.0F, -8.0F, 0.5305F, 0.1916F, -0.2255F));

		PartDefinition cape = body.addOrReplaceChild("cape", CubeListBuilder.create().texOffs(-6, 0).addBox(-5.0F, -25.6878F, -2.6968F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(20, 15).addBox(-3.5F, -21.3697F, -3.2229F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = cape.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 60).addBox(-10.49F, -3.0F, -1.0F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(38, 25).addBox(-10.49F, -3.0F, -1.0F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.99F, -2.1885F, 9.5583F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r6 = cape.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 54).addBox(-10.51F, -9.0F, -1.0F, 12.0F, 9.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(38, 15).addBox(-10.51F, -9.0F, -1.0F, 12.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.01F, -4.2854F, 7.8842F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r7 = cape.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 45).addBox(-9.0F, -5.1F, -2.5561F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.1F))
				.texOffs(0, 5).addBox(-9.0F, -5.4F, -2.3561F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -19.8086F, -2.3297F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = cape.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 50).addBox(-11.5F, -13.0F, -1.0F, 12.0F, 13.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(38, 0).addBox(-11.5F, -13.0F, -1.0F, 12.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.6F, 5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 50).addBox(-4.9F, -3.4F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.2F))
				.texOffs(0, 10).addBox(-4.9F, -3.4F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.1F, -3.4F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 50).mirror().addBox(-0.1F, -3.4F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}