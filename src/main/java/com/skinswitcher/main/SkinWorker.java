package com.skinswitcher.main;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class SkinWorker {
	public static boolean enabled = false;
public static void enable() {
	Minecraft.getMinecraft().thePlayer.addChatMessage(new TextComponentString(TextFormatting.GREEN + "Second skin layer enabled."));
	enabled = true;
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.LEFT_SLEEVE, true);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.RIGHT_SLEEVE, true);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.LEFT_PANTS_LEG, true);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.RIGHT_PANTS_LEG, true);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.JACKET, true);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.HAT, true);
}
public static void disable() {
	Minecraft.getMinecraft().thePlayer.addChatMessage(new TextComponentString(TextFormatting.GREEN + "Second skin layer disabled."));
	enabled = false;
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.LEFT_SLEEVE, false);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.RIGHT_SLEEVE, false);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.LEFT_PANTS_LEG, false);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.RIGHT_PANTS_LEG, false);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.JACKET, false);
	Minecraft.getMinecraft().gameSettings.setModelPartEnabled(EnumPlayerModelParts.HAT, false);
}
}
