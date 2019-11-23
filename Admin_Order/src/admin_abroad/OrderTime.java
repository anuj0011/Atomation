package admin_abroad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderTime {
	public WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.test-abroad.ubuy.com.kw/index.php/abroadadminmanager");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("pradeep.singh");
			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("!pradeep@singh654!");
			driver.findElement(By.xpath("//input[@title='Login']")).click();
			driver.navigate().to("http://www.test-abroad.ubuy.com.kw/index.php/abroadadminmanager/sales_order/index/key/9c5053b57f75f77066ed0189953a9d09/");
			
			
			for (int i=0; i>=0; i++)
			{
			String Total = driver.findElement(By.xpath("//td[contains(text(),'Page')]")).getText();
			String[] words= Total.split("Total");
			System.out.println(words[1]);
			
			
			WebDriverWait wait3 = new WebDriverWait(driver,10);
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/button[2]/span[1]/span[1]/span[1]"))).click();
			   

			String NewTotal = driver.findElement(By.xpath("//td[contains(text(),'Page')]")).getText();
			String[] Newwords = NewTotal.split("Total");
			System.out.println(Newwords[1]);
			
			try {
			if(words[1] == Newwords[1] )
			{
				driver.get("https://www.ubuy.co.in"); 
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.navigate().to("https://www.a.ubuy.com.kw");
				Keyboard keyboard=((RemoteWebDriver) driver).getKeyboard();
				keyboard.pressKey(Keys.ESCAPE);
				Thread.sleep(2000);
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
				driver.switchTo().window(Parent_Window);
				WebDriverWait wait1 = new WebDriverWait(driver , 20);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[5]/div[1]/div/div[2]/div/div[3]/div[1]/div/ul/li[1]/button"))).click();
				driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
				driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
				driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
				driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait2 = new WebDriverWait(driver, 20);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='s_method_dhlint_P']"))).click();
				driver.findElement(By.xpath(".//*[@id='shipping_method_save_button']")).click();
				WebDriverWait wait5 = new WebDriverWait(driver,20);
				wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_method_ccavenue\"]"))).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='payment_method_save_button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='place_order_button']")).click();
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CancelAction_id']"))).click();

			}
			}
			catch (NoSuchElementException e){
				
			}
	}
}
}
		
 