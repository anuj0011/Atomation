package com.ubuy.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ubuy.utilities.Readconfig;

public class BaseClass {
	
	/**
	 * @author ${Shailendra}
	 *
	 * 
	 */
	
	
	Readconfig readconfig = new Readconfig();
	
	public String baseurl =readconfig.getApplicationURL();
	public String username=readconfig.getUSername();
	public String password=readconfig.getpassword();
	
	public static WebDriver driver;
	public static Logger log ;
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	
	{
		
		log = Logger.getLogger("ubuy");
		 PropertyConfigurator.configure("log4j.properties");
		 
		if(br.equals("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		}
		
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			 
			 driver = new FirefoxDriver();
			
		}
		
		driver.get(baseurl);
		 
		 
		
	}
	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	}

}
