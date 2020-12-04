package webHit;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webhit {
	public static WebDriver driver;
	static String mailurl; // to send url with mail for slow detail

	public static void main(String[] args)

			throws IOException, JSONException, org.json.simple.parser.ParseException, InterruptedException

	{
		pricesave();
	}

	public static void pricesave() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anuj/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// To open multiple browser tabs
		for(int i = 0; i < 30; i++) {
			((JavascriptExecutor) driver).executeScript("window.open()");
		}

		// PASRSING JSON (getting data)

		for (;;) {
			try {

				String urlString = "https://www.a.ubuy.com.kw/am/google_content_api/get_products_url_script.php?time=23234";
				URL url1 = new URL(urlString);

				HttpURLConnection con = (HttpURLConnection) url1.openConnection();
				con.setRequestMethod("GET");
				int responseCode = con.getResponseCode();
				System.out.println("Sending get request : " + url1);
				System.out.println("Response code : " + responseCode);
				// Reading response from input Stream
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String output;
				StringBuffer response = new StringBuffer();

				while ((output = in.readLine()) != null)

				{
					response.append(output);
				}

				in.close();
				System.out.println(response.toString());
				JSONParser parser = new JSONParser();
				try {
					Object obj = parser.parse(response.toString());
					JSONArray array = (JSONArray) obj;
					System.out.println(array.size());
					for (int i = 0; i < array.size(); i++) {
						// System.out.println("The 1st element of array");
						ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
						for (int z = 0; z < 30; z++) {
							int k = i + z;

							driver.switchTo().window(tabs.get(z));
							String url0 = (String) array.get(k);

							// to check if detail is still loading, proxy issue
							if (z == 3 || z == 6 || z == 9 || z == 12 || z == 15) {
								try {

									String text = driver.findElement(By.xpath(
											"//*[@id='product-name' or contains(text(),'Don’t worry...') or contains(@alt,'not-available')]"))
											.getText();
									System.out.println("LOADED");

								} catch (Exception e) {

									mailurl = driver.getCurrentUrl(); // to send url with mail for slow detail

									// To skip the first mail with about:blank url
									if (mailurl.contains("about:blank") == false) {
										emailme(); // calling email method
										System.out.println("Slow Detail Email Sent");
									}

									else {
										System.out.println("blank url");
									}

								}

							}

							driver.get(url0);
							System.out.println(url0);

						}
						i += 29;
					}
				} catch (Exception e) {
					e.printStackTrace();

					// driver.manage().timeouts().implicitlyWait(30,
					// TimeUnit.SECONDS);
					Thread.sleep(900000);
					pricesave();
				}
			} catch (Exception e) {
				e.printStackTrace();
				// driver.manage().timeouts().implicitlyWait(30,
				// TimeUnit.SECONDS);
				Thread.sleep(900000);
				pricesave();
			}
		}
	}

	// TO GET MAIL & SCREENSHOT THROUGH SMTP
	public static void emailme() {

		try {

			temp(new File("C:/Users/my/AppData/Local/Temp")); // calling temp method to delete temp files

			TakesScreenshot screenshot = (TakesScreenshot) driver;

			@SuppressWarnings("unused")
			File src = screenshot.getScreenshotAs(OutputType.FILE);

			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

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
			email.setSubject("DETAIL PROXY ISSUE");
			email.setMsg("DETAIL PAGE NOT LOADING/LOADING SLOW  " + mailurl);
			email.addTo("anuj.bansal@ubuy.com");

			email.attach(attachment);
			email.send();

		}

		catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

	// METHOD TO DELETE SYSTEM TEMP FILE
	public static void temp(File directoryPath) throws IOException {
		if (directoryPath != null && directoryPath.exists()) {

			if (directoryPath.isDirectory()) {
				File[] fileList = directoryPath.listFiles();
				for (int i = 0; i < fileList.length; i++) {
					temp(fileList[i]); //recursion to delete content of folder inside folder
				}
				if (!"Temp".equalsIgnoreCase(directoryPath.getName())) {  // not to delete the temp folder itself
					System.out.println("folder   delete " + directoryPath.getAbsolutePath());
					directoryPath.delete();
				}
			} else {
				System.out.println("file   delete " + directoryPath.getAbsolutePath());
				directoryPath.delete();
			}
		}
	}

}

// JSON (posting data) just for knowledge
/*
 *  * public static void sendingPostRequest(String data) throws Exception {  *
 *  *  * String url =  *
 * "https://www.ubuy.com.kw/am/custom_admin/price_compare/update_website_list.php";
 *  * URL obj = new URL(url); HttpURLConnection con = (HttpURLConnection)  *
 * obj.openConnection(); System.out.println("data we are passing"+data);  *
 * //String postJsonData =  *
 * "{'id':1,'URL':'https://www.mobile2000.com//htc-u12-plus-ceramic-black.html','price':'KD56.900'}";
 *  * con.setDoOutput(true); DataOutputStream wr = new  *
 * DataOutputStream(con.getOutputStream()); wr.writeBytes(data); wr.flush();  *
 * wr.close(); int responseCode = con.getResponseCode();  *
 * System.out.println("Sending 'POST' request to URL : " + url);  *
 * //System.out.println("Post Data : " + postJsonData);  *
 * System.out.println("Response Code : " + responseCode); BufferedReader in =  *
 * new BufferedReader( new InputStreamReader(con.getInputStream())); String  *
 * output; StringBuffer response = new StringBuffer();  *  * while ((output =
 * in.readLine()) != null) { response.append(output); }  * in.close();  *  *
 * //printing result from response  *
 * System.out.println("this is response string"+response.toString());  *  
 */