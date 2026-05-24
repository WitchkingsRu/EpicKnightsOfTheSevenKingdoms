package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class DornishArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F))
                .texOffs(32, 42).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F))
                .texOffs(0, 56).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.7F))
                .texOffs(25, 58).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(42, 60).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(51, 61).addBox(-0.5F, -15.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.9F))
                .texOffs(40, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.8F))
                .texOffs(32, 9).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(1.0F))
                .texOffs(0, 49).addBox(-4.0F, 10.8F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.91F))
                .texOffs(16, 32).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.65F))
                .texOffs(34, 32).addBox(-3.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.0F))
                .texOffs(48, 32).addBox(-2.2F, 7.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.88F))
                .texOffs(16, 37).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.06F))
                .texOffs(16, 43).addBox(-3.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.05F))
                .texOffs(28, 42).addBox(-3.0F, 1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F))
                .texOffs(28, 38).addBox(-3.0F, 5.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(1.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.65F)).mirror(false)
                .texOffs(28, 38).mirror().addBox(0.0F, 5.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(1.0F)).mirror(false)
                .texOffs(28, 42).mirror().addBox(1.0F, 1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
                .texOffs(48, 32).mirror().addBox(-0.8F, 7.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.88F)).mirror(false)
                .texOffs(16, 37).mirror().addBox(1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.1F)).mirror(false)
                .texOffs(16, 43).mirror().addBox(1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(1.05F)).mirror(false)
                .texOffs(34, 32).mirror().addBox(0.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.88F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition cube_r1 = right_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.95F)), PartPose.offsetAndRotation(0.1F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 13).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.91F)), PartPose.offsetAndRotation(0.1F, 3.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -5.7F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)), PartPose.offsetAndRotation(0.1F, 6.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition RightBoot = right_leg.addOrReplaceChild("RightBoot", CubeListBuilder.create().texOffs(48, 9).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.88F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));

        PartDefinition cube_r4 = left_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -5.7F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r5 = left_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.95F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r6 = left_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 13).mirror().addBox(-1.0F, -3.0F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition LeftBoot = left_leg.addOrReplaceChild("LeftBoot", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-2.1F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
