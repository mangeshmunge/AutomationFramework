package com.Message_Lookup.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageLookupMenuPage {

	WebDriver driver;
	
	public MessageLookupMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[4]/a/span")
	WebElement messagelookupmenu;
	
	@FindBy(xpath = "//input[@id='lookupdate']")
	WebElement date;
	 
	/*@FindBy(xpath = "/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")
	WebElement month;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")
	WebElement arrow;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr/td[contains(text(),'15')]")
	WebElement day;*/
	
	@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	
	@FindBy(name="string")
	WebElement enterphonenumber;
	
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement searchbutton;
	
	@FindBy(xpath = "//label[@for='message_type_sms']") 
	WebElement messagetypesms;
	
	@FindBy(xpath = "//label[@for='message_type_mms']") 
	WebElement messagetypemms;
	
	@FindBy(xpath = "//*[@id=\"smsreg_0\"]") 
	WebElement smsdlr1;
	
	@FindBy(xpath = "//*[@id=\"smsreg_1\"]") 
	WebElement smsdlr2;
	
	@FindBy(xpath = "//*[@id=\"dlr_0\"]") 
	WebElement mmsdlr1;
	
	@FindBy(xpath = "//*[@id=\"dlr_1\"]") 
	WebElement mmsdlr2;
	
	@FindBy(xpath = "//*[@id=\"sms-dlr123\"]/div/div/div[1]/button/span") 
	WebElement smsdlrclose;
	
	@FindBy(xpath = "//*[@id=\"dlr123\"]/div/div/div[1]/button/span") 
	WebElement mmsdlrclose;
	
	
	
	public void messageLookupMenu()
	{
		messagelookupmenu.click();
	}
	
	public void Date()
	{
		date.click();
	}	
	
	public void clickonwebpage()
	{
		clickonwebpage.click();
	}
	
	public void enterPhoneNumber()
	{
		enterphonenumber.clear();
		enterphonenumber.sendKeys("6178389328");
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	public void messagetypeSMS()
	{
		messagetypesms.click();
	}
	
	public void messagetypeMMS()
	{
		messagetypemms.click();
	}
	
	public void SMSDLR1()
	{
		smsdlr1.click();
	}
	
	public void SMSDLR2()
	{
		smsdlr2.click();
	}
	
	public void MMSDLR1()
	{
		mmsdlr1.click();
	}
	
	public void MMSDLR2()
	{
		mmsdlr2.click();
	}
	
	public void SMSDLRClose()
	{
		smsdlrclose.click();
	}
	
	public void MMSDLRClose()
	{
		mmsdlrclose.click();
	}
	
	
	
	
	
	
	
	
}
