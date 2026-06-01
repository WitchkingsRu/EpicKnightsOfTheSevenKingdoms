package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class NorthernArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.9F, -4.2F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.75F))
                .texOffs(0, 32).addBox(-3.0F, -9.5F, -3.2F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 0).addBox(-4.0F, -0.1F, -2.01F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
                .texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 37).mirror().addBox(-6.0F, -6.0F, -0.055F, 12.0F, 12.0F, -1.0F, new CubeDeformation(0.95F)).mirror(false)
                .texOffs(38, 37).mirror().addBox(-6.0F, -6.0F, -5.955F, 12.0F, 12.0F, -1.0F, new CubeDeformation(0.95F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 3.925F, 0.0F, 0.0F, -0.7854F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false)
                .texOffs(0, 57).addBox(-3.5F, -2.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.91F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F))
                .texOffs(0, 57).mirror().addBox(-0.5F, -2.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.9F))
                .texOffs(0, 45).addBox(-1.9F, 1.4F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.92F))
                .texOffs(20, 40).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.91F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r2 = left_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 45).addBox(-2.0F, 4.9F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.95F)), PartPose.offsetAndRotation(0.1F, -4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.9F)).mirror(false)
                .texOffs(20, 40).mirror().addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false)
                .texOffs(0, 45).mirror().addBox(-2.1F, 1.4F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.92F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-2.0F, 4.9F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.95F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
