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

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead = bipedHead.addOrReplaceChild("armorHead", CubeListBuilder.create().texOffs(6, 25).addBox(-1.0F, -7.5F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(2.75F, -7.5F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(-4.75F, -7.5F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(2.75F, -7.5F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(-1.0F, -7.5F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(-4.75F, -7.5F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(2.25F, -8.0F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.5F, -8.0F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).mirror().addBox(-5.25F, -8.0F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).mirror().addBox(-5.25F, -8.0F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).addBox(2.25F, -8.0F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.5F, -8.0F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.5F, -7.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 25).addBox(3.0F, -1.0F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(2.5F, -1.5F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(3.0F, -1.0F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(2.5F, -1.5F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, -0.25F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = armorHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 25).addBox(-1.0F, -1.0F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.5F, -1.5F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(-1.0F, -1.0F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.5F, -1.5F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = armorHead.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 25).addBox(-5.0F, -1.0F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).mirror().addBox(-5.5F, -1.5F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 25).addBox(-5.0F, -1.0F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).mirror().addBox(-5.5F, -1.5F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.5F, 0.25F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}