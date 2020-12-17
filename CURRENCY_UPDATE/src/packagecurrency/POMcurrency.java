package packagecurrency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMcurrency {

	WebDriver driver;
	WebElement element;

	public POMcurrency(WebDriver driver) {
		// super();
		this.driver = driver;
	}

	public WebElement search() {
		element = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		return element;
	}

	public WebElement button() {
		element = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[1]/div[2]/button"));
		return element;
	}

	public WebElement currency() {
		element = driver.findElement(By.xpath("//span[@class='DFlfde SwHCTb']"));
		return element;
	}

}
