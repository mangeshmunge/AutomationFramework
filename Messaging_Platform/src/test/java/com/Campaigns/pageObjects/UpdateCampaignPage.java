package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateCampaignPage 
{

WebDriver ldriver;
	
	public UpdateCampaignPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[1]/div[2]/a")
	WebElement selectcampaign;              
	
	@FindBy(xpath = "//a[@title='Edit Campaign name']")
	WebElement editcampaignname;
	
	@FindBy(name="listname")
	WebElement entercampaignname;
	
	@FindBy(id="campaign_reference_id")
	WebElement editcampaignID;
	
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
	
	@FindBy(xpath = "//*[@id=\"form_edit\"]/div/div/div/div/div[12]/div/div/label/span")
	WebElement optinnotice;
	
	@FindBy(name="optin_notice_email")
	WebElement optinnoticeemail;
	
	@FindBy(xpath = "//*[@id=\"form_edit\"]/div/div/div/div/div[13]/div/div/label/span")
	WebElement forwardmms;
	
	@FindBy(xpath = "//select[@name='mmsmo']")
	WebElement selectmmsinbox;
	
	@FindBy(xpath = "//button[@title='Update']")
	WebElement updatecampaign;
	
	@FindBy(xpath = "(//span[text()= 'Copy'])[1]")
	WebElement copycampaign;
	
	@FindBy(xpath = "(//span[text()= 'Delete'])[1]")
	WebElement deletecampaign;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deleteconfirm;
	
	public void copyCampaign()
	{
		copycampaign.click();
	}
	
	public void deleteCampaign()
	{
		deletecampaign.click();
	}
	
	public void deleteConfirm()
	{
		deleteconfirm.click();
	}
	
	public void selectCampaign()
	{
		selectcampaign.click();
	}
	
	public void editCampaignName()
	{
		editcampaignname.click();
	}
	
	public void entercCampaignName(String campname)
	{
		entercampaignname.clear();
		entercampaignname.sendKeys(campname);
	}
	
	public void editCampaignID(String campid)
	{
		editcampaignID.clear();
		editcampaignID.sendKeys(campid);
	}
	
	public void selectCountry()
	{
	Select country1 = new Select(country);
	country1.selectByValue("102");
	}
	
	public void selectShortcode()
	{
    Select shortcode1 = new Select(shortcode);
    shortcode1.selectByValue("00096");
	}
	
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
	
	public void selectMMSInbox()
	{
		Select selectmmsinbox1 = new Select(selectmmsinbox);
		selectmmsinbox1.selectByValue("355");
	}
	
	public void updateCampaign()
	{
		updatecampaign.click();
	}
}
