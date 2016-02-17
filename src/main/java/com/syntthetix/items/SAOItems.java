package com.syntthetix.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.syntthetix.lib.RefStrings;

public class SAOItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 0, 1800, 2, 8, 10);
	
	public static Item elucidator;
	public static Item darkRepulser;
	public static Item karakurenai;
	public static Item guiltyThorn;
	
	public static void initializeItem() {
		elucidator = new elucidator(obsidian);
	}
	
	public static void registerItem() {
		
	}
	
	public static void registerRenders() {
		
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
	
}
