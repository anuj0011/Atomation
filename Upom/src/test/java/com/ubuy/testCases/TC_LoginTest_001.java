package com.ubuy.testCases;

import org.testng.annotations.Test;

import com.ubuy.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	/**
	 * @author ${Shailendra}
	 * @throws Exception 
	 *
	 * 
	 */
	
	@Test
	public void logintest() throws Exception
	
	{
		
		log.info("URL Is Open");
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		log.info("Enter Username");
		
		
		lp.setPassword(password);
		log.info("Enter Password");
		
		
		
		
		lp.ClickLogin();
		log.info("Click On Login Button");
		
		
		
	}
	
	
	
			

}
