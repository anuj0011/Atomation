package packagecurrency;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClassCuurency {
	public WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver_win32\\chromedriver4.exe");
		
		WebDriver driver =  new ChromeDriver();

		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		/* String Parent_Window = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 for (String Child_Window : driver.getWindowHandles())  
		 {  
		 driver.switchTo().window(Child_Window); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[5]/div/div/div[2]/div/a[1]")).click();
		 }
		 
		 driver.switchTo().window(Parent_Window); */
		
		Keyboard keyboard=((RemoteWebDriver) driver).getKeyboard();
		keyboard.pressKey(Keys.ESCAPE);
		
		/* Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE); */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to aed");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click(); 
		String TextBox = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();   // .sendKeys(Keys.chord(Keys.CONTROL, "c"));
		System.out.println("AED "+TextBox);
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to ARS");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox2 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ARS "+TextBox2);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to AUD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox3 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("AUD "+TextBox3);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to BHD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox4 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("BHD "+TextBox4);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to BRL");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox5 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("BRL "+TextBox5);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CAD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox6 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CAD "+TextBox6);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CHF");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox7 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CHF "+TextBox7);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CLP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox8 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CLP "+TextBox8);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to COP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox9 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("COP "+TextBox9);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CZK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox10 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CZK "+TextBox10);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to DKK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox11 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("DKK "+TextBox11);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to EGP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox12 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("EGP "+TextBox12);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to EUR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox13 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("EUR "+TextBox13);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to GBP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox14 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("GBP "+TextBox14);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to IDR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox15 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("IDR "+TextBox15);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to INR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox16 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("INR "+TextBox16);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to JOD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox17 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("JOD "+TextBox17);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to JPY");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox18 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("JPY "+TextBox18);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to KWD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox19 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("KWD "+TextBox19);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to LBP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox20 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("LBP "+TextBox20);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MAD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox21 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MAD "+TextBox21);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MXN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox22 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MXN "+TextBox22);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MYR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox23 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MYR "+TextBox23);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to NOK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox24 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("NOK "+TextBox24);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to NZD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox25 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("NZD "+TextBox25);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to OMR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox26 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("OMR "+TextBox26);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PHP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox27 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PHP "+TextBox27);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PLN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox28 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PLN "+TextBox28);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to QAR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox29 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("QAR "+TextBox29);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to RUB");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox30 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("RUB "+TextBox30);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to SAR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox31 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("SAR "+TextBox31);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to SGD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox32 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("SGD "+TextBox32);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to TRY");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox33 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("TRY "+TextBox33);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to zar");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox34 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ZAR "+TextBox34);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CNY");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox35 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CNY "+TextBox35);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to HKD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox36 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("HKD "+TextBox36);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to HUF");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox37 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("HUF "+TextBox37);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to IDR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox38 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("IDR "+TextBox38);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to ILS");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox39 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ILS "+TextBox39);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to IRR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox40 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("IRR "+TextBox40);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to ISK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox41 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ISK "+TextBox41);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to KRW");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox42 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("KRW "+TextBox42);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MVR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox43 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MVR "+TextBox43);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PEN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox44 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PEN "+TextBox44);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to SEK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox45 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("SEK "+TextBox45);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to THB");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox46 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("THB "+TextBox46);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to TWD");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox47 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("TWD "+TextBox47);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to UAH");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox48 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("UAH "+TextBox48);
		
		System.out.println("USD 1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to VND");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox49 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("VND "+TextBox49);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to AOA");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox50 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("AOA "+TextBox50);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to BDT");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox51 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("BDT "+TextBox51);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to BYN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox52 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("BYN "+TextBox52);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CFA");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox53 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CFA "+TextBox53);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to CRC");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox54 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("CRC "+TextBox54);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to DOP");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox55 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("DOP "+TextBox55);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to ETB");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox56 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ETB "+TextBox56);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to GEL");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox57 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("GEL "+TextBox57);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to GHS");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox58 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("GHS "+TextBox58);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to GTQ");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox59 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("GTQ "+TextBox59);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to KES");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox60 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("KES "+TextBox60);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to KHR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox61 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("KHR "+TextBox61);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to KZT");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox62 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("KZT "+TextBox62);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to LKR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox63 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("LKR "+TextBox63);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MGA");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox64 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MGA "+TextBox64);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MMK");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox65 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MMK "+TextBox65);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MUR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox66 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MUR "+TextBox66);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to MZN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox67 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("MZN "+TextBox67);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to NGN");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox68 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("NGN "+TextBox68);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to NIO");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox69 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("NIO "+TextBox69);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to NPR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox70 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("NPR "+TextBox70);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PAB");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox71 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PAB "+TextBox71);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PKR");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox72 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PKR "+TextBox72);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to PYG");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox73 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("PYG "+TextBox73);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to RON");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox74 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("RON "+TextBox74);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to SVC");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox75 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("SVC "+TextBox75);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to TND");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox76 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("TND "+TextBox76);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to TZS");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox77 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("TZS "+TextBox77);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to UGX");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox78 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("UGX "+TextBox78);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to UZS");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox79 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("UZS "+TextBox79);
		
Thread.sleep(2000);
		driver.get("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=VEF");
		String TextBox80 = driver.findElement(By.xpath("//span[@class='converterresult-toAmount']")).getText();
		System.out.println("VEF "+TextBox80);
		
Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to XAF");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		String TextBox81 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("XAF "+TextBox81);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to XOF");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox82 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("XOF "+TextBox82);
		
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("1 usd to ZMW");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button")).click();
		String TextBox83 = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']")).getText();
		System.out.println("ZMW "+TextBox83);
		
Thread.sleep(2000);
		
		driver.get("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=ZWD");
		String TextBox84 = driver.findElement(By.xpath("//span[@class='converterresult-toAmount']")).getText();
		System.out.println("ZWL or ZWD "+TextBox84);
			
		

	}

}
