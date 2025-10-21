package net.ekotsk.client.render.model.decoration;// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AegonCrownHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.52F))
				.texOffs(18, 13).addBox(-1.0F, -8.4F, -5.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(6, 18).addBox(-4.5F, -8.35F, 4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-5.7F, -8.35F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 14).addBox(-5.7F, -8.35F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(12, 14).addBox(-5.7F, -8.35F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-5.1F, -8.41F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F))
				.texOffs(6, 10).addBox(-5.1F, -8.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F))
				.texOffs(12, 10).addBox(-5.1F, -8.4F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F))
				.texOffs(18, 19).addBox(-4.5F, -8.4F, 4.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(0, 18).addBox(2.5F, -8.35F, 4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 10).addBox(2.5F, -8.4F, 4.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(0, 18).addBox(-1.0F, -8.35F, 4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 19).addBox(-1.0F, -8.4F, 4.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(0, 18).addBox(-1.0F, -8.35F, -5.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 10).addBox(2.5F, -8.41F, -5.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(0, 18).addBox(2.5F, -8.35F, -5.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 16).addBox(-4.5F, -8.41F, -5.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(12, 18).addBox(-4.5F, -8.35F, -5.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).mirror().addBox(4.7F, -8.35F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 14).mirror().addBox(4.7F, -8.35F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 14).mirror().addBox(4.7F, -8.35F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(4.1F, -8.41F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(4.1F, -8.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(4.1F, -8.4F, -4.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offset(0.0F, -1.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}