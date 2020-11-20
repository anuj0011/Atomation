package com.ubuy.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	// Create a constructer
	
	public Readconfig()
	
	{
		File src = new File ("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	
	{
		String url = pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getUSername()
	
	{
		
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	
	{
		
		String chromepath= pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath()
	{
		
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
