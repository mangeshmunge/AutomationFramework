package com.MMS_Templates.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MMSTemplateActionsPage {

    WebDriver driver;
	
	public MMSTemplateActionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[2]/a/span")
	WebElement mmstemplatesmenu;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/div/a")
	WebElement clicktrackingON;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/div/a")
	WebElement clicktrackingOFF;
	
	@FindBy(xpath = "//*[@id=\"sendMMS\"]")
	WebElement testmms;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement country;
	
	@FindBy(id="phonenumber")
	WebElement receiver;
	
	@FindBy(xpath = "//select[@id='shortcode']")
	WebElement sender;
	
	@FindBy(xpath = "//label[@id='sms_fallback']")
	WebElement sendassms;
	
	@FindBy(id="shortcode_mask")
	WebElement sendermask;
	
	@FindBy(id="operatorid")
	WebElement operatorID; 
	
	@FindBy(xpath = "//button[text()='Send']")
	WebElement sendtestmms;
	
	@FindBy(xpath = "//*[@id=\"preview\"]")
	WebElement mmspreview;
	
	@FindBy(xpath = "//*[@id=\"myTab\"]/li[1]/a")
	WebElement iphonepreview;
	
	@FindBy(xpath = "//*[@id=\"myTab\"]/li[2]/a")
	WebElement androidpreview;
	
	@FindBy(xpath = "//*[@id=\"myTab\"]/li[3]/a")
	WebElement featurepreview;
	
	@FindBy(xpath = "//*[@id=\"myTab\"]/li[4]/a")
	WebElement fallbacksmspreview;
	
	@FindBy(xpath = "//*[@id=\"mmspreview\"]/div/div/div/div[1]/button")
	WebElement closepreview;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/a[1]")
	WebElement copymmstemplate;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/a[2]")
	WebElement editmmstemplate;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/a[3]")
	WebElement deletemmstemplate;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deleteConfirm;
	
	@FindBy(id="search-mms-template")
	WebElement searchtemplate;
	
	
	
	
	
	public void MMSTemplatesMenu()
	{
		mmstemplatesmenu.click();
	}
	
	public void testMMS()
	{
		testmms.click();
	}
	
	public void selectCountry()
	{
		Select country1 = new Select(country);
		
		country1.selectByValue("7");
	}
	
	public void Receiver()
	{
		receiver.sendKeys("6178389328");
	}
	
	public void sender()
	{
		Select sender1 = new Select(sender);
		
		sender1.selectByValue("00060856");
	}
	
	public void sendAsSMS()
	{
		sendassms.click();
	}
	
	public void senderMask()
	{
		sendermask.sendKeys("Test123");
	}
	
	public void operatorID()
	{
		operatorID.sendKeys("12345");
	}
	
	public void sendTestMMS()
	{
		sendtestmms.click();
	}
	
	public void MMSPreview()
	{
		mmspreview.click();
	}
	
	public void iphonePreview()
	{
		iphonepreview.click();
	}
	
	public void androidPreview()
	{
		androidpreview.click();
	}
	
	public void featurePreview()
	{
		featurepreview.click();
	}
	
	public void fallbackSMSPreview()
	{
		fallbacksmspreview.click();
	}
	
	public void closePreview()
	{
		closepreview.click();
	}
	
	public void copyMMSTemplate()
	{
		copymmstemplate.click();
	}
	
	public void editMMSTemplate()
	{
		editmmstemplate.click();
	}
	
	public void deleteMMSTemplate()
	{
		deletemmstemplate.click();
	}
	
	public void deleteConfirm()
	{
		deleteConfirm.click();
	}
	
	public void clicktrackingON()
	{
		clicktrackingON.click();
	}
	
	public void clicktrackingOFF()
	{
		clicktrackingOFF.click();
	}
	
	
	
	
	
	
}
