package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class StannisCrownHelmetModel {

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

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 13).addBox(-5.5F, -5.5F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-5.5F, -6.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 39).addBox(-5.5F, -7.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 52).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(-0.05F))
				.texOffs(0, 0).addBox(-5.5F, -5.3F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}