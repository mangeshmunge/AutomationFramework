package com.MMS_Inboxes.testCases;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MMS_Inboxes.pageObjects.MMSInboxesMenuPage;
import com.opencsv.CSVReader;

public class TC_CreateMMSInbox_001 extends BaseClass
{
   
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/MMS Inbox Data.csv";
	
	@Test(priority=1)
	public void createMMS() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String inboxname = a[0];
		String keywordname = a[1];
		String smstext11 = a[2];
		String smstext22 = a[3];
		String smstext33 = a[4];
		String expression1 = a[5];
		
		
		MMSInboxesMenuPage mmsin = new MMSInboxesMenuPage(driver);
		
		Thread.sleep(3000);
		mmsin.MMSInboxesMenu();
		
		Thread.sleep(3000);
		mmsin.createMMSInbox();
		
		mmsin.inboxName(inboxname);
		Thread.sleep(3000);
		mmsin.clickonwebpage();
		
		
		//***************************  Add Shortcode   ***************************//
		
		
	try
	{
		Thread.sleep(3000);
		mmsin.addKeywordShortcode();

		Thread.sleep(3000);
		mmsin.enterKeyword(keywordname);
		mmsin.selectcountry();
		mmsin.selectshortcode();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	
		Thread.sleep(3000);
		mmsin.imageonlyContent();
		
		Thread.sleep(3000);
		mmsin.videoandtextonlyContent();
		Thread.sleep(3000);
		mmsin.videoonlyContent();
		Thread.sleep(3000);
		mmsin.imageandtextonlyContent();
		Thread.sleep(3000);
		mmsin.anyContent();
		
		
		//***************************  Reply MMS 1   ***************************//
		
		
	try
	{
		Thread.sleep(3000);
		mmsin.replyMMS1();
		mmsin.selectMMSLink1();
	
		Thread.sleep(3000);
		mmsin.selectMMS11();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
	    //***************************  Reply SMS 1   ***************************//
	
	
	try
	{
		Thread.sleep(3000);
		mmsin.replySMS1();
		mmsin.smsText1(smstext11);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
		Thread.sleep(3000);
		mmsin.textvalidationMessageText();
		
		Thread.sleep(3000);
		mmsin.textvalidationNone();
		mmsin.textvalidationDropdown();
		mmsin.expression(expression1);
		
		
		//***************************  Reply SMS 2   ***************************//
		
		
	try
	{
		Thread.sleep(3000);
		mmsin.replySMS2();
		mmsin.smsText2(smstext22);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	
	    //***************************  Reply MMS 2   ***************************//
	
	
	try
	{
		Thread.sleep(3000);
		mmsin.replyMMS2();
		mmsin.selectMMSLink2();
		
		Thread.sleep(3000);
		mmsin.selectMMS22();
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	    mmsin.closeMMS2();
	
	    //***************************  Reply Message on Receipt   ***************************//
	
	
		Thread.sleep(3000);
		mmsin.replyCheckbox();
		
		
		//***************************  Reply MMS 3   ***************************//
		
		
	try
	{
		Thread.sleep(3000);
		mmsin.replyMMS3();
		mmsin.selectMMSLink3();
		
		Thread.sleep(3000);
		mmsin.selectMMS33();
	}		
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	    //***************************  Reply SMS 3   ***************************//
	
	
	try
	{
	    mmsin.replySMS3();
	    mmsin.smsText3(smstext33); 
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	    //***************************  Opt-in the sender to an SMS/MMS campaign  ***************************//
	
	try
	{
	    Thread.sleep(3000);
		mmsin.optinsenderCheckbox();
		mmsin.selectcampaign();
		mmsin.optingin();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	
	try
	{
		Thread.sleep(3000);
		mmsin.mmsInboxSubmit1();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "MMS Inbox Create Pass");
			Assert.assertTrue(true);
			logger.info("MMS Inbox Created Successfully");
		}
		else
		{
			captureScreen(driver, "MMS Inbox Create Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Create MMS Inbox"); 
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
		Thread.sleep(3000);
		
 }	
	
	
	    //*********************************   Edit MMS Inbox    *******************************//
		
	
	@Test(priority=2)
	public void editMMS() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		String [] secondrow=reader.readNext();
		
		String [] a=reader.readNext();
		String inboxname = a[0];
		String keywordname = a[1];
	
		MMSInboxesMenuPage mmsin = new MMSInboxesMenuPage(driver);
		
		mmsin.MMSInboxesMenu();
		mmsin.editMMSInbox();
		mmsin.inboxName(inboxname);
		
		Thread.sleep(3000);
		mmsin.clickonwebpage();
		
		//***************************  Edit Shortcode   ***************************//
		
		
		try
		{
			Thread.sleep(3000);
			mmsin.addKeywordShortcode();

			Thread.sleep(3000);
			mmsin.enterKeyword(keywordname);
			mmsin.selectcountry();
			mmsin.selectshortcode();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		try
		{
			Thread.sleep(3000);
			mmsin.mmsInboxSubmit1();
			
			
			String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
			String expected = "Success!";
			
			if(actual.equals(expected))
			{
				captureScreen(driver, "MMS Inbox Edit Pass");
				Assert.assertTrue(true);
				logger.info("MMS Inbox Edited Successfully");
			}
			else
			{
				captureScreen(driver, "MMS Inbox Edit Fail");
				Assert.assertTrue(false);
				logger.info("Failed to Edit MMS Inbox"); 
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		Thread.sleep(3000);
		mmsin.MMSInboxesMenu();
		
		
	}
	
	
	    //*********************************   View Messages    *******************************//
	

	@Test(priority=3)
	public void viewMessages() throws Exception
	{
	
		MMSInboxesMenuPage mmsin = new MMSInboxesMenuPage(driver);
		
		mmsin.viewMessages();
		Thread.sleep(5000);
		
		mmsin.dateFilter();
		mmsin.enterPhone();
		mmsin.Search();
		
		Thread.sleep(5000);
		mmsin.MMSInboxesMenu();
		
		Thread.sleep(3000);
		
	}
	
	
	//*********************************   View Keywords    *******************************//
	
	
	@Test(priority=4)
	public void viewKeywords() throws Exception
	{
	
		MMSInboxesMenuPage mmsin = new MMSInboxesMenuPage(driver);
		
		mmsin.viewKeywords();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		
		Thread.sleep(5000);
		
	}
	
	
	    //*********************************   View Stats    *******************************//
	
	
	@Test(priority=5)
	public void ViewStats() throws Exception
	{
	
		MMSInboxesMenuPage mmsin = new MMSInboxesMenuPage(driver);
		
		mmsin.Stats();
		mmsin.Year();
		mmsin.Month();
		mmsin.Day();
		mmsin.mmsInboxSubmit2();
		
		
	}
}
