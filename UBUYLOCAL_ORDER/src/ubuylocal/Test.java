package ubuylocal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static  WebDriver driver;
	public static void main(String[] args) throws Exception {

	driver = new FirefoxDriver();
	driver.get("https://www.ubuy.com.kw/customer/account/login/");
	 driver.findElement(By.xpath(".//*[@class='input-text required-entry validate-email' and @id='login-email']")).sendKeys("anuj.bansal@ubuy.co.in");
	 driver.findElement(By.xpath(".//*[@class='input-text required-entry validate-email' and @id='login-password']")).sendKeys("00ubuy11");
	 Thread.sleep(2000);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 // driver.findElement(By.id("send2")).click();
	 WebDriverWait wait4 = new WebDriverWait(driver , 10);
	 wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='login-form']/div/button"))).click();
	
	}

}
