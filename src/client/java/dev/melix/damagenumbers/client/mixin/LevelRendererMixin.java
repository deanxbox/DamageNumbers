package dev.melix.damagenumbers.client.mixin;

import dev.melix.damagenumbers.client.render.WorldRenderHook;
import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Provides the missing world render hook for Minecraft 1.21.9. */
@Mixin(LevelRenderer.class)
abstract class LevelRendererMixin {
    @Inject(method = "renderLevel", at = @At("TAIL"), require = 0)
    private void damageNumbers$afterRenderLevel(CallbackInfo callbackInfo) {
        WorldRenderHook.renderFromMixin();
    }
}
