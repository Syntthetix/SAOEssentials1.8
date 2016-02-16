package com.syntthetix.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.items.SwordsItems;

public class CraftingManager {
	
	public static void addCraftingRec() {
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.eluc, 1), new Object[] {
			 " O ",
			 "OO ",
			 " S ",
			 'O', Blocks.obsidian,
			 'S', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.darkRep), new Object[] {
			" E ",
			"EDE",
			" S ",
			'S', Items.stick,
			'E', Items.emerald,
			'D', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.mSword), new Object[] {
			" M ",
			"MGM",
			" S ",
			'S', Items.stick,
			'G', Items.gold_ingot,
			'M', SwordsItems.mCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.eSword), new Object[] {
			"L L",
			"L L",
			"LIL",
			'I', Items.iron_ingot,
			'L', SwordsItems.lCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.saber), new Object[] {
			" L ",
			" L ",
			" O ",
			'O', Blocks.obsidian,
			'L', SwordsItems.lCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.lCrystal), new Object[] {
			"GGG",
			"GRG",
			"GGG",
			'G', Blocks.glass,
			'R', Items.redstone
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.mCrystal), new Object[] {
			" C ",
			"ICI",
			"GGG",
			'G', Items.gold_ingot,
			'I', Items.iron_ingot,
			'C', Blocks.coal_block
		});
	}
}