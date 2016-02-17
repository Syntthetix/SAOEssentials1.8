package com.syntthetix.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class elucidator extends ItemSword {

	public elucidator(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("eluc");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
