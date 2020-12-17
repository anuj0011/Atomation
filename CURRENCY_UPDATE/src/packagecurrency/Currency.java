package packagecurrency;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Currency {

	static WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/anuj/chromedriver_linux64/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		// creating object from POMcurrency class
		POMcurrency ele = new POMcurrency(driver);

		Keyboard keyboard = ((RemoteWebDriver) driver).getKeyboard();
		keyboard.pressKey(Keys.ESCAPE);

		/*
		 * Actions action = new Actions(driver); action.sendKeys(Keys.ESCAPE);
		 */
		Thread.sleep(2000);

		ele.search().sendKeys("1 usd to aed");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		String TextBox = ele.currency().getText(); // .sendKeys(Keys.chord(Keys.CONTROL, "c"));
		System.out.println("AED " + TextBox);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to ARS");
		ele.button().click();
		String TextBox2 = ele.currency().getText();
		System.out.println("ARS " + TextBox2);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to AUD");
		ele.button().click();
		String TextBox3 = ele.currency().getText();
		System.out.println("AUD " + TextBox3);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to BHD");
		ele.button().click();
		String TextBox4 = ele.currency().getText();
		System.out.println("BHD " + TextBox4);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to BRL");
		ele.button().click();
		String TextBox5 = ele.currency().getText();
		System.out.println("BRL " + TextBox5);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CAD");
		ele.button().click();
		String TextBox6 = ele.currency().getText();
		System.out.println("CAD " + TextBox6);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CHF");
		ele.button().click();
		String TextBox7 = ele.currency().getText();
		System.out.println("CHF " + TextBox7);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CLP");
		ele.button().click();
		String TextBox8 = ele.currency().getText();
		System.out.println("CLP " + TextBox8);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to COP");
		ele.button().click();
		String TextBox9 = ele.currency().getText();
		System.out.println("COP " + TextBox9);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CZK");
		ele.button().click();
		String TextBox10 = ele.currency().getText();
		System.out.println("CZK " + TextBox10);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to DKK");
		ele.button().click();
		String TextBox11 = ele.currency().getText();
		System.out.println("DKK " + TextBox11);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to EGP");
		ele.button().click();
		String TextBox12 = ele.currency().getText();
		System.out.println("EGP " + TextBox12);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to EUR");
		ele.button().click();
		String TextBox13 = ele.currency().getText();
		System.out.println("EUR " + TextBox13);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to GBP");
		ele.button().click();
		String TextBox14 = ele.currency().getText();
		System.out.println("GBP " + TextBox14);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to IDR");
		ele.button().click();
		String TextBox15 = ele.currency().getText();
		System.out.println("IDR " + TextBox15);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to INR");
		ele.button().click();
		String TextBox16 = ele.currency().getText();
		System.out.println("INR " + TextBox16);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to JOD");
		ele.button().click();
		String TextBox17 = ele.currency().getText();
		System.out.println("JOD " + TextBox17);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to JPY");
		ele.button().click();
		String TextBox18 = ele.currency().getText();
		System.out.println("JPY " + TextBox18);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to KWD");
		ele.button().click();
		String TextBox19 = ele.currency().getText();
		System.out.println("KWD " + TextBox19);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to LBP");
		ele.button().click();
		String TextBox20 = ele.currency().getText();
		System.out.println("LBP " + TextBox20);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MAD");
		ele.button().click();
		String TextBox21 = ele.currency().getText();
		System.out.println("MAD " + TextBox21);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MXN");
		ele.button().click();
		String TextBox22 = ele.currency().getText();
		System.out.println("MXN " + TextBox22);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MYR");
		ele.button().click();
		String TextBox23 = ele.currency().getText();
		System.out.println("MYR " + TextBox23);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to NOK");
		ele.button().click();
		String TextBox24 = ele.currency().getText();
		System.out.println("NOK " + TextBox24);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to NZD");
		ele.button().click();
		String TextBox25 = ele.currency().getText();
		System.out.println("NZD " + TextBox25);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to OMR");
		ele.button().click();
		String TextBox26 = ele.currency().getText();
		System.out.println("OMR " + TextBox26);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PHP");
		ele.button().click();
		String TextBox27 = ele.currency().getText();
		System.out.println("PHP " + TextBox27);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PLN");
		ele.button().click();
		String TextBox28 = ele.currency().getText();
		System.out.println("PLN " + TextBox28);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to QAR");
		ele.button().click();
		String TextBox29 = ele.currency().getText();
		System.out.println("QAR " + TextBox29);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to RUB");
		ele.button().click();
		String TextBox30 = ele.currency().getText();
		System.out.println("RUB " + TextBox30);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to SAR");
		ele.button().click();
		String TextBox31 = ele.currency().getText();
		System.out.println("SAR " + TextBox31);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to SGD");
		ele.button().click();
		String TextBox32 = ele.currency().getText();
		System.out.println("SGD " + TextBox32);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to TRY");
		ele.button().click();
		String TextBox33 = ele.currency().getText();
		System.out.println("TRY " + TextBox33);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to zar");
		ele.button().click();
		String TextBox34 = ele.currency().getText();
		System.out.println("ZAR " + TextBox34);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CNY");
		ele.button().click();
		String TextBox35 = ele.currency().getText();
		System.out.println("CNY " + TextBox35);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to HKD");
		ele.button().click();
		String TextBox36 = ele.currency().getText();
		System.out.println("HKD " + TextBox36);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to HUF");
		ele.button().click();
		String TextBox37 = ele.currency().getText();
		System.out.println("HUF " + TextBox37);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to IDR");
		ele.button().click();
		String TextBox38 = ele.currency().getText();
		System.out.println("IDR " + TextBox38);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to ILS");
		ele.button().click();
		String TextBox39 = ele.currency().getText();
		System.out.println("ILS " + TextBox39);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to IRR");
		ele.button().click();
		String TextBox40 = ele.currency().getText();
		System.out.println("IRR " + TextBox40);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to ISK");
		ele.button().click();
		String TextBox41 = ele.currency().getText();
		System.out.println("ISK " + TextBox41);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to KRW");
		ele.button().click();
		String TextBox42 = ele.currency().getText();
		System.out.println("KRW " + TextBox42);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MVR");
		ele.button().click();
		String TextBox43 = ele.currency().getText();
		System.out.println("MVR " + TextBox43);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PEN");
		ele.button().click();
		String TextBox44 = ele.currency().getText();
		System.out.println("PEN " + TextBox44);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to SEK");
		ele.button().click();
		String TextBox45 = ele.currency().getText();
		System.out.println("SEK " + TextBox45);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to THB");
		ele.button().click();
		String TextBox46 = ele.currency().getText();
		System.out.println("THB " + TextBox46);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to TWD");
		ele.button().click();
		String TextBox47 = ele.currency().getText();
		System.out.println("TWD " + TextBox47);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to UAH");
		ele.button().click();
		String TextBox48 = ele.currency().getText();
		System.out.println("UAH " + TextBox48);

		System.out.println("USD 1");

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to VND");
		ele.button().click();
		String TextBox49 = ele.currency().getText();
		System.out.println("VND " + TextBox49);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to AOA");
		ele.button().click();
		String TextBox50 = ele.currency().getText();
		System.out.println("AOA " + TextBox50);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to BDT");
		ele.button().click();
		String TextBox51 = ele.currency().getText();
		System.out.println("BDT " + TextBox51);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to BYN");
		ele.button().click();
		String TextBox52 = ele.currency().getText();
		System.out.println("BYN " + TextBox52);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CFA");
		ele.button().click();
		String TextBox53 = ele.currency().getText();
		System.out.println("CFA " + TextBox53);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to CRC");
		ele.button().click();
		String TextBox54 = ele.currency().getText();
		System.out.println("CRC " + TextBox54);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to DOP");
		ele.button().click();
		String TextBox55 = ele.currency().getText();
		System.out.println("DOP " + TextBox55);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to ETB");
		ele.button().click();
		String TextBox56 = ele.currency().getText();
		System.out.println("ETB " + TextBox56);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to GEL");
		ele.button().click();
		String TextBox57 = ele.currency().getText();
		System.out.println("GEL " + TextBox57);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to GHS");
		ele.button().click();
		String TextBox58 = ele.currency().getText();
		System.out.println("GHS " + TextBox58);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to GTQ");
		ele.button().click();
		String TextBox59 = ele.currency().getText();
		System.out.println("GTQ " + TextBox59);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to KES");
		ele.button().click();
		String TextBox60 = ele.currency().getText();
		System.out.println("KES " + TextBox60);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to KHR");
		ele.button().click();
		String TextBox61 = ele.currency().getText();
		System.out.println("KHR " + TextBox61);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to KZT");
		ele.button().click();
		String TextBox62 = ele.currency().getText();
		System.out.println("KZT " + TextBox62);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to LKR");
		ele.button().click();
		String TextBox63 = ele.currency().getText();
		System.out.println("LKR " + TextBox63);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MGA");
		ele.button().click();
		String TextBox64 = ele.currency().getText();
		System.out.println("MGA " + TextBox64);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MMK");
		ele.button().click();
		String TextBox65 = ele.currency().getText();
		System.out.println("MMK " + TextBox65);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MUR");
		ele.button().click();
		String TextBox66 = ele.currency().getText();
		System.out.println("MUR " + TextBox66);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to MZN");
		ele.button().click();
		String TextBox67 = ele.currency().getText();
		System.out.println("MZN " + TextBox67);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to NGN");
		ele.button().click();
		String TextBox68 = ele.currency().getText();
		System.out.println("NGN " + TextBox68);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to NIO");
		ele.button().click();
		String TextBox69 = ele.currency().getText();
		System.out.println("NIO " + TextBox69);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to NPR");
		ele.button().click();
		String TextBox70 = ele.currency().getText();
		System.out.println("NPR " + TextBox70);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PAB");
		ele.button().click();
		String TextBox71 = ele.currency().getText();
		System.out.println("PAB " + TextBox71);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PKR");
		ele.button().click();
		String TextBox72 = ele.currency().getText();
		System.out.println("PKR " + TextBox72);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to PYG");
		ele.button().click();
		String TextBox73 = ele.currency().getText();
		System.out.println("PYG " + TextBox73);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to RON");
		ele.button().click();
		String TextBox74 = ele.currency().getText();
		System.out.println("RON " + TextBox74);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to SVC");
		ele.button().click();
		String TextBox75 = ele.currency().getText();
		System.out.println("SVC " + TextBox75);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to TND");
		ele.button().click();
		String TextBox76 = ele.currency().getText();
		System.out.println("TND " + TextBox76);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to TZS");
		ele.button().click();
		String TextBox77 = ele.currency().getText();
		System.out.println("TZS " + TextBox77);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to UGX");
		ele.button().click();
		String TextBox78 = ele.currency().getText();
		System.out.println("UGX " + TextBox78);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to UZS");
		ele.button().click();
		String TextBox79 = ele.currency().getText();
		System.out.println("UZS " + TextBox79);

		Thread.sleep(2000);
		driver.get("https://www.xe.com/ele.currency()converter/convert/?Amount=1&From=USD&To=VEF");
		String TextBox80 = driver.findElement(By.xpath("//span[@class='converterresult-toAmount']")).getText();
		System.out.println("VEF " + TextBox80);

		Thread.sleep(2000);
		driver.get("https://www.google.com");
		ele.search().clear();
		ele.search().sendKeys("1 usd to XAF");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		String TextBox81 = ele.currency().getText();
		System.out.println("XAF " + TextBox81);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to XOF");
		ele.button().click();
		String TextBox82 = ele.currency().getText();
		System.out.println("XOF " + TextBox82);

		Thread.sleep(2000);

		ele.search().clear();
		ele.search().sendKeys("1 usd to ZMW");
		ele.button().click();
		String TextBox83 = ele.currency().getText();
		System.out.println("ZMW " + TextBox83);

		Thread.sleep(2000);

		driver.get("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=ZWD");
		String TextBox84 = driver.findElement(By.xpath("//span[@class='converterresult-toAmount']")).getText();
		System.out.println("ZWL or ZWD " + TextBox84);

	}
}
