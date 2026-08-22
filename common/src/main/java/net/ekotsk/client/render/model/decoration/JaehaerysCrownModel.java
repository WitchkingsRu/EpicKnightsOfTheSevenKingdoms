package net.ekotsk.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class JaehaerysCrownModel {
    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(4, 3).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(4, 15).addBox(-4.1F, -7.1F, -3.9F, 8.0F, 1.4F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(-4.5F, -7.5F, -4.325F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(1, 27).addBox(3.5F, -7.5F, -4.325F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(4, 27).addBox(-0.75F, -7.25F, -5.0F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(34, 27).addBox(-4.75F, -7.25F, -4.5F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(0, 27).addBox(-1.0F, -7.5F, -4.825F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(9, 27).mirror().addBox(3.75F, -7.25F, -4.5F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 27).mirror().addBox(-1.24F, -1.251F, -4.501F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(9.25F, -6.0F, -4.75F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 27).addBox(2.499F, -1.01F, -6.326F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.825F, -6.5F, -0.825F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -1.0F, -6.325F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(29, 27).addBox(-0.75F, -0.75F, -6.5F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.0F, -6.5F, 1.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 27).addBox(2.75F, -0.75F, -6.5F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(0, 27).addBox(2.5F, -1.0F, -6.225F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.0F, -6.5F, -2.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 27).addBox(-3.25F, -0.75F, -6.5F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(0, 27).addBox(-3.5F, -1.0F, -6.325F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -6.5F, -2.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 27).addBox(-2.499F, -1.01F, -5.326F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.825F, -6.5F, -1.825F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -1.0F, -5.325F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(14, 27).addBox(-0.75F, -0.75F, -5.5F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.0F, -6.5F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 27).addBox(0.24F, -1.251F, -3.501F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-8.25F, -6.0F, -4.75F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
