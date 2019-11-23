package banned;

// TO GET ALL THE FILTER OPTIONS AVAILABLE FOR THE SEARCHED KEYWORDS

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jdt.internal.compiler.ast.ContinueStatement;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uk_Filters {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();    
 
        try { 
    
        	FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\usfilters.xlsx")); 
        	XSSFWorkbook workbook = new XSSFWorkbook(file);
 
        	XSSFSheet sheet = workbook.getSheetAt(0);
 
        	for (int i=0; i<= sheet.getLastRowNum(); i++)
        	{ 
        	      Thread.sleep(2000);
        		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
        		  String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
        		  
        		  searchBox.clear();
        		  searchBox.sendKeys(keyword);
        		  searchBox.submit();
        		  
        	try{ 
        		
        		// TO GET ALL THE ELEMENTS UNDER SAME XPATH(ALL THE FILTER OPTIONS)
        		
        		 ArrayList<String> productName = new ArrayList<String>();
                 java.util.List<WebElement> allProductsName = driver.findElements(By.xpath("//div[@class=\"a-section a-spacing-small\"]//span[@class=\"a-size-base a-color-base a-text-bold\"]"));
                 for(WebElement w : allProductsName) 
                {
                    productName.add(w.getText());
                }

                 System.out.println(productName); 
        			  }
        	catch (NoSuchElementException e) {
        		
        		
        		
        		driver.get("https://www.amazon.co.uk");
        		
        				  
        			  }  
        	 
        
	}

        	
}
        catch (NoSuchElementException e) {
    		
    		driver.get("https://www.amazon.co.uk");
    		
    				  
    			  }  
        
        
        
}
}




