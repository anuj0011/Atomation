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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class StateTest {

	public static void main(String[] args) throws IOException, InterruptedException, FindFailed, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\CybersourceCountries.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			String url = sheet.getRow(i).getCell(0).getStringCellValue();

			try {
				for (int x = 1; x <= 100; x++) {
					driver.get(url);

					if (driver.findElements(By.xpath("//div[@class='newsletter-pop-up-v2 ub-newsletter-block in']"))
							.size() > 0) {
						driver.findElement(By.xpath("//*[@class='fas fa-times popup-v2 ub-newsletter-dismiss']"))
								.click();
						Thread.sleep(2000);
					}
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("pen");
					driver.findElement(By.xpath("//form[@id='search-form']//button[@type='submit']")).click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElement(By.xpath(
							"//div[@class='body-content clearfix']//div[@class='row']//div[1]//div[1]//div[1]//a[1]"))
							.click();

					Thread.sleep(15000);
					driver.findElement(By.xpath("//button[@id='add-to-cart-btn']")).click();

					String Parent_Window = driver.getWindowHandle();

					for (String Child_Window : driver.getWindowHandles()) {
						Thread.sleep(15000);
						driver.findElement(By.xpath("//*[@class='view-cart-and-checkout']")).click();

					}
					driver.switchTo().window(Parent_Window);

					driver.findElement(By
							.xpath("//div[@class='totals']//button[@class='button btn-proceed-checkout btn-checkout']"))
							.click();
					driver.findElement(By.xpath("//label[contains(text(),'Checkout as Guest')]")).click();
					driver.findElement(By.xpath("//button[@id='onepage-guest-register-button']")).click();
					driver.findElement(By.xpath("//input[@id='billing:firstname']")).sendKeys("Anuj");
					driver.findElement(By.xpath("//input[@id='billing:lastname']")).sendKeys("Bansal");
					driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("9052607942");
					driver.findElement(By.xpath("//input[@id='billing:email']")).sendKeys("test@test.com");

					Select oSelect = new Select(driver.findElement(By.id("billing:region")));
					oSelect.selectByIndex(x);

					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

					WebElement option = oSelect.getFirstSelectedOption();
					String defaultItem = option.getText();

					driver.findElement(By.xpath("//input[@id='billing:city']")).sendKeys("Oshawa");
					driver.findElement(By.xpath("//input[@id='billing:address_house_no']")).sendKeys("3836");
					driver.findElement(By.xpath("//input[@id='billing:address_street']")).sendKeys("Toy Avenue");
					driver.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("123456");

					driver.findElement(By.xpath("//button[@id='billing_save_button']")).click();

					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					driver.findElement(
							By.xpath("//label[contains(text(),'Ubuy Shipping - 5-9 Business days (Customs delay m')]"))
							.click();

					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

					driver.findElement(By.xpath(
							"//div[@id='shipping-method-buttons-container']//button[@class='next_btn'][contains(text(),'Continue')]"))
							.click();

					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					if (driver.findElement(By.xpath("//span[contains(text(),'Visa/Mastercard')]")).isDisplayed()) {
						driver.findElement(By.xpath("//span[contains(text(),'Visa/Mastercard')]")).click();

						Select Select1 = new Select(driver.findElement(By.id("cybersecure_cc_type")));
						Select1.selectByVisibleText("Visa");

						driver.findElement(By.xpath("//input[@id='cybersecure_cc_number']"))
								.sendKeys("4377486577038084");

						Select Select2 = new Select(driver.findElement(By.id("cybersecure_expiration")));
						Select2.selectByVisibleText("02 - February");
						Select Select3 = new Select(driver.findElement(By.id("cybersecure_expiration_yr")));
						Select3.selectByVisibleText("2022");

						driver.findElement(By.xpath("//input[@id='cybersecure_cc_cid']")).sendKeys("562");

						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					} else {
						// FOR STRIPE
						WebElement element2 = driver.findElement(
								By.xpath("//*[@id='p_method_cryozonic_stripe' and @name='payment[method]']"));
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

					Thread.sleep(10000);

					WebDriverWait wait = new WebDriverWait(driver, 10);
					try {
						if (wait.until(ExpectedConditions.alertIsPresent()) != null)
						System.out.println(url);
						System.out.println(defaultItem);

						Alert alert = driver.switchTo().alert();
						String Alerttext = alert.getText();
						System.out.println(Alerttext);
						alert.accept();
					} catch (Exception e) {
						System.out.println(url);
						System.out.println(defaultItem);
						System.out.println("No issue found");

					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
