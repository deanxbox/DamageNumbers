package dev.melix.damagenumbers.client.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractSliderButton;
import net.minecraft.network.chat.Component;

import java.util.function.DoubleConsumer;

final class FlatAngleSlider extends AbstractSliderButton {
    private final DoubleConsumer callback;

    FlatAngleSlider(int x, int y, int width, int height, float angle, DoubleConsumer callback) {
        super(x, y, width, height, Component.empty(), angle / 360.0D);
        this.callback = callback;
        updateMessage();
    }

    @Override
    protected void updateMessage() {
        setMessage(Component.literal(Math.round(value * 360.0D) + "\u00B0"));
    }

    @Override
    protected void applyValue() {
        updateMessage();
        callback.accept(value * 360.0D);
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        int middle = getY() + getHeight() / 2;
        graphics.fill(getX(), middle - 1, getX() + getWidth(), middle + 1, 0xFF343A44);
        int handleX = getX() + (int) Math.round(value * (getWidth() - 6));
        graphics.fill(handleX, getY(), handleX + 6, getY() + getHeight(),
                isHoveredOrFocused() ? 0xFF78B7FF : 0xFF58A6FF);
    }
}
