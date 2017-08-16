package com.example.examplemod;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {


        ModEntities.initModels();

    }
    
    
	public void registerRenders() {
		// TODO Auto-generated method stub
		
	}
}