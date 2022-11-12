package com.Campaigns.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.AutoResponsesPage;

public class TC_AutoResponses_008 extends BaseClass
{

	@Test
	public void AutoResponse() throws IOException, Exception
	{
		
		AutoResponsesPage ar = new AutoResponsesPage(driver);
		
		// SMS AUTO RESPONSES
		
		ar.autoResponsesLink();
		//ar.autoResponsesTab();
		//ar.sendSMS();		
		/*ar.enterARText();
		ar.DCFLever();
		ar.selectDCF();
		ar.webLink();
		ar.questionText();
		ar.ARSetup();
		ar.timeSetup();
		ar.timeSetupUnit();
		ar.CTLever();
		ar.scheduleAR();*/
		
		// MMS AUTO RESPONSES
		
		ar.sendMMS();
		ar.selectMMSTemp();
		
		Thread.sleep(3000);
		//ar.searchTemp();
		//ar.searchTempButton();
		ar.selectMMS();
		
		Thread.sleep(3000);
		ar.DCFLever();
		ar.selectDCF();
		ar.ARSetup();
		//ar.timeSetup();
		//ar.timeSetupUnit();
		Thread.sleep(3000);
		ar.recurringHours();
		ar.recurringMinutes();
		ar.recurringMeridiem();
		ar.recurringTimezone();
		ar.recurringDays();
		ar.scheduleAR();
		
		
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "AutoResponsePass");
			Assert.assertTrue(true);
			logger.info("Auto Response Created Successfully");
		}
		else
		{
			captureScreen(driver, "AutoResponseFail");
			Assert.assertTrue(false);
			logger.info("Failed to Create Auto Response");
		}
			
	}
	
	
}
