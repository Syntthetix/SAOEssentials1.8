package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class lambentLight extends ItemSword {

	public lambentLight(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("light");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
