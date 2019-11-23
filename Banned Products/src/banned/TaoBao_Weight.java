//  TO GET WEIGHT AND DIMENTION FROM AMAZON FOR ALL THE SEARCHED TAOBAO CATEGORY AVAILABLE IN EXCEL SHEET

package banned;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaoBao_Weight {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String Parent_Window1 = driver.getWindowHandle();

		 for (String Child_Window : driver.getWindowHandles())
		 {  
		 driver.switchTo().window(Child_Window);
		 
		// action on child window
		 
		 driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("41048");
		 WebDriverWait wait = new WebDriverWait(driver , 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='GLUXZipUpdate']//input[@class='a-button-input']"))).click();
	     // driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']//input[@class='a-button-input']")).click();
	     driver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
		 }
		//Switching back to Parent Window
		 driver.switchTo().window(Parent_Window1);
        
        
 
        try
        {  
    
        	FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\tao_category_weight.xlsx"));
        	XSSFWorkbook workbook = new XSSFWorkbook(file);
 
        	XSSFSheet sheet = workbook.getSheetAt(0);
 
        	for (int i=0; i<= sheet.getLastRowNum(); i++)
        	{ 
        	      Thread.sleep(2000);
        		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
        		  String keyword = sheet.getRow(i).getCell(1).getStringCellValue();
        		  
        		  searchBox.clear();
        		  searchBox.sendKeys(keyword); 
        		  searchBox.submit();
        		 
        	try{ 
        		JavascriptExecutor js = (JavascriptExecutor)driver;							
				js.executeScript("scroll(0,150)");
        		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        		driver.findElement(By.xpath("//div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]")).click();
        		
        		try 
        		{
        			String dimension = driver.findElement(By.xpath("//td[contains(text(),'inches')]") ).getText();
        			System.out.print(dimension);
        			String weight = driver.findElement(By.xpath("//td[contains(text(),' pounds ') or contains(text(),' ounces ')]")).getText();
        			System.out.println(weight);
        			
        		}
        		catch (NoSuchElementException e)
        		{
        			/*String dimentionli = driver.findElement(By.xpath("//li[contains(text(),'inches')]")).getText();
            		System.out.print(dimentionli);*/
            		String weightli = driver.findElement(By.xpath("//li[contains(text(),'pounds') or contains(text(),'ounces')]")).getText();
            		System.out.println(weightli);
            		
        			
        		} 
        		// TO GET ALL THE ELEMENTS UNDER SAME XPATH(ALL THE FILTER OPTIONS)
        		
        		 /* ArrayList<String> productName = new ArrayList<String>();
                 java.util.List<WebElement> allProductsName = driver.findElements(By.xpath("//div[@class=\"a-section a-spacing-small\"]//span[@class=\"a-size-base a-color-base a-text-bold\"]"));
                 for(WebElement w : allProductsName) 
                {
                    productName.add(w.getText());
                } 
                 System.out.println(productName); */
        		}
        	catch (NoSuchElementException e) 
        			{
        		
        		System.out.println("NO RESULT");  
        		
        		driver.get("https://www.amazon.com");
        		
        				  
        			}  
        	 
        	
        	
        
        	}

        	
        }
        catch (NoSuchElementException e) 
        		{
        	
        	System.out.println("NO RESULT");
    		driver.get("https://www.amazon.com");
    		
    				  
    			 }  
        
        
        
}
}
