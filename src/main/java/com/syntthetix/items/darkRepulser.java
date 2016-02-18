package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class darkRepulser extends ItemSword {

	public darkRepulser(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("darkRep");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
