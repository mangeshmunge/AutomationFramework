package com.Campaigns.testCases;

import java.io.FileReader;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.CreateCampaignPage;
import com.opencsv.CSVReader;

public class TC_CreateCampaign_002 extends BaseClass
{
    
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/testData.csv";
	
	@Test
	public void CreateCampaign() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		
		ccp.createCampaign();
		
		String [] firstrow=reader.readNext();
		
		String [] abc=reader.readNext();
		String cname = abc[0];
		System.out.println(cname);
		String name = abc[1];
		System.out.println(name);
		
		
		String [] abc1=reader.readNext();
		String a = abc1[0];
		System.out.println(a);
		String b = abc1[1];
		System.out.println(b);
		
		String campaignname = randomstring();
		ccp.enterCampaignName(campaignname);
		logger.info("Entered Campaign Name");
		
		ccp.selectCountry();
		logger.info("Selected Country");
		//Thread.sleep(3000);
		ccp.selectShortcode();
		logger.info("Selected Shortcode");
		//Thread.sleep(3000);
		ccp.selectAudienceList();
		logger.info("Selected Audience List");
		//Thread.sleep(3000);
	
		String audiencelistname = randomstring();
		ccp.enterAudienceListName(audiencelistname);
		ccp.clickAdd();
		logger.info("Added Sender");
		
		//ccp.shortcodeMask();
		
		//ccp.consentRequestON();
		ccp.consentRequestOFF();
		ccp.consentConfirmationON();
		//ccp.consentConfirmationOFF();
		//ccp.resendoptinON();
		ccp.resendoptinOFF();
		ccp.resendARON();
		//ccp.resendAROFF();
		
		//ccp.deleteCollectedDataON();
		//ccp.deleteCollectedDataOFF();
		//ccp.dataDeleteSpan();
		
		//Thread.sleep(3000);
		/*ccp.optinNotice();
		
		String optinemail = randomstring()+"@gmail.com";
		ccp.optinNoticeEmail(optinemail);
		logger.info("Entered Opt-in Email Address");
		
		//Thread.sleep(3000);
		ccp.forwardMMS();
		ccp.selectMMSInbox();
		logger.info("Selected MMS Inbox");
		//Thread.sleep(3000);*/
		ccp.submitCampaign();
		logger.info("Campaign Info Submitted");
		
		/*String actual = driver.findElement(By.xpath("//b[contains(text(),'Success: ')]")).getText();
		
		String expected = "Success:";
		
		if(actual == expected)
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			captureScreen(driver, "createCampaign");
			System.out.println("Test Case Failed");
		}*/
		
				
		if(driver.getTitle().equals("Campaigns")) 
		{
			captureScreen(driver, "CreateCampaignPass");
			Assert.assertTrue(true);
			logger.info("Create Campaign Test Passed");
		}
		else
		{
			captureScreen(driver, "CreateCampaignFail");
			Assert.assertTrue(false);
			logger.info("Create Campaign Test Failed");
		}
		
		
	}
}
