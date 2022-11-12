package com.AllMenus.testCases;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AllMenus.pageObjects.AllMenusPage;
import com.Campaigns.pageObjects.AutoResponsesPage;

import com.Campaigns.pageObjects.CreateCampaignPage;
import com.Campaigns.pageObjects.KeywordsPage;
import com.Campaigns.pageObjects.MessageSchedulingPage;
import com.Campaigns.pageObjects.SMSInboxPage;
import com.Campaigns.pageObjects.UpdateCampaignPage;
import com.MMS_Inboxes.pageObjects.MMSInboxesMenuPage;
import com.MMS_Templates.pageObjects.CreateMMSTemplatePage;
import com.MMS_Templates.pageObjects.MMSTemplateActionsPage;
import com.Manage_Keywords.pageObjects.ManageKeywordsMenuPage;
import com.Message_Lookup.pageObjects.MessageLookupMenuPage;
import com.Messaging_History.pageObjects.MessagingHistoryMenuPage;
import com.Optin_List.pageObjects.OptinListMenuPage;
import com.Optout_List.pageObjects.OptoutListMenuPage;
import com.opencsv.CSVReader;


public class TC_MessagingFlow_001 extends BaseClass
{
    
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Master Flow Test Data.csv";
	
	@Test (priority = 1)
	public void CreateCampaign() throws IOException, Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String campaignname = a[0];
		String audiencelistname = a[1];
		String optinemail = a[2];
		
		
		AllMenusPage amp = new AllMenusPage(driver);
		Thread.sleep(3000);
		amp.createCampaign();
		
		//String campaignname = "Campaign" + randomNum();
		
		amp.enterCampaignName(campaignname);
		//logger.info("Entered Campaign Name");
		
		Thread.sleep(3000);
		amp.selectCountry();
		//logger.info("Selected Country");
		//Thread.sleep(3000);
		amp.selectShortcode();
		//logger.info("Selected Shortcode");
		//Thread.sleep(3000);
		amp.selectAudienceList();
		//logger.info("Selected Audience List");
		Thread.sleep(3000);
	
		//String audiencelistname = "List" + randomNum();
		amp.enterAudienceListName(audiencelistname);
		amp.clickAdd();
		//logger.info("Added Sender");
		
		//amp.shortcodeMask();
		
		amp.consentRequestON();
		//amp.consentRequestOFF();
		amp.consentConfirmationON();
		//amp.consentConfirmationOFF();
		amp.resendoptinON();
		//amp.resendoptinOFF();
		amp.resendARON();
		//amp.resendAROFF();
		
		//amp.deleteCollectedDataON();
		//amp.deleteCollectedDataOFF();
		//amp.dataDeleteSpan();
		
		Thread.sleep(3000);
		amp.optinNotice();
		
		//String optinemail = "Skycore" + randomNum()+"@gmail.com";
		amp.optinNoticeEmail(optinemail);
		//logger.info("Entered Opt-in Email Address");
		
		//Thread.sleep(3000);
		amp.forwardMMS();
		amp.selectMMSInbox();
		//logger.info("Selected MMS Inbox");
		//Thread.sleep(3000);*/
		amp.submitCampaign();
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
	 
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.selectCampaign();
		Thread.sleep(5000);
		/*amp.editCampaignName();
		
		String campname = randomstring();
		amp.enterCampaignName(campname);
		
		String campid = randomNum();
		amp.editCampaignID(campid);
		
		amp.selectCountry();
		logger.info("Selected Country");
		Thread.sleep(1000);
		amp.selectShortcode();
		logger.info("Selected Shortcode");
		Thread.sleep(1000);
		amp.selectAudienceList();
		logger.info("Selected Audience List");
		Thread.sleep(1000);
	
		String audiencelistname = randomstring();
		amp.enterAudienceListName(audiencelistname);
		amp.clickAdd();
		logger.info("Added Sender");*/
		
		//amp.shortcodeMask();
		
		//amp.consentRequestON();
		amp.consentRequestOFF();
		//amp.consentConfirmationON();
		amp.consentConfirmationOFF();
		amp.resendoptinON();
		//amp.resendoptinOFF();
		amp.resendARON();
		//amp.resendAROFF();
		
