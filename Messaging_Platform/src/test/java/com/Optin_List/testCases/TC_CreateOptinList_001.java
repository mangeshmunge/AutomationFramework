package com.Optin_List.testCases;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Optin_List.pageObjects.OptinListMenuPage;
import com.opencsv.CSVReader;

public class TC_CreateOptinList_001 extends BaseClass
{
	
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Opt-in List Menu.csv";
	
    @Test(priority=1)
	public void createOptinList() throws Exception
	{
    	CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String listname = a[0];
    	
    	OptinListMenuPage olm = new OptinListMenuPage(driver);
		
    	Thread.sleep(3000);
    	olm.optinListMenu();
    	
		Thread.sleep(3000);
		olm.createNewList();
		olm.enterOptinListName(listname);
		olm.selectCountry();
		olm.selectSender();
		olm.Save();
		olm.addNumber();
		olm.enterNumber();
		olm.addButton();
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver,"Opt-in List Creation Pass");
			Assert.assertTrue(true);
			logger.info("Opt-in List Created Successfully");
		}
		else
		{
			captureScreen(driver, "Opt-in List Creation Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Create Opt-in List"); 
		}
		
		
	}
		
    
    //********************************** Upload CSV File  ***********************************//
    
    
    @Test(priority=2)
	public void uploadCSV() throws Exception
	{
    	OptinListMenuPage olm = new OptinListMenuPage(driver);
    	
		Thread.sleep(3000);
		olm.addImportNum();
		
		Thread.sleep(3000);
		olm.uploadCSV();
		olm.selectColumn();
		olm.importData();
		Thread.sleep(10000);
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[2]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver,"CSV Upload Pass");
			Assert.assertTrue(true);
			logger.info("CSV Uploaded Successfully");
		}
		else
		{
			captureScreen(driver, "CSV Upload Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Upload CSV"); 
		}
		
		
	}
    
    
        //********************************** Edit Optin List  ***********************************//
    
    
    @Test(priority=3)
	public void editOptinList() throws Exception
	{
		OptinListMenuPage olm = new OptinListMenuPage(driver);
		
		//Thread.sleep(10000);
		olm.subscribersLink();
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		olm.unconfirmed();
		
		Thread.sleep(3000);
		olm.subscribed();
		
		
		   //********************************** Export Subscribed Numbers ***********************************//
		
	try 
	{
		olm.exportAllSubscribed();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver,"Export All Subscribed Pass");
			Assert.assertTrue(true);
			logger.info("Numbers Exported Successfully");
		}
		else
		{
			captureScreen(driver, "Export All Subscribed Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Export Number"); 
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	  
		
		 //********************************** Search and Opt-out Number ***********************************//
		
		
		Thread.sleep(3000);
		olm.searchPhoneNumber();
		
	try 
	{
		olm.selectTimeZone();
		olm.selectCarrier();
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}	
	    Thread.sleep(3000);
		olm.filterResults();
		
		Thread.sleep(3000);
		olm.optoutNotify();
		olm.optout();
		olm.optoutConfirm();
		
		String actual1 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		String expected1 = "Success!";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver,"Optout Number Pass");
			Assert.assertTrue(true);
			logger.info("Number Opted Out Successfully");
		}
		else
		{
			captureScreen(driver, "Optout Number Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Optout Number"); 
		}
		
		Thread.sleep(3000);
		olm.clearPhoneNumber();
		Thread.sleep(3000);
		olm.clearTimeZone();
		olm.filterResults();
	
		Thread.sleep(3000);
		olm.removeAllSubscribed();
		olm.removeAllSubscribedYes();
		
		
		String actual2 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
		String expected2 = "Success!";
		
		if(actual2.equals(expected2))
		{
			captureScreen(driver,"Remove All Subscribed Pass");
			Assert.assertTrue(true);
			logger.info("Numbers Removed Successfully");
		}
		else
		{
			captureScreen(driver, "Remove All Subscribed Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Remove Numbers"); 
		}
		
		
	}
    
    
    //********************************** Search and Edit Opt-in List Name  ***********************************//
    
    
	@Test(priority=4)
	public void searchOptinList() throws Exception
	{
		OptinListMenuPage olm = new OptinListMenuPage(driver);
		
		Thread.sleep(3000);
		olm.optinListMenu();
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow=reader.readNext();
		
		String [] a=reader.readNext();
		String searchlist = a[0];
		String editname = a[1];
		
		olm.searchOptinList(searchlist);
		olm.searchButton();
		
		Thread.sleep(3000);
		olm.editOptinList();
		olm.editListName(editname);
		Thread.sleep(3000);
		olm.Submit();
		Thread.sleep(3000);
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"update_status_div\"]/div/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver,"Edit OptinList Name Pass");
			Assert.assertTrue(true);
			logger.info("OptinList Name Edited Successfully");
		}
		else
		{
			captureScreen(driver, "Edit OptinList Name Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Edit OptinList Name"); 
		}
		
	}
	
	
	 //********************************** Delete Opt-in List  ***********************************//
	
	
	@Test(priority=5)
	public void deleteOptinList() throws Exception
	{
		OptinListMenuPage olm = new OptinListMenuPage(driver);
		
		olm.optinListMenu();
		
		Thread.sleep(3000);
		olm.deleteOptinList();
		olm.deleteListConfirm();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[2]/strong")).getText();
		String expected = "Success!";
		
		if(actual.equals(expected))
		{
			captureScreen(driver,"OptinList Delete Pass");
			Assert.assertTrue(true);
			logger.info("OptinList Deleted Successfully");
		}
		else
		{
			captureScreen(driver, "OptinList Delete Fail");
			Assert.assertTrue(false);
			logger.info("Failed to Delete OptinList"); 
		}
		
		
	}
}
