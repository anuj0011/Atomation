package banned;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart_Weight {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
        driver.get("https://www.walmart.com");
        driver.manage().window().maximize();    
 
        try { 
    
        	FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\Walmart-weight-pattern.xlsx"));
        	XSSFWorkbook workbook = new XSSFWorkbook(file);
 
        	XSSFSheet sheet = workbook.getSheetAt(0);
 
        	for (int i=0; i<= sheet.getLastRowNum(); i++)
        	{ 
        	      Thread.sleep(2000);
        		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-search-input']")); 
        		  String keyword = sheet.getRow(i).getCell(1).getStringCellValue();
        		  
        		  searchBox.clear();
        		  searchBox.sendKeys(keyword); 
        		  searchBox.submit();
        		  driver.findElement(By.xpath("//li[@class='Grid-col u-size-6-12 u-size-1-4-m u-size-1-5-xl search-gridview-first-col-item search-gridview-first-grid-row-item']//div//img")).click();
        		  
        		  
        	try{ 
        		 
        		// TO GET ALL THE ELEMENTS UNDER SAME XPATH(ALL THE FILTER OPTIONS)
        		
        		 String Specification = driver.findElement(By.xpath("//body/div[@class='js-content']/div[@class='page-wrapper']/div[@class='page-full-wrapper']/div[@class='js-body-content']/div[@class='ProductPage-verticalTheme-standard ProductPage-verticalId-standard']/div[@class='btf-content']/div/div/div[@class='ResponsiveContainer']/div/div[@class='Grid']/div[@class='Grid-col ads-margin-top']/div[@class='Grid prod-IDML-container']/div/div[@class='Grid-col u-size-9-12-m padding-right']/div[@id='about-product-section']/div/div[@class='idmlExploreItem']/div[@class='SpecsTab']/div[1]")).getText();
        		System.out.println(Specification);
        		}
        	
        		catch (NoSuchElementException e) 
        		{
        		
        		driver.get("https://www.walmart.com");
        		
        				  
        		}
        	 
        	
        	
        
        	}

        	
}
        catch (NoSuchElementException e) 
        	{
    		
    		driver.get("https://www.walmart.com");
    		
    				  
        	}  
        
        
        
}
}
