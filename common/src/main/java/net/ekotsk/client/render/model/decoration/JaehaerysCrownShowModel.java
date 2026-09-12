package net.ekotsk.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class JaehaerysCrownShowModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 18).addBox(-4.0F, -8.6F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.0F, -8.73F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone = hat.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.4F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.05F))
                .texOffs(32, 9).addBox(-4.0F, -6.65F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.2F))
                .texOffs(0, 19).addBox(-4.0F, -6.25F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.15F))
                .texOffs(0, 9).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.1F))
                .texOffs(32, 0).addBox(-4.0F, -7.7F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.2F))
                .texOffs(0, 9).addBox(-4.0F, -7.4F, -4.0F, 8.0F, 1.4F, 8.0F, new CubeDeformation(0.25F))
                .texOffs(4, 30).addBox(-0.75F, -7.25F, -4.5F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.15F))
                .texOffs(0, 30).addBox(-1.0F, -7.5F, -4.115F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.15F))
                .texOffs(10, 30).addBox(-1.0F, -7.5F, -4.325F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(14, 30).addBox(-1.1F, -9.0F, -3.915F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(10, 30).addBox(-1.1F, -8.8F, 4.11F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(18, 31).addBox(-0.5F, -6.05F, -4.326F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.15F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 30).addBox(-0.9F, -0.8F, -2.89F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -8.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 30).addBox(-0.9F, -0.8F, -2.91F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
