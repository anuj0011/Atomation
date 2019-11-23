package probihited;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImportProhibited {

	public static WebDriver driver;

	@Test
	public void f() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myus.com/kw/");

		
			
			FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\countriesNamesList.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				
				try {
				Thread.sleep(2000);
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(keyword);

				Select oSelect = new Select(driver.findElement(By.xpath("//select[@id='Select_Your_Country']")));
				oSelect.selectByVisibleText(keyword);

//DHL

				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//a[contains(text(),'DHL import restrictions for ')]")))
						.click();
				Thread.sleep(3000);

				String winHandleBefore = driver.getWindowHandle();
				// Perform the click operation that opens new window
				// Switch to new window opened
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				// Perform the actions on new window
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String dhl = driver.findElement(By.xpath(
						"//body/div[@class='main facelift']/div[contains(@class,'main_area')]/div[@class='content_main_container']/div[@class='content_main_index']/div[@class='container']/div[@class='containerpar parsys']/div[@class='richtexteditor section']/div[@class='standard_article dhl']/div[@class='richtext']/ul[1]"))
						.getText();
				System.out.println("DHL PROHIBITED \n" + dhl);
				// Close the new window, if that window no more required
				driver.close();
				// Switch back to original browser (first window)
				driver.switchTo().window(winHandleBefore);
				// Continue with original browser (first window)

//FEDex

				driver.findElement(By.xpath("//a[contains(text(),'FedEx import restrictions for ')]")).click();
				Thread.sleep(3000);

				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				String fedex = driver
						.findElement(
								By.xpath("//p[contains(text(),'The following goods are subject to prohibition, re')]"))
						.getText();
				System.out.println("FEDEX PROHIBITED \n" + fedex);
				driver.close();
				driver.switchTo().window(winHandleBefore);

//UPS

				driver.findElement(By.xpath("//a[contains(text(),'UPS import restrictions for ')]")).click();
				Thread.sleep(3000);

				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				Select oSelect1 = new Select(driver.findElement(By.xpath("//select[@id='origin_country']")));
				oSelect1.selectByVisibleText("United States");
				Select oSelect2 = new Select(driver.findElement(By.xpath("//select[@id='destination_country']")));
				oSelect2.selectByVisibleText(keyword);
				driver.findElement(By.xpath("//label[contains(text(),'Prohibited or Restricted Commodities')]"))
						.click();
				driver.findElement(By.xpath("//input[@name='ShowRegulations']")).click();

				ArrayList<String> productName = new ArrayList<String>();
				java.util.List<WebElement> allProductsName = driver
						.findElements(By.xpath("//label[contains(text(),'')]"));
				System.out.println("UPS PROHIBITED");
				for (WebElement w : allProductsName) {
					String xyz = w.getText();
					// productName.add(w.getText());
					System.out.println(xyz);

				}
				driver.close();
				driver.switchTo().window(winHandleBefore);

//MYUS

				String myus = driver.findElement(By.xpath(
						"//body/div[@class='page']/div[@class='page-inner']/section[@class='page-frame country-more-info']/article[@class='article-content-holder']/ul[2]"))
						.getText();
				System.out.println("MYUS PROHIBITED \n" + myus);

			}
			
			catch (Exception e) {
				e.printStackTrace();
				driver.get("https://www.myus.com/kw/");
		} 
		}
	}
}
