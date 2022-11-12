package com.MMS_Templates.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MMS_Templates.pageObjects.CreateMMSTemplatePage;
import com.MMS_Templates.pageObjects.MMSTemplateActionsPage;


public class TC_MMSTemplate_MasterTestCase extends BaseClass
{
	
    @Test(priority=1)
	public void uploadMMSContent() throws Exception
	{
    	CreateMMSTemplatePage cmms = new CreateMMSTemplatePage(driver);
    	MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
    	
		Thread.sleep(5000);
		act.MMSTemplatesMenu();
		Thread.sleep(5000);
		cmms.createMMS();
		
		//Upload all the content in MMS Template creation page
		
		Thread.sleep(5000);
		cmms.uploadImage();
				
		Thread.sleep(5000);
		cmms.videoTab();
		cmms.uploadVideo();
				
		Thread.sleep(5000);
		cmms.audioTab();
		cmms.uploadAudio();
				
		Thread.sleep(5000);
		cmms.pImageTab();
				
		Thread.sleep(5000);
		cmms.contactTab();
		cmms.uploadContact();
				
		Thread.sleep(5000);
		cmms.calendarTab();
		cmms.uploadCalendar();
				
		Thread.sleep(7000);
		cmms.pdfTab();
		cmms.uploadPDF();
		Thread.sleep(10000);
		
		
	}
	@Test(priority=2)
	public void createMMSTemplate() throws Exception
	{
		//Create MMS Template using required content
		
		CreateMMSTemplatePage cmms = new CreateMMSTemplatePage(driver);
		
		cmms.imageTab();
		Thread.sleep(2000);
		cmms.selectImage1();
		Thread.sleep(2000);
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.videoTab();
		Thread.sleep(2000);
		cmms.selectVideo1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.audioTab();
		Thread.sleep(2000);
		cmms.selectAudio1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.pImageTab();
		Thread.sleep(2000);
		cmms.selectPImage1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.contactTab();
		Thread.sleep(2000);
		cmms.selectContact1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.calendarTab();
		Thread.sleep(2000);
		cmms.selectCalender1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.addSlide();
				
		Thread.sleep(5000);
		cmms.pdfTab();
		Thread.sleep(2000);
		cmms.selectPDF1();
		cmms.messageText();
				
		Thread.sleep(2000);
		cmms.Preview();
				
		Thread.sleep(2000);
		cmms.Preview();
		
		Thread.sleep(2000);
		cmms.deleteSlide();
				
		Thread.sleep(5000);
		cmms.Next();
		Thread.sleep(2000);
		cmms.templateName1();
		cmms.templateSubject1();
		cmms.disableFallbackSMS();
		Thread.sleep(2000);
		cmms.fallbackSMSText();
				
		Thread.sleep(2000);
		cmms.saveMMS();
		
		
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
		
	
	@Test(priority=3)
	public void MMSPreview() throws Exception
	{
		MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
		
		act.clicktrackingON();
		logger.info("Click Tracking Enabled");
		
		Thread.sleep(2000);
		act.testMMS();
		Thread.sleep(2000);
		act.selectCountry();
		Thread.sleep(2000);
		act.Receiver();
		Thread.sleep(2000);
		act.sender();
		Thread.sleep(5000);
		act.sendTestMMS();
		Thread.sleep(5000);
		
		//Preview Action
		
		act.MMSPreview();
		//act.iphonePreview();
		Thread.sleep(10000);
		captureScreen(driver, "Iphone Preview");
		
		act.androidPreview();
		Thread.sleep(5000);
		captureScreen(driver, "Android Preview");
		
		act.featurePreview();
		Thread.sleep(5000);
		captureScreen(driver, "Feature Phone Preview");
		
		act.fallbackSMSPreview();
		Thread.sleep(5000);
		captureScreen(driver, "Fallback SMS Preview");
		act.closePreview();
		
		Thread.sleep(5000);
		
	}
		
	@Test(priority=4) 
	public void copyMMS() throws Exception
	{
		MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
		
		act.copyMMSTemplate();
		
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
		
	
	@Test(priority=5)
	public void editMMS() throws Exception
	{
		CreateMMSTemplatePage cmms = new CreateMMSTemplatePage(driver);
		MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
		
		act.editMMSTemplate();
		Thread.sleep(5000);
		cmms.Next();
		Thread.sleep(2000);
		cmms.templateName2();
		cmms.templateSubject2();
		Thread.sleep(2000);
		cmms.saveMMS();
		
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
		
	@Test(priority=6)
	public void deleteMMS() throws Exception
	{
		MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
		
		act.deleteMMSTemplate();
		act.deleteConfirm();
				
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
				
		
	}
	
}
