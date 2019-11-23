package seleniumTests;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCucumber {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ubuy.co.in");
driver.navigate().to("https://www.a.ubuy.com.kw");
		
		// robot class
	/*	Robot robot = new Robot();       
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER); */
		
		
		
		
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("iphone");
		driver.findElement(By.xpath("//form[@id='search-form']//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[3]/div[2]/div[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='add-to-cart-btn']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Parent_Window = driver.getWindowHandle();
		for (String Child_Window : driver.getWindowHandles())
		{		
		driver.switchTo().window(Child_Window);
		
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='view-cart-and-checkout']"))).click();
		}
		driver.switchTo().window(Parent_Window);   //button[(@class='button btn-proceed-checkout btn-checkout']
		
		WebDriverWait wait1 = new WebDriverWait(driver , 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='totals']//button[@title='Proceed to Checkout']"))).click();
		
		driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
		
		driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='s_method_aramex_aramex']"))).click();
		
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//button[@type='button'][contains(text(),'Continue')]")).click();
		
		WebDriverWait wait5 = new WebDriverWait(driver,20);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='p_method_ccavenue']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='payment-buttons-container']//button[@type='button'][contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='CancelAction_id']"))).click();

	}

}
