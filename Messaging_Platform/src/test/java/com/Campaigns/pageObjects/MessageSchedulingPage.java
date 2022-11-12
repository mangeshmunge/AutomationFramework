package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessageSchedulingPage {

	WebDriver driver;
	
	public MessageSchedulingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath = "//*[@id=\"tr_0\"]/div[4]/div[2]/div[3]/a/span")
	  WebElement messageschedulinglink;
	  
	  @FindBy(id="key_3")
	  WebElement messageschedulingtab;
	 
	  @FindBy(xpath = "//label[@for='message-type-sms']")
	  WebElement sendSMS;
	  
	  @FindBy(xpath = "//textarea[@data-brand-name='Skycore: ']")
	  WebElement mstext;
	  
	  @FindBy(xpath = "//*[@id=\"form_alerts_send_calendar\"]/div/div/div/div/div[4]/div/div/a/label/span")
	  WebElement dcflever;
	  
	  @FindBy(xpath = "//select[@name='response_flow_action']")
	  WebElement datacollectionflow;
	  
	  @FindBy(xpath = "//label[@for='start_flow_web']")
	  WebElement weblink;
	  
	  @FindBy(xpath = "//label[@for='start_flow_sms']")
	  WebElement questiontext;
	  
	  @FindBy(xpath = "//*[@id=\"form_alerts_send_calendar\"]/div/div/div/div/div[8]/div/div/a/label/span")
	  WebElement clicktrackinglever;
	  
	  @FindBy(xpath = "//button[@title='Submit']")
	  WebElement submit;
	  
	  @FindBy(xpath = "//label[@for='message-type-mms']")
	  WebElement sendMMS;
	  
	  @FindBy(xpath = "//a[@title='Select MMS Template']")
	  WebElement selectMMStemp;
	  
	  @FindBy(xpath = "//input[@placeholder='Search by MMS Template Name']")
	  WebElement searchtemp;
	  
	  @FindBy(id="search-MMSAuto-button")
	  WebElement searchtempbutton;
	  
	  @FindBy(xpath = "//*[@id=\"selectLink|-|134236|-|Image Template|-|f\"]")
	  WebElement selectMMS;
	  
	  @FindBy(xpath = "//input[@id='datestamp']")
	  WebElement msgsendingdate;
	  
	  @FindBy(xpath = "//html")
	  WebElement clickonwebpage;
	  
	  @FindBy(xpath = "//select[@id='datestamphour']")
	  WebElement msgsendinghours;
	  
	  @FindBy(xpath = "//select[@id='datestampminute']")
	  WebElement msgsendingminutes;
	  
	  
	  
	  
	  public void messageSchedulingLink()
	  {
		  messageschedulinglink.click();
	  }
	  
	  public void messageSchedulingTab()
	  {
		  messageschedulingtab.click();
	  }
	  
	  public void sendSMS()
	  {
		  sendSMS.click();
	  }
	  
	  public void enterMSText(String smstext)
	  {
		  mstext.sendKeys(smstext);
	  }
	  
	  public void sendMMS()
	  {
		  sendMMS.click();
	  }
	  
	  public void selectMMSTemp()
	  {
		  selectMMStemp.click();
	  }
	  
	  public void searchTemp()
	  {
		  searchtemp.sendKeys("Audio Template");
	  }
	  
	  public void searchTempButton()
	  {
		  searchtempbutton.click();
	  }
	  
	  public void selectMMS()
	  {
		  selectMMS.click();
	  }
	  
	  public void DCFLever()
	  {
		  dcflever.click();
	  }
	  
	  public void selectDCF()
	  {
		  Select sdcf = new Select(datacollectionflow);
		  
		  sdcf.selectByValue("395");
	  }
	  
	  public void webLink()
	  {
		 weblink.click();
	  }
	  
	  public void questionText()
	  {
		  questiontext.click();
	  }
	  
	  public void CTLever()
	  {
		  clicktrackinglever.click();
	  }
	  
	  public void msgSendingDate()
	  {
		  msgsendingdate.click();
	  }
	  
	  public void clickonwebpage()
	  {
			clickonwebpage.click();
	  }
	  
	  public void msgSendingHours()
	  {
		  Select sdcf = new Select(msgsendinghours);
		  
		  sdcf.selectByValue("13");
	  }
	  
	  public void msgSendingMinutes()
	  {
		  Select sdcf = new Select(msgsendingminutes);
		  
		  sdcf.selectByValue("42");
	  }
	  
	  public void Submit()
	  {
		  submit.click();
	  }
	  
	  
	    
	  
}
