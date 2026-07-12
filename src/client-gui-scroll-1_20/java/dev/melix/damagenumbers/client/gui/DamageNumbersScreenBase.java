package dev.melix.damagenumbers.client.gui;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

abstract class DamageNumbersScreenBase extends Screen {
    protected DamageNumbersScreenBase(Component title) {
        super(title);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double delta) {
        return handleMouseScroll(mouseX, mouseY, 0.0D, delta) || super.mouseScrolled(mouseX, mouseY, delta);
    }

    protected abstract boolean handleMouseScroll(double mouseX, double mouseY, double horizontal, double vertical);
}
