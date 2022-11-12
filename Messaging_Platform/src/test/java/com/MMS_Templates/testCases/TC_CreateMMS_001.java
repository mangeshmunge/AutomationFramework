package com.MMS_Templates.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MMS_Templates.pageObjects.CreateMMSTemplatePage;


public class TC_CreateMMS_001 extends BaseClass
{
    @Test
	public void CreateMMS() throws Exception
	{
		CreateMMSTemplatePage cmms = new CreateMMSTemplatePage(driver);
		
		Thread.sleep(5000);
		cmms.MMSTemplatesMenu();
		cmms.createMMS();
		
		
		//Upload all the content in MMS Template creation page
		
		/*Thread.sleep(5000);
		cmms.uploadImage();
		
		Thread.sleep(5000);
		cmms.selectImage1();
		
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
		
		Thread.sleep(5000);
		cmms.pdfTab();
		cmms.uploadPDF();*/
		
		//Create MMS Template using required content
		
		Thread.sleep(5000);
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
		
		
		// Delete Content from MMS Template creation page
	
		/*cmms.deleteImage();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.audioTab();
		Thread.sleep(2000);
		cmms.deleteAudio();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.videoTab();
		Thread.sleep(2000);
		cmms.deleteVideo();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.audioTab();
		Thread.sleep(2000);
		cmms.deleteAudio();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.contactTab();
		Thread.sleep(2000);
		cmms.deleteContact();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.calendarTab();
		Thread.sleep(2000);
		cmms.deleteCalender();
		cmms.deleteConfirmation();
		
		Thread.sleep(5000);
		cmms.pdfTab();
		Thread.sleep(2000);
		cmms.deletePDF();
		cmms.deleteConfirmation();*/
		
		
	}
	
}
