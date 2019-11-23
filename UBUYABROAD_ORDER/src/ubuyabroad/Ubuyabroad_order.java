package ubuyabroad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ubuyabroad_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch firefox
					 
					 System.setProperty("webdriver.gecko.driver","D:\\Lib\\geckodriver.exe");
					 WebDriver driver = new FirefoxDriver();
					// launch url
		/*System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		// Create object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver();*/
		
					driver.get("https://www.a.ubuy.com.kw");
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					System.out.println("Line 1"); // to print the line no. to check 
					driver.findElement(By.name("q")).sendKeys("laptop");
					System.out.println("Line 2");
					driver.findElement(By.xpath(".//*[@type='submit']")).click();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					
					/* to wait until the element is found
					WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(".//*[@id='mainDiv']/div/div/ul/li[1]/a"))).click(); */
					
					driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[3]/div[2]/div[1]/div")).click(); 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
					driver.findElement(By.xpath(".//*[@id='add-to-cart-btn']")).click();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
					String Parent_Window = driver.getWindowHandle();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

					for (String Child_Window : driver.getWindowHandles())  
					{  
					driver.switchTo().window(Child_Window); 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'view-cart-and-checkout')]"))).click();
					}
					 
					driver.switchTo().window(Parent_Window);
					WebDriverWait wait2 = new WebDriverWait(driver,10);
					wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[5]/div[1]/div/div[2]/div/div[3]/div[1]/div/ul/li[1]"))).click();		 
					driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
					driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
					driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
					driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
					
					/* String Parent_win = driver.getWindowHandle();
					
					for (String Child_win : driver.getWindowHandles())
					{
					 driver.switchTo().window(Child_win);
					 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 driver.findElement(By.xpath(".//*[@id='billing_save_confirm']")).click();
				 	}
					
					driver.switchTo().window(Parent_win); */
					
					
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					WebDriverWait wait3 = new WebDriverWait(driver , 10);
					wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_method_dhlint_P' and @name='shipping_method']"))).click();
					// driver.findElement(By.xpath("")).click();  // .//*[@id='s_method_aramex_aramex']
					driver.findElement(By.xpath(".//*[@id='shipping_method_save_button']")).click();
					
					// BELOW CODE IS FOR KUWAIT KNET CHECKOUT
					 
					 
					WebDriverWait wait1 = new WebDriverWait(driver,30);
					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_method_ccavenue\"]"))).click();
					 
					driver.findElement(By.xpath("//button[@id='payment_method_save_button']")).click();
					driver.findElement(By.xpath("//button[@id='place_order_button']")).click();
					 
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 
					WebDriverWait wait = new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CancelAction_id']"))).click();
					 
					// BELOW CODE IS FOR INDIA CC AVENUE CHECKOUT
					 
					/* driver.findElement(By.xpath(".//*[@id='p_method_ccavenuepay']")).click();
					driver.findElement(By.xpath(".//*[@id='payment_method_save_button']")).click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					driver.findElement(By.xpath(".//*[@id='place_order_button']")).click();
					// To cancel order on knet payment page
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='buttons']/a[3]/span"))).click();
					// to move from parent to child window
						
					String Parent_Window1 = driver.getWindowHandle();    

						for (String Child_Window1 : driver.getWindowHandles())  
					 {  
					 	driver.switchTo().window(Child_Window1); 
					 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					// action on child window
						 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						 driver.findElement(By.xpath(".//*[@id='buttons']/span/a[1]/span")).click();
						 }
					//Switching back to Parent Window  
						 driver.switchTo().window(Parent_Window1); */

	}

}