		//amp.deleteCollectedDataON();
		amp.deleteCollectedDataOFF();
		//amp.dataDeleteSpan();
		
		/*Thread.sleep(1000);
		amp.optinNotice();
				
		String optinemail = randomstring()+"@gmail.com";
		amp.optinNoticeEmail(optinemail);
		logger.info("Entered Opt-in Email Address");
				
		//Thread.sleep(1000);
		amp.forwardMMS();
		amp.selectMMSInbox();
		logger.info("Selected MMS Inbox");*/
		
		Thread.sleep(1000);
		amp.updateCampaign();
		
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
	
	
	@Test (priority = 3)
	public void Compliance() throws Exception
	{
 
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.complianceTab();
		
		captureScreen(driver, "CompliancePass1");
		logger.info("Compliance Tab Opened Successfully");
			
			Thread.sleep(5000);
	}
	
	
	@Test (priority = 4)
	public void OptinList() throws Exception
	{
		
		AllMenusPage amp = new AllMenusPage(driver);
		
		//amp.optinListLink();
		amp.optinListTab();
        Thread.sleep(3000);
        amp.selectOptinList();
		Thread.sleep(3000);
		//amp.searchPhoneNumber();
		//amp.selectTimeZone();
		//amp.selectCarrier(carrier3);
		//amp.filterResults();
		//Thread.sleep(3000);
		/*amp.unconfirmed();
		Thread.sleep(3000);
		amp.subscribed();
		amp.exportAllSubscribed();
		amp.removeAllSubscribed();
		amp.removeAllSubscribedYes();*/
		amp.addImportNum();
		Thread.sleep(3000);
		/*amp.addNumber();
		amp.enterNumber();
		amp.addButton();
		amp.optoutNotify();
		amp.optout();
		amp.optoutConfirm();*/
		/*amp.deleteCheckbox();
		optin.deletebButton();	
		optin.deleteNumberConfirm();*/
		amp.uploadCSV1();
		amp.selectColumn();
		//optin.skipfFirstRow();
		Thread.sleep(3000);
		amp.importData1();
		//Thread.sleep(5000);
		//amp.verifyOptinList();
		//amp.cancelImport();
		//amp.cancelImportYes();
		
		
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
	
	
	@Test (priority = 5)
	public void MessageSchedule() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String SMStext = a[3];
		
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.campaignsMenu();
		Thread.sleep(3000);
		amp.selectCampaign();
		Thread.sleep(3000);
		
		// SMS SCHEDULING
		
		//amp.messageSchedulingLink();
		amp.messageSchedulingTab();
		amp.sendSMS1();
		amp.enterMSText(SMStext);
		Thread.sleep(3000);
		/*amp.DCFLever1();
		amp.selectDCF1();
		amp.webLink1();
		amp.CTLever1();*/
		amp.Submit();
		
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
		
		amp.sendMMS1();
		amp.selectMMSTemp1();
		Thread.sleep(3000);
		amp.selectMMS1();
		Thread.sleep(3000);
		amp.DCFLever1();
		amp.selectDCF1();
		Thread.sleep(3000);
		amp.msgSendingDate();
		amp.Submit();
		
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
		
		AllMenusPage amp = new AllMenusPage(driver);
		
		// SMS AUTO RESPONSES
		
		//ar.autoResponsesLink();
		amp.autoResponsesTab();
		amp.sendSMS2();		
		amp.enterARText(SMStext);
		Thread.sleep(3000);
		/*amp.DCFLever2();
		amp.selectDCF2();
		amp.webLink2();
		amp.questionText2();*/
		amp.ARSetup();
		amp.timeSetup();
		amp.timeSetupUnit();
		amp.CTLever2();
		amp.scheduleAR();			
					
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
		
		amp.sendMMS2();
		amp.selectMMSTemp2();
		Thread.sleep(3000);
		//amp.searchTemp2();
		//amp.searchTempButton2();
		amp.selectMMS2();
		Thread.sleep(3000);
		amp.DCFLever2();
		amp.selectDCF2();
		amp.ARSetup();
		amp.timeSetup();
		amp.timeSetupUnit();
		Thread.sleep(3000);
		/*amp.recurringHours();
		amp.recurringMinutes();
		amp.recurringMeridiem();
		amp.recurringTimezone();
		amp.recurringDays();*/
		amp.scheduleAR();
		
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
		
		AllMenusPage amp = new AllMenusPage(driver);
    	
		//kp.keywordsLink();
		amp.keywordsTab();
		amp.addKeyword();
    	Thread.sleep(3000);
    	amp.keywordCountry();
    	Thread.sleep(3000);
    	//String keywordname = "CAMP" + randomNum();
    	amp.typeKeyword(keywordname);
    	amp.saveKeyword();
    	//Thread.sleep(5000);
    	//amp.deleteKeyword1();
    	//amp.deleteConfirm();
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
	
	@Test (priority = 8)
	public void SMSInbox() throws IOException, Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		//amp.smsInboxLink();
		amp.smsInboxTab();
		//Thread.sleep(3000);
		//amp.searchNumber();
		//amp.searchButton();
		//amp.generateCSV();
		
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
		
		Thread.sleep(5000);
	}
	
	
	
