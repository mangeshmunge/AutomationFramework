package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaignPage {

    WebDriver ldriver;
	
	public CreateCampaignPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[3]/a/span")
	WebElement campaignsmenu;
	
	@FindBy(xpath = "//*[@title='Create SMS/MMS Campaign']")
	WebElement createcampaign;
	
	@FindBy(id="createAlert_name")
	WebElement entercampaignname;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="shortcode")
	WebElement shortcode;
	
	@FindBy(id="audience-list")
	WebElement aulist;
	
	@FindBy(id="audience_list_name")
	WebElement enteraudiencelistname;
	
	@FindBy(xpath = "//button[@title='Add']")
	WebElement clickadd;
	
	@FindBy(id="custom_shortcode_mask")
	WebElement sendermask;
	
	//X path with Tagname Label is only working for following elements
	
	@FindBy(xpath = "//label[@for='consent_request_t']")
	WebElement consentrequestON;
	
	@FindBy(xpath = "//label[@for='consent_request_f']")
	WebElement consentrequestOFF;
	
	@FindBy(xpath = "//label[@for='consent_confirmation_t']")
	WebElement consentconfirmationON;
	
	@FindBy(xpath = "//label[@for='consent_confirmation_f']")
	WebElement consentconfirmationOFF;
	
	@FindBy(xpath = "//label[@for='resend_optin_t']")
	WebElement resendoptinON;
	
	@FindBy(xpath = "//label[@for='resend_optin_f']")
	WebElement resendoptinOFF;
	
	@FindBy(xpath = "//label[@for='one_ar_t']")
	WebElement resendARON;
	
	@FindBy(xpath = "//label[@for='one_ar_f']")
	WebElement resendAROFF;
	
	@FindBy(xpath = "//label[@for='delete_collected_data_t']")
	WebElement deletedataON;
	
	@FindBy(xpath = "//label[@for='delete_collected_data_f']")
	WebElement deletedataOFF;
	
	@FindBy(id="data_delete_interval")
	WebElement datadeletespan;
	
	@FindBy(xpath = "//label[@for='optin_notice']")
	WebElement optinnotice;
	
	@FindBy(name="optin_notice_email")
	WebElement optinnoticeemail;
	
	@FindBy(xpath = "//label[@for='mms_fwd']")
	WebElement forwardmms;
	
	@FindBy(xpath = "//select[@name='mmsmo']")
	WebElement selectmmsinbox;
	
	@FindBy(xpath = "//button[@name='submit-form']")
	WebElement submitcampaign;
	
	
	
	
	public void campaignsMenu()
	{
		campaignsmenu.click();
	}
	
	public void createCampaign()
	{
		createcampaign.click();
	}
	
	public void enterCampaignName(String cname)
	{
		entercampaignname.sendKeys(cname);
	}
	
	//enter the required country value here
	
	public void selectCountry()
	{
	Select country1 = new Select(country);
	country1.selectByValue("7");
	}
	
	//enter the required shortcode value here
	
	public void selectShortcode()
	{
    Select shortcode1 = new Select(shortcode);
    shortcode1.selectByValue("00060856");
	}
	
	//enter the required audience list value here
	
	public void selectAudienceList()
	{
    Select aulist1 = new Select(aulist);
	aulist1.selectByValue("autocreate");
	}
	
	
	public void enterAudienceListName(String auname)
	{
		enteraudiencelistname.sendKeys(auname);
	}
	
	public void clickAdd()
	{
		clickadd.click();
	}
	
	//Enter sender mask here
	
	public void shortcodeMask()
	{
		sendermask.sendKeys("SKY-123");
	}
	
	public void consentRequestON()
	{
		consentrequestON.click();
	}
	
	public void consentRequestOFF()
	{
		consentrequestOFF.click();
	}
	
	public void consentConfirmationON()
	{
		consentconfirmationON.click();
	}
	
	public void consentConfirmationOFF()
	{
		consentconfirmationOFF.click();
	}
	
	public void resendoptinON()
	{
		resendoptinON.click();
	}
	
	public void resendoptinOFF()
	{
		resendoptinOFF.click();
	}
	
	public void resendARON()
	{
		resendARON.click();
	}
	
	public void resendAROFF()
	{
		resendAROFF.click();
	}
	
	public void deleteCollectedDataON()
	{
		deletedataON.click();
	}
	
	public void dataDeleteSpan()
	{
		datadeletespan.sendKeys("48");
	}
	
	public void deleteCollectedDataOFF()
	{
		deletedataOFF.click();
	}
	
	
	public void optinNotice()
	{
		optinnotice.click();
	}
	
	public void optinNoticeEmail(String optinemail)
	{
		optinnoticeemail.sendKeys(optinemail);
	}
	
	public void forwardMMS()
	{
		forwardmms.click();
	}
	
	//enter the required MMS INBOX value here
	
	public void selectMMSInbox()
	{
		Select selectmmsinbox1 = new Select(selectmmsinbox);
		selectmmsinbox1.selectByValue("355");
	}
	
	public void submitCampaign()
	{
		submitcampaign.click();
	}
	
	
	
	
}
