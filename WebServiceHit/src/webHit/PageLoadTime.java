package webHit;

//TO SEND THE TIME TAKEN TO LOAD DETAIL PAGE WITH IMAGE every hour
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTime {
	public static WebDriver driver2;
	static long totalTime; // to send detail page load time

	public static void main(String urll) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--blink-settings=imagesEnabled=true");
		op.addArguments("window-size=1400,800");
		driver2 = new ChromeDriver(op);
		driver2.get(urll);
		try {

			long start = System.currentTimeMillis();

			WebDriverWait wait = new WebDriverWait(driver2, 60);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"//*[@id='product-name' or contains(text(),'Don’t worry...') or contains(@alt,'not-available')]")));

			long finish = System.currentTimeMillis();
			totalTime = finish - start;
			System.out.println("Total Time for page load(MilliSeconds) - " + totalTime);
			emailme2();
			driver2.quit();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	// TO GET MAIL & SCREENSHOT OF "PAGE WITH IMAGE" LOAD TIME

	public static void emailme2() {

		try {

			TakesScreenshot screenshot = (TakesScreenshot) driver2;

			@SuppressWarnings("unused")
			File src = screenshot.getScreenshotAs(OutputType.FILE);

			File file = ((TakesScreenshot) driver2).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(file, new File("/home/anuj/git/Atomation/WebServiceHit/Screenshots/screenshot.png"));
			System.out.println("Screenshot Taken");

			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath("/home/anuj/git/Atomation/WebServiceHit/Screenshots/screenshot.png");
			attachment.setDisposition(EmailAttachment.ATTACHMENT);
			attachment.setDescription("Error");
			attachment.setName("Screen");
			attachment.getURL();

			// Create the email message
			MultiPartEmail email = new MultiPartEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("manayasam@gmail.com", "omitit123"));
			email.setSSLOnConnect(true);
			email.setFrom("manayasam@gmail.com");
			email.setSubject("DETAIL LOADING SPEED(MilliSeconds) - " + totalTime);
			email.setMsg("Total Time for page load(MilliSeconds) - " + totalTime);
			email.addTo("anuj.bansal@ubuy.com");
			// email.addTo("pradeep.singh@ubuy.com");

			email.attach(attachment);
			email.send();

		}

		catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

}
