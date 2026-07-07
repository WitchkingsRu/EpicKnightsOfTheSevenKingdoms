package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class NightsWatchArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F))
                .texOffs(32, 0).addBox(-3.0F, -9.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.7F))
                .texOffs(28, 32).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 34).mirror().addBox(-1.5F, -3.0F, -1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, -4.0F, -3.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-1.7F, -3.0F, -1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, -2.0F, -3.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 37).addBox(1.7F, -3.0F, -1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 34).addBox(1.0F, -3.0F, -1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.0F, 4.0F, 1.5708F, -1.4399F, -1.5708F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 34).addBox(1.5F, -3.0F, -1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -4.0F, -3.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F))
                .texOffs(1, 55).addBox(-3.5F, 1.0F, -2.7F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.7F))
                .texOffs(15, 55).addBox(-3.5F, 1.0F, 2.5F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.8F))
                .texOffs(2, 53).addBox(-3.0F, 10.5F, -2.5F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.6F))
                .texOffs(16, 53).addBox(-3.0F, 10.5F, 2.51F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.7F))
                .texOffs(32, 57).addBox(-5.0F, -1.5F, -3.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(32, 57).mirror().addBox(2.0F, -1.5F, -3.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(51, 60).addBox(-5.0F, -1.51F, 1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(51, 60).mirror().addBox(2.0F, -1.51F, 1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
                .texOffs(15, 47).addBox(-3.9F, -2.4F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.03F))
                .texOffs(50, 46).addBox(-3.0F, 9.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.15F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
                .texOffs(15, 47).mirror().addBox(0.9F, -2.4F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.03F)).mirror(false)
                .texOffs(50, 46).mirror().addBox(0.0F, 9.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.15F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
                .texOffs(0, 37).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.2F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r6 = right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 43).addBox(-2.6F, -5.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(1.09F)), PartPose.offsetAndRotation(0.0F, 7.0F, -1.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
                .texOffs(0, 37).mirror().addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.4F, -5.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(1.09F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0F, -1.0F, 0.0F, 0.0F, -0.1309F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
