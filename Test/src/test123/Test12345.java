package test123;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12345 {

	public static void main(String[] args)throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		  
		// Set the notification setting it will override the default setting
		//  prefs.put("profile.default_content_setting_values.notifications", 2);
		  
		// Create object of ChromeOption class
		//  ChromeOptions options = new ChromeOptions();
		  
		// Set the experimental option
		//  options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ubuy.co.in");
		driver.findElement(By.xpath("//input[@autofocus='autofocu"));
		
	}

}
