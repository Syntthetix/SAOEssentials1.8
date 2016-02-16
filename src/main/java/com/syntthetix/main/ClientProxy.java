package com.syntthetix.main;

import com.syntthetix.items.SwordsItems;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		SwordsItems.registerRenders();
	}
	
}