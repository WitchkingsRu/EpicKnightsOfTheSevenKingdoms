package net.ekotsk.client.render.model.armor;


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LannisterHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F))
				.texOffs(40, 0).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(1.0F))
				.texOffs(0, 15).addBox(-0.5F, -10.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.3F))
				.texOffs(6, 21).addBox(-0.49F, -9.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 27).mirror().addBox(-0.99F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.265F, -3.1897F, -6.2051F, -0.1309F, 0.3491F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 27).addBox(0.01F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.265F, -3.1897F, -6.2051F, -0.1309F, -0.3491F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 26).addBox(-3.97F, -4.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7565F, -2.0F, -6.0F, -0.1309F, 0.3491F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-1.96F, -2.5F, -1.15F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5179F, -6.1096F, -4.7982F, -0.3927F, 0.3491F, -0.0873F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 25).addBox(-6.2684F, -6.0F, -1.999F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1584F, -8.0F, 2.0F, -0.3491F, 0.0873F, -0.3054F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 22).addBox(-2.04F, -2.5F, -1.15F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5179F, -6.1096F, -4.7982F, -0.3927F, -0.3491F, 0.0873F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 26).mirror().addBox(-0.03F, -4.2F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7565F, -2.0F, -6.0F, -0.1309F, -0.3491F, 0.0F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 19).mirror().addBox(-1.3598F, -3.0F, -0.7912F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(6.1598F, 0.0F, -4.1588F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 14).addBox(-9.0F, -3.0F, -1.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.0065F, 0.1282F, 6.0565F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 19).addBox(0.3598F, -3.0F, -0.7912F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-6.1598F, 0.0F, -4.1588F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.7316F, -6.0F, -1.999F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1584F, -8.0F, 2.0F, -0.3491F, -0.0873F, 0.3054F));

		return LayerDefinition.create(meshdefinition, 64, 32);

	}
}