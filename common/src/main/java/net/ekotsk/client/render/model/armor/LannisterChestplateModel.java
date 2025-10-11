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
                .texOffs(1, 60).addBox(-3.0F, 0.3F, -2.7F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 0).addBox(-4.0F, 2.3F, -2.7F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 58).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-3.0F, 4.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 57).addBox(-3.0F, 6.5F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(61, 28).addBox(-3.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 48).addBox(-2.5F, 0.3F, -2.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(24, 10).addBox(-4.5F, -0.7F, -2.9F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(58, 61).addBox(1.0F, 10.3F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 92).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 112).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(87, 120).addBox(-3.4F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(110, 121).addBox(-3.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(61, 111).addBox(-3.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(108, 105).addBox(-3.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(87, 89).addBox(-3.3F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(73, 107).addBox(-2.4F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 121).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.2F, 1.1F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 113).addBox(-1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -3.3F, 1.1F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 103).addBox(-1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.1F, 1.1F, 0.0F, 0.0F, 0.1309F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(112, 15).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(85, 38).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(114, 0).addBox(-0.6F, -2.8F, -2.1F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(82, 21).addBox(-1.7F, -1.5F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(94, 0).addBox(-0.6F, -2.5F, -2.9F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(102, 73).addBox(0.4F, -0.5F, -2.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(102, 59).mirror().addBox(-1.5F, 7.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(78, 70).mirror().addBox(2.4F, 0.5F, -2.9F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r4 = LeftArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(116, 80).mirror().addBox(1.0F, 1.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.2F, 1.1F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(1.0F, 2.0F, -4.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.1F, 1.1F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(114, 34).addBox(1.0F, 1.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -3.3F, 1.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

}