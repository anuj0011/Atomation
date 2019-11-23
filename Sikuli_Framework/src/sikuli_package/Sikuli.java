package sikuli_package;

/* This script will perform following activity
1-       Launch any browser and navigate to google.com (using Selenium)
2-      Click on Gmail button (using Selenium)
3-      On Gmail enter email, password and will click on login button (using Sikuli code) */


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class Sikuli {
  @Test
  public void test() throws FindFailed {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	  driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]")).click();
	  
	  Screen screen = new Screen();
	  
	  Pattern image4 = new Pattern("D:\\sikuli_image\\image4.PNG");
	  Pattern image5 = new Pattern("D:\\sikuli_image\\image5.PNG");
	  Pattern image6 = new Pattern("D:\\sikuli_image\\image6.PNG");
	  Pattern image7 = new Pattern("D:\\sikuli_image\\image7.PNG");
	  Pattern image8 = new Pattern("D:\\sikuli_image\\image8.PNG");
	 // screen.wait(image4 , 10);
	  
	  
	  screen.click(image5);
	  screen.type(image7,"testify.test1991@gmail.com");
	  screen.click(image5);
	  screen.type(image6,"1234567890");
	  screen.click(image5);
	  screen.click(image8);
  } 
}