package com.syntthetix.main;

import com.syntthetix.items.SAOItems;

public class ClientProxy extends ServerProxy{

	@Override
	public void registerRenders() {
		SAOItems.registerRenders();
	}
}	