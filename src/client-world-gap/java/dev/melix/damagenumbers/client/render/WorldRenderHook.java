package dev.melix.damagenumbers.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;

/** World render bridge for Minecraft 1.21.9, whose Fabric API has no world events. */
public final class WorldRenderHook {
    private static DamageNumberManager manager;

    private WorldRenderHook() {
    }

    public static void register(DamageNumberManager damageNumberManager) {
        manager = damageNumberManager;
    }

    public static void renderFromMixin() {
        Minecraft client = Minecraft.getInstance();
        if (manager != null && client.level != null) {
            manager.render(new PoseStack(), client.gameRenderer.getMainCamera());
        }
    }
}
