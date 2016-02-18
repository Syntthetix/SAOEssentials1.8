package com.syntthetix.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.lib.RefStrings;

public class SAOItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 0, 1800, 2, 7f, 10);
	public static ToolMaterial dragOre = EnumHelper.addToolMaterial("Dragon Ore", 0, 2000, 2, 8, 10);
	public static ToolMaterial rSteel = EnumHelper.addToolMaterial("Red Steel", 0, 1450, 2, 5.25f, 10);
	public static ToolMaterial pSteel = EnumHelper.addToolMaterial("Purified Steel", 0, 1750, 2, 6.5f, 10);
	public static ToolMaterial steel = EnumHelper.addToolMaterial("Steel", 0, 1425, 2, 5.15f, 10); 
	public static ToolMaterial pOrb = EnumHelper.addToolMaterial("Photon Orb", 0, 3000, 2, 7, 10); 
	
	public static Item elucidator;
	public static Item darkRepulser;
	public static Item karakurenai;
	public static Item guiltyThorn;
	public static Item lambentLight;
	public static Item liberator;
	public static Item photonSword;
	
	public static Item dragonOre;
	public static Item redSteel;
	public static Item pureSteel;
	public static Item dSteel;
	public static Item phoOrb;
	
	public static void initializeItem() {
		elucidator = new elucidator(obsidian);
		darkRepulser = new darkRepulser(dragOre);
		karakurenai = new karakurenai(steel);
		guiltyThorn = new guiltyThorn(rSteel);
		lambentLight = new lambentLight(pSteel);
		liberator = new liberator(pSteel);
		photonSword = new photonSword(pOrb);
		
		dragonOre = new Item().setUnlocalizedName("dragon").setCreativeTab(CreativeTabs.tabMaterials);
		redSteel = new Item().setUnlocalizedName("rSteel").setCreativeTab(CreativeTabs.tabMaterials);
		pureSteel = new Item().setUnlocalizedName("pSteel").setCreativeTab(CreativeTabs.tabMaterials);
		dSteel = new Item().setUnlocalizedName("steel").setCreativeTab(CreativeTabs.tabMaterials);
		phoOrb = new Item().setUnlocalizedName("pOrb").setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(elucidator, elucidator.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(darkRepulser, darkRepulser.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(karakurenai, karakurenai.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(guiltyThorn, guiltyThorn.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lambentLight, lambentLight.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(liberator, liberator.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(photonSword, photonSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(dragonOre, dragonOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redSteel, redSteel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pureSteel, pureSteel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dSteel, dSteel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(phoOrb, phoOrb.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(elucidator);
		registerRender(darkRepulser);
		registerRender(karakurenai);
		registerRender(guiltyThorn);
		registerRender(lambentLight);
		registerRender(liberator);
		registerRender(photonSword);
		
		registerRender(dragonOre);
		registerRender(redSteel);
		registerRender(pureSteel);
		registerRender(dSteel);
		registerRender(phoOrb);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
