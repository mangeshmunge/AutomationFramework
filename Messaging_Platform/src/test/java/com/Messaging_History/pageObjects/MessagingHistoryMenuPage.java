package com.Messaging_History.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagingHistoryMenuPage {

	WebDriver driver;
	
	public MessagingHistoryMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul[6]/li[11]/a/span")
	WebElement messaginghistorymenu;
	
	@FindBy(xpath = "//select[@name='custom_month']") 
	WebElement month;
	
	@FindBy(xpath = "//select[@name='custom_year']") 
	WebElement year;
	
	@FindBy(xpath = "//select[@name='custom_from']") 
	WebElement fromdate;
	
	@FindBy(xpath = "//select[@name='custom_to']") 
	WebElement todate;
	
	@FindBy(id="shortcode") 
	WebElement sender;
	
	@FindBy(xpath = "//button[text()='Submit']") 
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[3]/div[2]/a[1]") 
	WebElement viewmmsmt;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[4]/div[2]/a[1]") 
	WebElement viewmmsmo;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[5]/div[2]/a[1]") 
	WebElement viewsmsmt;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[6]/div[2]/a[1]") 
	WebElement viewsmsmo;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[3]/div[2]/a[2]") 
	WebElement chartmmsmt;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[4]/div[2]/a[2]") 
	WebElement chartmmsmo;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[5]/div[2]/a[2]") 
	WebElement chartsmsmt;
	
	@FindBy(xpath = "//*[@id=\"history_breakdown_00060856_7\"]/div[6]/div[2]/a[2]") 
	WebElement chartsmsmo;
	
	@FindBy(xpath = "//select[@id='report_type']") 
	WebElement selectreporttype;
	
	@FindBy(xpath = "//button[text()='Generate CSV Report']") 
	WebElement generatecsvreport;
	
	@FindBy(xpath = "//*[@id=\"hideshow_00060856_7\"]") 
	WebElement senderwisefilter;
	 
	@FindBy(xpath = "//a[text() = 'Export Files']") 
	WebElement verifyexportedfiles;
	
	
	
	
	
	
	public void messaginghistoryMenu()
	{
		messaginghistorymenu.click();
	}
	
	public void Month()
	{
        Select sc = new Select(month);
		
		sc.selectByValue("05");
	}
	
	public void Year()
	{
        Select sc = new Select(year);
		
		sc.selectByValue("2022");
	}
	
	public void fromDate()
	{
        Select sc = new Select(fromdate);
		
		sc.selectByValue("01");
	}
	
	public void toDate()
	{
        Select sc = new Select(todate);
		
		sc.selectByValue("30");
	}
	
	public void sender()
	{
		sender.sendKeys("00060856");
	}
	
	public void Submit()
	{
		submit.click();
	}
	
	public void viewMMMSMT()
	{
		viewmmsmt.click();
	}
	
	public void viewMMMSMO()
	{
		viewmmsmo.click();
	}
	
	public void viewSMSMT()
	{
		viewsmsmt.click();
	}
	
	public void viewSMSMO()
	{
		viewsmsmo.click();
	}
	
	public void chartMMMSMT()
	{
		chartmmsmt.click();
	}
	
	public void chartMMMSMO()
	{
		chartmmsmo.click();
	}
	
	public void chartSMSMT()
	{
		chartsmsmt.click();
	}
	
	public void chartSMSMO()
	{
		chartsmsmo.click();
	}
	
	public void MMSMTReport()
	{
        Select sc = new Select(selectreporttype);
		
		sc.selectByValue("mmsmt");
	}
	
	public void MMSMOReport()
	{
        Select sc = new Select(selectreporttype);
		
		sc.selectByValue("mmsmo");
	}
	
	public void SMSMTReport()
	{
        Select sc = new Select(selectreporttype);
		
		sc.selectByValue("smsmt");
	}
	
	public void SMSMOReport()
	{
        Select sc = new Select(selectreporttype);
		
		sc.selectByValue("smsmo");
	}
	
	public void generateCSVReport()
	{
		generatecsvreport.click();
	}
	
	public void senderwiseFilter()
	{
		senderwisefilter.click();
	}
	
	public void verifyExportedFiles()
	{
		verifyexportedfiles.click();
	}
	
	
	
	
	
}
