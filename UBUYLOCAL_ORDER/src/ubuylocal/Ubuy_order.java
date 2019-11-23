package ubuylocal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ubuy_order {
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   // launch firefox
			System.setProperty("webdriver.gecko.driver","D:\\Lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			// launch url
			driver.get("https://www.ubuy.com.kw");
			driver.manage().window().maximize();
			driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("iQOS USB Cable");
			driver.findElement(By.xpath(".//*[@class='result algolia-clearfix goos-algolia-product']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='instant-search-results-container']/div/div/div/div/a")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='product_vendors_1_in_stock']/button")).click();
			
			//to move from parent to child window
			
			 String Parent_Window = driver.getWindowHandle();

			 for (String Child_Window : driver.getWindowHandles())
			 {  
			 driver.switchTo().window(Child_Window);
			 
			// action on child window
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 WebDriverWait wait5 = new WebDriverWait(driver , 10);
			 wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='view-cart-and-checkout']"))).click();
			 // driver.findElement(By.xpath("html/body/div[7]/div/div/a[2]")).click();
			 }
			//Switching back to Parent Window
			 driver.switchTo().window(Parent_Window);
			 
			 driver.findElement(By.xpath("//div[@class='totals']//ul[@class='checkout-types']//li//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]")).click();
			 driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
			 driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
			 WebDriverWait wait4 = new WebDriverWait(driver , 10);
			 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Login')]"))).click();
			 
			 //driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
			 
			 // WebDriverWait wait1 = new WebDriverWait(driver, 10);
			 // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='login-form']/div/button"))).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='billing-buttons-container']/button")).click();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 driver.findElement(By.xpath(".//*[@id='shipping-method-buttons-container']/button[1]")).click();
			 driver.findElement(By.xpath(".//*[@id='p_method_ccavenue']")).click();
			 driver.findElement(By.xpath(".//*[@id='payment-buttons-container']/button[1]")).click();
			 driver.findElement(By.xpath(".//*[@id='review-buttons-container']/button[1]")).click();
			// To cancel order on knet payment page
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CancelAction_id']"))).click();

	}

}
