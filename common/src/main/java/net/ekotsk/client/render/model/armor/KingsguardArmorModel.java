package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class KingsguardArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 5).mirror().addBox(-1.51F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(1.0F, -9.0F, -4.0F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, -6).mirror().addBox(-2.3418F, -2.2048F, -0.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(7.3418F, -0.7952F, -4.05F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, -4).addBox(1.1418F, -4.3048F, -0.85F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.6582F, 3.2048F, 4.95F, 1.5708F, -1.2217F, -1.5708F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, -6).addBox(2.3418F, -2.2048F, -0.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-7.3418F, -0.7952F, -4.05F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, -9).addBox(0.5F, -1.5F, -1.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-5.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 1).addBox(0.31F, -1.5F, -1.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -8.0F, -3.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 11).addBox(0.602F, -3.0789F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.392F, -6.4726F, -4.6953F, -0.3491F, 0.0F, 0.2618F));

        PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 5).addBox(0.312F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9368F, -7.7332F, 4.6235F, 0.48F, 0.0F, 0.2618F));

        PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 5).addBox(-1.312F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9368F, -7.7332F, 4.6235F, 0.48F, 0.0F, -0.2618F));

        PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 1).addBox(-1.31F, -1.5F, -1.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, -3.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 11).addBox(-1.602F, -3.0789F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.392F, -6.4726F, -4.6953F, -0.3491F, 0.0F, -0.2618F));

        PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 5).addBox(0.491F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-1.0F, -6.8457F, 3.7242F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 5).addBox(0.491F, -4.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-1.0F, -4.9115F, -4.8282F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, -9).addBox(-1.2F, -1.8F, -0.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(4.0F, 1.0F, 6.0F, 1.5708F, -1.2217F, -1.5708F));

        PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, -9).addBox(-0.5F, -1.5F, -1.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(5.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
                .texOffs(0, 32).addBox(-0.3F, -2.7F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.3F))
                .texOffs(11, 42).addBox(-3.8F, -0.3F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
                .texOffs(13, 33).addBox(-3.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.8F))
                .texOffs(27, 42).addBox(-2.4F, -2.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.51F))
                .texOffs(17, 49).addBox(-3.8F, 4.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r16 = right_arm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 33).addBox(-4.5F, -3.5F, -0.8F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 2.0F, 0.2182F, -1.5708F, 0.0F));

        PartDefinition cube_r17 = right_arm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 36).addBox(-3.2F, -3.5F, -0.8F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r18 = right_arm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 36).addBox(-3.7F, -3.0F, -1.1F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false)
                .texOffs(13, 33).mirror().addBox(0.0F, 8.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false)
                .texOffs(11, 42).mirror().addBox(0.8F, -0.3F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false)
                .texOffs(0, 32).mirror().addBox(-0.7F, -2.7F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.3F)).mirror(false)
                .texOffs(27, 42).mirror().addBox(-1.6F, -2.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.51F)).mirror(false)
                .texOffs(17, 49).mirror().addBox(-0.2F, 4.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r19 = left_arm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 33).mirror().addBox(-0.5F, -3.5F, -0.8F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 3.0F, 2.0F, 0.2182F, 1.5708F, 0.0F));

        PartDefinition cube_r20 = left_arm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(-0.8F, -3.5F, -0.8F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r21 = left_arm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(-0.8F, -3.0F, -1.1F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F))
                .texOffs(36, 37).addBox(0.2F, -1.0F, -2.51F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.42F))
                .texOffs(0, 49).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r22 = right_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(45, 41).addBox(-2.0F, -4.5F, -1.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.41F)), PartPose.offsetAndRotation(-1.1F, 5.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r23 = right_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 32).addBox(-3.3F, -4.0F, -1.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.0F, 0.0F, 0.0F, 0.1745F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false)
                .texOffs(0, 49).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.81F)).mirror(false)
                .texOffs(36, 37).mirror().addBox(-2.2F, -1.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.42F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r24 = left_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 41).mirror().addBox(-1.0F, -4.5F, -1.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.41F)).mirror(false), PartPose.offsetAndRotation(1.1F, 5.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r25 = left_leg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-0.7F, -4.0F, -1.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.45F)).mirror(false), PartPose.offsetAndRotation(0.1F, 3.0F, -1.0F, 0.0F, 0.0F, -0.1745F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}
