package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class liberator extends ItemSword {

	public liberator(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("lib");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
