package pom;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class pomdemo {


	@FindBy(xpath = "//input[@autofocus='autofocus']")
	@CacheLookup
	WebElement Searchbox;
	
	//By Searchbox=By.xpath("//input[@autofocus='autofocus']");

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.get("https://www.ubuy.co.in");

		Searchbox.sendKeys("laptop");
		//driver.findElement(Searchbox).sendKeys("iphone");

	}
}
