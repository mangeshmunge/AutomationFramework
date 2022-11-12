package com.Account.testCases;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Account.pageObjects.AccountPage;
import com.Campaigns.pageObjects.LoginPage;
import com.opencsv.CSVReader;

public class TC_AccountMenu_001 extends BaseClass
{

	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Account Menu.csv";
			
	@Test(priority=1)
	public void accountInfo() throws Exception
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow =reader.readNext();
		
		String [] a = reader.readNext();
		String csvretention = a[0];
		/*String brand = a[1];
		String zip = a[2];
		String phone = a[3];
		String email = a[4];
		String website = a[5];*/
		
		AccountPage ap = new AccountPage(driver);
		
		ap.accountmodule();
		
		Thread.sleep(2000);
		ap.accountInfo();
		
		Thread.sleep(2000);
		ap.country1();
		ap.timezone();
		ap.csvDataRetention(csvretention);
		
		Thread.sleep(2000);
		ap.twoFAON();
		Thread.sleep(2000);
		ap.twoFAOFF();
		
		Thread.sleep(2000);
		ap.update();	
		
	}
	
	@Test(priority=2)
	public void brandInfo() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow =reader.readNext();
		
		String [] a = reader.readNext();
		String brand = a[1];
		String zip = a[2];
		String phone = a[3];
		String email = a[4];
		String website = a[5];
		
		AccountPage ap = new AccountPage(driver);
		
		Thread.sleep(2000);
		ap.brandInfo();
		
		Thread.sleep(2000);
		ap.brandName(brand);
		ap.zipCode(zip);
		ap.country2();
		ap.EUsupportPhone(phone);
		ap.EUsupportEmail(email);
		ap.supportWebsite(website);
		
		Thread.sleep(2000);
		ap.update();	
		
	}
	
	@Test(priority=3)
	public void myProfile1() throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow = reader.readNext();
		
		String [] a =reader.readNext();
		String name = a[6];
		String surname = a[7];
		String currentpass = a[8];
		String newpass = a[9];
		String confirmpass = a[10];
		
		AccountPage ap = new AccountPage(driver);
		
		Thread.sleep(2000);
		ap.myProfile();
		
		Thread.sleep(2000);
		ap.firstName(name);
		Thread.sleep(2000);
		ap.lastName(surname);
		Thread.sleep(2000);
		ap.currentpassword(currentpass);
		Thread.sleep(2000);
		ap.newpassword(newpass);
		Thread.sleep(2000);
		ap.confirmpassword(confirmpass);
		Thread.sleep(2000);
		ap.update();
		
		Thread.sleep(2000);
		String abc = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div/div/div[2]/div")).getText();
		System.out.println(abc);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=4)
	public void myProfile2() throws Exception
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow = reader.readNext();
		String [] secondrow = reader.readNext();
		
		
		String [] b =reader.readNext();
		String name = b[6];
		String surname = b[7];
		String currentpass = b[8];
		String newpass = b[9];
		String confirmpass = b[10];
		String username = b[4];
		
		
		AccountPage ap = new AccountPage(driver);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.logOut();
		
		Thread.sleep(3000);
		driver.get("https://stage-app.skycore.com/platform/login.php?noauth=1");
		
		Thread.sleep(2000);
		lp.userName(username);
		lp.password(currentpass);
		lp.loginButton();
        
		Thread.sleep(3000);
		ap.accountmodule();

		Thread.sleep(2000);
		ap.myProfile();
		
		Thread.sleep(2000);
		ap.firstName(name);
		Thread.sleep(2000);
		ap.lastName(surname);
		Thread.sleep(2000);
		ap.currentpassword(currentpass);
		Thread.sleep(2000);
		ap.newpassword(newpass);
		Thread.sleep(2000);
		ap.confirmpassword(confirmpass);
		Thread.sleep(2000);
		ap.update();
		
		Thread.sleep(2000);
		String abc = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div/div/div[2]/div")).getText();
		System.out.println(abc);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5)
	public void myProfile3() throws Exception
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow = reader.readNext();
		String [] secondrow = reader.readNext();
		String [] thirdrow = reader.readNext();
		
		String [] c =reader.readNext();
		String name = c[6];
		String surname = c[7];
		String currentpass = c[8];
		String newpass = c[9];
		String confirmpass = c[10];
		String username = c[4];
		
		
		AccountPage ap = new AccountPage(driver);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.logOut();
		
		Thread.sleep(3000);
		driver.get("https://stage-app.skycore.com/platform/login.php?noauth=1");
		
		Thread.sleep(2000);
		lp.userName(username);
		lp.password(currentpass);
		lp.loginButton();
        
		Thread.sleep(3000);
		ap.accountmodule();

		Thread.sleep(2000);
		ap.myProfile();
		
		Thread.sleep(2000);
		ap.firstName(name);
		Thread.sleep(2000);
		ap.lastName(surname);
		Thread.sleep(2000);
		ap.currentpassword(currentpass);
		Thread.sleep(2000);
		ap.newpassword(newpass);
		Thread.sleep(2000);
		ap.confirmpassword(confirmpass);
		Thread.sleep(2000);
		ap.update();
		//*[text()='Success! Your profile has been updated.']
		Thread.sleep(2000);
		String abc = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div/div/div[2]/div")).getText();
		System.out.println(abc);
		
	}
	
	@Test(priority=6)
	public void users() throws Exception
	{
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow = reader.readNext();
		
		String [] c =reader.readNext();
		//String username1 = c[11];
		String username2 = c[12];
		
		
		AccountPage ap = new AccountPage(driver);
		
        ap.accountmodule();
		
		Thread.sleep(2000);
		ap.usersMenu();
		/*ap.inviteemail(username1);
		ap.inviteuser();
		
		Thread.sleep(2000);
		ap.resend1();
		
		Thread.sleep(2000);
		ap.inviteemail(username2);
		ap.inviteuser();*/
		
		Thread.sleep(5000);
		ap.deletecheckbox();
		Thread.sleep(5000);
		ap.deleteButton();
		ap.deleteconfirm();
		
		
	}
	
	
	@Test(priority=7)
	public void csvExports() throws Exception
	{
		
		AccountPage ap = new AccountPage(driver);
		
        //ap.accountmodule();
		
	try
	{
        Thread.sleep(2000);
		ap.csvExportsMenu();
		
		Thread.sleep(2000);
		ap.downloadFile();
		
		Thread.sleep(2000);
		ap.deleteFile();
		ap.deleteconfirm();
		
		
        String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div/div/div[2]/div[1]/strong")).getText();
		
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "Exported CSV File Delete Pass");
			Assert.assertTrue(true);
			logger.info("Exported CSV file deleted successfully");
		}
		else
		{
			captureScreen(driver, "Exported CSV File Delete Fail");
			Assert.assertTrue(true);
			logger.info("Failed to delete Exported CSV File");
		}
		
		Thread.sleep(2000);
		ap.next();
		
		Thread.sleep(2000);
		ap.retry();
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}
	
	
	@Test(priority=8)
	public void csvImports() throws Exception
	{
        AccountPage ap = new AccountPage(driver);
		
        Thread.sleep(2000);
        //ap.accountmodule();
        
	try 
	{
		Thread.sleep(2000);
		ap.csvImportsMenu();
		
        Thread.sleep(2000);
		ap.downloadFile();
		
		//Thread.sleep(2000);
		//ap.errorReport();
		
		Thread.sleep(2000);
		ap.expand();
		
		Thread.sleep(2000);
		ap.deleteFile();
		
		Thread.sleep(2000);
		ap.deleteconfirm();
		
		
        String actual = driver.findElement(By.xpath("//*[@id=\"main-container-fluid\"]/div/div/div[2]/div[1]/strong")).getText();
		
		String expected = "Success!";
			
		if(actual.equals(expected))
		{
			captureScreen(driver, "Imported CSV File Delete Pass");
			Assert.assertTrue(true);
			logger.info("Imported CSV file deleted successfully");
		}
		else
		{
			captureScreen(driver, "Imported CSV File Delete Fail");
			Assert.assertTrue(true);
			logger.info("Failed to delete Imported CSV File");
		}
		
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
		
    }
	
	
}
