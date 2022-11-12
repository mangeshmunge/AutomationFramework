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
import com.Campaigns.pageObjects.SearchCampaignPage;
import com.Campaigns.pageObjects.UpdateCampaignPage;
import com.opencsv.CSVReader;

public class TC_MasterTestCase extends BaseClass
{
	
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Master Flow Test Data.csv";
	
	@Test (priority = 0)
	public void SearchCampaign() throws Exception
	{
		SearchCampaignPage sc = new SearchCampaignPage(driver);
	
	try 
	{
		sc.searchCampaign();
		Thread.sleep(3000);
		sc.clickSearch();
		logger.info("Campaign Search");
		
		String expected = "Test Campaign - 1";
		String actual = driver.findElement(By.xpath("//strong[text()='Test Campaign - 1']")).getText();
		
		if(expected.equals(actual)) 
		{
			captureScreen(driver, "SearchCampaignPass");
			Assert.assertTrue(true);
			logger.info("Search Campaign Test Passed");
		}
		else
		{
			captureScreen(driver, "SearchCampaignFail");
			Assert.assertTrue(false);
			logger.info("Search Campaign Test Failed");
		}
	}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}
	
	@Test (priority = 1)
	public void CreateCampaign() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String campaignname = a[0];
		String audiencelistname = a[1];
		String optinemail = a[2];
		
		
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		Thread.sleep(3000);
		ccp.createCampaign();
		
		//String campaignname = "Campaign" + randomNum();
		
		ccp.enterCampaignName(campaignname);
		//logger.info("Entered Campaign Name");
		
		Thread.sleep(3000);
		ccp.selectCountry();
		Thread.sleep(2000);
		//logger.info("Selected Country");
		//Thread.sleep(3000);
		ccp.selectShortcode();
		Thread.sleep(2000);
		//logger.info("Selected Shortcode");
		//Thread.sleep(3000);
		ccp.selectAudienceList();
		//logger.info("Selected Audience List");
		Thread.sleep(3000);
	
		//String audiencelistname = "List" + randomNum();
		ccp.enterAudienceListName(audiencelistname);
		ccp.clickAdd();
		//logger.info("Added Sender");
		
		//ccp.shortcodeMask();
		
		ccp.consentRequestON();
		Thread.sleep(2000);
		//ccp.consentRequestOFF();
		ccp.consentConfirmationON();
		Thread.sleep(2000);
		//ccp.consentConfirmationOFF();
		ccp.resendoptinON();
		Thread.sleep(2000);
		//ccp.resendoptinOFF();
		ccp.resendARON();
		Thread.sleep(2000);
		//ccp.resendAROFF();
		
		//ccp.deleteCollectedDataON();
		//ccp.deleteCollectedDataOFF();
		//ccp.dataDeleteSpan();
		
		Thread.sleep(3000);
		ccp.optinNotice();
		Thread.sleep(2000);
		//String optinemail = "Skycore" + randomNum()+"@gmail.com";
		ccp.optinNoticeEmail(optinemail);
		//logger.info("Entered Opt-in Email Address");
		
