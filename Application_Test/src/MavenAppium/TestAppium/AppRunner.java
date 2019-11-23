package MavenAppium.TestAppium;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class AppRunner {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "ddc376c1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.ubuy");
		caps.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
		//caps.setCapability("appActivity",".ui.activities.Main");
		caps.setCapability("noReset", "true");
		
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			/*WebElement ele = driver.findElement(By.xpath("//android.widget.ImageButton"));
				
			ele.click();*/
				driver.findElement(By.id("com.ubuy:id/action")).click();
				List<MobileElement> editText = driver.findElements(By.className("android.widget.LinearLayout"));

				System.out.println(editText);
			//	driver.findElementByClassName("android.widget.ImageButton").click();
			
			/*WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By
			        .xpath("//android.widget.ImageView[@index='0']"))).click();*/
				/*Screen scr = new Screen();
				Pattern img1 = new Pattern("D:\\Appium Sikuli\\img22.png");
				img1.*/
				
				/*.similar( (float) 0.7);
				scr.type(img1, "Laptop");
				if (scr.exists(img1 , 7) != null) {
					Match match = scr.getLastMatch();
					}*/
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}


