package net.ekotsk.client.render;

import net.ekotsk.ASOIAFMod;
import net.ekotsk.entity.WeirwoodArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.Arrow;

@Environment(EnvType.CLIENT)
public class WeirwoodArrowRender extends ArrowRenderer<WeirwoodArrowEntity> {
    public static final ResourceLocation NORMAL_ARROW_LOCATION = ResourceLocation.fromNamespaceAndPath(ASOIAFMod.MOD_ID, "textures/entity/projectiles/weirwood_arrow.png");
    public static final ResourceLocation TIPPED_ARROW_LOCATION = ResourceLocation.fromNamespaceAndPath(ASOIAFMod.MOD_ID, "textures/entity/projectiles/weirwood_arrow.png");

    public WeirwoodArrowRender(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(WeirwoodArrowEntity entity) {
        return entity.getColor() > 0 ? TIPPED_ARROW_LOCATION : NORMAL_ARROW_LOCATION;
    }

}

