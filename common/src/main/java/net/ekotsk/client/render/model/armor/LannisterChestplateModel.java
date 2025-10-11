package net.ekotsk.client.render.model.armor;
// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LannisterChestplateModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(40, 32).addBox(-3.0F, 0.3F, -2.7F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 29).addBox(-4.0F, 0.3F, -2.3F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 6).addBox(-4.0F, 2.3F, -2.7F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 0).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(48, 1).addBox(-3.0F, 4.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(48, 2).addBox(-3.0F, 6.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(12, 42).addBox(-3.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 0).addBox(-2.5F, 0.3F, -2.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.5F, -0.7F, -2.9F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(12, 45).addBox(1.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 92).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 112).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(20, 16).addBox(-3.4F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(40, 6).addBox(-3.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(20, 40).addBox(-3.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(20, 32).addBox(-3.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(-3.3F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(46, 41).addBox(-2.4F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.1F, 1.1F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 39).addBox(-0.0244F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.5F, -2.9F, 0.0F, 0.0873F, 0.1309F));

        PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 38).addBox(-0.0262F, -0.4905F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.2F, 3.1F, 0.0F, -0.0436F, 0.0873F));

        PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 39).addBox(-0.1258F, -0.4818F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 1.2F, -2.9F, 0.0F, 0.1745F, 0.0873F));

        PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 48).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.2F, 1.1F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r6 = RightArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -3.3F, 1.1F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r7 = RightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 36).addBox(-0.0244F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.5F, 3.1F, 0.0F, -0.0436F, 0.1309F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(112, 15).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(85, 38).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(46, 36).addBox(-0.6F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-1.7F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(20, 24).addBox(-0.6F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(40, 13).addBox(0.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-1.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(40, 20).addBox(2.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r8 = LeftArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 37).addBox(-0.9738F, -0.4905F, -0.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.2F, 3.3F, 0.0F, 0.0436F, -0.0873F));

        PartDefinition cube_r9 = LeftArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 36).addBox(-0.9738F, -0.4905F, -0.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.2F, -2.7F, 0.0F, -0.1309F, -0.0873F));

        PartDefinition cube_r10 = LeftArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 49).addBox(1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.2F, 1.1F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r11 = LeftArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 38).addBox(-0.9756F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.5F, 3.1F, 0.0F, 0.0436F, -0.1309F));

        PartDefinition cube_r12 = LeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 37).addBox(-0.9756F, -0.5492F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.5F, -2.9F, 0.0F, -0.0873F, -0.1309F));

        PartDefinition cube_r13 = LeftArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 46).addBox(1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.1F, 1.1F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 40).addBox(1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -3.3F, 1.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}