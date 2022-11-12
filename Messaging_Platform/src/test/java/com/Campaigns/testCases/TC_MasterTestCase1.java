package com.Campaigns.testCases;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.AutoResponsesPage;
import com.Campaigns.pageObjects.CompliancePage;
import com.Campaigns.pageObjects.CreateCampaignPage;
import com.Campaigns.pageObjects.KeywordsPage;
import com.Campaigns.pageObjects.MessageSchedulingPage;
import com.Campaigns.pageObjects.OptinListsPage;
import com.Campaigns.pageObjects.SMSInboxPage;
import com.Campaigns.pageObjects.UpdateCampaignPage;
import com.opencsv.CSVReader;

public class TC_MasterTestCase1 extends BaseClass
{
	
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Master Flow Test Data.csv";
	
	@Test (priority = 9)
	public void CreateCampaign() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		String [] secondrow=reader.readNext();
		
		String [] a=reader.readNext();
		String campaignname = a[0];
		String audiencelistname = a[1];
		String optinemail = a[2];
		
		
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		Thread.sleep(3000);
		ccp.createCampaign();
		
		//String campaignname = "Campaign" + randomNum();
		ccp.enterCampaignName(campaignname);
		logger.info("Entered Campaign Name");
		
		Thread.sleep(3000);
		ccp.selectCountry();
		logger.info("Selected Country");
		//Thread.sleep(3000);
		ccp.selectShortcode();
		logger.info("Selected Shortcode");
		//Thread.sleep(3000);
		ccp.selectAudienceList();
		logger.info("Selected Audience List");
		Thread.sleep(3000);
	
		//String audiencelistname = "List" + randomNum();
		ccp.enterAudienceListName(audiencelistname);
		ccp.clickAdd();
		logger.info("Added Sender");
		
		//ccp.shortcodeMask();
		
		ccp.consentRequestON();
		//ccp.consentRequestOFF();
		ccp.consentConfirmationON();
		//ccp.consentConfirmationOFF();
		ccp.resendoptinON();
		//ccp.resendoptinOFF();
		ccp.resendARON();
		//ccp.resendAROFF();
		
		//ccp.deleteCollectedDataON();
		//ccp.deleteCollectedDataOFF();
		//ccp.dataDeleteSpan();
		
		Thread.sleep(3000);
		ccp.optinNotice();
		
		//String optinemail = "Skycore" + randomNum()+"@gmail.com";
		ccp.optinNoticeEmail(optinemail);
		logger.info("Entered Opt-in Email Address");
		
