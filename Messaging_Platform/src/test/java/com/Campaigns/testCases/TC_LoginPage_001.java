package com.Campaigns.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass //EXTENDED BASECLASS TO ACCESS THE PROPERTIES/METHODS FROM BASECLASS
{
   
	// @Test IS USED TO EXECUTE THE TEST CASES IN TESTNG
	
	@Test 
	public void loginTest() throws IOException, Exception
	{
	
	// CREATED OBJECT/INSTANCE OF LOGINPAGE CLASS TO ACCESS THE ELEMENTS/METHODS AND PERFORM THE ACTIONS NEEDED
		
		LoginPage lp = new LoginPage(driver);
		
		/*lp.userName(username);
		logger.info("Entered Username");
		
		lp.password(password);
		logger.info("Entered Password");
		
		lp.loginButton();
		logger.info("Clicked on login button");
		
		Thread.sleep(3000);*/
		lp.logOut();
		logger.info("Clicked on logout button");
		
		
		// USED VALIDATION FOR PASSED AND FAILED TEST CASES
		
		
		if(driver.getTitle().equals("Sign in")) 
		{
			captureScreen(driver, "loginTestPass");
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver, "loginTestFail");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
	
}
