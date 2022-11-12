package com.Campaigns.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.SearchCampaignPage;

public class TC_SearchCampaign_003 extends BaseClass
{
   
	@Test (priority = 0)
	public void SearchCampaign() throws Exception
	{
		SearchCampaignPage sc = new SearchCampaignPage(driver);
	
	try 
	{
		sc.searchCampaign();
		Thread.sleep(3000);
		sc.clickSearch();
		logger.info("Campaign Search");
		
		String expected = "Test Campaign - 1";
		String actual = driver.findElement(By.xpath("//strong[text()='Test Campaign - 1']")).getText();
		
		if(expected.equals(actual)) 
		{
			captureScreen(driver, "SearchCampaignPass");
			Assert.assertTrue(true);
			logger.info("Search Campaign Test Passed");
		}
		else
		{
			captureScreen(driver, "SearchCampaignFail");
			Assert.assertTrue(false);
			logger.info("Search Campaign Test Failed");
		}
	}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}
	
}