		//Thread.sleep(3000);
		ccp.forwardMMS();
		ccp.selectMMSInbox();
		logger.info("Selected MMS Inbox");
		//Thread.sleep(3000);*/
		ccp.submitCampaign();
		logger.info("Campaign Info Submitted");
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/b")).getText();
		String expected = "Success:";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "CreateCampaignPass1");
			Assert.assertTrue(true);
			logger.info("Campaign Created Successfully");
		}
		else
		{
			captureScreen(driver, "CreateCampaignFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Create Campaign");
		}
		
		Thread.sleep(5000);
		
	}
	
	
	@Test (priority = 10)
	public void UpdateCampaign() throws Exception
	{
	 
		UpdateCampaignPage uc = new UpdateCampaignPage(driver);
		
		uc.selectCampaign();
		Thread.sleep(5000);
		/*uc.editCampaignName();
		
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
		logger.info("Added Sender");*/
		
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
		
		/*Thread.sleep(1000);
		uc.optinNotice();
				
		String optinemail = randomstring()+"@gmail.com";
		uc.optinNoticeEmail(optinemail);
		logger.info("Entered Opt-in Email Address");
				
		//Thread.sleep(1000);
		uc.forwardMMS();
		uc.selectMMSInbox();
		logger.info("Selected MMS Inbox");*/
		
		Thread.sleep(1000);
		uc.updateCampaign();
		
		String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/b")).getText();
		String expected = "Success:";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "UpdateCampaignPass1");
			Assert.assertTrue(true);
			logger.info("Campaign Updated Successfully");
		}
		else
		{
			captureScreen(driver, "UpdateCampaignFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Update Campaign");
		} 
			
			Thread.sleep(5000);
	}
	
	
	@Test (priority = 11)
	public void Compliance() throws Exception
	{
 
		CompliancePage cp = new CompliancePage(driver);
		
		cp.complianceTab();
		
		captureScreen(driver, "CompliancePass1");
			
			Thread.sleep(5000);
	}
	
	
	@Test (priority = 12)
	public void OptinList() throws Exception
	{
		
        OptinListsPage optin = new OptinListsPage(driver);
		
		//optin.optinListLink();
        optin.optinListTab();
        Thread.sleep(3000);
		optin.selectOptinList();
		Thread.sleep(3000);
		//optin.searchPhoneNumber();
		//optin.selectTimeZone();
		//optin.selectCarrier(carrier3);
		//optin.filterResults();
		//Thread.sleep(3000);
		/*optin.unconfirmed();
		Thread.sleep(3000);
		optin.subscribed();
		optin.exportAllSubscribed();
		optin.removeAllSubscribed();
		optin.removeAllSubscribedYes();*/
		optin.addImportNum();
		Thread.sleep(3000);
		/*optin.addNumber();
		optin.enterNumber();
		optin.addButton();
		optin.optoutNotify();
		optin.optout();
		optin.optoutConfirm();*/
		/*optin.deleteCheckbox();
		optin.deletebButton();	
		optin.deleteNumberConfirm();*/
		optin.uploadCSV();
		optin.selectColumn();
		//optin.skipfFirstRow();
		Thread.sleep(3000);
		optin.importData();
		//Thread.sleep(5000);
		//optin.verifyOptinList();
		//optin.cancelImport();
		//optin.cancelImportYes();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[2]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "OptinListPass1");
			Assert.assertTrue(true);
			logger.info("Optin List Added Successfully");
		}
		else
		{
			captureScreen(driver, "OptinListFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Add Optin List"); 
		}
		
		Thread.sleep(5000);
		
	}
	
	@Test (priority = 13)
	public void MessageSchedule() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		String [] secondrow=reader.readNext();
		
		String [] a=reader.readNext();
		String SMStext = a[3];
		
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		ccp.campaignsMenu();
		Thread.sleep(3000);
		
		UpdateCampaignPage uc = new UpdateCampaignPage(driver);
		uc.selectCampaign();
		Thread.sleep(3000);
		
		MessageSchedulingPage ms = new MessageSchedulingPage(driver);
		
		// SMS SCHEDULING
		
		//ms.messageSchedulingLink();
		ms.messageSchedulingTab();
		ms.sendSMS();
		ms.enterMSText(SMStext);
		Thread.sleep(3000);
		/*ms.DCFLever();
		ms.selectDCF();
		ms.webLink();*/
		ms.CTLever();
		ms.Submit();
		
		String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "SMSSchedulePass1");
			Assert.assertTrue(true);
			logger.info("SMS Scheduled Successfully");
		}
			else
			{
			captureScreen(driver, "SMSScheduleFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Schedule SMS");
		}
		
		Thread.sleep(5000);
		
		// MMS SCHEDULING
		
		ms.sendMMS();
		ms.selectMMSTemp();
		Thread.sleep(3000);
		ms.selectMMS();
		Thread.sleep(3000);
		ms.DCFLever();
		ms.selectDCF();
		Thread.sleep(3000);
		ms.msgSendingDate();
		ms.Submit();
		
        String actual1 = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		String expected1 = "Success!";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "MMSSchedulePass1");
			Assert.assertTrue(true);
			logger.info("MMS Scheduled Successfully");
		}
		else
		{
			captureScreen(driver, "MMSScheduleFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Schedule MMS");
		}
		
	}
	
	
	@Test (priority = 14)
	public void AutoResponse() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		String [] secondrow=reader.readNext();
		
		String [] a=reader.readNext();
		String SMStext = a[4];
		
		AutoResponsesPage ar = new AutoResponsesPage(driver);
		
		// SMS AUTO RESPONSES
		
		//ar.autoResponsesLink();
		ar.autoResponsesTab();
		ar.sendSMS();		
		ar.enterARText(SMStext);
		Thread.sleep(3000);
		/*ar.DCFLever();
		ar.selectDCF();
		ar.webLink();
		ar.questionText();*/
		ar.ARSetup();
		ar.timeSetup();
		ar.timeSetupUnit();
		ar.CTLever();
		ar.scheduleAR();			
					
        String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "SMSAutoResponsePass1");
			Assert.assertTrue(true);
			logger.info("SMS Auto Response Created Successfully");
		}
		else
		{
			captureScreen(driver, "SMSAutoResponseFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Create SMS Auto Response");
		} 
		
		Thread.sleep(5000);
		
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
		ar.timeSetup();
		ar.timeSetupUnit();
		Thread.sleep(3000);
		/*ar.recurringHours();
		ar.recurringMinutes();
		ar.recurringMeridiem();
		ar.recurringTimezone();
		ar.recurringDays();*/
		ar.scheduleAR();
		
		String actual1 = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();		
		String expected1 = "Success!";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "MMSAutoResponsePass1");
			Assert.assertTrue(true);
			logger.info("MMS Auto Response Created Successfully");
		}
		else
		{
			captureScreen(driver, "MMSAutoResponseFail1");
			Assert.assertTrue(false);
			logger.info("Failed to Create MMS Auto Response");
		}
		
		Thread.sleep(5000);
			
	}
	
	@Test (priority = 15)
	public void Keywords() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		String [] secondrow=reader.readNext();
		
		String [] a=reader.readNext();
		String keywordname = a[5];
		
		KeywordsPage kp = new KeywordsPage(driver);
    	
		//kp.keywordsLink();
    	kp.keywordsTab();
    	kp.addKeyword();
    	Thread.sleep(3000);
    	kp.selectCountry();
    	//String keywordname = "CAMP" + randomNum();
    	kp.typeKeyword(keywordname);
    	kp.saveKeyword();
    	//Thread.sleep(5000);
    	//kp.deleteKeyword();
    	//kp.deleteConfirm();
    	//logger.info("Keyword deleted successfully");
    	
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
    	
		Thread.sleep(5000);
    	
	}
	
	
	@Test (priority = 16)
	public void SMSInbox() throws IOException
	{
		SMSInboxPage smsinbox = new SMSInboxPage(driver);
		
		//smsinbox.smsInboxLink();
		smsinbox.smsInboxTab();
		//smsinbox.searchNumber();
		//smsinbox.searchButton();
		//smsinbox.generateCSV();
		
		captureScreen(driver, "SMSInboxPass2");
		
        /*String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		
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
		}*/
	
	}
	
}
