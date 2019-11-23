package abroad_chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Localknet {

	public static void main(String[] args) throws IOException, InterruptedException, FindFailed, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\CybersourceCountries.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i =0; i<=sheet.getLastRowNum(); i++ )
		{
			String url = sheet.getRow(i).getCell(0).getStringCellValue();
			driver.get(url);
			
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("pen");
			driver.findElement(By.xpath("//span[@id='algolia-glass']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='ais-hits']//div[1]//div[1]//div[1]//a[1]")).click();
			//driver.navigate().refresh();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='product_vendors_1_in_stock']//button[@class='button btn-cart button-add-cart']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String Parent_Window = driver.getWindowHandle();
					for(String Child_Window : driver.getWindowHandles())
					{
						Thread.sleep(5000);
						driver.findElement(By.xpath("//a[@class='view-cart-and-checkout']")).click();
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
						
			driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("00ubuy11");
			driver.findElement(By.xpath("//form[@id='login-form']//button[@class='button']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button']")).click();
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='del-options']//input[@name='default_delivery']"))).click();

			driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//button[@class='button']")).click();

			//WebDriverWait wait5 = new WebDriverWait(driver,20);
			//wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Visa/Mastercard')]"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='p_method_ccavenue']")).click();

			/* Select Select1 = new Select(driver.findElement(By.id("cybersecure_cc_type")));
			Select1.selectByVisibleText("Visa");

			driver.findElement(By.xpath("//input[@id='cybersecure_cc_number']")).sendKeys("4377486577038084");

			Select Select2 = new Select(driver.findElement(By.id("cybersecure_expiration")));
			Select2.selectByVisibleText("02 - February");
			Select Select3 = new Select(driver.findElement(By.id("cybersecure_expiration_yr")));
			Select3.selectByVisibleText("2022");
			
			driver.findElement(By.xpath("//input[@id='cybersecure_cc_cid']")).sendKeys("562"); */
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@id='payment-buttons-container']//button[@class='button']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='button btn-checkout']")).click();
			
			Thread.sleep(2000);
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='CancelAction_id']"))).click();
			
			/*Thread.sleep(5000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);*/
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@id='customer_short_section']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
			Thread.sleep(3000);
		}			
	}
}

	//MOVING TO LOCAL INVENTOR

	/*	driver.navigate().to("https://www.ubuy.com.kw");
		driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("iQOS USB Cable");
		WebDriverWait wait7 = new WebDriverWait(driver,30);
		wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"))).click();
		
		// driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr[@class='even']//button[@title='Add To Cart']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//div[@id='product_vendors_1_in_stock']")).click();
		
		String Parent_Window1 = driver.getWindowHandle();

		 for (String Child_Window : driver.getWindowHandles())
		 {  
		 driver.switchTo().window(Child_Window);
		 
		// action on child window
		 
		 WebDriverWait wait6 = new WebDriverWait(driver , 10);
		 wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='view-cart-and-checkout']"))).click();
		 // driver.findElement(By.xpath("html/body/div[7]/div/div/a[2]")).click();
		 }
		//Switching back to Parent Window
		 driver.switchTo().window(Parent_Window1);
		 
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
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CancelAction_id']"))).click(); */