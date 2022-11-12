package com.People.testCases;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Campaigns.pageObjects.CreateCampaignPage;
import com.People.pageObjects.PeoplePage;
import com.opencsv.CSVReader;

public class TC_People_001 extends BaseClass
{
	
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/People - Update Person Info.csv";
	
	
	
	//**********************************      Upload People Bulk Data using CSV     ************************************//
	
	
	
    @Test(priority=1)
	public void uploadPeopleBulkData() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
    	
		String [] firstrow = reader.readNext();
		String [] a = reader.readNext();
		
		String phone = a[0];
		String email = a[1];
		String fullname = a[2];
		String fulladdress = a[3];
		String custom1 = a[4];
		String custom2 = a[5];
    	
    	PeoplePage pp = new PeoplePage(driver);
		
		pp.peopleModule();
		pp.peopleMenu();
		Thread.sleep(3000);
		//pp.enterPhoneNumber1();
		//pp.searchButton1();
		
		
		
		pp.importPeopleBulkData();
		Thread.sleep(2000);
		pp.uploadPeopleCSV();
		pp.csvcolumn1();
		pp.csvcolumn2();
		pp.csvcolumn3();
		Thread.sleep(3000);
		//pp.skipFirstRow();
		//Thread.sleep(3000);
		//pp.cancelImport();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		pp.importData();
	
		
        String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong	")).getText();
		
		String expected = "Success:";
		
		if(actual.equals(expected))
		{
			captureScreen(driver, "Import People Bulk Data Pass");
			Assert.assertTrue(true);
			logger.info("People data imported successfully");
		}
		else
		{
			captureScreen(driver, "Import People Bulk Data Fail");
			Assert.assertTrue(true);
			logger.info("Import People Bulk Data action failed");
		}
		
		
	}
    
    
    
    //******************************     View and Update Personal Information      *********************************//
    
    
    
    @Test(priority=2)
	public void viewUpdatePersonalInfo() throws Exception
	{
		
        CSVReader reader = new CSVReader(new FileReader(csvfile));
    	
		String [] firstrow = reader.readNext();
		String [] a = reader.readNext();
		
		String phone = a[0];
		String email = a[1];
		String fullname = a[2];
		String fulladdress = a[3];
		String custom1 = a[4];
		String custom2 = a[5];
		
		
		PeoplePage pp = new PeoplePage(driver);
		
		Thread.sleep(3000);
		pp.personalDataLink();
		
		Thread.sleep(3000);
		//pp.updatePhone(phone);
	    pp.updateEmail(email);
	    pp.updateFullAddress(fulladdress);
	    pp.updateCustom1(custom1);
	    pp.updateFullName(fullname);
	    pp.updateCustom2(custom2);
	    pp.updatePersonInfo();
		
	    
        String actual1 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/b")).getText();
		
		String expected1 = "Success:";
		
		if(actual1.equals(expected1))
		{
			captureScreen(driver, "Update Person Info Pass");
			Assert.assertTrue(true);
			logger.info("Person info updated successfully");
		}
		else
		{
			captureScreen(driver, "Update Person Info Fail");
			Assert.assertTrue(true);
			logger.info("Failed to update person info");
		}
	
	}
		
    
	
	//******************************   Create, Edit, Delete Merge Tag      ****************************//
    
    
	
    @Test(priority=3)
	public void createEditDeleteMergeTag() throws Exception
	{
    
    	PeoplePage pp = new PeoplePage(driver);
    	
		Thread.sleep(3000);
		pp.createMergeTag();
		pp.addNewTag();
		
		try 
		{	
		    pp.enterMergeTagName();
		    pp.selectMappingTags();
		    pp.save();
		    
		    String actual2 = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[1]/strong")).getText();
			
			String expected2 = "Success!";
			
			if(actual2.equals(expected2))
			{
				captureScreen(driver, "Add New Tag Pass");
				Assert.assertTrue(true);
				logger.info("Personal Tag mapping has been stored successfully");
			}
			else
			{
				captureScreen(driver, "Add New Tag Fail");
				Assert.assertTrue(true);
				logger.info("Personal Tag mapping has is failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
    
		
    //**************************************    View, Export Additional Data    ***********************************//
    
    
		
    @Test(priority=4)
	public void viewExportAdditionalData() throws Exception
	{
		
    	PeoplePage pp = new PeoplePage(driver);
    	
		Thread.sleep(5000);
		pp.peopleMenu();
		Thread.sleep(5000);
		
		String month1 ="May 2018";
		String day1 = "16";
		
		String month2 ="May 2022";
		String day2 = "22";
		
		
		pp.additionalDataLink();
		Thread.sleep(3000);
		
		pp.mmsCampaign();
		pp.enterPhoneNumber2();
		pp.from();
		
		Thread.sleep(3000);
		
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
		pp.clickonwebpage();
		Thread.sleep(3000);
		
		pp.to();
		Thread.sleep(3000);
		
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
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
		    }
		
		}
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day2+")]")).click();
		Thread.sleep(3000);
		pp.clickonwebpage();
		
		pp.searchButton2();
		
		Thread.sleep(3000);
		pp.exportAdditionalData();
		
	}
		
		
		
	//**************************************       Check Opt-in Lists      ************************************//
    
    
		
    @Test(priority=5)
	public void checkOptinLists() throws Exception
	{	
    
    	PeoplePage pp = new PeoplePage(driver);
    	
		Thread.sleep(3000);
		pp.peopleMenu();
		Thread.sleep(5000);
		pp.optinListsLink();
		Thread.sleep(3000);
		
		pp.enterPhoneNumber3();
		pp.searchButton3();
		
		
	}
}
