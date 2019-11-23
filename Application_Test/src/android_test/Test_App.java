/* package android_test;
 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class Test_App {
 
		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "D:\\eclipse-workspace\\Application_Test\\src\\android_test\\Test_App.java");
			File app = new File(appDir, "D:\\Android_APK\\UBuy-release_11_12_2018_1.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
			capabilities.setCapability("deviceName", "ddc376c1");
			capabilities.setCapability("platformVersion", "8.0.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.ubuy");
			capabilities.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
 
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.quit();
 
	}
 
} */




package android_test;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
 public class Test_App {
 
 private static AndroidDriver driver;
 public static void main(String[] args) throws InterruptedException, AWTException, IOException {
 
 File classpathRoot = new File(System.getProperty("user.dir"));
 File appDir = new File(classpathRoot, "D:\\Appium\\UBuy-release_26_2_2019_1.apk");
 File app = new File(appDir, "D:\\Appium\\UBuy-release_26_2_2019_1.apk");
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
 capabilities.setCapability("deviceName", "554c50d2");
 capabilities.setCapability("platformVersion", "9");
 capabilities.setCapability("platformName", "Android");
 // capabilities.setCapability("appPackage", "com.ubuy");
 // capabilities.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
 
 URL url = new URL("http://127.0.0.1:4723/wd/hub");
 
 WebDriver driver = new AndroidDriver<>(url, capabilities);
 
 // To Handle Notification
 // capabilities.setCapability("autoAcceptAlerts", true);
 // capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
 
/* WebDriverWait wait3 = new WebDriverWait(driver, 20);
 wait3.until(ExpectedConditions.alertIsPresent());
 Alert alert = driver.switchTo().alert();
 alert.accept(); */
/*  Thread.sleep(8000);
 Robot robot = new Robot();
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 
 
/* capabilities.setCapability("app", app.getAbsolutePath());
 capabilities.setCapability("appPackage", "ubuy");
 capabilities.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
 Thread.sleep(10000);
 driver.quit(); */
 
 FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\CybersourceCountries.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheetAt(0); 
	
	for(int i =0; i<=sheet.getLastRowNum(); i++ )
	{
		String url1 = sheet.getRow(i).getCell(0).getStringCellValue();
		driver.get(url1);
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("pen");
		driver.findElement(By.xpath("//form[@id='search-form']//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@class='section search-content']/div[@class='container-fluid']/div[@class='row']/div[@id='usstore-product-block-section']/div[@id='store']/div[@id='usstore-products']/div[1]")).click();
		//driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-btn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String Parent_Window = driver.getWindowHandle();
				for(String Child_Window : driver.getWindowHandles())
				{
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@class='view-cart-and-checkout']")).click();
					/*Screen screen = new Screen();
					Pattern image = new Pattern("D:\\sikuli_image\\Screenshot_1.png");
					Thread.sleep(3000);
					screen.click(image);	*/
				}
				driver.switchTo().window(Parent_Window);
				
					driver.findElement(By.xpath("//div[@class='totals']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
					/*Screen screen2 = new Screen();
					Pattern image2 = new Pattern("D:\\sikuli_image\\Screenshot_2.png");
					Thread.sleep(3000);
					screen2.click(image2);*/
					
		driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
		driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='s_method_aramex_aramex']"))).click();

		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//button[@type='button'][contains(text(),'Continue')]")).click();

		//WebDriverWait wait5 = new WebDriverWait(driver,20);
		//wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Visa/Mastercard')]"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Visa/Mastercard')]")).click();
		
		Select Select1 = new Select(driver.findElement(By.id("cybersecure_cc_type")));
		Select1.selectByVisibleText("Visa");

		driver.findElement(By.xpath("//input[@id='cybersecure_cc_number']")).sendKeys("4377486577038084");

		Select Select2 = new Select(driver.findElement(By.id("cybersecure_expiration")));
		Select2.selectByVisibleText("02 - February");
		Select Select3 = new Select(driver.findElement(By.id("cybersecure_expiration_yr")));
		Select3.selectByVisibleText("2022");
		
		driver.findElement(By.xpath("//input[@id='cybersecure_cc_cid']")).sendKeys("562");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='payment-buttons-container']//button[@type='button'][contains(text(),'Continue')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		Thread.sleep(2000);
		
		
		  }
				
}

 
 
 } 
 
 