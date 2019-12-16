//  TO GET TITLE,WEIGHT,DIMENTION ETC. FROM AMAZON AND SEND THEM IN JSON FORMATE.

package scrap;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;

public class Scrapping extends Sikuli {

	public static void main(String[] args) throws IOException, InterruptedException, FindFailed, AWTException {

		// *** OPENING TOR BROWSER ***

		/*
		 * System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
		 * String torPath = "C:\\Users\\HP\\Desktop\\Tor Browser\\Browser\\firefox.exe";
		 * String profilePath =
		 * "C:\\Users\\HP\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default"
		 * ;
		 * 
		 * File torProfileDir = new File(profilePath); FirefoxBinary binary = new
		 * FirefoxBinary(new File(torPath)); FirefoxProfile torProfile = new
		 * FirefoxProfile(torProfileDir);
		 * 
		 * FirefoxOptions options = new FirefoxOptions(); options.setBinary(binary);
		 * options.setProfile(torProfile);
		 * options.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options); WebDriver
		 * driver = new FirefoxDriver(options);
		 */

		JSONObject o1 = new JSONObject();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Lib\\geckodriver-v0.26.0-win64\\geckodriver.exe"); WebDriver driver =
		 * new FirefoxDriver();
		 */

		System.setProperty("webdriver.chrome.driver",
				"D:\\Lib\\chrome_driver_latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// browserproxy();

		driver.get("https://www.amazon.com");

		/*
		 * driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();
		 * driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); String
		 * Parent_Window1 = driver.getWindowHandle();
		 * 
		 * for (String Child_Window : driver.getWindowHandles()) {
		 * driver.switchTo().window(Child_Window);
		 * 
		 * // action on child window
		 * 
		 * driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys(
		 * "41048"); WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(
		 * By.xpath("//span[@id='GLUXZipUpdate']//input[@class='a-button-input']"))).
		 * click(); // driver.findElement(By.xpath(
		 * "//span[@id='GLUXZipUpdate']//input[@class='a-button-input']")).click();
		 * driver.findElement(By.xpath("//button[@name='glowDoneButton']")).click(); }
		 * // Switching back to Parent Window driver.switchTo().window(Parent_Window1);
		 */

		try {

			FileInputStream file = new FileInputStream(new File("D:\\ExcelReadAutomated\\amazonscrap.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				String keyword = sheet.getRow(i).getCell(0).getStringCellValue();

				searchBox.clear();
				searchBox.sendKeys(keyword);
				searchBox.submit();

				try {

					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("scroll(0,150)");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath(
							"//div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]"))
							.click();
						
					// ***PRIME NON-PRIME***
					try {
						String text = driver.findElement(By.xpath("//div[@id='merchant-info']")).getText();
						if (text.contains("Amazon")) {
							o1.put("primenonprime", "PRIME");

						} else {

							o1.put("primenonprime", "NON-PRIME");

						}

					} catch (NoSuchElementException e) {

					}

					// ***TITLE***
					try {

						String title = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();

						o1.put("TITLE", title);

					} catch (Exception e) {

					}

					
					// ***IN STOCK OR OUT OF STOCK***
					WebElement outin = null;
					try {
						 outin = driver.findElement(By.xpath("//span[contains(text(),'Currently unavailable.')]"));	 
						 
					} catch (NoSuchElementException e) {


					}
					
						if (outin != null) {
							
							o1.put("STOCK", "Out of Stock");
						}
						
						else {
							o1.put("STOCK", "In Stock");

					}

						
					// ***PRICE***
					WebElement pri = null;	
					try {
						
						pri = driver.findElement(By.xpath("//span[@id='priceblock_ourprice' or @id='priceblock_saleprice']"));
						
					} catch (NoSuchElementException e) {

					}
					if (pri != null) {
						String price = driver
								.findElement(
										By.xpath("//span[@id='priceblock_ourprice' or @id='priceblock_saleprice']"))
								.getText();

						o1.put("PRICE", price);
					} else {
						driver.findElement(By.xpath("//a[@id='buybox-see-all-buying-choices-announce']")).click();
						driver.findElement(By.xpath("//input[@name='olpCheckbox_new']")).click();
						String Offerlisting = driver.findElement(By.xpath(
								"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]"))
								.getText();

						o1.put("PRICE", Offerlisting);
					}

					
					// ***SHIPPING***
					try {
						String shipping = driver.findElement(By.xpath(
								"//span[@id='ourprice_shippingmessage']//span[@class='a-size-base a-color-secondary']"))
								.getText();
						// TO BREAK THE ELEMENT TEXT
						String[] words = shipping.split(Pattern.quote("+"));
						String part1 = words[0];
						String part2 = words[1];
						String[] word = part2.split("shipping");
						String part3 = word[0];

						o1.put("SHIPPING", part3);

					} catch (NoSuchElementException e) {

					}

					
					// ***CATEGORY NAME***
					try {

						String category = driver
								.findElement(By.xpath("//div[@id='wayfinding-breadcrumbs_container']//li[1]//span[1]"))
								.getText();
						o1.put("CATEGORY", category);

					} catch (NoSuchElementException e) {

					}

					
					// ***DIMENSION & WEIGHT***
					WebElement dim = null;
					try {
						dim = driver.findElement(By.xpath("//td[contains(text(),'inches')]"));
						
						
					} catch (NoSuchElementException e) {

					}
					
					if (dim != null) {
						String dimension = driver.findElement(By.xpath("//td[contains(text(),'inches')]"))
								.getText();

						o1.put("DIMENSION", dimension);

						String weight = driver
								.findElement(By
										.xpath("//td[contains(text(),' pounds ') or contains(text(),' ounces ')]"))
								.getText();

						// TO BREAK THE ELEMENT TEXT
						String[] wordss = weight.split(Pattern.quote(" ("));
						String part4 = wordss[0];
						String part5 = wordss[1];

						o1.put("WEIGHT", part4);
					} else {
						/*
						 * String dimentionli =
						 * driver.findElement(By.xpath("//li[contains(text(),'inches')]")).getText();
						 * System.out.print(dimentionli);
						 */
						String weightli = driver
								.findElement(
										By.xpath("//li[contains(text(),'pounds') or contains(text(),'ounces')]"))
								.getText();

						o1.put("WEIGHT", weightli);
					}


					// TO GET ALL THE ELEMENTS UNDER SAME XPATH(ALL THE FILTER OPTIONS)

					/*
					 * ArrayList<String> productName = new ArrayList<String>();
					 * java.util.List<WebElement> allProductsName = driver.findElements(By.
					 * xpath("//div[@class=\"a-section a-spacing-small\"]//span[@class=\"a-size-base a-color-base a-text-bold\"]"
					 * )); for(WebElement w : allProductsName) { productName.add(w.getText()); }
					 * System.out.println(productName);
					 */

					System.out.println(o1);
					o1.clear();

				} catch (NoSuchElementException e) {

					System.out.println("NO RESULT");

					driver.get("https://www.amazon.com");

				}

			}

		}

		catch (NoSuchElementException e) {

			System.out.println("NO RESULT");
			driver.get("https://www.amazon.com");

		}

	}
}
