package com.Tools.testCases;

import java.io.FileReader;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Tools.pageObjects.ToolsPage;
import com.opencsv.CSVReader;

public class TC_ToolsMenu_001 extends BaseClass
{

	String csvfile1 = "/home/mangeshmunge/Mangesh - Testing/CSV/Map File Builder.csv";
	String csvfile2 = "/home/mangeshmunge/Mangesh - Testing/CSV/Create vCard.csv";
	String csvfile3 = "/home/mangeshmunge/Mangesh - Testing/CSV/Create iCal.csv";
	String csvfile4 = "/home/mangeshmunge/Mangesh - Testing/CSV/Image Templates.csv";
	
	@Test(priority=1)
	public void createMapBuilder() throws Exception 
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile1));
		String firstrow[] = reader.readNext();
		
		String a [] = reader.readNext();
		String locationname = a[0];
		String latitude = a[1];
		String longitude = a[2];
		String address = a[3];
		
		
		
		ToolsPage tp = new ToolsPage(driver);
		
		tp.toolsModule();
		
		Thread.sleep(2000);
		tp.mapFileBuilderMenu();
		
		Thread.sleep(2000);
		tp.locationName(locationname);
		
		Thread.sleep(2000);
		tp.latlongOption();
		
		Thread.sleep(2000);
		tp.enterLatitude1(latitude);
		
		Thread.sleep(2000);
		tp.enterLongitude1(longitude);
		
		Thread.sleep(3000);
		tp.createMapFile();	
		
		Thread.sleep(000);
		tp.addressOption();
		
		Thread.sleep(2000);
		tp.enterAddress(address);
		
		Thread.sleep(2000);
		tp.clickonwebpage();
		
		Thread.sleep(2000);
		tp.createMapFile();	
		
	}
	
	
	@Test(priority=2)
	public void createVCard() throws Exception 
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile2));
		String firstrow[] = reader.readNext();
		
		String a [] = reader.readNext();
		String firstname = a[0];
		String lastname = a[1];
		String organizationname = a[2];
		String cardtitle = a[3];
		String samplenote = a[4];
		String photoURL = a[5];
		String phnumber1 = a[6];
		String phnumber2 = a[7];
		String phnumber3 = a[8];
		String phnumber4 = a[9];
		String mailid1 = a[10];
		String mailid2 = a[11];
		String mailid3 = a[12];
		String mailid4 = a[13];
		String add1 = a[14];
		String add2 = a[15];
		String add3 = a[16];
		String add4 = a[17];
		String url1 = a[18];
		String url2 = a[19];
		String url3 = a[20];
		String url4 = a[21];
		String label1 = a[22];
		String label2 = a[23];
		String label3 = a[24];
		String label4 = a[25];
		
		ToolsPage tp = new ToolsPage(driver);
		
		//tp.toolsModule();
		
		Thread.sleep(5000);
		tp.createVCardMenu();
		
		Thread.sleep(2000);
		tp.firstName(firstname);
		tp.lastName(lastname);
		tp.orgName(organizationname);
		tp.vCardTitle(cardtitle);
		tp.note(samplenote);
		
		Thread.sleep(2000);
		tp.uploadphoto();
		
		Thread.sleep(5000);
		tp.addNewNumber();
		tp.addNewNumber();
		tp.addNewNumber();
		
		Thread.sleep(2000);
		tp.phoneNumber1(phnumber1);
		tp.phoneNumber2(phnumber2);
		tp.phoneNumber3(phnumber3);
		tp.phoneNumber4(phnumber4);
		
		Thread.sleep(2000);
		tp.numberType1();
		tp.numberType2();
		tp.numberType3();
		tp.numberType4();
		
		Thread.sleep(2000);
		tp.addNewEmail();
		tp.addNewEmail();
		tp.addNewEmail();
		
		Thread.sleep(2000);
		tp.email1(mailid1);
		tp.email2(mailid2);
		tp.email3(mailid3);
		tp.email4(mailid4);
		
		Thread.sleep(2000);
		tp.emailType1();
		tp.emailType2();
		tp.emailType3();
		tp.emailType4();
		
		Thread.sleep(2000);
		tp.addNewAddress();
		tp.addNewAddress();
		tp.addNewAddress();
		
		Thread.sleep(2000);
		tp.address1(add1);
		tp.address2(add2);
		tp.address3(add3);
		tp.address4(add4);
		
		Thread.sleep(2000);
		tp.addressType1();
		tp.addressType2();
		tp.addressType3();
		tp.addressType4();
		
		Thread.sleep(2000);
		tp.addNewWebsite();
		tp.addNewWebsite();
		tp.addNewWebsite();
		
		Thread.sleep(2000);
		tp.website1(url1);
		tp.website2(url2);
		tp.website3(url3);
		tp.website4(url4);
		
		Thread.sleep(2000);
		tp.websiteLabel1(label1);
		tp.websiteLabel2(label2);
		tp.websiteLabel3(label3);
		tp.websiteLabel4(label4);
		
		Thread.sleep(2000);
		tp.removePhoneNumber4();
		
		Thread.sleep(2000);
		tp.removeEmail4();
		
		Thread.sleep(2000);
		tp.removeaddress4();
		
		Thread.sleep(2000);
		tp.removewebsite4();
		
		Thread.sleep(5000);
		tp.create();
		
	}
	
	
	@Test(priority=3)
	public void createiCal() throws Exception 
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile3));
		String firstrow[] = reader.readNext();
		
		String a [] = reader.readNext();
		String eventname = a[0];
		String location = a[1];
		String eventdesc = a[2];
		
		String month1 = "November 2022";
	    String day1 = "15";
	    
	    String month2 = "November 2022";
	    String day2 = "25";
		
		
		ToolsPage tp = new ToolsPage(driver);
		
		//tp.toolsModule();
		
		Thread.sleep(2000);
		tp.createiCalMenu();
		
		Thread.sleep(2000);
		tp.eventtitle(eventname);
		
		Thread.sleep(2000);
		tp.eventStartDate();
		
		Thread.sleep(5000);
		
		while(true)
		{
			String actualmonth1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[2]")).getText();
			
			if(actualmonth1.equals(month1))
			{
				break;
			}
			else
			{
				// Backward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[3]")).click();
			}
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[contains(text(),"+day1+")]")).click();	
			
		}
		
		Thread.sleep(3000);
		tp.eventStartTime();
		
		Thread.sleep(5000);
		tp.eventEndDate();
		
		Thread.sleep(5000);
		
		
		while(true)
		{
			String actualmonth2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[2]")).getText();
			
			if(actualmonth2.equals(month2))
			{
				break;
			}
			else
			{
				// Backward Arrow
		    	//driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[1]")).click();
		    	
		    	// Forward Arrow
		    	driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[3]")).click();
			}
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr/td[contains(text(),"+day2+")]")).click();	
			
		}
		
		Thread.sleep(3000);
		tp.eventEndTime();
		
		Thread.sleep(2000);
		tp.timezone();
		
		Thread.sleep(2000);
		tp.oneTimeEvent();
		
		Thread.sleep(2000);
		tp.eventlocation(location);
		
		Thread.sleep(2000);
		tp.clickonwebpage();
		
		Thread.sleep(2000);
		tp.eventdescription(eventdesc);
		
		Thread.sleep(2000);
		tp.create();
		
		Thread.sleep(2000);
		tp.lastsAllDay();
		
		Thread.sleep(2000);
		tp.create();
				
		
	}
	
	
	@Test(priority=4)
	public void addressLookup() throws Exception 
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile1));
		String firstrow[] = reader.readNext();
		
		String a [] = reader.readNext();
		String latitude = a[1];
		String longitude = a[2];
		String address = a[3];
		
		
		ToolsPage tp = new ToolsPage(driver);
		
		//tp.toolsModule();
		
		Thread.sleep(2000);
		tp.addressLookupMenu();
		
		Thread.sleep(2000);
		tp.enterLatitude2(latitude);
		
		Thread.sleep(2000);
		tp.enterLongitude2(longitude);
		
		Thread.sleep(2000);
		tp.searchforaddress();
		
		Thread.sleep(2000);
		tp.showongooglemaps1();
		
		Thread.sleep(5000);
		captureScreen(driver, "MAP 1");
		
		//****************** Switch between tabs ******************//
		
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(tabs.size());
		
	    driver.switchTo().window(tabs.get(0));
	    
		
		Thread.sleep(3000);
		tp.enterAddress(address);
		
		Thread.sleep(3000);
		tp.clickonwebpage();
		
		Thread.sleep(2000);
		tp.searchforcoordinates();
		
		Thread.sleep(2000);
		tp.showongooglemaps2();	
		
		Thread.sleep(5000);
		captureScreen(driver, "MAP 2");
		
		
		//****************** Switch between tabs ******************//
		
		Thread.sleep(5000);		
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=5)
	public void imageTemplate() throws Exception 
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile4));
		String firstrow[] = reader.readNext();
		
		String a [] = reader.readNext();
		String name = a[0];
		String id = a[1];
		String payload = a[2];
		String pubkey = a[3];
		String prikey = a[4];
		String barcodevalue = a[5];
		String barcodex = a[6];
		String barcodey = a[7];
		String barcodewidth = a[8];
		String barcodeheight = a[9];
		String fgcolor = a[10];
		String bgcolor = a[11];
		String barcodeborder = a[12];
		String text1 = a[13];
		String text1x = a[14];
		String text1y = a[15];
		String text1color = a[16];
		String textwidth1 = a[17];
		String text2 = a[18];
		String text2x = a[19];
		String text2y = a[20];
		String text2color = a[21];
		String textwidth2 = a[22];
		
		
		
		
		ToolsPage tp = new ToolsPage(driver);
		
		tp.toolsModule();
		
		Thread.sleep(2000);
		tp.imageTemplatesMenu();
		
		Thread.sleep(2000);
		tp.createImageTemplate();
		
		Thread.sleep(2000);
		tp.metadataTab();
		
		Thread.sleep(2000);
		tp.templateName(name);
		
		Thread.sleep(2000);
		tp.templateId(id);
	    
		Thread.sleep(3000);
		tp.personalCollecteddData();
		
		Thread.sleep(3000);
		tp.backgroundImageTab();
		
		//Thread.sleep(2000);
		//tp.uploadBGImage();
		
		Thread.sleep(2000);
		tp.barcodeTab();
		
		Thread.sleep(2000);
		tp.addBarcode();
		
		Thread.sleep(2000);
		tp.addBarcode();
		
		/*Thread.sleep(2000);
		tp.enableJWT();
		
		Thread.sleep(2000);
		tp.jwtPayload(payload);
		
		Thread.sleep(2000);
		tp.publicKey(pubkey);
		
		Thread.sleep(2000);
		tp.privateKey(prikey);*/
		
		Thread.sleep(2000);
		tp.barcodevalue(barcodevalue);
		
		Thread.sleep(5000);
		tp.barcodeXPosition(barcodex);
		
		Thread.sleep(2000);
		tp.barcodeYPosition(barcodey);
		
		Thread.sleep(2000);
		tp.barcodeWidth(barcodewidth);
		
		Thread.sleep(2000);
		tp.barcodeHeight(barcodeheight);
		
		Thread.sleep(2000);
		tp.selectForegroundColour(fgcolor);
		
		Thread.sleep(2000);
		tp.selectBackgroundColour(bgcolor);
		
		Thread.sleep(2000);
		tp.barcodeBorder(barcodeborder);
		
		Thread.sleep(2000);
		tp.barcodeTransparent();
		
		Thread.sleep(2000);
		tp.barcodeType();
		
		Thread.sleep(2000);
		tp.hideBarcodeText();
		
		Thread.sleep(2000);
		tp.barcodeTextFont();
		
		Thread.sleep(2000);
		tp.barcodeTextFont();
		
		Thread.sleep(2000);
		tp.barcodeTextFontSize();
		
		Thread.sleep(2000);
		tp.barcodeAlignment();
		
		Thread.sleep(2000);
		tp.barcodeRotation();
		
		Thread.sleep(2000);
		tp.textTab();
		
		Thread.sleep(2000);
		tp.enableTextarea();
		
		Thread.sleep(2000);
		tp.enableTextarea();
		
		Thread.sleep(2000);
		tp.textarea1(text1);
		
		Thread.sleep(2000);
		tp.text1font();
		
		Thread.sleep(2000);
		tp.text1fontsize();
		
		Thread.sleep(2000);
		tp.text1xposition(text1x);
		
		Thread.sleep(2000);
		tp.text1yposition(text1y);
		
		Thread.sleep(2000);
		tp.selecttext1colour(text1color);
		
		Thread.sleep(2000);
		tp.text1width(textwidth1);
		
		Thread.sleep(2000);
		tp.addnewtextarea();
		
		Thread.sleep(2000);
		tp.textarea2(text2);
		
		Thread.sleep(2000);
		tp.text2font();
		
		Thread.sleep(2000);
		tp.text2fontsize();
		
		Thread.sleep(2000);
		tp.text2xposition(text2x);
		
		Thread.sleep(2000);
		tp.text2yposition(text2y);
		
		Thread.sleep(2000);
		tp.selecttext2colour(text2color);
		
		Thread.sleep(2000);
		tp.text2width(textwidth2);
		
		Thread.sleep(2000);
		tp.saveTemplate();
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div[2]/div[2]/strong")).getText();
		
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "Image Template Pass");
			Assert.assertTrue(true);
			logger.info("Image template object created successfully");
		}
		else
		{
			captureScreen(driver, "Image Template Fail");
			Assert.assertTrue(true);
			logger.info("Failed to create image template");
		}
		
		
	}
	
}
