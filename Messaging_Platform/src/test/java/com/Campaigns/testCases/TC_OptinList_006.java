package com.Campaigns.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.OptinListsPage;

public class TC_OptinList_006 extends BaseClass
{
	
    @Test
	public void OptinList() throws IOException, Exception
	{
		OptinListsPage optin = new OptinListsPage(driver);
		
		optin.optinListLink();
		//optin.optinListTab();
		optin.selectOptinList();
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
		Thread.sleep(1000);
		//optin.skipfFirstRow();
		optin.importData();
		//Thread.sleep(5000);
		//optin.verifyOptinList();
		//optin.cancelImport();
		//optin.cancelImportYes();
		
		if(driver.getTitle().equals("Opt-in List")) 
		{ 
			captureScreen(driver, "OptinListPass");
			Assert.assertTrue(true);
			logger.info("Optin List added successfully");
		}
		else
		{
			captureScreen(driver, "OptinListFail");
			Assert.assertTrue(false);
			logger.info("Create Campaign Test Failed");
		}
		
	}
    
   /* @Test(priority=2)
 	public void OptinList1() throws IOException, Exception
 	{
     	
 		OptinLists optin = new OptinLists(driver);
 		
 		optin.optinList();
 		optin.selectOptinList();
 		optin.deleteCheckbox();
 		optin.deletebButton();
 				
 	}
    
    @Test(priority=3)
 	public void OptinList2() throws IOException, Exception
 	{
     	
 		OptinLists optin = new OptinLists(driver);
 		
 		optin.optinList();
 		optin.selectOptinList();
 		optin.deleteCheckbox();
 		optin.deletebButton();
 				
 	}*/
}
