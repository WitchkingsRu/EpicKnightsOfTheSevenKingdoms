package net.ekotsk.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.ekotsk.ASOIAFMod;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class QohorySmelteryScreen extends AbstractContainerScreen<QohorySmelteryMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ASOIAFMod.MOD_ID, "textures/gui/qohory_smeltery.png");
    public QohorySmelteryScreen(QohorySmelteryMenu abstractContainerMenu, Inventory inventory, Component component) {
        super(abstractContainerMenu, inventory, component);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float f, int i, int j) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
        renderProgressArrow(guiGraphics, x, y);
        renderBurningFlame(guiGraphics, x, y);
    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 53, y + 35, 176, 0, 22, menu.getScaledProgress());
        }
    }
    private void renderBurningFlame(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isBurning()) {
            int flameHeight = 14;
            int burnProgress = menu.getScaledBurnProgress();

            int fireX = x + 95;
            int fireY = y + 36;

            int textureFireU = 198;
            int textureFireV = 0;

            int yOffset = flameHeight - burnProgress;

            guiGraphics.blit(
                    TEXTURE,
                    fireX,
                    fireY + yOffset,       // Сдвигаем Y на экране
                    textureFireU,
                    textureFireV + yOffset, // Сдвигаем V на текстуре (берем нижние пиксели)
                    14,                    // Ширина значка огня
                    burnProgress           // Высота, которую нужно отрисовать
            );
        }
    }
    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
