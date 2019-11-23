package banned;
 
import java.io.*;
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
 
public class ExcelReadData{
 
 public static void main(String[] args) throws InterruptedException { 
	 
	 	System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     
        driver.get("https://www.ubuy.com.sa/en/");
        driver.manage().window().maximize();
 
        try {
    
        	FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\ExcelAutomated.xlsx"));
        	XSSFWorkbook workbook = new XSSFWorkbook(file);
 
        	XSSFSheet sheet = workbook.getSheetAt(0);
 
        	for (int i=0; i<= sheet.getLastRowNum(); i++)
        	{ 
	    
	  WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']")); 
	  String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
	  
	  searchBox.clear();
	  searchBox.sendKeys(keyword);  
	  searchBox.submit();
	  
	  Thread.sleep(6000);
        	
        
	 
	  try{
	  // WebDriverWait wait = new WebDriverWait(driver, 10);
	  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[6]/div/div/div[2]/div[3]/div[2]/div[1]/div"))).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // driver.findElement(By.xpath("//div[5]//div[1]//div[1]//a[1]//img[1]")).click();
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  catch (NoSuchElementException e) {
		//  System.out.println(keyword +" SEARCH RESTRICTED");
	  }
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;								// This will scroll down the page
		js.executeScript("scroll(0,50)");
	  
	  try {
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  WebElement Restriction = driver.findElement(By.xpath("//strong[contains(text(),'This product is restricted in your country.')] | //div[@class='banImage clearfix media']"));
		  
		  if(Restriction.isDisplayed())
		  {
			  System.out.println(keyword +" RESTRICTED");
		  }
		  Thread.sleep(2000);
	  }
	  catch (NoSuchElementException e) {
		  
		  	System.out.println(keyword +" AVAILABLE");
	  }	
	  catch (InterruptedException e) {
		  
		  e.printStackTrace();
	  }	
	  
	  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
  }
 
  workbook.close();
  file.close();
  driver.close();
  driver.quit();
 
 } catch (FileNotFoundException fnfe) {
  fnfe.printStackTrace();
 }
 catch (IOException ioe) {
  ioe.printStackTrace();
 }
 }
}