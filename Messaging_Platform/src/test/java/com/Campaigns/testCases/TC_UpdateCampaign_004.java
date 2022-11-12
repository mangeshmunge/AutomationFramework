package com.Campaigns.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.UpdateCampaignPage;

public class TC_UpdateCampaign_004 extends BaseClass
{
 
	@Test
	public void UpdateCampaign() throws Exception
	{
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UpdateCampaignPage uc = new UpdateCampaignPage(driver);
		
		uc.selectCampaign();
		uc.editCampaignName();
		
		String campname = randomstring();
		uc.entercCampaignName(campname);
		
		String campid = randomNum();
		uc.editCampaignID(campid);
		
		uc.selectCountry();
		logger.info("Selected Country");
		Thread.sleep(1000);
		uc.selectShortcode();
		logger.info("Selected Shortcode");
		Thread.sleep(1000);
		uc.selectAudienceList();
		logger.info("Selected Audience List");
		Thread.sleep(1000);
	
		String audiencelistname = randomstring();
		uc.enterAudienceListName(audiencelistname);
		uc.clickAdd();
		logger.info("Added Sender");
		
		//uc.shortcodeMask();
		
		//uc.consentRequestON();
		uc.consentRequestOFF();
		//uc.consentConfirmationON();
		uc.consentConfirmationOFF();
		uc.resendoptinON();
		//uc.resendoptinOFF();
		uc.resendARON();
		//uc.resendAROFF();
		
		//uc.deleteCollectedDataON();
		uc.deleteCollectedDataOFF();
		//uc.dataDeleteSpan();
		
		//Thread.sleep(1000);
		//uc.optinNotice();
				
		//String optinemail = randomstring()+"@gmail.com";
		//uc.optinNoticeEmail(optinemail);
		//logger.info("Entered Opt-in Email Address");
				
		//Thread.sleep(1000);
		uc.forwardMMS();
		uc.selectMMSInbox();
		logger.info("Selected MMS Inbox");
		
		Thread.sleep(1000);
		uc.updateCampaign();
		logger.info("Campaign Info Updated");
		
		
		if(driver.getTitle().equals("Campaigns")) 
		{
			captureScreen(driver, "UpdateCampaignPass");
			Assert.assertTrue(true);
			logger.info("Update Campaign Test Passed");
		}
		else
		{
			captureScreen(driver, "UpdateCampaignFail");
			Assert.assertTrue(false);
			logger.info("Update Campaign Test Failed");
		}
	}
	
}
