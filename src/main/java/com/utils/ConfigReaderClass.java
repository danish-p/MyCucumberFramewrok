package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderClass {

	private Properties prop;
	
	public Properties readConfigFile(){
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("G:\\DanishTesting\\CocumberMavenProject\\MyCucumberFramewrok\\com.resources\\config\\Config.properties");
			prop.load(fis);
			System.out.println("Config Read Successfully!!!!!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
}
