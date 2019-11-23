package webHit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webservice {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("window.open()");
		((JavascriptExecutor)driver).executeScript("window.open()");
		((JavascriptExecutor)driver).executeScript("window.open()");
		((JavascriptExecutor)driver).executeScript("window.open()");
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

		FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\Productdetailpage.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i = 0 ; i<=sheet.getLastRowNum(); i++) {
			
			try {
				
				String url = sheet.getRow(i).getCell(0).getStringCellValue();
				
				    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
				    driver.switchTo().window(tabs.get(1)); 
				    String url1 = sheet.getRow(i++).getCell(0).getStringCellValue();
					driver.get(url1);
				   
					driver.switchTo().window(tabs.get(2)); 
				    String url2 = sheet.getRow(i++).getCell(0).getStringCellValue();
					driver.get(url2);
					
					driver.switchTo().window(tabs.get(3)); 
				    String url3 = sheet.getRow(i++).getCell(0).getStringCellValue();
					driver.get(url3);
					
					driver.switchTo().window(tabs.get(4)); 
				    String url4 = sheet.getRow(i++).getCell(0).getStringCellValue();
					driver.get(url4);
					
					driver.switchTo().window(tabs.get(0)); 
				    String url5 = sheet.getRow(i++).getCell(0).getStringCellValue();
					driver.get(url5);		
				
			} 
			
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

}
