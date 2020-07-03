// TO CHECK IF KEYWORD IS AVAILABLE IN SEARCH OR NOT.
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

public class Searchcheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\AUTOMATION\\chromedriver_win32\\chromedriver4.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ubuy.co.in");
		driver.manage().window().maximize();

		try {

			FileInputStream file = new FileInputStream(new File("E:\\AUTOMATION\\Excelautomated.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {

				WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue();

				searchBox.clear();
				searchBox.sendKeys(keyword);
				searchBox.submit();

				Thread.sleep(6000);

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
				} else if (driver.findElement(By.xpath("//div[@id='store']")).getText().contains(keyword)){
					System.out.println(keyword + " FOUND IN SEARCH");
				}
				else
				{
					System.out.println(keyword + " NOT AVAILABLE IN SEARCH");
				}

			}
		}

		catch (Exception e) {

		}
	}
}
