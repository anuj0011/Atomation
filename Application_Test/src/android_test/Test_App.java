/* package android_test;
 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class Test_App {
 
		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "D:\\eclipse-workspace\\Application_Test\\src\\android_test\\Test_App.java");
			File app = new File(appDir, "D:\\Android_APK\\UBuy-release_11_12_2018_1.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
			capabilities.setCapability("deviceName", "ddc376c1");
			capabilities.setCapability("platformVersion", "8.0.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.ubuy");
			capabilities.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
 
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.quit();
 
	}
 
} */

package android_test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_App {
	// ***APPIUM INTEGRATION WITH SAUCE LABS***
	public static final String USERNAME = "anuj0011";
	public static final String ACCESS_KEY = "330bc23c-651c-41a0-910d-ba32c9e2858e";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:4723/wd/hub";
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("username", "anuj0011");
		capabilities.setCapability("testobject_api_key", "e135634a-f6ed-4394-a833-dffc2d0c0249");
		capabilities.setCapability("appiumVersion", "1.15.1");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability("deviceName", "Motorola Moto G6");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.ubuy");
		capabilities.setCapability("appActivity", "com.app.mazade.ubuy.MainActivity");
		capabilities.setCapability("platform", "Windows 10");
		capabilities.setCapability("version", "latest");

		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);

		driver.get("https://saucelabs.com/test/guinea-pig");
		System.out.println("title of page is: " + driver.getTitle());

	}

}
