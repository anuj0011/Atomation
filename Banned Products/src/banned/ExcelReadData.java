package banned;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelReadData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ubuy.co.in");
		driver.manage().window().maximize();

		try {

			FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\ExcelAutomated1.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {

				WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue();

				searchBox.clear();
				searchBox.sendKeys(keyword);
				searchBox.submit();

				// Thread.sleep(6000);

				List<WebElement> SearchResticted = driver
						.findElements(By.xpath("//div[@class='banImage clearfix media']"));
				List<WebElement> Noresult = driver.findElements(
						By.xpath("//p[contains(text(),'Your search keyword did not match any product, try')]"));
				
				List<WebElement> Notfound = driver
						.findElements(By.xpath("//h4[contains(text(),'Not found your desired product?')]"));

				if (SearchResticted.size() > 0) {

					System.out.println(keyword + " SEARCH RESTRICTED");
				} else if (Noresult.size() > 0) {

					System.out.println(keyword + " NO RESULT FOUND");
				} else {

					JavascriptExecutor js = (JavascriptExecutor) driver; // This will scroll down the page
					js.executeScript("scroll(0,50)");
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath("//div[@id='usstore-products']//div[2]//div[1]//div[1]//a[1]"))).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='product-name']")))
							.isDisplayed();
					Thread.sleep(7000);
					
					List<WebElement> Restricted = driver.findElements(
							By.xpath("//strong[contains(text(),'This product is restricted in your country.')]"));
					List<WebElement> Notfound2 = driver
							.findElements(By.xpath("//h4[contains(text(),'Not found your desired product?')]"));
					List<WebElement> SearchResticted2 = driver
							.findElements(By.xpath("//div[@class='banImage clearfix media']"));

					if (Restricted.size() > 0) {

						System.out.println(keyword + " RESTRICTED");

					} else if (SearchResticted2.size() > 0) {

						System.out.println(keyword + " RESTRICTED");
					} else if (Notfound2.size() > 0) {

						System.out.println(keyword + " RESTRICTED");
					} else {
						System.out.println(keyword + " AVAILABLE");
					}

				}

			}
		}

		catch (Exception e) {

		}
	}
}
