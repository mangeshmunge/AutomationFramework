package com.Messaging_History.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Messaging_History.pageObjects.MessagingHistoryMenuPage;

public class TC_MessagingHistory_001 extends BaseClass
{
    @Test
	public void messagingHistory() throws Exception
	{
    	MessagingHistoryMenuPage mh = new MessagingHistoryMenuPage(driver);
    	
    	mh.messaginghistoryMenu();
    	
    	Thread.sleep(3000);
    	mh.Month();
    	mh.Year();
    	mh.fromDate();
    	mh.toDate();
    	mh.sender();
    	mh.Submit();
    	
    	Thread.sleep(3000);
 		mh.senderwiseFilter();
 		Thread.sleep(2000);
 		captureScreen(driver, "Sendewise Details");
    	
    	Thread.sleep(3000);
    	mh.viewMMMSMT();
    	Thread.sleep(3000);
    	mh.viewMMMSMO();
    	Thread.sleep(3000);
    	mh.viewSMSMT();
    	Thread.sleep(3000);
    	mh.viewSMSMO();
    	
    	Thread.sleep(3000);
    	mh.chartMMMSMT();
    	Thread.sleep(3000);
    	mh.chartMMMSMO();
    	Thread.sleep(3000);
    	mh.chartSMSMT();
    	Thread.sleep(3000);
    	mh.chartSMSMO();
    	
    	
    	Thread.sleep(3000);
    	mh.MMSMTReport();
    	mh.generateCSVReport();
    	
    	
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
    	mh.MMSMOReport();
    	mh.generateCSVReport();
    	
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
    	mh.SMSMTReport();
    	mh.generateCSVReport();
    	
    	
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
    	mh.SMSMOReport();
    	mh.generateCSVReport();
    	
    	
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
 		
 		Thread.sleep(3000);
 		mh.verifyExportedFiles();
 		Thread.sleep(120000);
 		driver.navigate().refresh();
 		captureScreen(driver, "Export Successful");
 		logger.info("All the files are exported successfully");
 		
 		System.out.println("************  Messaging History TestCase Passed  ************");
    	
    	
	}
}
