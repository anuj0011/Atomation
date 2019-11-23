package Windows;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows_Notification {
	public static void main(String[] args) throws InterruptedException {
		
	

	// public void test () throws Exception {
		// Create object of HashMap Class
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  
		// Set the notification setting it will override the default setting
		  prefs.put("profile.default_content_setting_values.notifications", 2);
		  
		// Create object of ChromeOption class
		  ChromeOptions options = new ChromeOptions();
		  
		// Set the experimental option
		  options.setExperimentalOption("prefs", prefs);
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =  new ChromeDriver(options);
			
			driver.get("https://www.a.ubuy.com.kw");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			Keyboard keyboard=((RemoteWebDriver) driver).getKeyboard();
			keyboard.pressKey(Keys.ESCAPE);
			Thread.sleep(2000);
		
			// robot class
		/*	Robot robot = new Robot();       
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER); */
			
			
			
			
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("iphone");
			driver.findElement(By.xpath("//DIV[@id='search_go']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class,'buynow')]")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String Parent_Window = driver.getWindowHandle();
			for (String Child_Window : driver.getWindowHandles())
			{		
			driver.switchTo().window(Child_Window);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(.,'View Cart & Checkout')]")).click();
			}
			
			driver.switchTo().window(Parent_Window);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/div[1]/div/ul/li[1]/button")).click();
			driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
			driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
			
			driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
			driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='s_method_dhlint_P']")).click();
			driver.findElement(By.xpath(".//*[@id='shipping_method_save_button']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='p_method_ccavenue']")).click();
			driver.findElement(By.xpath(".//*[@id='payment_method_save_button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='place_order_button']")).click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CancelAction_id']"))).click();
			
	}
	}


