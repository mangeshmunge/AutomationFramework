package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMSInboxPage {

    
	WebDriver driver;
	
	public SMSInboxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[7]/div[2]/a")
	WebElement smsinboxlink;
	
	@FindBy(id="key_8")
	WebElement smsinboxtab;
	
	@FindBy(xpath = "//input[@placeholder='Phone number']")
	WebElement searchnumber;
	
	@FindBy(xpath = "//*[@id=\"tabs-1\"]/form[1]/div/div[1]/button")
	WebElement searchbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Generate CSV Export')]")
	WebElement generatecsv;
	
	
	
	public void smsInboxLink()
	{
		smsinboxlink.click();
	}
	
	public void smsInboxTab()
	{
		smsinboxtab.click();
	}
	
	public void searchNumber()
	{
		searchnumber.sendKeys("16178389328");
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	public void generateCSV()
	{
		generatecsv.click();
	}
	
}
