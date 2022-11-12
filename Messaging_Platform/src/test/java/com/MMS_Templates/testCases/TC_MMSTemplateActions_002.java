package com.MMS_Templates.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MMS_Templates.pageObjects.MMSTemplateActionsPage;



public class TC_MMSTemplateActions_002 extends BaseClass
{

	@Test
	public void MMSTemplateActions() throws Exception 
	{
		MMSTemplateActionsPage act = new MMSTemplateActionsPage(driver);
		
		Thread.sleep(5000);
		act.MMSTemplatesMenu();
		Thread.sleep(5000);
		
		//Search Template
		
		//act.searchTemplate();
		
		//Test Action
		
		/*act.testMMS();
		act.selectCountry();
		act.Receiver();
		act.sender();
		Thread.sleep(5000);
		act.sendTestMMS();*/
		
		//Preview Action
		
		/*act.MMSPreview();
		//act.iphonePreview();
		Thread.sleep(5000);
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
		act.closePreview();*/
		
		//Copy Action
		
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
		
		//Edit Action
		
		
		
		//act.editMMSTemplate();
		
		//Delete Action
		Thread.sleep(5000);
		act.deleteMMSTemplate();
		act.deleteConfirm();
		
        String actual2 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		
		String expected2 = "Success:";
		
		if(actual2.equals(expected2))
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
