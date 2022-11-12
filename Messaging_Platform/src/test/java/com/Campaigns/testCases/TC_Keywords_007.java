package com.Campaigns.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.KeywordsPage;

public class TC_Keywords_007 extends BaseClass
{

    @Test
	public void Keywords() throws IOException, Exception
	{
    	KeywordsPage kp = new KeywordsPage(driver);
    	
    	kp.keywordsLink();
    	//kp.keywordsTab();
    	kp.addKeyword();
    	Thread.sleep(3000);
    	kp.selectCountry();
    	String abc = "CAMP" + randomNum();
    	kp.typeKeyword(abc);
    	kp.saveKeyword();
    	/*Thread.sleep(5000);
    	kp.deleteKeyword();
    	kp.deleteConfirm();
    	logger.info("Keyword deleted successfully");*/
    	
		
    	String actual = driver.findElement(By.xpath("//strong[contains(text(),'Success!')]")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "KeywordsPass");
			Assert.assertTrue(true);
			logger.info("Keyword added Successfully");
		}
		else
		{
			captureScreen(driver, "KeywordsFail");
			Assert.assertTrue(false);
			logger.info("Failed to Add Keyword");
		}
    	
	}
}
