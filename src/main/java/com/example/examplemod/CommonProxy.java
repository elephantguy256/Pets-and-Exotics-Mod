package com.example.examplemod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {


            ModEntities.init();

        }

		public void registerRenders() {
			// TODO Auto-generated method stub
			
		}

		public void init(FMLInitializationEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void postInit(FMLPostInitializationEvent e) {
			// TODO Auto-generated method stub
			
		}
    }