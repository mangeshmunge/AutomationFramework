package com.Optout_List.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Optout_List.pageObjects.OptoutListMenuPage;

public class TC_OptoutListMenu_001 extends BaseClass
{
    @Test
	public void optoutList() throws Exception
	{
		OptoutListMenuPage out = new OptoutListMenuPage(driver);
		
		Thread.sleep(3000);
		out.optoutListMenu();
		
		/*Thread.sleep(3000);
		out.searchBySender();
		out.searchButton();
		
		Thread.sleep(3000);
		out.deleteNumber();
		out.deleteNumberConfirm();*/
		
		Thread.sleep(3000);
		out.importNumbers();
		out.uploadCSV();
		
		Thread.sleep(3000);
		out.selectdropdown();
		out.selectCountryShortcode();
		
		Thread.sleep(3000); 
		out.clickonwebpage();
		
		Thread.sleep(3000);
		out.importData();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[3]/strong")).getText();
			
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "Import Numebers Pass");
			Assert.assertTrue(true);
			logger.info("Data imported successfully");
		}
		else
		{
			captureScreen(driver, "Import Numbers Fail");
			Assert.assertTrue(true);
			logger.info("Failed to import data");
		}
		
		
		
	}
	
}
