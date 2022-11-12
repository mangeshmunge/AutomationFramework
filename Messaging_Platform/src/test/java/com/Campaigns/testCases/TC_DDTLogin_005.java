package com.Campaigns.testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.messaging_platform.utilities.ReadConfig;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class TC_DDTLogin_005
{
    
	WebDriver driver;
	String BaseURL = "https://stage-app.skycore.com/platform/login.php?noauth=1";
	String csvfile = "/home/mangeshmunge/eclipse-workspace/Messaging_Platform/testData.csv";
	
	@Test
	public void verifyLogin() throws CsvValidationException, IOException, Exception
	{
		ReadConfig readconfig = new ReadConfig();
		
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		
		driver.manage().window().maximize();
		
		CSVReader reader = new CSVReader(new FileReader(csvfile));
		String[] cell;
		
		while((cell=reader.readNext())!=null) {
			
			for(int i=0;i<1;i++) {
				
				String id = cell[i];
				String pass = cell[i+1];
				
				driver.findElement(By.id("login")).sendKeys(id);
				driver.findElement(By.id("password")).sendKeys(pass);
				driver.findElement(By.xpath("//button[@title='Click here to login']")).click();
		        driver.findElement(By.xpath("//*[@id=\"sidemenu-list\"]/li[6]/ul/li[4]/div/a")).click();
		        driver.get(BaseURL);
		        Thread.sleep(3000);
				
				
			}
		}
		
		
		
	}
}
