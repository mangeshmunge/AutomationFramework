package com.Campaigns.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.SMSInboxPage;

public class TC_SMSInbox_010 extends BaseClass
{

	@Test
	public void SMSInbox() throws IOException
	{
		SMSInboxPage smsinbox = new SMSInboxPage(driver);
		
		smsinbox.smsInboxLink();
		smsinbox.smsInboxTab();
		smsinbox.searchNumber();
		smsinbox.searchButton();
		smsinbox.generateCSV();
		
        String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "GenerateCSVPass");
			Assert.assertTrue(true);
			logger.info("CSV Generated Successfully");
		}
		else
		{
			captureScreen(driver, "GenerateCSVFail");
			Assert.assertTrue(false);
			logger.info("Failed to Export CSV");
		}
		
	}
}
