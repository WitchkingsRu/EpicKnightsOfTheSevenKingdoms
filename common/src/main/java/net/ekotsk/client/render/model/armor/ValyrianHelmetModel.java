package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ValyrianHelmetModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F))
                .texOffs(0, 16).addBox(-3.5F, -11.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-0.5F, -1.0355F, -0.6127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(28, 18).addBox(-2.5F, -1.0355F, -0.6127F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.3645F, -4.4873F, 0.6981F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, -1.0355F, -0.6127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -9.3645F, -4.4873F, 0.9175F, 0.6224F, 0.1234F));

        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, -1.0355F, -0.6127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -9.3645F, -4.4873F, 0.9175F, -0.6224F, -0.1234F));

        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.3645F, -5.4873F, 0.6981F, 0.0F, 0.0F));

        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 21).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -6.0F, 1.309F, 0.0F, 0.0F));

        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 16).addBox(-0.5F, -2.3F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-3.0F, -1.0F, -4.0F, 0.3924F, 0.401F, 0.1072F));

        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 24).addBox(-0.5F, -4.0F, -1.0F, 5.0F, 4.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-4.0F, -3.0F, -4.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 24).addBox(-0.5F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-4.0F, -7.0F, -4.0F, -0.3054F, 0.3927F, 0.0F));

        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 26).addBox(-4.5F, -2.0F, -1.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(4.0F, -7.0F, -4.0F, -0.3054F, -0.3927F, 0.0F));

        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 28).addBox(-3.5F, -2.3F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.0F, -1.0F, -4.0F, 0.3924F, -0.401F, -0.1072F));

        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 24).addBox(-4.5F, -4.0F, -1.0F, 5.0F, 4.0F, 0.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(4.0F, -3.0F, -4.0F, 0.0F, -0.3927F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
