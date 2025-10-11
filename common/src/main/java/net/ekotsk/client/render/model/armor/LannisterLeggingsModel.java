package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LannisterLeggingsModel {

    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.35F))
                .texOffs(30, 22).addBox(-1.5F, 0.8F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.78F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r1 = right_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 29).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(0.0F, -1.0F, -3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 30).addBox(0.0F, -1.0F, 2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 24).addBox(0.0F, -1.0F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.0F, 0.3F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 42).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 41).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 31).addBox(0.0F, 0.0F, 2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 26).addBox(0.0F, 0.0F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.4F, 0.3F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 39).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(44, 1).addBox(0.0F, 0.0F, 2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 28).addBox(0.0F, 0.0F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 2.7F, 0.3F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r4 = right_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 9).addBox(0.0F, 0.0F, -3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 33).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(38, 10).addBox(0.0F, 0.0F, 2.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 22).addBox(0.0F, 0.0F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 3.9F, 0.3F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r5 = right_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 32).addBox(2.0F, -1.0F, -2.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-1.7F, 0.8F, -0.4F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r6 = right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 11).addBox(0.0F, -1.0F, -2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-2.2F, 0.8F, -0.4F, 0.0F, 0.0F, 0.0436F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(30, 11).addBox(-1.5F, 0.8F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.78F))
                .texOffs(0, 11).addBox(-1.9F, -0.01F, -2.01F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 38).addBox(0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 21).addBox(0.0F, 0.0F, -2.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(26, 32).addBox(-2.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(26, 31).addBox(-2.0F, 0.0F, -2.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 3.9F, -0.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 36).addBox(0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 42).addBox(0.0F, 0.0F, -2.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(30, 43).addBox(-3.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(42, 32).addBox(-3.0F, 0.0F, -2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.7F, -0.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r9 = left_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 34).addBox(0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 15).addBox(0.0F, 0.0F, -2.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 27).addBox(-3.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(32, 10).addBox(-3.0F, 0.0F, -2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.4F, -0.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r10 = left_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 32).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 42).addBox(0.0F, -1.0F, -2.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 28).addBox(-3.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(32, 9).addBox(-3.0F, -1.0F, -2.6F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.0F, -0.1F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r11 = left_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -1.0F, -2.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.7F, 0.8F, -0.4F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r12 = left_leg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 21).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(2.2F, 0.8F, -0.4F, 0.0F, 0.0F, -0.0436F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}
