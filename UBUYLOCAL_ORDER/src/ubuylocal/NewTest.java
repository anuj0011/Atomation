package ubuylocal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void Search() {
	  
	  driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("samsung");
		System.out.println("Line 2");
		driver.findElement(By.xpath(".//*[@id='search_go']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/* to wait until the element is found
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(".//*[@id='mainDiv']/div/div/ul/li[1]/a"))).click(); */
		
		driver.findElement(By.xpath(".//*[@id='mainDiv']/div/div/ul/li[1]/a")).click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath(".//*[@id='product-vendors-table']/tbody/tr/td/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.ubuy.co.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
