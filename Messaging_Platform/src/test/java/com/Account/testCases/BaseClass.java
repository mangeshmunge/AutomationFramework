package com.Account.testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Campaigns.pageObjects.LoginPage;
import com.messaging_platform.utilities.ReadConfig;
import com.opencsv.CSVReader;

public class BaseClass {

	// CREATED OBJECT/INSTANCE OF READCONFIG CLASS TO READ THE DATA FROM CONFIG.PROPERTIES FILE
	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL= readconfig.getApplicationURL();
	public String username= readconfig.getusername();
	public String password= readconfig.getpassword();
	public String carrier1= readconfig.getcarrier1();
	public String carrier2= readconfig.getcarrier2();
	public String carrier3= readconfig.getcarrier3();
	public String carrier4= readconfig.getcarrier4();
	public String carrier5= readconfig.getcarrier5();
	public String carrier6= readconfig.getcarrier6();
	public String carrier7= readconfig.getcarrier7();
	public String carrier8= readconfig.getcarrier8();
	public String csvfilepath= readconfig.getcsvfilepath();
	/*public String campaignname= readconfig.getcampaignname();
	public String audiencelistname= readconfig.getaudiencelistname();
	public String optinemail= readconfig.getoptinemail();*/
	public static WebDriver driver;
	
	public static Logger logger;
	
	// @Parameters IS USED TO EXECUTE THE TEST CASES THROUGH TESTNG.XML FILE ("browser" is parameter)
	// @BeforeClass IS USED TO EXECUTE THE SETUP METHOD BEFORE TEST CLASS
	
	String csvfile = "/home/mangeshmunge/Mangesh - Testing/CSV/Account Menu.csv";
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws Exception
	{
		logger = Logger.getLogger("Messaging Platform");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","/home/mangeshmunge/Mangesh - Testing/Automation/Chromedriver/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","/home/mangeshmunge/Mangesh - Testing/geckodriver");  
	        driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		/*CSVReader reader = new CSVReader(new FileReader(csvfile));
		String [] firstrow = reader.readNext();
		
		String [] a =reader.readNext();
		String username = a[4];
		String password = a[9];
		String password1 = b[9];*/
		
        LoginPage lp = new LoginPage(driver);
        
		lp.userName(username);
		//logger.info("Entered Username");
		
		lp.password(password);
		//logger.info("Entered Password");
		
		lp.loginButton();
		//logger.info("Clicked on login button");
		logger.info("Logged in Succcessfully");
		
		
	}
	
	// @AfterClass IS USED TO EXECUTE THE TEARDOWN METHOD AFTER TEST CLASS
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	// captureScreen METHOD IS USED CAPTURE THE SCREENSHOTS OF PASSED/FAILED TEST CASES
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	// randomstring() METHOD IS USED TO GENERATE THE RANDOM STRINGS OF DESIRED LENGTHS
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	// randomNum() METHOD IS USED TO GENERATE THE RANDOM NUMBERS OF DESIRED LENGTHS
	
	public String randomNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
}
