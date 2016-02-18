package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class photonSword extends ItemSword {

	public photonSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("pSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
