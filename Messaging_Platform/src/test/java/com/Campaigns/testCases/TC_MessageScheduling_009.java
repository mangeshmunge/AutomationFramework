package com.Campaigns.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.MessageSchedulingPage;

public class TC_MessageScheduling_009 extends BaseClass
{
   
	@Test
	public void MessageSchedule() throws Exception
	{
		String month ="June 2022";
		String day = "22";
		
		MessageSchedulingPage ms = new MessageSchedulingPage(driver);
		
		// SMS MESSAGE SCHEDULING
		
		ms.messageSchedulingLink();
		//ms.messageSchedulingTab();
		/*ms.sendSMS();
		ms.enterMSText();
		ms.DCFLever();
		ms.selectDCF();
		ms.webLink();
		ms.CTLever();
		ms.Submit();*/
		
		// MMS MESSAGE SCHEDULING
		
		ms.sendMMS();
		ms.selectMMSTemp();
		Thread.sleep(3000);
		ms.selectMMS();
		Thread.sleep(3000);
		ms.DCFLever();
		ms.selectDCF();
		Thread.sleep(3000);
		ms.msgSendingDate();
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
		    	// Backward Arrow (We will not select back date to schedule messages)
		    	//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow 
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
		    }
		
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
		Thread.sleep(5000);
		ms.clickonwebpage();
		Thread.sleep(3000);
		ms.msgSendingHours();
		Thread.sleep(3000);
		ms.msgSendingMinutes();
		Thread.sleep(3000);
		ms.Submit(); 
		
		/*Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//*[@id=\"tr_0\"]/div/div/div[4]/div[2]")).getText();
		System.out.println(result);*/
		
		
		//Validation
		
        String actual = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "MessageSchedulePass");
			Assert.assertTrue(true);
			logger.info("Message Scheduled Successfully");
		}
		else
		{
			captureScreen(driver, "MessageScheduleFail");
			Assert.assertTrue(false);
			logger.info("Failed to Schedule Message");
		}
		
		Thread.sleep(300000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		String actual1 = driver.findElement(By.xpath("//*[@id=\"tr_0\"]/div/div/div[4]/div[2]")).getText();
		System.out.println(actual1);
		
		String newLine = System.getProperty("line.separator");
		String expected1 = "Pending".concat(newLine).concat("0 / 2");
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "MessageSendingPass");
			Assert.assertTrue(true);
			logger.info("Message Sent Successfully");
		}
		else
		{
			captureScreen(driver, "MessageSendingFail");
			Assert.assertTrue(false);
			logger.info("Failed to Send Message");
		}
		
	}
	
}
