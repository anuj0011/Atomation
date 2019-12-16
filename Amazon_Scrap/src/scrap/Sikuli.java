package scrap;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class Sikuli {
	@Test
	public static void browserproxy() throws FindFailed, AWTException, InterruptedException {
		
		// FOR FIREFOX PROXY SETTING
	/*	Screen screen = new Screen();

		Pattern image9 = new Pattern("D:\\sikuli_image\\image9.PNG");
		Pattern image10 = new Pattern("D:\\sikuli_image\\image10.PNG");
		Pattern image11 = new Pattern("D:\\sikuli_image\\image11.PNG");
		Pattern image12 = new Pattern("D:\\sikuli_image\\image12.PNG");
		Pattern image13 = new Pattern("D:\\sikuli_image\\image13.PNG");
		Pattern image14 = new Pattern("D:\\sikuli_image\\image14.PNG");
		Pattern image15 = new Pattern("D:\\sikuli_image\\image15.PNG");
		Pattern image16 = new Pattern("D:\\sikuli_image\\image16.PNG");

		// screen.wait(image4 , 10);
		Robot robot = new Robot();

		screen.click(image9);
		screen.click(image10);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);

		screen.click(image11);
		screen.click(image12);
		screen.type(image13, "127.0.0.1");

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);

		screen.click(image14);

		robot.keyPress(KeyEvent.VK_DOWN);

		screen.type(image15, "localhost,127.0.0.1");
		screen.click(image16); */
		
		
		// FOR CHROME PROXY SETTING
		Screen screen = new Screen();

		Pattern image1 = new Pattern("D:\\sikuli_image\\chromeproxy\\image1.PNG");
		Pattern image2 = new Pattern("D:\\sikuli_image\\chromeproxy\\image2.PNG");
		Pattern image3 = new Pattern("D:\\sikuli_image\\chromeproxy\\image3.PNG");
		Pattern image4 = new Pattern("D:\\sikuli_image\\chromeproxy\\image4.PNG");
		Pattern image5 = new Pattern("D:\\sikuli_image\\chromeproxy\\image5.PNG");
		Pattern image6 = new Pattern("D:\\sikuli_image\\chromeproxy\\image6.PNG");
		Pattern image7 = new Pattern("D:\\sikuli_image\\chromeproxy\\image7.PNG");
		Pattern image8 = new Pattern("D:\\sikuli_image\\chromeproxy\\image8.PNG");
		Pattern image9 = new Pattern("D:\\sikuli_image\\chromeproxy\\image9.PNG");
		Pattern image10 = new Pattern("D:\\sikuli_image\\chromeproxy\\image10.PNG");
		Pattern image11 = new Pattern("D:\\sikuli_image\\chromeproxy\\image11.PNG");

		Robot robot = new Robot();

		screen.click(image1);
		screen.click(image2);
		screen.click(image3);
		screen.click(image4);
		screen.click(image5);
		
		Thread.sleep(3000);
		screen.type(Key.UP, KeyModifier.WIN);
		
		screen.click(image6);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		screen.type(image7, "127.0.0.1");
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		screen.type(Key.NUM2);
		screen.type(Key.NUM4);
		screen.type(Key.NUM0);
		screen.type(Key.NUM0);
		screen.type(Key.NUM0);


		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		screen.type(image9, "localhost,127.0.0.1");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		screen.click(image11);
		screen.type(Key.PAGE_UP, KeyModifier.CTRL);

	}
}