package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class RobertCrownModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.2F))
				.texOffs(0, 28).addBox(-4.1F, -6.0F, -4.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 30).addBox(-4.1F, -7.0F, -4.2F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 28).addBox(-4.1F, -6.0F, 4.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 18).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.08F))
				.texOffs(0, 9).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.03F))
				.texOffs(32, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(32, 9).addBox(-3.5F, -7.6F, -3.5F, 7.0F, 1.4F, 7.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-9.6F, -1.0F, -2.5F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-6.5F, -5.0F, 5.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 28).addBox(-9.6F, -1.0F, -2.5F, 8.0F, 1.0F, 0.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5F, -5.0F, 5.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}