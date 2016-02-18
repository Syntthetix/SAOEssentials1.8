package com.syntthetix.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.items.SAOItems;

public class CraftingManager {
	
	public static void mainRegistry() {
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec() {
		//All the sword crafting recipes:
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.elucidator, 1), new Object[] {
			 " O ",
			 "OOS",
			 " S ",
			 'O', Blocks.obsidian,
			 'S', SAOItems.dSteel,
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.darkRepulser, 1), new Object[] {
			" D ",
			"DED",
			" S ",
			'D', SAOItems.dragonOre,
			'E', Items.emerald,
			'S', SAOItems.dSteel,
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.karakurenai, 1), new Object[] {
			"  S",
			" SS",
			"II ",
			'S', SAOItems.dSteel,
			'I', Items.iron_ingot
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.guiltyThorn, 1), new Object[] {
			" R ",
			"RRR",
			" S ",
			'R', SAOItems.redSteel,
			'S', SAOItems.dSteel
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.lambentLight, 1), new Object[] {
			" P ",
			" PP",
			" S ",
			'P', SAOItems.pureSteel,
			'S', SAOItems.dSteel
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.liberator, 1), new Object[] {
			"PPP",
			"PPP",
			" S ",
			'P', SAOItems.pureSteel,
			'S', SAOItems.dSteel
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.photonSword, 1), new Object[] {
			" O ",
			" O ",
			"RIR",
			'O', SAOItems.phoOrb,
			'R', Items.redstone,
			'I', Items.iron_ingot
		});
		
		//All the item crafting recipes:
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.dragonOre, 1), new Object[] {
			"III",
			"EPE",
			"III",
			'I', Items.iron_ingot,
			'E', Items.emerald,
			'P', SAOItems.pureSteel
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.redSteel, 1), new Object[] {
			"RRR",
			"RSR",
			"RRR",
			'R', Items.redstone,
			'S', SAOItems.redSteel
		});
		GameRegistry.addRecipe(new ItemStack(SAOItems.dSteel, 1), new Object[] {
			"II",
			"II",
			'I', Items.iron_ingot
		});
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.phoOrb, 1), new Object[] {
			"GPG",
			"RRR",
			"GPG",
			'R', Items.redstone,
			'G', Blocks.glass,
			'P', new ItemStack(Items.dye,1,5)
		});
	}
		
		public static void addSmeltingRec() {
		//All the item smelting recipes:
		GameRegistry.addSmelting(SAOItems.dSteel, new ItemStack(SAOItems.pureSteel), 1.0F);
	}
}