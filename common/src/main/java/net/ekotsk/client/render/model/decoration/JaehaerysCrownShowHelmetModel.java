package net.ekotsk.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class JaehaerysCrownShowHelmetModel {
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

        PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 11).addBox(-1.0F, -5.5F, -5.925F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(46, 11).addBox(-1.0F, -5.5F, -5.325F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.5F))
                .texOffs(47, 12).addBox(-0.5F, -3.7F, -5.324F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.5F))
                .texOffs(54, 11).addBox(-1.0F, -5.5F, -5.125F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.65F))
                .texOffs(0, 0).addBox(-5.5F, -5.5F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.1F))
                .texOffs(0, 52).addBox(-5.5F, -6.0F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 52).addBox(-5.5F, -4.0F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 13).addBox(-5.5F, -3.6F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 0).addBox(-5.5F, -6.35F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(-0.05F))
                .texOffs(0, 25).addBox(-5.5F, -7.0F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(-0.06F))
                .texOffs(0, 37).addBox(-5.5F, -7.3F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(-0.09F))
                .texOffs(0, 25).addBox(-5.5F, -7.5F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(-0.11F))
                .texOffs(46, 11).addBox(-1.1F, -7.9F, -5.515F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(46, 11).addBox(-1.1F, -7.7F, 5.415F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 11).addBox(-1.1F, -0.7F, -2.585F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -7.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 11).addBox(-1.1F, -0.7F, -2.415F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
