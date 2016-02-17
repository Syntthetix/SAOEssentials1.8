package com.syntthetix.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.syntthetix.items.SAOItems;
import com.syntthetix.lib.RefStrings;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENT_PROXY_CLASS, serverSide = RefStrings.SERVER_PROXY_CLASS)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		SAOItems.mainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}