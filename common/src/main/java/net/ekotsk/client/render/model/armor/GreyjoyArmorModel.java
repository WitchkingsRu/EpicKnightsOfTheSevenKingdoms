package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GreyjoyArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.9F))
                .texOffs(32, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.6F))
                .texOffs(40, 33).addBox(-3.0F, -8.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 36).addBox(-2.7F, 0.0F, -0.8F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(7.0F, -2.0F, -3.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -4.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(2.0F, -2.0F, 0.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 7.0F, 1.5708F, 1.2217F, 1.5708F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 36).mirror().addBox(2.7F, 0.0F, -0.8F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.61F))
                .texOffs(16, 32).addBox(-3.5F, 0.0F, -2.0F, 7.0F, 9.0F, 4.0F, new CubeDeformation(0.67F))
                .texOffs(16, 45).addBox(-3.5F, 0.0F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
                .texOffs(39, 52).addBox(-3.0F, -0.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.57F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r5 = right_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 58).addBox(-3.0F, -2.5F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.58F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r6 = right_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 46).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
                .texOffs(39, 52).mirror().addBox(-1.0F, -0.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.57F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r7 = left_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 58).mirror().addBox(-1.0F, -2.5F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.58F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r8 = left_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 46).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r9 = right_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-1.0F, -4.3F, -1.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(4.9F, 5.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r10 = left_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 54).addBox(-2.0F, -4.3F, -1.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-4.9F, 5.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}
