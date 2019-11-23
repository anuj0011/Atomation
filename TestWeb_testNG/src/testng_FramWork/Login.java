package testng_FramWork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Login {
	
	public WebDriver driver;
  @Test
  public void Search() {
	  driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("samsung");
		System.out.println("Line 2");
		driver.findElement(By.xpath(".//*[@id='search_go']")).click();
  }
  public void detail()
  {
	  
	  driver.findElement(By.xpath(".//*[@id='mainDiv']/div/div/ul/li[1]/a")).click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='product-vendors-table']/tbody/tr/td/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver =  new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.a.ubuy.com.kw");
  }

  @AfterTest
  public void afterTest() {
  }

}