	@Test (priority = 9)
	public void createOptinList() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.optinListMenu();
		amp.searchOptinList();
		amp.searchButton();
		
		/*Thread.sleep(3000);
		amp.editOptinList();
		amp.editListName();
		amp.Submit();*/
		
		Thread.sleep(3000);
		amp.createNewList();
		
		String listname = randomstring();
		amp.enterOptinListName(listname);
		amp.selectCountry();
		amp.selectSender1();
		amp.Save();
		amp.addNumber();
		amp.enterNumber();
		amp.addButton();
		
		Thread.sleep(3000);
		amp.optinListMenu();
		amp.deleteOptinList();
		amp.deleteListConfirm();
		
		Thread.sleep(5000);
	}
	
	
	@Test (priority = 10)
	public void optoutList() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.optoutListMenu();
		
		/*Thread.sleep(3000);
		amp.searchBySender();
		amp.searchButton();
		
		Thread.sleep(3000);
		amp.deleteNumber();
		amp.deleteNumberConfirm();*/
		
		Thread.sleep(3000);
		amp.importNumbers();
		amp.uploadCSV2();
		
		Thread.sleep(3000);
		amp.selectdropdown();
		amp.selectCountryShortcode();
		
		Thread.sleep(3000); 
		amp.clickonwebpage();
		
		Thread.sleep(3000);
		amp.importData2();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[3]/strong")).getText();
			
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "Import Numbers Pass");
			Assert.assertTrue(true);
			logger.info("Data imported successfully");
		}
		else
		{
			captureScreen(driver, "Import Numbers Fail");
			Assert.assertTrue(true);
			logger.info("Failed to import data");
		}
		
		Thread.sleep(5000);
	}
	
	
	@Test (priority = 11)
	public void managekeywords() throws InterruptedException, Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.manageKeywordsMenu();
		Thread.sleep(3000);
		amp.selectCountry3();
		Thread.sleep(3000);
		amp.enterKeyword();
		amp.searchButton();
		
		
		/*Thread.sleep(3000);
		amp.editCampaign();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		amp.deleteKeyword2();
		amp.deleteConfirm();
		
		
        String actual1 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/strong")).getText();
		
		String expected1 = "Success!";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "Delete Keyword Pass");
			Assert.assertTrue(true);
			logger.info("Keyword deleted successfully");
		}
		else
		{
			captureScreen(driver, "Delete Keyword Fail");
			Assert.assertTrue(true);
			logger.info("Delete keyword action failed");
		}*/
		
		Thread.sleep(5000);
	}
	
	
	@Test (priority = 12)
	public void uploadMMSContent() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
    	
		
		amp.MMSTemplatesMenu();
		Thread.sleep(5000);
		amp.createMMS();
		
		//Upload all the content in MMS Template creation page
		
		Thread.sleep(5000);
		amp.uploadImage();
				
		Thread.sleep(7000);
		amp.videoTab();
		amp.uploadVideo();
				
		Thread.sleep(5000);
		amp.audioTab();
		amp.uploadAudio();
				
		Thread.sleep(5000);
		amp.pImageTab();
				
		Thread.sleep(5000);
		amp.contactTab();
		amp.uploadContact();
				
		Thread.sleep(5000);
		amp.calendarTab();
		amp.uploadCalendar();
				
		Thread.sleep(5000);
		amp.pdfTab();
		amp.uploadPDF();
		Thread.sleep(10000);
		
		
	}
	
	
	@Test(priority=13)
	public void createMMSTemplate() throws Exception
	{
		//Create MMS Template using required content
		
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.imageTab();
		Thread.sleep(2000);
		amp.selectImage1();
		Thread.sleep(2000);
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.videoTab();
		Thread.sleep(2000);
		amp.selectVideo1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.audioTab();
		Thread.sleep(2000);
		amp.selectAudio1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.pImageTab();
		Thread.sleep(2000);
		amp.selectPImage1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.contactTab();
		Thread.sleep(2000);
		amp.selectContact1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.calendarTab();
		Thread.sleep(2000);
		amp.selectCalender1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.addSlide();
				
		Thread.sleep(5000);
		amp.pdfTab();
		Thread.sleep(2000);
		amp.selectPDF1();
		amp.messageText();
				
		Thread.sleep(2000);
		amp.Preview();
				
		Thread.sleep(2000);
		amp.Preview();
		
		Thread.sleep(2000);
		amp.deleteSlide();
				
		Thread.sleep(5000);
		amp.Next();
		Thread.sleep(2000);
		amp.templateName1();
		amp.templateSubject1();
		amp.disableFallbackSMS();
		Thread.sleep(2000);
		amp.fallbackSMSText();
				
		Thread.sleep(2000);
		amp.saveMMS();
		
		
        String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		
		String expected = "Success:";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "Create MMS Template Pass");
			Assert.assertTrue(true);
			logger.info("MMS Template created successfully");
		}
		else
		{
			captureScreen(driver, "Create MMS Template Fail");
			Assert.assertTrue(true);
			logger.info("Failed to create MMS Template");
		}
		
		Thread.sleep(5000);
		
	}
		
	
	@Test(priority=14)
	public void MMSPreview() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.clicktrackingON();
		logger.info("Click Tracking Enabled");
		
		Thread.sleep(2000);
		amp.testMMS();
		Thread.sleep(2000);
		amp.selectCountry2();
		Thread.sleep(2000);
		amp.Receiver();
		amp.selectSender1();
		Thread.sleep(5000);
		amp.sendTestMMS();
		Thread.sleep(5000);
		
		//Preview Action
		
		amp.MMSPreview();
		//amp.iphonePreview();
		Thread.sleep(10000);
		captureScreen(driver, "Iphone Preview");
		
		amp.androidPreview();
		Thread.sleep(5000);
		captureScreen(driver, "Android Preview");
		
		amp.featurePreview();
		Thread.sleep(5000);
		captureScreen(driver, "Feature Phone Preview");
		
		amp.fallbackSMSPreview();
		Thread.sleep(5000);
		captureScreen(driver, "Fallback SMS Preview");
		amp.closePreview();
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=15) 
	public void copyMMS() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.copyMMSTemplate();
		
		String actual1 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		
		String expected1 = "Success:";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "Copy MMS Template Pass");
			Assert.assertTrue(true);
			logger.info("MMS Template copied successfully");
		}
		else
		{
			captureScreen(driver, "Copy MMS Template Fail");
			Assert.assertTrue(true);
			logger.info("MMS Template copy action failed");
		}
		
		Thread.sleep(5000);
		
	}
		
	
	@Test(priority=16)
	public void editMMS() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.editMMSTemplate();
		Thread.sleep(5000);
		amp.Next();
		Thread.sleep(2000);
		amp.templateName2();
		amp.templateSubject2();
		Thread.sleep(2000);
		amp.saveMMS();
		
		String actual2 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		
	    String expected2 = "Success:";
			
		if(actual2.equals(expected2))
		{
			captureScreen(driver, "Edit MMS Template Pass");
			Assert.assertTrue(true);
			logger.info("MMS Template edited successfully");
		}
		else
		{
			captureScreen(driver, "Edit MMS Template Fail");
			Assert.assertTrue(true);
			logger.info("Failed to edit MMS Template");
		}
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=17)
	public void deleteMMS() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.deleteMMSTemplate();
		amp.deleteConfirm();
				
		String actual3 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
				
		String expected3 = "Success:";
				
		if(actual3.equals(expected3))
		{
			captureScreen(driver, "Delete MMS Template Pass");
			Assert.assertTrue(true);
			logger.info("MMS Template deleted successfully");
		}
		else
		{
			captureScreen(driver, "Delete MMS Template Fail");
			Assert.assertTrue(true);
			logger.info("MMS Template delete action failed");
		}
				
		
		Thread.sleep(5000);
	}
	
	
	
	@Test(priority=18)
	public void messagingHistory() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
    	
    	amp.messaginghistoryMenu();
    	
    	Thread.sleep(3000);
    	amp.Month1();
    	amp.Year1();
    	amp.fromDate();
    	amp.toDate();
    	amp.sender();
    	amp.Submit();
    	
    	Thread.sleep(3000);
    	amp.viewMMMSMT();
    	Thread.sleep(3000);
    	amp.viewMMMSMO();
    	Thread.sleep(3000);
    	amp.viewSMSMT();
    	Thread.sleep(3000);
    	amp.viewSMSMO();
    	
    	Thread.sleep(3000);
    	amp.chartMMMSMT();
    	Thread.sleep(3000);
    	amp.chartMMMSMO();
    	Thread.sleep(3000);
    	amp.chartSMSMT();
    	Thread.sleep(3000);
    	amp.chartSMSMO();
    	
    	Thread.sleep(3000);
    	amp.MMSMTReport();
    	amp.generateCSVReport();
    	
    	
        String actual1 = driver.findElement(By.xpath("//*[@id=\"display-messages\"]/div/strong")).getText();
		
		String expected1 = "Success!";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "MMSMT CSV Export Pass");
			Assert.assertTrue(true);
			logger.info("MMSMT CSV Export successful");
		}
		else
		{
			captureScreen(driver, "MMSMT CSV Export Fail");
			Assert.assertTrue(true);
			logger.info("MMSMT CSV Export failed");
		}
		
		
    	Thread.sleep(3000);
    	amp.MMSMOReport();
    	amp.generateCSVReport();
    	
        String actual2 = driver.findElement(By.xpath("//*[@id=\"display-messages\"]/div/strong")).getText();
		
		String expected2 = "Success!";
		
		if(actual2.equals(expected2))
		{
			captureScreen(driver, "MMSMO CSV Export Pass");
			Assert.assertTrue(true);
			logger.info("MMSMO CSV Export successful");
		}
		else
		{
			captureScreen(driver, "MMSMO CSV Export Fail");
			Assert.assertTrue(true);
			logger.info("MMSMO CSV Export failed");
		}
		
		
    	Thread.sleep(3000);
    	amp.SMSMTReport();
    	amp.generateCSVReport();
    	
    	
        String actual3 = driver.findElement(By.xpath("//*[@id=\"display-messages\"]/div/strong")).getText();
		
		String expected3 = "Success!";
		
		if(actual3.equals(expected3))
		{
			captureScreen(driver, "SMSMT CSV Export Pass");
			Assert.assertTrue(true);
			logger.info("SMSMT CSV Export successful");
		}
		else
		{
			captureScreen(driver, "SMSMT CSV Export Fail");
			Assert.assertTrue(true);
			logger.info("SMSMT CSV Export failed");
		}
		
		
    	Thread.sleep(3000);
    	amp.SMSMOReport();
    	amp.generateCSVReport();
    	
    	
    	String actual4 = driver.findElement(By.xpath("//*[@id=\"display-messages\"]/div/strong")).getText();
 		
 		String expected4 = "Success!";
 		
 		if(actual4.equals(expected4))
 		{
 			captureScreen(driver, "SMSMO CSV Export Pass");
 			Assert.assertTrue(true);
 			logger.info("SMSMO CSV Export successful");
 		}
 		else
 		{
 			captureScreen(driver, "SMSMO CSV Export Fail");
 			Assert.assertTrue(true);
 			logger.info("SMSMO CSV Export failed");
 		}	
 		
 		Thread.sleep(5000);
	}
	
	
	
	@Test(priority=19)
	public void messagelookup() throws Exception
	{
    	
		String month ="May 2018";
		String day = "16";
    	
		AllMenusPage amp = new AllMenusPage(driver);
		
		//Thread.sleep(3000);
		amp.messageLookupMenu();
		
		Thread.sleep(3000);
		amp.Date();
		
		Thread.sleep(5000);
		
		while(true)
		{
		    String text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		    //System.out.println(text);
		    
		    if(text.equals(month))
		    {
		    	break;
		    }
		    else
		    {   
		    	// Backward Arrow
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
		    }
		
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
		Thread.sleep(3000);
		amp.clickonwebpage();
		
		Thread.sleep(3000);
		amp.enterPhoneNumber2();
		//amp.messagetypeSMS();
		amp.messagetypeMMS();
		amp.searchButton();
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=20)
	public void createMMSInbox() throws Exception
	{
		AllMenusPage amp = new AllMenusPage(driver);
		
		amp.MMSInboxesMenu();
		
		Thread.sleep(3000);
		amp.createMMSInbox();
		
		String inboxname = randomstring();
		amp.inboxName(inboxname);
		amp.clickonwebpage();
		Thread.sleep(3000);

		amp.addKeywordShortcode();
       
		Thread.sleep(3000);
		String keyword = randomstring();
		amp.enterKeyword1(keyword);
		amp.selectcountry1();
		amp.selectshortcode();
		
		Thread.sleep(3000);
		amp.imageonlyContent();
		
		Thread.sleep(3000);
		amp.videoandtextonlyContent();
		Thread.sleep(3000);
		amp.videoonlyContent();
		Thread.sleep(3000);
		amp.imageandtextonlyContent();
		Thread.sleep(3000);
		amp.anyContent();
		
		amp.replyMMS1();
		amp.selectMMSLink1();
		
		Thread.sleep(3000);
		amp.selectMMS11();
		
		Thread.sleep(3000);
		amp.textvalidationMessageText();
		
		Thread.sleep(3000);
		amp.textvalidationNone();
		amp.textvalidationDropdown();
		amp.expression();
		
		Thread.sleep(3000);
		amp.replySMS2();
		amp.smsText2();
		//mmsin.replyMMS2();
		//mmsin.selectMMSLink2();
		
		//Thread.sleep(3000);
		//mmsin.selectMMS22();
		
		Thread.sleep(3000);
		amp.replyCheckbox();
		amp.replyMMS3();
		amp.selectMMSLink3();
		
		Thread.sleep(3000);
		amp.selectMMS33();
		
		Thread.sleep(3000);
		amp.optinsenderCheckbox();
		Thread.sleep(3000);
		amp.selectcampaign();
		amp.optingin();
		
		Thread.sleep(3000);
		amp.mmsInboxSubmit1();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		
		String expected = "Success!";
				
		if(actual.equals(expected))
		{
			captureScreen(driver, "Create MMS Inbox Pass");
			Assert.assertTrue(true);
			logger.info("MMS Inbox created successfully");
		}
		else
		{
			captureScreen(driver, "Create MMS Inbox Fail");
			Assert.assertTrue(true);
			logger.info("Failed to create MMS Inbox");
		}
		
		/*amp.editMMSInbox();
		driver.navigate().back();
		
		Thread.sleep(3000);
		amp.viewMessages();
		Thread.sleep(3000);
		
		amp.dateFilter();
		amp.enterPhone();
		amp.Search();
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		
		Thread.sleep(3000);
		amp.Stats();
		amp.Year();
		amp.Month();
		amp.Day();
		amp.mmsInboxSubmit2();*/
		
		
	}
	
	
	
	
	
}
