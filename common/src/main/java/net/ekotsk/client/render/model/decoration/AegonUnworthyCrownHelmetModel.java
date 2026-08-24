package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonUnworthyCrownHelmetModel {

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

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 22).addBox(-6.0F, -6.5F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 36).addBox(-6.0F, -4.9F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(-0.38F))
				.texOffs(0, 0).addBox(-5.5F, -5.3F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(-5.5F, -6.6F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition dragon7 = bone.addOrReplaceChild("dragon7", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -7.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = dragon7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-4.9F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-6.15F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = dragon7.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-3.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r3 = dragon7.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 17).addBox(0.0F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r4 = dragon7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.8F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = dragon7.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -1.7F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon_front2 = bone.addOrReplaceChild("dragon_front2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -10.0F, 4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition dragon4 = dragon_front2.addOrReplaceChild("dragon4", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition cube_r6 = dragon4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-2.9F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.1F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = dragon4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-2.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r8 = dragon4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 17).addBox(1.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r9 = dragon4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 17).addBox(0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = dragon4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 14).addBox(0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon5 = dragon_front2.addOrReplaceChild("dragon5", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 3.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r11 = dragon5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-3.2F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.4F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = dragon5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-2.3F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r13 = dragon5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 17).addBox(0.7F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r14 = dragon5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 17).addBox(0.2F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = dragon5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 14).addBox(0.2F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon6 = dragon_front2.addOrReplaceChild("dragon6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r16 = dragon6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-3.6F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.8F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = dragon6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-1.7F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r18 = dragon6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 17).addBox(1.3F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r19 = dragon6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.2F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r20 = dragon6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.2F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon_front = bone.addOrReplaceChild("dragon_front", CubeListBuilder.create(), PartPose.offset(-1.0F, -10.0F, -4.0F));

		PartDefinition dragon1 = dragon_front.addOrReplaceChild("dragon1", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition cube_r21 = dragon1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-2.9F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.1F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r22 = dragon1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-2.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r23 = dragon1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(7, 17).addBox(1.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r24 = dragon1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 17).addBox(0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r25 = dragon1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 14).addBox(0.5F, -1.7F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon2 = dragon_front.addOrReplaceChild("dragon2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 3.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r26 = dragon2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-3.2F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.4F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = dragon2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-2.3F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r28 = dragon2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 17).addBox(0.7F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r29 = dragon2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 17).addBox(0.2F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = dragon2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 14).addBox(0.2F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon3 = dragon_front.addOrReplaceChild("dragon3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r31 = dragon3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-3.6F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(3, 21).addBox(-4.8F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r32 = dragon3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-1.7F, -0.6F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r33 = dragon3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 17).addBox(1.3F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r34 = dragon3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.2F, -0.8F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = dragon3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.2F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition dragon8 = bone.addOrReplaceChild("dragon8", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r36 = dragon8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(3, 21).addBox(3.9F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(3, 21).mirror().addBox(5.15F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = dragon8.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(7, 17).addBox(2.0F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.575F, 0.2048F, 0.0757F));

		PartDefinition cube_r38 = dragon8.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-1.0F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.575F, -0.2048F, -0.0757F));

		PartDefinition cube_r39 = dragon8.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.5F, -0.8F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r40 = dragon8.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.5F, -1.7F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}