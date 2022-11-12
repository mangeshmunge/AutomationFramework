package com.Message_Lookup.pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Campaigns.pageObjects.LoginPage;

public class Test {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","/home/mangeshmunge/Mangesh - Testing/Automation/Chromedriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stage-app.skycore.com/platform/login.php?noauth=1");
		
        LoginPage lp = new LoginPage(driver);
		
		lp.userName("mangesh.munge@skycore.com");
		//logger.info("Entered Username");
		
		lp.password("Mangesh@2818");
		//logger.info("Entered Password");
		
		lp.loginButton();
		//logger.info("Clicked on login button");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Message Lookup\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lookupdate']")).click();
		
		Thread.sleep(3000);
		
		
		
		
		
	}
}
