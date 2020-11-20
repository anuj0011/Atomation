package fetch_review;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Userreview {
    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver","D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  dr= new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.trustpilot.com/review/www.ubuy.com");
        dr.findElement(By.xpath("//a[@class='cookie-bar__close-button']")).click();
        Thread.sleep(5000);
        String str = dr.findElement(By.xpath("//div[@class='review-list']")).getText();
        System.out.println(str);
        
        
        while (dr.findElement(By.xpath(".//*[@class='button button--primary next-page']")).isDisplayed()) {
        try 
            {
            JavascriptExecutor js = (JavascriptExecutor)dr;
            js.executeScript("scroll(0 , 7600)");
            
            dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
            
            dr.findElement(By.xpath(".//*[@class='button button--primary next-page']")).click();
            String str1 = dr.findElement(By.xpath("//div[@class='review-list']")).getText();
            
            
            System.out.println(str1);
            
            dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            JavascriptExecutor js1 = (JavascriptExecutor)dr;
            js.executeScript("scroll(0 , 7600)");
            
            	try {
				
            		// TO WRITE DATE IN EXCEL
            	
            		FileWriter fw = new FileWriter("D:\\ExcelWriteAutomated\\userreview.xlsx",true);
            		BufferedWriter bw = new BufferedWriter(fw);
            		PrintWriter pw = new PrintWriter(bw);
            		pw.println(str1);
            		pw.flush();
            		pw.close();
				
					} 
            	catch (Exception e) 
            		{
            		
            		}
            }
        catch(NoSuchElementException e) 
            {
            System.out.println("ooooooooooooooooooooooooooooooo"+e); 
            }
    }
        
        dr.close();
		
		 
			
			
} 
}
