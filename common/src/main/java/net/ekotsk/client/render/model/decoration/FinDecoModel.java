package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FinDecoModel {

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

		PartDefinition fin = head.addOrReplaceChild("fin", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = fin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 1).addBox(-0.1F, -4.2F, 0.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(13, 1).mirror().addBox(0.1F, -4.2F, 0.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = fin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 1).mirror().addBox(0.1F, -4.3F, 0.25F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 1).addBox(-0.1F, -4.3F, 0.25F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fin.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 0).addBox(-0.496F, 0.1F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8207F, 5.0325F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r4 = fin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-0.495F, -0.9F, -0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5794F, 0.0431F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = fin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 8).addBox(0.0F, -4.2F, 0.05F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5966F, -1.4453F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = fin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 3).addBox(-0.1F, -4.3F, 0.25F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -3.2735F, 2.9176F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r7 = fin.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -3.0F, 4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = fin.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -3.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = fin.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -2.9F, -0.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = fin.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -1.7F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r11 = fin.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -1.9F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r12 = fin.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}