package MavenAppium.TestAppium;

import java.awt.Desktop.Action;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;




public class AppRunner {

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "ddc376c1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.ubuy");
		caps.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
		// caps.setCapability("appActivity",".ui.activities.Main");
		caps.setCapability("noReset", "true");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		Thread.sleep(5000);

		// List<MobileElement> editText =
		// driver.findElements(By.className("android.widget.LinearLayout"));
		// System.out.println(editText);

	/*	driver.findElement(By.xpath("//android.widget.TextView[@text='Select Country']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Australia']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='US']")).click();
		
		//swipeVertical((AppiumDriver)driver,0.05,0.9,0.5,3000);

		Thread.sleep(15000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='What are you looking for?']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Actions action = new Actions(driver);
	    action.sendKeys("iphone").perform();
	    action.sendKeys(Keys.ENTER).perform();
	    

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement add = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubuy:id/add.to.cart")));
		Thread.sleep(3000);
		add.click();
		
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).click();
		Thread.sleep(7000);		
		/*TouchActions touch = new TouchActions(driver);
		touch.scroll(10, 100);
		action.perform();*/
		
		driver.findElement(By.id("com.ubuy:id/check.out")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.view.View[@text='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.ubuy:id/et_email")).click();
		action.sendKeys("anuj.bansal@ubuy.co.in").perform();
		driver.findElement(By.id("com.ubuy:id/et_password")).click();
		action.sendKeys("00ubuy11").perform();
		
		driver.findElement(By.id("com.ubuy:id/sing.in")).click();
		
		driver.findElement(By.id("com.ubuy:id/no")).click();

		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.ubuy:id/check.out")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.view.View[@index='0']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//FINDING ELEMENT BY CONTAIN TEXT
		driver.findElement(By.xpath("//android.view.View[contains(@text, 'Ubuy Shipping')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.view.View[@text='Visa/Mastercard']")).click();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).click();
		action.sendKeys("4377486577038084").perform();
		Thread.sleep(2000);
		
		swipeVertical((AppiumDriver)driver,0.05,0.9,0.5,3000);
		    
		driver.findElement(By.id("cybersecure_cc_cid")).click();
		action.sendKeys("562").perform();
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	// *** FOR SCROLLING/SWIPE ***
	
	public static void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(PointOption.point(anchor,startPoint)).waitAction(waitOptions(Duration.ofMillis(duration))).moveTo(PointOption.point(anchor, endPoint)).release().perform();
        
	}

}
