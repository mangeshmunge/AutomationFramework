package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutoResponsesPage {

	  WebDriver driver;
	  
	  public AutoResponsesPage(WebDriver driver)
	  {
		 PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(xpath = "//*[@id=\"tr_0\"]/div[5]/div[2]/a")
	  WebElement autoresponseslink;
	  
	  @FindBy(id="key_7")
	  WebElement autoresponsestab;
	  
	  @FindBy(xpath = "//label[@for='autoresponder-type-2']")
	  WebElement sendSMS;
	  
	  @FindBy(xpath = "//textarea[@data-brand-name='Skycore: ']")
	  WebElement artext;
	  
	  @FindBy(xpath = "//*[@id=\"schedule_in_sequence_form\"]/div/div/div/div/div[4]/div/div/a/label/span")
	  WebElement dcflever;
	  
	  @FindBy(xpath = "//select[@id='response_flow_action']")
	  WebElement datacollectionflow;
	  
	  @FindBy(xpath = "//label[@for='start_flow_web']")
	  WebElement weblink;
	  
	  @FindBy(xpath = "//label[@for='start_flow_sms']")
	  WebElement questiontext;
	  
	  @FindBy(xpath = "//select[@id='sequence_type']")
	  WebElement arsetup;
	  
	  @FindBy(xpath = "//input[@name='quantity']")
	  WebElement timesetup;
	  
	  @FindBy(xpath = "//select[@id='sequence_period']")
	  WebElement timesetupunit;
	  
	  @FindBy(xpath = "//select[@id='frequency_hours']")
	  WebElement recurringhours;
	  
	  @FindBy(xpath = "//select[@id='frequency_minutes']")
	  WebElement recurringminutes;
	  
	  @FindBy(xpath = "//select[@id='frequency_meridiem']")
	  WebElement recurringmeridiem;
	  
	  @FindBy(xpath = "//select[@id='frequency_timezone']")
	  WebElement recurringtimezone;
	  
	  @FindBy(xpath = "//label[@for='frequency_days_3']")
	  WebElement recurringdays;
	  
	  @FindBy(xpath = "//*[@id=\"schedule_in_sequence_form\"]/div/div/div/div/div[11]/div/div/a/label/span")
	  WebElement clicktrackinglever;
	  
	  @FindBy(id="schedule-autoresponder")
	  WebElement scheduleAR;
	  
	  @FindBy(xpath = "//label[@for='autoresponder-type-1']")
	  WebElement sendMMS;
	  
	  @FindBy(xpath = "//a[@title='Select MMS Template']")
	  WebElement selectMMStemp;
	  
	  @FindBy(xpath = "//input[@placeholder='Search by MMS Template Name']")
	  WebElement searchtemp;
	  
	  @FindBy(id="search-MMSAuto-button")
	  WebElement searchtempbutton;
	  
	  @FindBy(xpath = "//*[@id=\"selectLink|-|134236|-|Image Template|-|f\"]")
	  WebElement selectMMS;
	  
	  
	  
	  public void autoResponsesLink()
	  {
		  autoresponseslink.click();
	  }
	  
	  public void autoResponsesTab()
	  {
		  autoresponsestab.click();
	  }
	  
	  public void sendSMS()
	  {
		  sendSMS.click();
	  }
	  
	  public void enterARText(String smstext)
	  {
		  artext.sendKeys(smstext);
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
	  
	  public void ARSetup()
	  {
		  Select ars = new Select(arsetup);
		  
		  ars.selectByValue("1");
	  }
	  
	  public void timeSetup()
	  {
		  timesetup.sendKeys("1");
	  }
	  
	  public void timeSetupUnit()
	  {
		  Select tsu = new Select(timesetupunit);
		  
		  tsu.selectByValue("1");
	  }
	  
	  public void CTLever()
	  {
		  clicktrackinglever.click();
	  }
	  
	  public void scheduleAR()
	  {
		  scheduleAR.click();
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
	  
	  public void recurringHours()
	  {
          Select rh = new Select(recurringhours);
		  
		  rh.selectByValue("12");
	  }
	  
	  public void recurringMinutes()
	  {
          Select rm = new Select(recurringminutes);
		  
		  rm.selectByValue("48");
	  }
	  
	  public void recurringMeridiem()
	  {
          Select rmeri = new Select(recurringmeridiem);
		  
		  rmeri.selectByValue("AM");
	  }
	  
	  public void recurringTimezone()
	  {
          Select rt = new Select(recurringtimezone);
		  
		  rt.selectByValue("Australia/Sydney");
	  }
	  
	  public void recurringDays()
	  {
		  recurringdays.click();
	  }
	 
	  
	  
	  
	  
}
