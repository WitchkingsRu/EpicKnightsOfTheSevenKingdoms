package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LannisterLordChestplateModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 38).addBox(-3.0F, 0.3F, -2.7F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(32, 37).addBox(-4.0F, 0.3F, -2.3F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-4.0F, 2.3F, -2.7F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 20).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-3.0F, 4.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(32, 47).addBox(-3.0F, 6.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(44, 47).addBox(-3.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 14).addBox(-2.5F, 0.3F, -2.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(-4.5F, -0.7F, -2.9F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(32, 48).addBox(1.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, -3.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 48).addBox(6.0F, -3.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.6F, 2.1F, -0.0524F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 50).addBox(-1.0F, -3.3F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, 2.2F, -0.0524F, 0.0F, 0.0F));

        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 2.0F, -0.0524F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(20, 21).addBox(-3.4F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 31).addBox(-3.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(18, 37).addBox(-3.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(20, 29).addBox(-3.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(20, 0).addBox(-3.3F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(40, 20).addBox(-2.4F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(14, 50).addBox(-3.4F, 3.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 40).addBox(-3.4F, 4.8F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 40).addBox(-1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.1F, 1.1F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 14).addBox(-0.0244F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.5F, -2.9F, 0.0F, 0.0873F, 0.1309F));

        PartDefinition cube_r6 = RightArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 14).addBox(-0.0262F, -0.4905F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.2F, 3.1F, 0.0F, -0.0436F, 0.0873F));

        PartDefinition cube_r7 = RightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 14).addBox(-0.1258F, -0.4818F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 1.2F, -2.9F, 0.0F, 0.1745F, 0.0873F));

        PartDefinition cube_r8 = RightArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 25).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.2F, 1.1F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -3.3F, 1.1F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r10 = RightArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 14).addBox(-0.0244F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.5F, 3.1F, 0.0F, -0.0436F, 0.1309F));

        PartDefinition shoulderpad2 = RightArm.addOrReplaceChild("shoulderpad1", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, -2.2F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 50).addBox(-1.6F, -2.4F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 14).addBox(-1.6F, -1.2F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 50).addBox(-1.6F, -2.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 32).addBox(-1.6F, -2.8F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(50, 37).addBox(-1.6F, -2.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 8).addBox(-0.5F, -3.0F, -3.7F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.25F))
                .texOffs(0, 42).addBox(-1.1F, -3.5F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(48, 17).addBox(-1.8F, -3.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2F, 0.1F, 1.1F));

        PartDefinition cube_r11 = shoulderpad2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 46).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(48, 17).addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.7F, -1.7F, 0.0F, 0.0F, -0.4189F));

        PartDefinition cube_r12 = shoulderpad2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 46).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -1.9F, -2.5F, 0.0F, 0.0F, -0.4189F));

        PartDefinition cube_r13 = shoulderpad2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 42).addBox(0.6492F, -0.4445F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -3.4F, -1.4F, 0.0F, 0.0F, 2.4435F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(20, 21).mirror().addBox(-0.6F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 31).mirror().addBox(0.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(18, 37).mirror().addBox(2.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(20, 29).mirror().addBox(-1.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(20, 0).mirror().addBox(-1.7F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(40, 20).mirror().addBox(-0.6F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(14, 50).mirror().addBox(2.4F, 3.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(44, 40).mirror().addBox(2.4F, 4.8F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 40).mirror().addBox(1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.1F, 1.1F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 14).mirror().addBox(-0.9756F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 2.5F, -2.9F, 0.0F, -0.0873F, -0.1309F));

        PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 14).mirror().addBox(-0.9738F, -0.4905F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 1.2F, 3.1F, 0.0F, 0.0436F, -0.0873F));

        PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 14).mirror().addBox(-0.8742F, -0.4818F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4F, 1.2F, -2.9F, 0.0F, -0.1745F, -0.0873F));

        PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 25).mirror().addBox(1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.2F, 1.1F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -3.3F, 1.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(-0.9756F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 2.5F, 3.1F, 0.0F, 0.0436F, -0.1309F));

        PartDefinition shoulderpad3 = LeftArm.addOrReplaceChild("shoulderpad2", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -2.2F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(50, 37).mirror().addBox(-0.4F, -2.4F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(48, 14).mirror().addBox(-0.4F, -1.2F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(20, 50).mirror().addBox(-0.4F, -2.4F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(40, 32).mirror().addBox(-0.4F, -2.8F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(26, 50).mirror().addBox(-0.4F, -2.4F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(40, 8).mirror().addBox(-1.5F, -3.0F, -3.7F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false)
                .texOffs(0, 42).mirror().addBox(-0.9F, -3.5F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(48, 17).mirror().addBox(-0.2F, -3.0F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.2F, 0.1F, 1.1F));

        PartDefinition cube_r21 = shoulderpad3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(48, 17).mirror().addBox(-1.0F, -2.0F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.7F, -1.7F, 0.0F, 0.0F, 0.4189F));

        PartDefinition cube_r22 = shoulderpad3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 46).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.9F, -2.5F, 0.0F, 0.0F, 0.4189F));

        PartDefinition cube_r23 = shoulderpad3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 50).mirror().addBox(-1.6492F, -0.4445F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -3.4F, -1.4F, 0.0F, 0.0F, -2.4435F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
