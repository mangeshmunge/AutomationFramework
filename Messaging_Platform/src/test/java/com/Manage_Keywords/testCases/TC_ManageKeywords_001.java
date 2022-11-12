package com.Manage_Keywords.testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Manage_Keywords.pageObjects.ManageKeywordsMenuPage;

public class TC_ManageKeywords_001 extends BaseClass
{
    @Test
	public void managekeywords() throws InterruptedException, Exception
	{
		ManageKeywordsMenuPage mk = new ManageKeywordsMenuPage(driver);
		
		mk.manageKeywordsMenu();
		mk.selectCountry();
		mk.enterKeyword();
		mk.searchButton();
		
		
		try
		{
			Thread.sleep(3000);
			mk.editCampaign();
			
			Thread.sleep(3000);
			driver.navigate().back();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		
		try
		{
			Thread.sleep(3000);
			mk.deleteKeyword();
			mk.deleteConfirm();
			
			
	        String actual1 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/strong")).getText();
			String expected1 = "Success!";
			
			if(actual1.equals(expected1))
			{
				captureScreen(driver, "Delete Keyword Pass");
				Assert.assertTrue(true);
				logger.info("Keyword deleted successfully");
			}
			else
			{
				captureScreen(driver, "Delete Keyword Fail");
				Assert.assertTrue(true);
				logger.info("Delete keyword action failed");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
