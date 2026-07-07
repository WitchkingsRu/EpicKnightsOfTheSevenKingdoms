package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class HOTDKingsguardArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 1).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.83F))
                .texOffs(32, 8).addBox(-3.5F, -8.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, -5).mirror().addBox(-2.2418F, -2.2048F, -0.5F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(7.3418F, 0.2048F, -3.05F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 7).mirror().addBox(-1.511F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(1.002F, -8.9934F, -4.4636F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, -6).addBox(1.8418F, -2.7048F, -1.05F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.3418F, 1.2048F, 6.95F, 1.5708F, 1.1781F, 1.5708F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, -5).addBox(2.2418F, -2.2048F, -0.5F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-7.3418F, 0.2048F, -3.05F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 8).addBox(0.493F, -4.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-1.001F, -4.9274F, -5.2625F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 7).addBox(0.492F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-1.0F, -8.164F, 4.1318F, 1.0472F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F))
                .texOffs(20, 37).addBox(-3.5F, -0.3F, -2.2F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.7F))
                .texOffs(20, 32).addBox(-3.5F, -0.5F, -2.81F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.3F))
                .texOffs(22, 40).addBox(-1.5F, 2.8F, -2.15F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.72F))
                .texOffs(22, 35).addBox(-1.5F, 1.6F, -2.85F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F))
                .texOffs(0, 53).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.76F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r7 = right_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 33).addBox(-3.3F, -5.7F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.0F, 0.0F, 0.0F, 0.1745F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F))
                .texOffs(45, 40).addBox(-3.7F, 2.3F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.2F))
                .texOffs(45, 48).addBox(-3.7F, 3.8F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.21F))
                .texOffs(45, 57).addBox(-3.7F, 5.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.22F))
                .texOffs(45, 33).addBox(-3.2F, 2.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.6F))
                .texOffs(45, 33).addBox(-3.2F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.59F))
                .texOffs(45, 33).addBox(-3.2F, 6.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.55F))
                .texOffs(45, 33).addBox(-2.7F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.55F))
                .texOffs(28, 41).addBox(-2.8F, -2.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.61F))
                .texOffs(28, 48).addBox(-3.4F, -1.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)).mirror(false)
                .texOffs(45, 48).mirror().addBox(0.7F, 3.8F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.21F)).mirror(false)
                .texOffs(45, 33).mirror().addBox(1.7F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.55F)).mirror(false)
                .texOffs(28, 48).mirror().addBox(-0.6F, -1.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false)
                .texOffs(45, 57).mirror().addBox(1.7F, 5.3F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.22F)).mirror(false)
                .texOffs(45, 40).mirror().addBox(0.7F, 2.3F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false)
                .texOffs(45, 33).mirror().addBox(2.2F, 6.4F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.55F)).mirror(false)
                .texOffs(28, 41).mirror().addBox(-0.2F, -2.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.61F)).mirror(false)
                .texOffs(45, 33).mirror().addBox(1.2F, 2.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false)
                .texOffs(45, 33).mirror().addBox(1.2F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.59F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)).mirror(false)
                .texOffs(0, 53).mirror().addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.76F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.7F, -5.7F, -1.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.35F)).mirror(false), PartPose.offsetAndRotation(0.1F, 6.0F, -1.0F, 0.0F, 0.0F, -0.1745F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

}
