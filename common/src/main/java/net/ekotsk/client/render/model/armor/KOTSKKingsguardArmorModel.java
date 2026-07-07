package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class KOTSKKingsguardArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -7.15F, -3.2F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.95F))
                .texOffs(29, 8).addBox(-2.5F, -8.2F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.9F))
                .texOffs(6, 6).addBox(-3.5F, -6.95F, -3.7F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.88F)), PartPose.offset(0.0F, -0.8F, 0.0F));

        PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.8F, 0.0F));

        PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rmask_r1 = rmask.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-2.5F, -4.01F, 0.0F, 5.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2932F, -28.576F, -6.0899F, -1.4987F, 0.4648F, 0.0F));

        PartDefinition rmask_r2 = rmask.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(54, 10).addBox(-3.5F, -4.0F, 0.0F, 5.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0703F, -28.576F, -5.6417F, -1.4987F, -0.4648F, 0.0F));

        PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition lmask_r1 = lmask.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(52, 5).mirror().addBox(-5.45F, -3.4665F, 1.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, -25.1F, -6.1F, 0.552F, 0.4648F, 0.0F));

        PartDefinition lmask_r2 = lmask.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-5.5266F, -1.5466F, -0.7743F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -31.0701F, -4.2235F, -0.4164F, 0.3348F, -0.0116F));

        PartDefinition lmask_r3 = lmask.addOrReplaceChild("lmask_r3", CubeListBuilder.create().texOffs(52, 5).addBox(-0.55F, -3.4665F, 1.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -25.1F, -6.1F, 0.552F, -0.4648F, 0.0F));

        PartDefinition lmask_r4 = lmask.addOrReplaceChild("lmask_r4", CubeListBuilder.create().texOffs(52, 0).addBox(-0.4734F, -1.5466F, -0.7743F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -31.0701F, -4.2235F, -0.4164F, -0.3348F, 0.0116F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.66F))
                .texOffs(17, 58).addBox(-4.5F, 9.5F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(17, 49).addBox(-3.5F, 3.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.25F))
                .texOffs(27, 42).addBox(-3.2F, -0.6F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.58F))
                .texOffs(27, 35).addBox(-3.2F, 0.7F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.51F))
                .texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
                .texOffs(13, 32).addBox(-3.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r1 = right_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 42).addBox(-0.3F, -1.9F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.64F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r2 = right_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 42).addBox(-0.2F, -2.9F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.67F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
                .texOffs(17, 49).mirror().addBox(0.5F, 3.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false)
                .texOffs(27, 35).mirror().addBox(0.2F, 0.7F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.51F)).mirror(false)
                .texOffs(27, 42).mirror().addBox(0.2F, -0.6F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.58F)).mirror(false)
                .texOffs(13, 32).mirror().addBox(0.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r3 = left_arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 42).mirror().addBox(-2.7F, -1.9F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.64F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r4 = left_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 42).mirror().addBox(-2.8F, -2.9F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.67F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F))
                .texOffs(0, 57).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r5 = right_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 44).addBox(-2.9F, -4.9F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.12F)), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r6 = right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 33).addBox(-3.5F, -5.5F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.17F)), PartPose.offsetAndRotation(-0.1F, 4.0F, -1.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)).mirror(false)
                .texOffs(0, 57).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.1F, -4.9F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.12F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.5F, -5.5F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.17F)).mirror(false), PartPose.offsetAndRotation(0.1F, 4.0F, -1.0F, 0.0F, 0.0F, -0.2618F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}
