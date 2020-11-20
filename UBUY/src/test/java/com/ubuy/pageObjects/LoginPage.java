package com.ubuy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/**
	 * @author ${Shailendra}
	 *
	 * 
	 */

	WebDriver ldriver;
// project rename
	
	// WebDriver rdriver is a parameter  And LoginPage is a class constructor
	
	public LoginPage(WebDriver rdriver)

	{
		// TODO Auto-generated constructor stub

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "login[username]")
	WebElement txtUsername;

	@FindBy(name = "login[password]")
	WebElement txtPassword;
	
	

	@FindBy(name = "send")
	WebElement btnLogin;

	public void setUserName(String uname) 
	{
		
		txtUsername.sendKeys(uname);
	}

	
	public void setPassword(String pwd)

	{

		txtPassword.sendKeys(pwd);
	}

	public void ClickLogin() {
		btnLogin.click();

	}
}
