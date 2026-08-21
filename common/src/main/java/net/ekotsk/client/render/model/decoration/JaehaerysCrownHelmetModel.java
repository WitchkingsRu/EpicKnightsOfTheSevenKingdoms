package net.ekotsk.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class JaehaerysCrownHelmetModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(21, 25).addBox(2.25F, -5.5F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(26, 25).addBox(-4.25F, -5.5F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(11, 25).addBox(4.75F, -5.5F, -5.725F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(6, 25).addBox(-1.0F, -5.5F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(36, 25).addBox(-5.75F, -5.5F, -5.725F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(1.75F, -6.0F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).mirror().addBox(-4.75F, -6.0F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(1, 25).mirror().addBox(-5.6F, -6.0F, -5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(1, 25).addBox(3.6F, -6.0F, -5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-1.5F, -6.0F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.5F, -5.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 25).addBox(-1.0F, -1.0F, 5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-1.5F, -1.5F, 5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(16, 25).addBox(-1.0F, -1.0F, -5.725F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-1.5F, -1.5F, -5.525F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 25).addBox(-4.0F, -1.0F, 5.725F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(12, 25).addBox(-4.0F, -1.0F, -5.725F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -1.75F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(-4.5F, -1.5F, 5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.074F, -4.5F, -1.025F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 25).mirror().addBox(-4.5F, -1.5F, -5.525F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.075F, -4.5F, -1.025F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
