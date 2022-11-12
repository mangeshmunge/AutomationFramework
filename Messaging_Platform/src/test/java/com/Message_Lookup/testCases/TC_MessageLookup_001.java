package com.Message_Lookup.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Message_Lookup.pageObjects.MessageLookupMenuPage;

public class TC_MessageLookup_001 extends BaseClass
{
	
    @Test
	public void messagelookup() throws Exception
	{
    	
		String month1 ="December 2018";
		String day1 = "16";
		
		String month2 ="May 2022";
		String day2 = "31";
		
		String month3 ="June 2022";
		String day3 = "15";
    	
    	MessageLookupMenuPage mlm= new MessageLookupMenuPage(driver);
		
		Thread.sleep(3000);
		mlm.messageLookupMenu();
		
		
		// ****************************************     Testing Round 1    *****************************************//
		
		
		Thread.sleep(3000);
		mlm.Date();
		
		Thread.sleep(5000);
		
		while(true)
		{
		    String text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		    //System.out.println(text);
		    
		    if(text.equals(month1))
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
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day1+")]")).click();
		
		Thread.sleep(3000);
		mlm.clickonwebpage();
		
		Thread.sleep(3000);
		mlm.enterPhoneNumber();
		//mlm.messagetypeSMS();
		mlm.messagetypeMMS();
		mlm.searchButton();		
		
		
		
		// ****************************************     Testing Round 2    *****************************************//
		
		
		
		Thread.sleep(5000);
		mlm.Date();
		
		Thread.sleep(5000);
		
		while(true)
		{
		    String text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		    //System.out.println(text);
		    
		    if(text.equals(month2))
		    {
		    	break;
		    }
		    else
		    {   
		    	// Backward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
		    }
		
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day2+")]")).click();
		
		Thread.sleep(3000);
		mlm.clickonwebpage();
		
		Thread.sleep(3000);
		mlm.enterPhoneNumber();
		mlm.messagetypeSMS();
		//mlm.messagetypeMMS();
		mlm.searchButton();	
		
		Thread.sleep(3000);
		mlm.SMSDLR1();
		Thread.sleep(2000);
		captureScreen(driver, "SMS DLR1 Pass");
		Thread.sleep(3000);
		mlm.SMSDLRClose();
		
		Thread.sleep(3000);
		mlm.SMSDLR2();
		Thread.sleep(2000);
		captureScreen(driver, "SMS DLR2 Pass");
		Thread.sleep(3000);
		mlm.SMSDLRClose();
		
		Thread.sleep(3000);
		mlm.messagetypeMMS();
		mlm.searchButton();	
		
		Thread.sleep(3000);
		mlm.MMSDLR1();
		Thread.sleep(2000);
		captureScreen(driver, "MMS DLR1 Pass");
		Thread.sleep(3000);
		mlm.MMSDLRClose();
		
		Thread.sleep(3000);
		mlm.MMSDLR2();
		Thread.sleep(2000);
		captureScreen(driver, "MMS DLR2 Pass");
		Thread.sleep(3000);
		mlm.MMSDLRClose();
	
		
		
		// ****************************************     Testing Round 3    *****************************************//
		
		
		
		Thread.sleep(5000);
		mlm.Date();
		
		Thread.sleep(5000);
		
		while(true)
		{
		    String text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		    //System.out.println(text);
		    
		    if(text.equals(month3))
		    {
		    	break;
		    }
		    else
		    {   
		    	// Backward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
		    }
		
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day3+")]")).click();
		
		Thread.sleep(3000);
		mlm.clickonwebpage();
		
		Thread.sleep(3000);
		mlm.enterPhoneNumber();
		mlm.messagetypeSMS();
		//mlm.messagetypeMMS();
		mlm.searchButton();	
		
		Thread.sleep(3000);
		mlm.SMSDLR1();
		Thread.sleep(2000);
		captureScreen(driver, "SMS DLR3 Pass");
		Thread.sleep(3000);
		mlm.SMSDLRClose();
		
		
		
		Thread.sleep(3000);
		mlm.messagetypeMMS();
		mlm.searchButton();	
		
		Thread.sleep(3000);
		mlm.MMSDLR1();
		Thread.sleep(2000);
		captureScreen(driver, "MMS DLR3 Pass");
		Thread.sleep(3000);
		mlm.MMSDLRClose();
		
		System.out.println("************  Message Lookup TestCase Passed  ************");
		
		
		
		
	}
    
    
} 
