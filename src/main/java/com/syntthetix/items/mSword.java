package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class mSword extends ItemSword {

	public mSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("mSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
