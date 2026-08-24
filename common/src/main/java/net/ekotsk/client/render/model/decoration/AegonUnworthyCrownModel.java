package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonUnworthyCrownModel {

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

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.25F))
				.texOffs(28, 11).addBox(-4.5F, -8.3F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 21).addBox(-4.5F, -6.8F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 9).addBox(-4.0F, -7.1F, -4.0F, 8.0F, 1.4F, 8.0F, new CubeDeformation(0.15F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition dragons_front3 = bone.addOrReplaceChild("dragons_front3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -10.0F, 3.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition dragon9 = dragons_front3.addOrReplaceChild("dragon9", CubeListBuilder.create(), PartPose.offset(2.0F, 2.0F, 2.0F));

		PartDefinition cube_r1 = dragon9.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-2.1F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(3, 27).addBox(-2.9F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = dragon9.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r3 = dragon9.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 23).addBox(1.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r4 = dragon9.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 23).addBox(0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = dragon9.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 20).addBox(0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragons_front2 = bone.addOrReplaceChild("dragons_front2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -10.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition dragon4 = dragons_front2.addOrReplaceChild("dragon4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r6 = dragon4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 27).addBox(2.4F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(3, 27).mirror().addBox(3.2F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = dragon4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.2F, -1.75F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = dragon4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.2F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = dragon4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-1.6F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r10 = dragon4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 23).addBox(1.2F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition dragon5 = dragons_front2.addOrReplaceChild("dragon5", CubeListBuilder.create(), PartPose.offset(2.0F, 2.0F, 2.0F));

		PartDefinition cube_r11 = dragon5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-2.1F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(3, 27).addBox(-2.9F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = dragon5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r13 = dragon5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 23).addBox(1.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r14 = dragon5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 23).addBox(0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = dragon5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 20).addBox(0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon6 = dragons_front2.addOrReplaceChild("dragon6", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 2.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r16 = dragon6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-3.4F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(3, 27).addBox(-4.2F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = dragon6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.2F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r18 = dragon6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 23).addBox(0.6F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r19 = dragon6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 23).addBox(0.2F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r20 = dragon6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 20).addBox(0.2F, -1.75F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragons_front = bone.addOrReplaceChild("dragons_front", CubeListBuilder.create(), PartPose.offset(-3.0F, -10.0F, -5.0F));

		PartDefinition dragon3 = dragons_front.addOrReplaceChild("dragon3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r21 = dragon3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(3, 27).addBox(2.4F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(3, 27).mirror().addBox(3.2F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r22 = dragon3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.2F, -1.75F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r23 = dragon3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.2F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = dragon3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-1.6F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r25 = dragon3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 23).addBox(1.2F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition dragon1 = dragons_front.addOrReplaceChild("dragon1", CubeListBuilder.create(), PartPose.offset(2.0F, 2.0F, 2.0F));

		PartDefinition cube_r26 = dragon1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-2.1F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(3, 27).addBox(-2.9F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = dragon1.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r28 = dragon1.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 23).addBox(1.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r29 = dragon1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 23).addBox(0.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = dragon1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 20).addBox(0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon2 = dragons_front.addOrReplaceChild("dragon2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, 2.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r31 = dragon2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-3.4F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(3, 27).addBox(-4.2F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r32 = dragon2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.2F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r33 = dragon2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 23).addBox(0.6F, -0.2F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r34 = dragon2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 23).addBox(0.2F, -0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = dragon2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 20).addBox(0.2F, -1.75F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragons_front6 = bone.addOrReplaceChild("dragons_front6", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -10.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition dragon15 = dragons_front6.addOrReplaceChild("dragon15", CubeListBuilder.create(), PartPose.offset(-2.0F, 2.0F, 2.0F));

		PartDefinition cube_r36 = dragon15.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(3, 27).addBox(1.1F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(3, 27).mirror().addBox(1.9F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = dragon15.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(7, 23).addBox(1.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r38 = dragon15.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-2.0F, -0.2F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r39 = dragon15.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.5F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r40 = dragon15.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}