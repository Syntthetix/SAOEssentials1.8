package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class guiltyThorn extends ItemSword {

	public guiltyThorn(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("thorn");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
