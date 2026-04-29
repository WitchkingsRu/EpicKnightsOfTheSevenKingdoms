package net.ekotsk.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ValyrianArmorModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 43).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.95F))
                .texOffs(0, 0).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F))
                .texOffs(32, 33).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.86F))
                .texOffs(0, 25).addBox(-1.2F, -4.0F, -3.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.2F))
                .texOffs(1, 16).addBox(-4.75F, -3.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.15F))
                .texOffs(32, 39).addBox(-3.25F, 2.6F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.85F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F)).mirror(false)
                .texOffs(32, 33).mirror().addBox(-0.25F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.86F)).mirror(false)
                .texOffs(0, 25).mirror().addBox(0.2F, -4.0F, -3.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.2F)).mirror(false)
                .texOffs(32, 39).mirror().addBox(0.25F, 2.6F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.85F)).mirror(false)
                .texOffs(1, 16).mirror().addBox(-0.25F, -3.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(24, 16).mirror().addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));

        PartDefinition cube_r1 = left_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 46).mirror().addBox(-2.1F, -5.0F, -1.2F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(1.4F, 4.25F, -1.8F, 0.0F, 0.0F, -0.1309F));

        PartDefinition LeftFoot2 = left_leg.addOrReplaceChild("LeftFoot2", CubeListBuilder.create().texOffs(29, 56).mirror().addBox(1.3F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.9F)).mirror(false), PartPose.offset(-3.4F, 12.25F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(24, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 46).addBox(-1.9F, -5.0F, -1.2F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.4F, 4.25F, -1.8F, 0.0F, 0.0F, 0.1309F));

        PartDefinition RightFoot = right_leg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(29, 56).addBox(-3.9F, 17.25F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offset(2.0F, -9.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
