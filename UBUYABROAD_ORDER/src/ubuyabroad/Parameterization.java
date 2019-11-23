package ubuyabroad;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Parameterization {
	public WebDriver driver;
	public void textbox(String locater, String value)
	{
		driver.findElement(By.xpath(locater)).sendKeys(value);
	}
	public void linkbtn(String loacter)
	{
		driver.findElement(By.xpath(loacter));
	}
  @Test
  public void Search() {
	  textbox(".//*[@type='text']", "laptop");
	  linkbtn("");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.a.ubuy.com.kw/en/");
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
