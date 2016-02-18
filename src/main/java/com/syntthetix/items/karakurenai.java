package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class karakurenai extends ItemSword {

	public karakurenai(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("kara");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
