package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class eSword extends ItemSword {

	public eSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("eSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
