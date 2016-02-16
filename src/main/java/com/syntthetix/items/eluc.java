package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class eluc extends ItemSword{

	public eluc(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("eluc");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}