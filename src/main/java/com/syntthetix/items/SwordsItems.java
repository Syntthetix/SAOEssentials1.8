package com.syntthetix.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.lib.RefStrings;

public class SwordsItems {
	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("Obsidian", 0, 1800, 2, 9.5f, 10);
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("Emerald", 0, 1500, 2, 8, 10);
	public static ToolMaterial lsCrystal = EnumHelper.addToolMaterial("Laser Crystal", 0, 2000, 2, 7.5f, 10);
	public static ToolMaterial mOCrystal = EnumHelper.addToolMaterial("Master Ore Crystal", 0, 2200, 2, 9, 10);
	
	public static Item eluc;
	public static Item darkRep;
	public static Item mSword;
	public static Item eSword;
	public static Item saber;
	public static Item lCrystal;
	public static Item mCrystal;
	
	public static void initializeItem() {
		eluc = new eluc(obsidian);
		darkRep = new darkRep(emerald);
		mSword = new mSword(mOCrystal);
		eSword = new eSword(lsCrystal);
		saber = new saber(lsCrystal);
		lCrystal = new Item().setUnlocalizedName("lCrystal").setCreativeTab(CreativeTabs.tabMaterials);
		mCrystal = new Item().setUnlocalizedName("mCrystal").setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(eluc, eluc.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(darkRep, darkRep.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mSword, mSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eSword, eSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(saber, saber.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lCrystal, lCrystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mCrystal, mCrystal.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(eluc);
		registerRender(darkRep);
		registerRender(mSword);
		registerRender(eSword);
		registerRender(saber);
		registerRender(lCrystal);
		registerRender(mCrystal);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
	
}
