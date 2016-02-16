package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class saber extends ItemSword {

	public saber(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("saber");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
