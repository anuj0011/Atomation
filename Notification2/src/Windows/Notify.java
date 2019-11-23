package Windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.HttpURLConnection;
import java.net.URL;

public class Notify {
	
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
			  
			  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =  new ChromeDriver();
				
				driver.get("https://www.ubuy.com.kw");
				driver.manage().window().maximize();
				
			// Verify Page title in Selenium Webdriver
				
				/* String actualTitle = driver.getTitle();
				System.out.println("Title is"+actualTitle);
				String expectedTitle = "Online Shopping | Electronics, Phones, Fashion & More  | Ubuy Kuwait";
				Assert.assertEquals(actualTitle, expectedTitle);
				System.out.println("Test completed"); */
				
			// Navigation in selenium
				
				/* driver.navigate().to("https://www.ubuy.com.my/en");
				driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("iphone");
				driver.findElement(By.xpath(".//*[@id='search_go']")).click();
				driver.navigate().back();
				driver.navigate().forward(); */
				
			// Radio button and Checkbox in Selenium Webdriver
				
				/* driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("iphone");
				driver.findElement(By.xpath(".//*[@id='search_go']")).click();
				WebElement radioBtn = driver.findElement(By.id("toolsqa"));
				radioBtn.click(); */
				
			// Handling Auto Suggestion
				
				/* driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("sam");
				List list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
				System.out.println("Auto suggest List ::"+list.size());
				for(int i = 0 ;i<= list.size();i++)
				{
					System.out.println(list.get(i));
					
					if(list.get(i).equals("Samsung Galaxy S4"))
					{
						((WebElement) list.get(i)).click();
						break;
					}
				} */
				
			// Handling DropdownList
				
				/* driver.navigate().to("https://www.ubuy.co.at/en/search/index/view/product/B00N2VILDM/s/amazonbasics-rj45-cat-6-ethernet-patch-cable-5-feet-1-5-meters/store/store");
				Select oSelect = new Select(driver.findElement(By.id("select_size")));
				oSelect.selectByVisibleText("14 Feet"); */
				
			//Handling Drag and Drop in Selenium
				/* driver.navigate().to("https://www.a.ubuy.com.kw/en/search/index/view/product/B0791TX5P5/s/Fire-TV-Stick-with-all-new-Alexa-Voice-Remote--streaming-media-player/store/store/kk/dp");
				WebElement From = driver.findElement(By.className("wishlist-button"));
				WebElement To = driver.findElement(By.xpath(".//*[@id='search']"));
				Actions builder = new Actions(driver);
				Actions dragAndDrop = builder.clickAndHold(From);
				builder.moveToElement(To);
				builder.release(To);
				builder.build();
				dragAndDrop.perform(); */
				
			//Handling Mouse Hover,Keyword Events using Action class
				/* driver.navigate().to("https://www.a.ubuy.com.kw/en/electronics/id-172282/category-list-view");
				WebElement element = driver.findElement(By.id("order_from"));
				Actions action = new Actions(driver);
				action.moveToElement(element).build().perform();
				driver.findElement(By.className("1055398")).click(); */
				
			//How to take screenshot using selenium
				/*File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile. new File(D:\\AUTOMATION_ANUJ\\screenshot.png));
				// FileUtils.copyFile(srcFile, new File(D:\\AUTOMATION_ANUJ\\screenshot.png));*/
			 
			//Handling Multiple windows
				/* driver.get("https://www.a.ubuy.com.kw/en/search/?ref_p=ser_tp&q=laptop");
				WebElement clickElement = driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div[3]/div[2]/div[1]/div"));
				for (int i = 0;i<3;i++)
				{
					clickElement.click();
					Thread.sleep(3000);
				} */
				
			//Handling WebCalendar
				/* driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
				driver.findElement(By.id("datepicker")).click();
				List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				for(WebElement ele:allDates)
				{
					String date = ele.getText();
					if(date.equalsIgnoreCase("28"))
					{
						ele.click();
						break;
					}
				} */
				
			//Download files using Selenium Webdriver
				/* FirefoxProfile profile=new FirefoxProfile();   // Create a profile
				profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");  // Set preferences for file type as it is not possible to use selenium on windows pop up asking whether open or save file                
				WebDriver driver=new FirefoxDriver(profile);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://www.filehippo.com/download_adobe_reader");
				driver.findElement(By.xpath(".//*[@id='program-header']/div[4]/a[1]")).click(); */
				
			//Upload files using Selenium Webdriver
				/* StringSelection sel = new StringSelection("D:\\Appium For Apps-converted.pdf"); // Specify the file location with extension
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);         // Copy to clipboard
				System.out.println("selection" +sel);
				driver.get("http://my.monsterindia.com/create_account.html");
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor)driver;								// This will scroll down the page
				js.executeScript("scroll(0,350)");
				Thread.sleep(5000);
				driver.findElement(By.id("wordresume")).click();
				Robot robo = new Robot();														// Create object of Robot class
				Thread.sleep(5000);
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				robo.keyPress(KeyEvent.VK_CONTROL);
				robo.keyPress(KeyEvent.VK_V);
				robo.keyRelease(KeyEvent.VK_CONTROL);
				robo.keyRelease(KeyEvent.VK_V);
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER); */
				
			//Handling IFrames
				/* try {
				driver.switchTo().frame(“framename” or "indexnumber");							// switching to iframe to perform action on it
				      } 
				 catch (NoSuchFrameException e)
				    {            
				    System.out.println(e.getMessage());     
				    }
				 driver.switchTo().defaultContent(); */                                            // swithching back to default
				
			//Cross Browsing using selenium
				//@Test
				//@Parameters("Browser"))
				
			//capture Error message using webdriver
				/* driver.navigate().to("https://www.ubuy.co.in");
				Actions action = new Actions(driver);                                           // to hover over an element
				WebElement we = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/abbr[1]"));
				
				action.moveToElement(we).build().perform();
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]"))).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/input[1]")).sendKeys("abc");
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/input[1]")).sendKeys("xyz");
				driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]")).getText(); */
				
			// How to Find All/Broken links using Selenium Webdriver
				
					

		
	/*	List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } 
        
        catch (Exception e) 
        	{
        	
        	} */
    	

	}
}

