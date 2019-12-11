package MavenAppium.TestAppium;

import java.awt.Desktop.Action;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppRunner {

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "554c50d2");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.1");
		caps.setCapability("appPackage", "com.ubuy");
		caps.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
		// caps.setCapability("appActivity",".ui.activities.Main");
		caps.setCapability("noReset", "true");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		Thread.sleep(15000);

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
		driver.findElement(By.xpath("//android.widget.TextView[@text='What are you looking for?']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Actions action = new Actions(driver);
	    action.sendKeys("lenovo").perform();
	    action.sendKeys(Keys.ENTER).perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("com.ubuy:id/add.to.cart")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).click();
		Thread.sleep(7000);		
		TouchActions touch = new TouchActions(driver);
		touch.scroll(10, 100);
		action.perform();


		
		driver.findElement(By.id("com.ubuy:id/check.out")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.view.View[@text='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.ubuy:id/et_email")).click();
		action.sendKeys("anuj.bansal@ubuy.co.in").perform();
		driver.findElement(By.id("com.ubuy:id/et_password")).click();
		action.sendKeys("00ubuy11").perform();
		
		driver.findElement(By.id("com.ubuy:id/sing.in")).click();

		






	}

}
