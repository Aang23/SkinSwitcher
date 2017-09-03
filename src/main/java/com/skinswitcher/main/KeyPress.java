package com.skinswitcher.main;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyPress {
private KeyBinding stats = new KeyBinding("Switch", Keyboard.KEY_U, "SkinSwitcher");

public KeyPress() {
	ClientRegistry.registerKeyBinding(stats);
}

@SubscribeEvent
public void KeyInputEvent(KeyInputEvent event) {
	if(Main.timeout == 0 && GameSettings.isKeyDown(stats)) {
		Main.timeout = 10;
	    if(SkinWorker.enabled)SkinWorker.disable(); else SkinWorker.enable();
	}
}
}
