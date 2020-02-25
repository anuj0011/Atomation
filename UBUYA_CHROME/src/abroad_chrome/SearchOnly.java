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

public class SearchOnly {

	public static WebDriver driver;

	@Test
	public void f() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	

		FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\Normalsearchcheck.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		driver.get("https://test-abroad.ubuy.com.kw/en/");
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {
				
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
				

// NORMAL SEARCH
			WebElement searchbox =	driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
			searchbox.clear();
			searchbox.sendKeys(keyword);
			searchbox.submit();
				
			Thread.sleep(5000);
				
			} catch (Exception e) {
				e.printStackTrace();
				
		
			}

		}
	}
}

	
	
	

	