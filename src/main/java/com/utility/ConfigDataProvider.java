package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro;
	
	public ConfigDataProvider () throws Exception {
	//	String filepath = "C:\\Users\\30007473\\eclipse-workspace\\C_HSBC_Insurance\\Config\\config.properties";
		
		String path=System.getProperty("user.dir")+"\\Config\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		
		pro = new Properties();
		pro.load(fis);
	}
	
	public String gfp_Url() {
		return pro.getProperty("gfp_Url");
	}
	
	public String ytp_Url() {
		return pro.getProperty("ytp_Url");
	}


}