		//Thread.sleep(3000);
		ccp.forwardMMS();
		Thread.sleep(2000);
		ccp.selectMMSInbox();
		Thread.sleep(2000);
		//logger.info("Selected MMS Inbox");
		//Thread.sleep(3000);*/
		ccp.submitCampaign();
		//logger.info("Campaign Info Submitted");
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/b")).getText();
		String expected = "Success:";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "CreateCampaignPass");
			Assert.assertTrue(true);
			logger.info("Campaign Created Successfully");
		}
		else
		{
			captureScreen(driver, "CreateCampaignFail");
			Assert.assertTrue(false);
			logger.info("Failed to Create Campaign");
		}
		
		Thread.sleep(5000);
		
	}
	
	
	@Test (priority = 2)
	public void UpdateCampaign() throws Exception
	{
	 
		UpdateCampaignPage uc = new UpdateCampaignPage(driver);
		
	try 
	{
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
		Thread.sleep(2000);
		//uc.consentConfirmationON();
		uc.consentConfirmationOFF();
		Thread.sleep(2000);
		uc.resendoptinON();
		Thread.sleep(2000);
		//uc.resendoptinOFF();
		uc.resendARON();
		Thread.sleep(2000);
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
		
		Thread.sleep(2000);
		uc.updateCampaign();
		
		String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/b")).getText();
		String expected = "Success:";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "UpdateCampaignPass");
			Assert.assertTrue(true);
			logger.info("Campaign Updated Successfully");
		}
		else
		{
			captureScreen(driver, "UpdateCampaignFail");
			Assert.assertTrue(false);
			logger.info("Failed to Update Campaign");
		} 
			
			Thread.sleep(5000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	@Test (priority = 3)
	public void Compliance() throws Exception
	{
 
		CompliancePage cp = new CompliancePage(driver);
		
		cp.complianceTab();
		
		captureScreen(driver, "CompliancePass");
		logger.info("Compliance Tab Opened Successfully");
			
			Thread.sleep(5000);
	}
	
	
	@Test (priority = 4)
	public void OptinList() throws Exception
	{
		
        OptinListsPage optin = new OptinListsPage(driver);
        
	try
	{
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
			captureScreen(driver, "OptinListPass");
			Assert.assertTrue(true);
			logger.info("Optin List Added Successfully");
		}
		else
		{
			captureScreen(driver, "OptinListFail");
			Assert.assertTrue(false);
			logger.info("Failed to Add Optin List"); 
		}
		
		Thread.sleep(5000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	
	@Test (priority = 5)
	public void MessageSchedule() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
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
			captureScreen(driver, "SMSSchedulePass");
			Assert.assertTrue(true);
			logger.info("SMS Scheduled Successfully");
		}
			else
			{
			captureScreen(driver, "SMSScheduleFail");
			Assert.assertTrue(false);
			logger.info("Failed to Schedule SMS");
		}
		Thread.sleep(5000);
	
		
		
		// MMS SCHEDULING
		
	    //MessageSchedulingPage ms = new MessageSchedulingPage(driver);
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
			captureScreen(driver, "MMSSchedulePass");
			Assert.assertTrue(true);
			logger.info("MMS Scheduled Successfully");
		}
		else
		{
			captureScreen(driver, "MMSScheduleFail");
			Assert.assertTrue(false);
			logger.info("Failed to Schedule MMS");
		}
	
	}
	
	
	@Test (priority = 6)
	public void AutoResponse() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
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
			captureScreen(driver, "SMSAutoResponsePass");
			Assert.assertTrue(true);
			logger.info("SMS Auto Response Created Successfully");
		}
		else
		{
			captureScreen(driver, "SMSAutoResponseFail");
			Assert.assertTrue(false);
			logger.info("Failed to Create SMS Auto Response");
		} 
		
		Thread.sleep(5000);
	
	
		// MMS AUTO RESPONSES
	
	
	  //  AutoResponsesPage ar = new AutoResponsesPage(driver);
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
			captureScreen(driver, "MMSAutoResponsePass");
			Assert.assertTrue(true);
			logger.info("MMS Auto Response Created Successfully");
		}
		else
		{
			captureScreen(driver, "MMSAutoResponseFail");
			Assert.assertTrue(false);
			logger.info("Failed to Create MMS Auto Response");
		}
		
		Thread.sleep(5000);
	
	}
	
	@Test (priority = 7)
	public void Keywords() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String keywordname = a[5];
	
	try
	{
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
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	@Test (priority = 8)
	public void SMSInbox() throws IOException, Exception
	{
		SMSInboxPage smsinbox = new SMSInboxPage(driver);
		
		//smsinbox.smsInboxLink();
		smsinbox.smsInboxTab();
		Thread.sleep(3000);
		//smsinbox.searchNumber();
		//smsinbox.searchButton();
		//smsinbox.generateCSV();
		
		captureScreen(driver, "SMS Inbox");
		logger.info("SMS Inbox Tab Opened Successfully");
		
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
	
	@Test (priority = 9)
	public void copyDelete() throws IOException, Exception
	{
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		ccp.campaignsMenu();
		Thread.sleep(3000);
		
		UpdateCampaignPage uc = new UpdateCampaignPage(driver);
		
	try
	{
	    uc.copyCampaign();
		Thread.sleep(3000);
		captureScreen(driver, "CopyCampaign");
		logger.info("Campaign Copied Successfully");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	    Thread.sleep(3000);
	try
	{
	    uc.deleteCampaign();
	    uc.deleteConfirm();
		Thread.sleep(3000);
		captureScreen(driver, "DeleteCampaign");
		logger.info("Campaign Deleted Successfully");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
	}
		
}
