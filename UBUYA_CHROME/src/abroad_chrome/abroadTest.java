package abroad_chrome;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class abroadTest {

	public static WebDriver driver;

	@Test
	public void f() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// TO RUN IN HEADLESS CHROME BROWSER
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("--allow-running-insecure-content");
		 * chromeOptions.addArguments("--window-size=1920x1080");
		 * chromeOptions.addArguments("--disable-gpu"); chromeOptions.setHeadless(true);
		 * ChromeDriver driver = new ChromeDriver(chromeOptions);
		 */

		FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\CybersourceCountries.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {

				String url = sheet.getRow(i).getCell(0).getStringCellValue();
				driver.get(url);
// HOME PAGE CATEGORY SEARCH
				Thread.sleep(5000);
				driver.findElement(By.xpath(
						"//body/div[@class='header-section container-fluid']/div[@class='row']/div[@class='row shop-by-block']/div[@class='shop-by']/ul/li[8]/a[1]"))
						.click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[@id='usstore-products']//div[1]//div[1]//div[1]//a[1]//img[1]"))
						.click();
				Thread.sleep(8000);
// NORMAL SEARCH
				//driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("silencer");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(
						"//div[@id='usstore-products']//div[1]//div[1]//div[1]//a[1]//img[1]"))
						.click();
				// driver.navigate().refresh();
				Thread.sleep(9000);
				driver.findElement(By.xpath("//button[@id='add-to-cart-btn']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String Parent_Window = driver.getWindowHandle();
				for (String Child_Window : driver.getWindowHandles()) {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@class='view-cart-and-checkout']")).click();
					/*
					 * Screen screen = new Screen(); Pattern image = new
					 * Pattern("D:\\sikuli_image\\Screenshot_1.png"); Thread.sleep(3000);
					 * screen.click(image);
					 */
				}
				driver.switchTo().window(Parent_Window);

				driver.findElement(
						By.xpath("//div[@class='totals']//button[@class='button btn-proceed-checkout btn-checkout']"))
						.click();
				/*
				 * Screen screen2 = new Screen(); Pattern image2 = new
				 * Pattern("D:\\sikuli_image\\Screenshot_2.png"); Thread.sleep(3000);
				 * screen2.click(image2);
				 */

				driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
				driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("00ubuy11");
				driver.findElement(By.xpath(".//*[@id='login-form']/div/button")).click();
				driver.findElement(By.xpath(".//*[@id='billing_save_button']")).click();
				WebDriverWait wait2 = new WebDriverWait(driver, 20);
				wait2.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//label[@for='s_method_aramex_aramex']"))).click();

				driver.findElement(By.xpath(
						"//div[@id='shipping-method-buttons-container']//button[@type='button'][contains(text(),'Continue')]"))
						.click();

				// WebDriverWait wait5 = new WebDriverWait(driver,20);
				// wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Visa/Mastercard')]"))).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Thread.sleep(3000);

				if (driver.findElement(By.xpath("//span[contains(text(),'Visa/Mastercard')]")).isDisplayed()) {
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
				} else {
// FOR STRIPE
					WebElement element2 = driver
							.findElement(By.xpath("//*[@id='p_method_cryozonic_stripe' and @name='payment[method]']"));
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", element2);
					// WebDriverWait wait = new WebDriverWait(driver,20);
					// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='p_method_cryozonic_stripe'
					// and @name='payment[method]']"))).click();
					// driver.findElement(By.xpath("//*[@id='p_method_cryozonic_stripe' and
					// @name='payment[method]']")).click();

					Thread.sleep(3000);
					Screen screen = new Screen();

					Pattern image1 = new Pattern("D:\\sikuli_image\\stripe1.PNG");
					Pattern image2 = new Pattern("D:\\sikuli_image\\stripe2.PNG");
					Pattern image3 = new Pattern("D:\\sikuli_image\\stripe3.PNG");

					screen.type(image1, "4377486577038084");
					screen.type(image2, "0222");
					screen.type(image3, "562");

				}

				driver.findElement(By.xpath(
						"//div[@id='payment-buttons-container']//button[@type='button'][contains(text(),'Continue')]"))
						.click();

				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

				Thread.sleep(2000);

				/*
				 * WebDriverWait wait = new WebDriverWait(driver, 30);
				 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				 * "//a[contains(text(),'Cancel')]"))).click();
				 * 
				 * Thread.sleep(5000);
				 * 
				 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
				 * robot.keyRelease(KeyEvent.VK_ENTER);
				 * 
				 * Thread.sleep(5000);
				 */

// FOR PAYPAL
				/*
				 * driver.findElement(By.xpath("//li[@class='carts_box cats_section']//a")).
				 * click(); driver.findElement(By.
				 * xpath("//div[@class='totals']//button[@class='button btn-proceed-checkout btn-checkout']"
				 * )).click();
				 * 
				 * driver.findElement(By.xpath("//button[@id='billing_save_button']")).click();
				 * WebDriverWait wait3 = new WebDriverWait(driver, 20);
				 * wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				 * "//label[@for='s_method_aramex_aramex']"))).click();
				 * driver.findElement(By.xpath(
				 * "//div[@id='shipping-method-buttons-container']//button[@type='button'][contains(text(),'Continue')]"
				 * )).click(); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 * driver.findElement(By.
				 * xpath("//body/div/main/section[@class='container-lg']/div[@class='cell checkout']/div[@class='canvas']/div[@id='opc-payment']/div[@class='payment-information a-item']/div[@id='step-form-payment']/form[@id='co-payment-form']/fieldset/ul[@id='checkout-payment-method-load']/li[2]/label[1] "
				 * )).click(); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 * driver.findElement(By.xpath(
				 * "//div[@id='payment-buttons-container']//button[@class='next_btn'][contains(text(),'Continue')]"
				 * )).click(); Thread.sleep(5000);
				 * driver.findElement(By.xpath("//div[@id='content']//a[@id='cancelLink']")).
				 * click(); Thread.sleep(5000);
				 */
			} catch (Exception e) {
				e.printStackTrace();
				takescreenshot();
				Thread.sleep(5000);
			}

		}

	}
	
	

	@AfterMethod
	public void tearDown(ITestResult result) throws AWTException {
		// Here will compare if test is failing then only it will enter into if
		// condition

		// result = Reporter.getCurrentTestResult();
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// Create reference of TakesScreenshot
				// TakesScreenshot ts=(TakesScreenshot)driver;
				// Call method to capture screenshot
				// File source=ts.getScreenshotAs(OutputType.FILE);
				File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// Copy files to specific location here it will save all screenshot in our
				// project home directory and
				// result.getName() will return name of test case so that screenshot name will
				// be same
				FileUtils.copyFile(file1, new File("./Screenshots/" + result.getName() + ".png"));
				System.out.println("Screenshot taken");
			}

			catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_WINDOWS);
				rb.keyPress(KeyEvent.VK_PRINTSCREEN);
				rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
				rb.keyRelease(KeyEvent.VK_WINDOWS);
			}

		}

	}

	public void takescreenshot() {
		try {
			// Create reference of TakesScreenshot
			// TakesScreenshot ts=(TakesScreenshot)driver;
			// Call method to capture screenshot
			// File source=ts.getScreenshotAs(OutputType.FILE);
			File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Copy files to specific location here it will save all screenshot in our
			// project home directory and
			// result.getName() will return name of test case so that screenshot name will
			// be same
			FileUtils.copyFile(file1, new File("./Screenshots/" + "screeenshot" + ".png"));
			System.out.println("Screenshot taken");
			// + Calendar.getInstance().getTimeInMillis()

// TO GET MAIL OF SCREENSHOT THROUGH SMTP

			final String username = "manayasam@gmail.com";
			final String password = "omitit123";
			Properties prop = new Properties();
			prop.put("mail.smtp.auth", true);
			prop.put("mail.smtp.starttls.enable", true);
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", "587");

			Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("manayasam@gmail.com"));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("anuj.bansal@ubuy.co.in"));
				message.setSubject("Ubuy Abroad Script");
				message.setText("PFA");

				MimeBodyPart messagebodypart = new MimeBodyPart();
				Multipart multipart = new MimeMultipart();

				messagebodypart = new MimeBodyPart();

				String file = "D:\\eclipse-workspace\\UBUYA_CHROME\\Screenshots\\screeenshot.PNG";
				String fileName = "screeenshot.PNG";

				DataSource source = new FileDataSource(file);
				messagebodypart.setDataHandler(new DataHandler(source));
				messagebodypart.setFileName(fileName);
				messagebodypart.attachFile(file);
				multipart.addBodyPart(messagebodypart);
				message.setContent(multipart);
				System.out.println("Sending");
				Transport.send(message);
				System.out.println("Done");

			}

			catch (Exception e) {
				e.printStackTrace();
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
