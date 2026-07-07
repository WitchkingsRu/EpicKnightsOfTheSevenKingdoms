package net.ekotsk.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class NightsWatchCapeModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cape = body.addOrReplaceChild("cape", CubeListBuilder.create().texOffs(31, 21).addBox(-5.0F, -25.6878F, -2.6968F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(17, 9).addBox(-3.5F, -23.0F, -3.5F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = cape.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-8.99F, -3.0F, -1.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.6079F, 9.0873F, 0.6545F, 0.0F, 0.0F));

        PartDefinition cube_r2 = cape.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-9.01F, -9.0F, -1.0F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -5.0825F, 7.7362F, 0.3316F, 0.0F, 0.0F));

        PartDefinition cube_r3 = cape.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 29).addBox(-9.0F, -3.4F, -2.3561F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -22.1886F, -2.1439F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r4 = cape.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 0).addBox(-9.0F, -13.0F, -1.0F, 10.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -12.6F, 5.0F, 0.1309F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 8).addBox(-3.9F, -2.4F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.03F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition bone = right_arm.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -5.4F, -2.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(49, 4).addBox(0.0F, -4.8F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 0).addBox(-5.0F, -3.9057F, -3.5783F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 2).addBox(-1.0F, -5.599F, -2.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-3, 4).addBox(-5.0F, 0.5F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 1.309F, 0.0F, 0.0F));

        PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-3, 2).addBox(-5.0F, 0.2F, -0.9F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 1.3963F, 0.0F, 0.0F));

        PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(11, 4).addBox(-5.4783F, 0.0F, -1.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-5.4217F, 0.2113F, -2.1251F, 0.0F, 1.5708F, -1.309F));

        PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 0).addBox(-5.6783F, 0.0F, -1.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-5.4217F, -1.4532F, -2.367F, 0.0F, 1.5708F, -1.309F));

        PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 5).addBox(-4.0F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4217F, -4.4933F, -1.0F, 1.1345F, 1.5708F, 0.0F));

        PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 3).addBox(-6.0F, 0.0F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2578F, -2.9406F, -2.5783F, 0.0F, 1.5708F, -1.309F));

        PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-3, 4).addBox(-5.0F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-4.0F, 0.2113F, 3.7749F, -1.8326F, 0.0F, -3.1416F));

        PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-3, 2).addBox(-5.0F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-4.0F, -1.4532F, 3.733F, -1.8326F, 0.0F, -3.1416F));

        PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4933F, 3.4217F, 1.1345F, 3.1416F, 0.0F));

        PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-2, 1).addBox(-5.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 3.8434F, -1.8326F, 0.0F, -3.1416F));

        PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(3, 1).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.4933F, -2.4217F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.8933F, -3.4217F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-2, 1).addBox(-5.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -2.9302F, -3.7938F, 1.3526F, 0.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(0.9F, -2.4F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(1.03F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition bone2 = left_arm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.0F, -4.8F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(44, 0).mirror().addBox(-2.0F, -5.4F, -2.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(13, 0).mirror().addBox(-2.0F, -5.599F, -2.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(28, 0).mirror().addBox(-1.0F, -3.9057F, -3.5783F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(2, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.8933F, -3.4217F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-2, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9302F, -3.7938F, 1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-2, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -3.0F, 3.8434F, -1.8326F, 0.0F, 3.1416F));

        PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2578F, -2.9406F, -2.5783F, 0.0F, -1.5708F, 1.309F));

        PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-3, 1).mirror().addBox(-1.0F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(4.0F, -1.4532F, 3.733F, -1.8326F, 0.0F, 3.1416F));

        PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-2, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.4933F, 3.4217F, 1.1345F, -3.1416F, 0.0F));

        PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(3, 0).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.4933F, -2.4217F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(11, 1).mirror().addBox(-1.3217F, 0.0F, -1.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(5.4217F, -1.4532F, -2.367F, 0.0F, -1.5708F, 1.309F));

        PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 2).mirror().addBox(-1.0F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4217F, -4.4933F, -1.0F, 1.1345F, -1.5708F, 0.0F));

        PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-3, 3).mirror().addBox(-1.0F, 0.0F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, 0.2113F, 3.7749F, -1.8326F, 0.0F, 3.1416F));

        PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-3, 2).mirror().addBox(-1.0F, 0.2F, -0.9F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 1.3963F, 0.0F, 0.0F));

        PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 3).mirror().addBox(-1.5217F, 0.0F, -1.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(5.4217F, 0.2113F, -2.1251F, 0.0F, -1.5708F, 1.309F));

        PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-3, 3).mirror().addBox(-1.0F, 0.5F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 1.309F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
