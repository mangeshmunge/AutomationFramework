package com.AllMenus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllMenusPage {

	WebDriver driver;
	
	public AllMenusPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	// CAMPAIGNS MENU PAGE OBJECTS
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[3]/a/span")
	WebElement campaignsmenu;
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[1]/div[2]/a")
	WebElement selectcampaign; 
	
	@FindBy(xpath = "//a[@title='Edit Campaign name']")
	WebElement editcampaignname;
	
	@FindBy(id="campaign_reference_id")
	WebElement editcampaignID;
	
	@FindBy(xpath = "//*[@title='Create SMS/MMS Campaign']")
	WebElement createcampaign;
	
	@FindBy(id="createAlert_name")
	WebElement entercampaignname;
	
	@FindBy(id="country")
	WebElement country; 
	
	@FindBy(id="keycode_country")
	WebElement keywordcountry;
	
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
	
	@FindBy(xpath = "//button[@title='Update']")
	WebElement updatecampaign;
	
	@FindBy(id="key_6")
	WebElement compliancetab;
	
	@FindBy(id="key_2")
	WebElement optinlisttab;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[1]/div[2]/a")
	WebElement selectoptinlist;
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[4]/div[2]/div[3]/a/span")
	WebElement messageschedulinglink;
	  
	@FindBy(id="key_3")
	WebElement messageschedulingtab;
	 
	@FindBy(xpath = "//label[@for='message-type-sms']")
	WebElement sendSMS1;
	  
	@FindBy(xpath = "//textarea[@data-brand-name='Skycore: ']")
	WebElement mstext;
	  
	@FindBy(xpath = "//*[@id=\"form_alerts_send_calendar\"]/div/div/div/div/div[4]/div/div/a/label/span")
	WebElement dcflever1;
	  
    @FindBy(xpath = "//select[@name='response_flow_action']")
	WebElement datacollectionflow1;
	  
	@FindBy(xpath = "//label[@for='start_flow_web']")
	WebElement weblink1;
	  
	@FindBy(xpath = "//label[@for='start_flow_sms']")
	WebElement questiontext1;
	  
	@FindBy(xpath = "//*[@id=\"form_alerts_send_calendar\"]/div/div/div/div/div[8]/div/div/a/label/span")
	WebElement clicktrackinglever1;
	  
	@FindBy(xpath = "//button[@title='Submit']")
	WebElement submit;
	  
	@FindBy(xpath = "//label[@for='message-type-mms']")
	WebElement sendMMS1;
	  
	@FindBy(xpath = "//a[@title='Select MMS Template']")
	WebElement selectMMStemp1;
	  
	@FindBy(xpath = "//input[@placeholder='Search by MMS Template Name']")
	WebElement searchtemp1;
	  
	@FindBy(id="search-MMSAuto-button")
	WebElement searchtempbutton1;
	  
	@FindBy(xpath = "//*[@id=\"selectLink|-|134236|-|Image Template|-|f\"]")
	WebElement selectMMS1;
	  
	@FindBy(xpath = "//input[@id='datestamp']")
	WebElement msgsendingdate;
	  
	@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	  
	@FindBy(xpath = "//select[@id='datestamphour']")
	WebElement msgsendinghours;
	  
	@FindBy(xpath = "//select[@id='datestampminute']")
	WebElement msgsendingminutes;
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[5]/div[2]/a")
	WebElement autoresponseslink;
	  
	@FindBy(id="key_7")
	WebElement autoresponsestab;
	  
	@FindBy(xpath = "//label[@for='autoresponder-type-2']")
	WebElement sendSMS2;
	  
	@FindBy(xpath = "//textarea[@data-brand-name='Skycore: ']")
	WebElement artext;
	  
	@FindBy(xpath = "//*[@id=\"schedule_in_sequence_form\"]/div/div/div/div/div[4]/div/div/a/label/span")
	WebElement dcflever2;
	  
	@FindBy(xpath = "//select[@id='response_flow_action']")
	WebElement datacollectionflow2;
	  
	@FindBy(xpath = "//label[@for='start_flow_web']")
	WebElement weblink2;
	  
	@FindBy(xpath = "//label[@for='start_flow_sms']")
	WebElement questiontext2;
	  
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
	WebElement clicktrackinglever2;
	  
	@FindBy(id="schedule-autoresponder")
	WebElement scheduleAR;
	  
	@FindBy(xpath = "//label[@for='autoresponder-type-1']")
	WebElement sendMMS2;
	  
	@FindBy(xpath = "//a[@title='Select MMS Template']")
	WebElement selectMMStemp2;
	  
	@FindBy(xpath = "//input[@placeholder='Search by MMS Template Name']")
	WebElement searchtemp2;
	  
	@FindBy(id="search-MMSAuto-button")
	WebElement searchtempbutton2;
	  
	@FindBy(xpath = "//*[@id=\"selectLink|-|134236|-|Image Template|-|f\"]")
	WebElement selectMMS2;
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[6]/div[2]/a")
	WebElement keywordslink;
	
	@FindBy(id="key_4")
	WebElement keywordstab;
	
	@FindBy(xpath = "//a[@title='Add Keyword']")
	WebElement addkeyword;
	
	//@FindBy(xpath = "//select[@id='keycode_country']")
	//WebElement selectcountry;
	
	@FindBy(xpath = "//input[@placeholder='Please enter the Keyword']")
	WebElement typekeyword;
	
	@FindBy(id="save")
	WebElement savekeyword;
	
	@FindBy(xpath = "//*[@id=\"row_index_1\"]/div/div[5]/div[2]/a")
	WebElement deletekeyword1;
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[7]/div[2]/a")
	WebElement smsinboxlink;
	
	@FindBy(id="key_8")
	WebElement smsinboxtab;
	
	@FindBy(xpath = "//input[@placeholder='Phone number']")
	WebElement searchnumber;
	
	@FindBy(xpath = "//button[contains(text(),'Generate CSV Export')]")
	WebElement generatecsv;
	
	
	
	
	
	public void campaignsMenu()
	{
		campaignsmenu.click();
	}
	
	public void selectCampaign()
	{
		selectcampaign.click();
	}
	
	public void editCampaignName()
	{
		editcampaignname.click();
	}
	
	public void editCampaignID(String campid)
	{
		editcampaignID.clear();
		editcampaignID.sendKeys(campid);
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
	
	public void keywordCountry()
	{
	Select country2 = new Select(keywordcountry);
	country2.selectByValue("7");
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
		selectmmsinbox1.selectByValue("354");
	}
	
	public void submitCampaign()
	{
		submitcampaign.click();
	}
	
	public void updateCampaign()
	{
		updatecampaign.click();
	}
	
	public void complianceTab()
	{
		compliancetab.click();
	}
	
	public void optinListTab()
	{
		optinlisttab.click();
	}
	
	public void selectOptinList()
	{
		selectoptinlist.click();
	}
	
	public void messageSchedulingLink()
    {
	    messageschedulinglink.click();
	}
	  
	public void messageSchedulingTab()
	{
		messageschedulingtab.click();
	}
	  
    public void sendSMS1()
	{
		sendSMS1.click();
	}
	  
	public void enterMSText(String smstext)
	{
		mstext.sendKeys(smstext);
	}
	  
	public void sendMMS1()
	{
		sendMMS1.click();
	}
	  
	public void selectMMSTemp1()
	{
		selectMMStemp1.click();
	}
	  
	public void searchTemp1()
	{
		searchtemp1.sendKeys("Audio Template");
	}
	  
	public void searchTempButton1()
	{
		searchtempbutton1.click();
	}
	  
	public void selectMMS1()
	{
		selectMMS1.click();
	}
	  
	public void DCFLever1()
	{
		dcflever1.click();
	}
	  
	public void selectDCF1()
	{
		Select sdcf = new Select(datacollectionflow1);
		  
		sdcf.selectByValue("395");
	}
	  
	public void webLink1()
	{
	    weblink1.click();
	}
	  
	public void questionText1()
	{
		questiontext1.click();
	}
	  
	public void CTLever1()
	{
		clicktrackinglever1.click();
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
	  
	public void autoResponsesLink()
	{
		autoresponseslink.click();
	}
	  
	public void autoResponsesTab()
	{
		autoresponsestab.click();
	}
	  
	public void sendSMS2()
	{
		sendSMS2.click();
	}
	  
	public void enterARText(String smstext)
	{
		artext.sendKeys(smstext);
	}
	  
	public void DCFLever2()
	{
		dcflever2.click();
	}
	  
	public void selectDCF2()
	{
		Select sdcf = new Select(datacollectionflow2);
		  
		sdcf.selectByValue("395");
	}
	  
	public void webLink2()
	{
	    weblink2.click();
	}
	  
	public void questionText2()
	{
		questiontext2.click();
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
	  
	public void CTLever2()
	{
		clicktrackinglever2.click();
	}
	  
	public void scheduleAR()
	{
		scheduleAR.click();
	}
	  
	public void sendMMS2()
	{
		sendMMS2.click();
	}
	  
	public void selectMMSTemp2()
	{
		selectMMStemp2.click();
	}
	  
	public void searchTemp2()
	{
		searchtemp2.sendKeys("Audio Template");
	}
	  
	public void searchTempButton2()
	{
		searchtempbutton2.click();
	}
	  
	public void selectMMS2()
	{
		selectMMS2.click();
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
	
	public void keywordsLink()
	{
		keywordslink.click();
	}
	
	public void keywordsTab()
	{
		keywordstab.click();
	}
	
	public void addKeyword()
	{
		addkeyword.click();
	}
	
	public void typeKeyword(String kw)
	{
		typekeyword.sendKeys(kw);
	}
	
	public void saveKeyword()
	{
		savekeyword.click();
	}
	
	public void deleteKeyword1()
	{
		deletekeyword1.click();
	}
	
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
	
	public void generateCSV()
	{
		generatecsv.click();
	}
	  
	  
	  
	
	
	// OPTIN LIST MENU PAGE OBJECTS
	
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[7]/a/span")
	WebElement optinlistmenu;
	
	@FindBy(id="search-mms-template")
	WebElement searchoptinlist;
	
	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/span/a/span")
	WebElement editoptinlist;
	
	@FindBy(name="audienceListName")
	WebElement editlistname;
	
	//@FindBy(name="update")
	//WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/a/i")
	WebElement deleteoptinlist;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement deletelistconfirm;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/div/a")
	WebElement addsubscribers;
	
	@FindBy(xpath = "//a[@title='Create New List']")
	WebElement createnewlist;
	
	@FindBy(name="audiencelistname")
	WebElement optinlistname;
	
	//@FindBy(xpath="//select[@id='country']")
	//WebElement country;
	
	@FindBy(xpath="//select[@id='shortcode']")
	WebElement sender1;
	
	@FindBy(name="save-continue")
	WebElement save;
	
	@FindBy(xpath = "//button[@value='Add Number']")
	WebElement addnumber;
	
	@FindBy(xpath = "//input[@name='save_num']")
	WebElement enternumber;
	
	@FindBy(xpath = "//button[@name='Add_Number']")
	WebElement addbutton;
	
	@FindBy(xpath = "//input[@id='dataToUpload']")
	WebElement uploadcsv;
	
	@FindBy(xpath = "//select[@name='standard_column[0]']")
	WebElement columns;
	
	//Copied xpath from span
	
	@FindBy(xpath = "//*[@id=\"main-container-fluid\"]/div[2]/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/label/span")
	WebElement skipfirstrow;
	
	@FindBy(id="column_map")
	WebElement importdata1;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel my import')]")
	WebElement cancelimport;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement cancelimportYes;
	
	@FindBy(xpath = "//a[@title='Subscribed']")
	WebElement subscribed;
	
	@FindBy(xpath = "//a[@title='Unconfirmed']")
	WebElement unconfirmed;
	
	@FindBy(xpath = "//a[@title='Add/Import Numbers']")
	WebElement addimportnum;
	
	@FindBy(xpath = "//button[@title='Export all Subscribed']")
	WebElement exportallsubscribed;
	
	@FindBy(xpath = "//button[@title='Remove all Subscribed']")
	WebElement removeallsubscribed;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement removeallsubscribedYes;
	
	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	WebElement searchphonenumber;
	
	@FindBy(xpath = "//select[@name='tz']")
	WebElement selecttimezone;
	
	@FindBy(xpath = "//select[@name='carrier']")
	WebElement selectcarrier;
	
	@FindBy(xpath = "//button[@title='Filter Results']")
	WebElement filterresults;
	
	//Change row index 0,1,2,3 to select checkbox for particular number (Copied xpath from span)
	@FindBy(xpath = "//*[@id=\"row_index_1\"]/div/div[7]/div[2]/div/label/span")
	WebElement optoutnotify;
		
	//Enter the number as per index (Index and number should match)
	@FindBy(xpath = "//button[@data-phonenumber='11234567850']")
	WebElement optout;
		
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement optoutconfirm;
		
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[9]/div")
	WebElement deletecheckbox;
		
	@FindBy(xpath = "//button[@title='Delete']")
	WebElement deletebutton;
		
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deletenumberconfirm;
	
	
	public void optinListMenu()
	{
		optinlistmenu.click();
	}
	
	public void searchOptinList()
	{
		searchoptinlist.sendKeys("apgTSUmH");
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	public void editOptinList()
	{
		editoptinlist.click();
	}
	
	public void editListName()
	{
		editlistname.clear();
		editlistname.sendKeys("Edited");
	}
	
	/*public void Submit()
	{
		submit.click();
	}*/
	
	public void deleteOptinList()
	{
		deleteoptinlist.click();
	}
	
	public void deleteListConfirm()
	{
		deletelistconfirm.click();
	}
	
	public void addSubscribers()
	{
		addsubscribers.click();
	}
	
	public void createNewList()
	{
		createnewlist.click();
	}
	
	public void enterOptinListName(String listname)
	{
		optinlistname.sendKeys(listname);
	}
	
	/*public void selectCountry()
	{
		Select sc = new Select(country);
		
		sc.selectByValue("7");
	}*/
	
	public void selectSender1()
	{
        Select sc = new Select(sender1);
		
		sc.selectByValue("00060856");
	}
	
	public void Save()
	{
		save.click();
	}
	
	public void addNumber()
	{
		addnumber.click();
	}
	
	public void enterNumber()
	{
		enternumber.sendKeys("6179593069");
	}
	
	public void addButton()
	{
		addbutton.click();
	}
	
	public void uploadCSV1()
	{
		uploadcsv.sendKeys("/home/mangeshmunge/Mangesh - Testing/CSV/newNo.csv"); //Tagname should be INPUT
	}
	
	public void selectColumn()
	{
		Select selcol = new Select(columns);
	    selcol.selectByValue("phone");
	}
	
	public void skipfFirstRow()
	{
		skipfirstrow.click();
	}
	
	public void importData1()
	{
		importdata1.click();
	}
	
	public void cancelImport()
	{
		cancelimport.click();
	}
	
	public void cancelImportYes()
	{
		cancelimportYes.click();
	}
	
	public void subscribed()
	{
		subscribed.click();
	}
	
	public void unconfirmed()
	{
		unconfirmed.click();
	}
	
	public void addImportNum()
	{
		addimportnum.click();
	}
	
	public void exportAllSubscribed()
	{
		exportallsubscribed.click();
	}
	
	public void removeAllSubscribed()
	{
		removeallsubscribed.click();
	}
	
	public void removeAllSubscribedYes()
	{
		removeallsubscribedYes.click();
	}
	
	public void searchPhoneNumber()
	{
		searchphonenumber.sendKeys("11234567860");
	}
	
	public void selectTimeZone()
	{
		Select stz = new Select(selecttimezone);
	    stz.selectByValue("362");
	}
	
	public void selectCarrier(String carrier)
	{
		Select sc = new Select(selectcarrier);
	    sc.selectByValue(carrier);
	}
	
	public void filterResults()
	{
		filterresults.click();
	}
	
	public void optoutNotify()
	{
		optoutnotify.click();
	}
	
	public void optout()
	{
		optout.click();
	}
	
	public void optoutConfirm()
	{
		optoutconfirm.click();
	}
	
	public void deleteCheckbox()
	{
		deletecheckbox.click();
	}
	
	public void deletebButton()
	{
		deletebutton.click();
	}
	
	public void deleteNumberConfirm()
	{
		deletenumberconfirm.click();
	}
	
	
	
	
	// OPTOUT LIST MENU PAGE OBJECTS
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[8]/a/span")
	WebElement optoutlistmenu;
	
	@FindBy(id="number")
	WebElement searchbynumber;
	
	@FindBy(name="sender")
	WebElement searchbysender;
	
	//@FindBy(xpath = "//button[@title='Search']")
	//WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/div/label/span")
	WebElement blacklistnumber;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[7]/div[2]/a/i")
	WebElement deletenumber;
	
	//@FindBy(xpath = "//button[text() = 'Yes']")
	//WebElement deletenumberconfirm;
	
	@FindBy(xpath = "//button[text()='Add a number']")
	WebElement addnumberbutton;
	
	//@FindBy(xpath="//select[@id='country']")
	//WebElement country;
	
	@FindBy(name="phoneNumber")
	WebElement enterphonenumber1;
	
	@FindBy(name="addShortcode")
	WebElement entersender;
	
	//@FindBy(xpath = "//button[text()='Add Number']")
	//WebElement addnumber;
	
	@FindBy(xpath = "//button[text()='Import Numbers']")
	WebElement importnumbers;
	
	//@FindBy(xpath = "//input[@id='dataToUpload']")
	//WebElement uploadcsv;
	
	@FindBy(xpath = "//button[@title='None selected']")
	WebElement selectdropdown;

	@FindBy(xpath = "//label[text()='00060856 (United States)']")
	WebElement selectcountryshortcode;
	
	//@FindBy(xpath = "//html")
	//WebElement clickonwebpage;
	
	@FindBy(id="submit_import")
	WebElement importdata2;
	
	//@FindBy(xpath = "//a[contains(text(),'Cancel my import')]")
	//WebElement cancelimport;
	
	
	
	
	
	public void optoutListMenu()
	{
		optoutlistmenu.click();
	}
	
	public void searchByNumber()
	{
		searchbynumber.sendKeys("16178389328");
	}
	
	public void searchBySender()
	{
		searchbysender.sendKeys("00060856");
	}
	
	/*public void searchButton()
	{
		searchbutton.click();
	}*/
	
	public void blacklistNumber()
	{
		blacklistnumber.click();
	}
	
	public void deleteNumber()
	{
		deletenumber.click();
	}
	
	/*public void deleteNumberConfirm()
	{
		deletenumberconfirm.click();
	}*/
	
	public void addNumberButton()
	{
		addnumberbutton.click();
	}
	
	/*public void selectCountry()
	{
		Select sc = new Select(country);
		
		sc.selectByValue("7__1");
	}*/
	
	public void enterPhoneNumber1()
	{
		enterphonenumber1.sendKeys("16178389328");
	}
	
	public void enterSender()
	{
		entersender.sendKeys("00060856");
	}
	
	/*public void addNumber()
	{
		addnumber.click();
	}*/
	
	public void importNumbers()
	{
		importnumbers.click();
	}
	
	public void uploadCSV2()
	{
		uploadcsv.sendKeys("/home/mangeshmunge/Mangesh - Testing/CSV/Optout.csv"); //Tagname should be INPUT
	}
	
	public void selectdropdown()
	{
		selectdropdown.click();
	}
	
	public void selectCountryShortcode()
	{
		selectcountryshortcode.click();
	}
	
	/*public void clickonwebpage()
	{
		clickonwebpage.click();
	}*/
	
	public void importData2()
	{
		importdata2.click();
	}
	
	/*public void cancelImport()
	{
		cancelimport.click();
	}*/
	
	
	
	
	// MANAGE KEYWORDS MENU PAGE OBJECTS
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[10]/a/span")
	WebElement managekeywordsmenu;
	
	@FindBy(id="keyword")
	WebElement enterkeyword;
	
	//@FindBy(xpath = "//button[text()='Search']") 
	//WebElement searchbutton;
	
	@FindBy(xpath = "//select[@id='countryid']")
	WebElement selectcountry;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/a")
	WebElement editcampaign;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/a/i")
	WebElement deletekeyword2;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deleteconfirm;
	
	
	public void manageKeywordsMenu()
	{
		managekeywordsmenu.click();
	}
	
	public void enterKeyword()
	{
		enterkeyword.sendKeys("FCIVQOLM");
	}
	
	/*public void searchButton()
	{
		searchbutton.click();
	}*/
	
	
	public void selectCountry3()
	{
		Select sc = new Select(selectcountry);
		
		sc.selectByValue("7");
	}
	
	public void editCampaign()
	{
		editcampaign.click();
	}
	
	public void deleteKeyword2()
	{
		deletekeyword2.click();
	}
	
	public void deleteConfirm()
	{
		deleteconfirm.click();
	}
	
	
	
	
	// MMS TEMPLATES MENU PAGE OBJECTS
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[2]/a/span")
	WebElement mmstemplatesmenu; 
	
	@FindBy(name="search")
	WebElement searchmms; 
	
	@FindBy(xpath = "//button[text() = 'Create an MMS']")
	WebElement createmms;
	
	@FindBy(xpath = "//a[text()='Image']")
	WebElement imagetab;
	
	@FindBy(xpath = "//*[@id=\"upload-image\"]")
	WebElement uploadimage;
	
	@FindBy(xpath = "//*[@id=\"1827-39894\"]")
	WebElement selectimage1;
	
	@FindBy(xpath = "//*[@id=\"save_mms\"]/div[2]/div[1]/div/div/textarea")
	WebElement messagetext;
	
	@FindBy(xpath = "//a[text()='Video']")
	WebElement videotab;
	
	@FindBy(xpath = "//*[@id=\"1829-39894\"]")
	WebElement selectvideo1;
	
	@FindBy(xpath = "//*[@id=\"upload-video\"]")
	WebElement uploadvideo;
	
	@FindBy(xpath = "//a[text()='Audio']")
	WebElement audiotab;
	
	@FindBy(xpath = "//*[@id=\"1822-39894\"]")
	WebElement selectaudio1;
	
	@FindBy(xpath = "//*[@id=\"upload-audio\"]")
	WebElement uploadaudio;
	
	@FindBy(xpath = "//a[text()='pImage']")
	WebElement pimagetab;
	
	@FindBy(xpath = "//*[@id=\"1416-39894\"]")
	WebElement selectpimage1;
	
	@FindBy(xpath = "//a[text()='Contact']")
	WebElement contacttab;
	
	@FindBy(xpath = "//*[@id=\"1823-39894\"]")
	WebElement selectcontact1;
	
	@FindBy(xpath = "//*[@id=\"upload-contact\"]")
	WebElement uploadcontact;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	WebElement calendartab;
	
	@FindBy(xpath = "//*[@id=\"1824-39894\"]")
	WebElement selectcalender1;
	
	@FindBy(xpath = "//*[@id=\"upload-calendar\"]")
	WebElement uploadcalendar;
	
	@FindBy(xpath = "//a[text()='PDF']")
	WebElement pdftab;
	
	@FindBy(xpath = "//*[@id=\"1825-39894\"]")
	WebElement selectpdf1;
	
	@FindBy(xpath = "//*[@id=\"upload-pdf\"]")
	WebElement uploadpdf;
	
	@FindBy(xpath = "//*[@id=\"save_mms\"]/div[2]/div[2]/div/div/div/div/div")
	WebElement addslide;
	
	@FindBy(xpath = "//*[@id=\"save_mms\"]/div[2]/div[2]/div/div/section/div[4]/span[1]")
	WebElement deleteslide;
	
	@FindBy(name="next")
	WebElement next;
	
	@FindBy(name="name")
	WebElement templatename;
	
	@FindBy(name="message_subject")
	WebElement templatesubject;
	
	@FindBy(xpath="//label[@for='dis_fallback_sms']")
	WebElement disablefallbacksms;
	
	@FindBy(xpath="//label[@for='dis_fallback_sms']")
	WebElement enablefallbacksms;
	
	@FindBy(xpath="//*[@id=\"main-container-fluid\"]/div[2]/div[1]/div/div[6]/div/div[2]/div/div[6]/textarea")
	WebElement fallbacksmstext;
	
	@FindBy(name="save")
	WebElement savemms;
	
	@FindBy(xpath="//*[@id=\"1833-39894\"]/td[2]/button")
	WebElement deleteimage;

	@FindBy(xpath="//*[@id=\"1830-39894\"]/td[2]/button")
	WebElement deletevideo;
	
	@FindBy(xpath="//*[@id=\"1831-39894\"]/td[2]/button[2]")
	WebElement deleteaudio;
	
	@FindBy(xpath="//*[@id=\"1819-39894\"]/td[2]/button")
	WebElement deletecontact;
	
	@FindBy(xpath="//*[@id=\"1834-39894\"]/td[2]/button")
	WebElement deletecalender;
	
	@FindBy(xpath="//*[@id=\"1835-39894\"]/td[2]/button")
	WebElement deletepdf;
	
	//@FindBy(xpath="//button[text()='Ok']")
	//WebElement deleteconfirm;
	
	@FindBy(xpath="//*[@id=\"mmsPreview\"]/div/div/div[2]/label/span")
	WebElement preview;
	
	//@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[2]/a/span")
	//WebElement mmstemplatesmenu;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/div/a")
	WebElement clicktrackingON;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/div/a")
	WebElement clicktrackingOFF;
	
	@FindBy(xpath = "//a[@title=\"Click to Send Test MMS\"][1]")
	WebElement testmms;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement country2;
	
	@FindBy(id="phonenumber")
	WebElement receiver;
	
	//@FindBy(xpath = "//select[@id='shortcode']")
	//WebElement sender;
	
	@FindBy(xpath = "//label[@id='sms_fallback']")
	WebElement sendassms;
	
	//@FindBy(id="shortcode_mask")
	//WebElement sendermask;
	
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
	
	public void searchMMS()
	{
		searchmms.sendKeys("All Content MMS");
	}
	
	public void createMMS()
	{
		createmms.click();
	}
	
	public void imageTab()
	{
		imagetab.click();
	}
	
	public void uploadImage()
	{
		uploadimage.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Images/4-plane-png-image.png"); //Tagname should be INPUT
	}
	
	public void selectImage1()
	{
		selectimage1.click();
	}
	
	public void messageText()
	{
		messagetext.sendKeys("This is test MMS");
	}
	
	public void videoTab()
	{
		videotab.click();
	}
	
	public void uploadVideo()
	{
		uploadvideo.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Video/video-m4v-to-mp4-h264-8-smartphone.mp4");
	}
	
	public void selectVideo1()
	{
		selectvideo1.click();
	}
	
	public void audioTab()
	{
		audiotab.click();
	}
	
	public void uploadAudio()
	{
		uploadaudio.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Audio/audio-mp33.wav");
	}
	
	public void selectAudio1()
	{
		selectaudio1.click();
	}
	
	public void pImageTab()
	{
		pimagetab.click();
	}
	
	public void selectPImage1()
	{
		selectpimage1.click();
	}
	
	public void contactTab()
	{
		contacttab.click();
	}
	
	public void uploadContact()
	{
		uploadcontact.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Contact/sample.vcf");
	}
	
	public void selectContact1()
	{
		selectcontact1.click();
	}
	
	public void calendarTab()
	{
		calendartab.click();
	}
	
	public void uploadCalendar()
	{
		uploadcalendar.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Calender/basic.ics");
	}
	
	public void selectCalender1()
	{
		selectcalender1.click();
	}
	
	public void pdfTab()
	{
		pdftab.click();
	}
	
	public void selectPDF1()
	{
		selectpdf1.click();
	}
	
	public void uploadPDF()
	{
		uploadpdf.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/PDF/Give and Take_ WHY HELPING OTHERS DRIVES OUR SUCCESS ( PDFDrive ).pdf");
	}
	
	public void addSlide()
	{
		addslide.click();
	}
	
	public void deleteSlide()
	{
		deleteslide.click();
	}
	
	public void Next()
	{
		next.click();
	}
	
	public void templateName1()
	{
		templatename.sendKeys("All Content MMS");
	}
	
	public void templateName2()
	{
		templatename.sendKeys("All Content MMS Edited");
	}
	
	public void templateSubject1()
	{
		templatesubject.sendKeys("Test Subject");
	}
	
	public void templateSubject2()
	{
		templatesubject.sendKeys("Test Subject Edited");
	}
	
	public void disableFallbackSMS()
	{
		disablefallbacksms.click();
	}
	
	public void enableFallbackSMS()
	{
		enablefallbacksms.click();
	}
	
	public void fallbackSMSText()
	{
		fallbacksmstext.sendKeys("Test is the test fallback SMS Text");
	}
	
	public void saveMMS()
	{
		savemms.click();
	}
	
	public void deleteImage()
	{
		deleteimage.click();
	}
	
	public void deleteVideo()
	{
		deletevideo.click();
	}
	
	public void deleteAudio()
	{
		deleteaudio.click();
	}
	
	public void deleteContact()
	{
		deletecontact.click();
	}
	
	public void deleteCalender()
	{
		deletecalender.click();
	}
	
	public void deletePDF()
	{
		deletepdf.click();
	}
	
	/*public void deleteConfirmation()
	{
		deleteconfirm.click();
	}*/
	
	public void Preview()
	{
		preview.click();
	}
	
	/*public void MMSTemplatesMenu()
	{
		mmstemplatesmenu.click();
	}*/
	
	public void testMMS()
	{
		testmms.click();
	}
	
	public void selectCountry2()
	{
		Select country1 = new Select(country2);
		
		country1.selectByValue("7");
	}
	
	public void Receiver()
	{
		receiver.sendKeys("6178389328");
	}
	
	/*public void sender()
	{
		Select sender1 = new Select(sender);
		
		sender1.selectByValue("00060856");
	}*/
	
	public void sendAsSMS()
	{
		sendassms.click();
	}
	
	/*public void senderMask()
	{
		sendermask.sendKeys("Test123");
	}*/
	
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
	
	/*public void deleteConfirm()
	{
		deleteConfirm.click();
	}*/
	
	public void clicktrackingON()
	{
		clicktrackingON.click();
	}
	
	public void clicktrackingOFF()
	{
		clicktrackingOFF.click();
	}
	
	
	
	
	
	// MESSAGING HISTORY MENU PAGE OBJECTS
	
	
	
	
	@FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul[6]/li[11]/a/span")
	WebElement messaginghistorymenu;
	
	@FindBy(xpath = "//select[@name='custom_month']") 
	WebElement month1;
	
	@FindBy(xpath = "//select[@name='custom_year']") 
	WebElement year1;
	
	@FindBy(xpath = "//select[@name='custom_from']") 
	WebElement fromdate;
	
	@FindBy(xpath = "//select[@name='custom_to']") 
	WebElement todate;
	
	@FindBy(id="shortcode") 
	WebElement sender;
	
	//@FindBy(xpath = "//button[text()='Submit']") 
	//WebElement submit;
	
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
	
	
	
	public void messaginghistoryMenu()
	{
		messaginghistorymenu.click();
	}
	
	public void Month1()
	{
        Select sc = new Select(month1);
		
		sc.selectByValue("05");
	}
	
	public void Year1()
	{
        Select sc = new Select(year1);
		
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
		
		sc.selectByValue("31");
	}
	
	public void sender()
	{
		sender.sendKeys("00060856");
	}
	
	/*public void Submit()
	{
		submit.click();
	}*/
	
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
	
	
	
	
	
	// MESSAGE LOOKUP MENU PAGE OBJECTS
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[4]/a/span")
	WebElement messagelookupmenu;
	
	@FindBy(xpath = "//input[@id='lookupdate']")
	WebElement date;
	
	/*@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement searchbutton;*/
	
	@FindBy(name="string")
	WebElement enterphonenumber2;
	
	@FindBy(xpath = "//label[@for='message_type_sms']") 
	WebElement messagetypesms;
	
	@FindBy(xpath = "//label[@for='message_type_mms']") 
	WebElement messagetypemms;
	
	
	public void messageLookupMenu()
	{
		messagelookupmenu.click();
	}
	
	public void Date()
	{
		date.click();
	}	
	
	/*public void clickonwebpage()
	{
		clickonwebpage.click();
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}*/
	
	public void enterPhoneNumber2()
	{
		enterphonenumber2.sendKeys("6178389328");
	}
	
	
	public void messagetypeSMS()
	{
		messagetypesms.click();
	}
	
	public void messagetypeMMS()
	{
		messagetypemms.click();
	}
	
	
	
	
	// MMS INBOXES MENU PAGE OBJECTS
	
	
	
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[9]/a/span")
	WebElement mmsinboxesmenu;
	
	@FindBy(xpath = "//button[text()='Create MMS Inbox']")
	WebElement createmmsinbox;
	
	@FindBy(id="campaign_name")
	WebElement inboxname;
	
	// Add/remove keywords
	
	@FindBy(xpath = "//button[text()='Add Keyword/Sender']")
	WebElement addkeywordshortcode;
	
	//@FindBy(xpath = "//html")
	//WebElement clickonwebpage;
	
	@FindBy(id="kw_add_1")
	WebElement enterkeyword1;
	
	@FindBy(xpath = "//select[@id='country_add_1']")
	WebElement selectcountry1;
	
	@FindBy(xpath = "//select[@id='sc_add_1']") 
	WebElement selectshortcode;
	
	// Incoming MMS Message must contain
	
	@FindBy(xpath = "//label[@for='mmsmo_val_1']") 
	WebElement anycontent;
	
	@FindBy(xpath = "//label[@for='mmsmo_val_2']") 
	WebElement imageonlycontent;
	
	@FindBy(xpath = "//label[@for='mmsmo_val_3']") 
	WebElement videoonlycontent;
	
	@FindBy(xpath = "//label[@for='mmsmo_val_4']") 
	WebElement imageandtextonlycontent;
	
	@FindBy(xpath = "//label[@for='mmsmo_val_5']") 
	WebElement videoandtextonlycontent;
	
	// Otherwise send this reply
	
	@FindBy(xpath = "//label[@for='mmsmo_val_aa_sms']") 
	WebElement replysms1;
	
	@FindBy(xpath = "//*[@id=\"val_sms_txt\"]") 
	WebElement smstext1;
	
	@FindBy(xpath = "//label[@for='mmsmo_val_aa_mms']") 
	WebElement replymms1;
	
	@FindBy(xpath = "//*[@id=\"mmsselect6\"]/div/a") 
	WebElement selectmmslink1;  
	
	@FindBy(id="selectLink_134236_Image Template") 
	WebElement selectmms11;
	
	@FindBy(xpath = "//label[@for='txtval_enabled_1']") 
	WebElement textvalidationnone;
	
	@FindBy(xpath = "//label[@for='txtval_enabled_2']") 
	WebElement textvalidationmessagetext;
	
	@FindBy(xpath = "//select[@name='text_val']") 
	WebElement textvalidationdropdown;
	
	@FindBy(name="text_regex") 
	WebElement expression;
	
	@FindBy(xpath = "//label[@for='mmsmo_txtval_aa_sms']") 
	WebElement replysms2;
	
	@FindBy(xpath = "//label[@for='mmsmo_txtval_aa_mms']") 
	WebElement replymms2;
	
	@FindBy(xpath = "//*[@id=\"mmsselect7\"]/div/a") 
	WebElement selectmmslink2;  
	
	@FindBy(xpath = "//a[@id='selectLink_134236_Image Template']") 
	WebElement selectmms22;
	
	@FindBy(xpath = "//*[@id=\"txtval_sms_txt\"]") 
	WebElement smstext2;
	
	// Checkbox1 at bottom
	
	@FindBy(xpath = "//*[@id=\"mosettings\"]/div/div/section[4]/label/span") 
	WebElement replycheckbox;
	
	@FindBy(xpath = "//label[@for='sbtype']") 
	WebElement replysms3;
	
	@FindBy(xpath = "//label[@for='sbtype2']") 
	WebElement replymms3;
	
	@FindBy(xpath = "//*[@id=\"mmsselect1\"]/div/a") 
	WebElement selectmmslink3;  
	
	@FindBy(id="selectLink_134236_Image Template") 
	WebElement selectmms33;
	
	@FindBy(xpath = "//*[@id=\"smsmsg\"]") 
	WebElement smstext3;
	
	// Checkbox2 at bottom
	
	@FindBy(xpath = "//*[@id=\"mosettings\"]/div/div/section[5]/label/span") 
	WebElement optinsendercheckbox;
	
	@FindBy(xpath = "//select[@name='sb_alertid']") 
	WebElement selectcampaign1;
	
	@FindBy(xpath = "//select[@name='optin']") 
	WebElement optingin;
	
	// Submit Button
	
	@FindBy(xpath = "//button[@name='Submit']") 
	WebElement mmsinboxsubmit;
	
	// Home Page Other Actions
	
	
	// Edit MMS Inbox
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[1]/div[2]/strong/a") 
	WebElement editmmsinbox;
	
	// View Messages Link
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[2]/div[2]/a") 
	WebElement viewmessages;
	
	@FindBy(xpath = "//select[@name='date_filter']") 
	WebElement datefilter;
	
	@FindBy(name="search") 
	WebElement enterphone;
	
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement search;
	
	
	// Stats Link
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/a/i") 
	WebElement stats;
	
	@FindBy(xpath = "//select[@name='yr']") 
	WebElement year;
	
	@FindBy(xpath = "//select[@name='mo']") 
	WebElement month;
	
	@FindBy(xpath = "//select[@name='day']") 
	WebElement day;
	
	@FindBy(xpath = "//button[text()='Submit']") 
	WebElement mmsinboxsubmit2;
	
	
	
	public void MMSInboxesMenu()
	{
		mmsinboxesmenu.click();
	}
	
	public void createMMSInbox()
	{
		createmmsinbox.click();
	}
	
	public void inboxName(String inbox)
	{
		inboxname.sendKeys(inbox);
	}
	
	public void addKeywordShortcode()
	{
		addkeywordshortcode.click();
	}
	
	/*public void clickonwebpage()
	{
		clickonwebpage.click();
	}*/
	
	public void enterKeyword1(String keyword)
	{
		enterkeyword1.sendKeys(keyword);
	}
	
	public void selectcountry1()
	{
		Select sc = new Select(selectcountry1);
		
		sc.selectByValue("7");
	}
	
	public void selectshortcode()
	{
        Select sc = new Select(selectshortcode);
		
		sc.selectByValue("00060856");
	}
	
	public void anyContent()
	{
		anycontent.click();
	}
	
	public void imageonlyContent()
	{
		imageonlycontent.click();
	}
	
	public void videoonlyContent()
	{
		videoonlycontent.click();
	}
	
	public void imageandtextonlyContent()
	{
		imageandtextonlycontent.click();
	}
	
	public void videoandtextonlyContent()
	{
		videoandtextonlycontent.click();
	}
	
	public void replySMS1()
	{
		replysms1.click();
	}
	
	public void replyMMS1()
	{
		replymms1.click();
	}
	
	public void selectMMSLink1()
	{
		selectmmslink1.click();
	}
	
	public void selectMMS11()
	{
		selectmms11.click();
	}
	
	public void smsText1()
	{
		smstext1.clear();
		smstext1.sendKeys("Test1");
	}
	
	public void textvalidationNone()
	{
		textvalidationnone.click();
	}
	
	public void textvalidationMessageText()
	{
		textvalidationmessagetext.click();
	}
	
	public void textvalidationDropdown()
	{
		Select sc = new Select(textvalidationdropdown);
		
		sc.selectByValue("2");
	}
	
	public void expression()
	{
		expression.sendKeys("Test");
	}
	
	public void replySMS2()
	{
		replysms2.click();
	}
	
	public void replyMMS2()
	{
		replymms2.click();
	}
	
	public void selectMMSLink2()
	{
		selectmmslink2.click();
	}
	
	public void selectMMS22()
	{
		selectmms22.click();
	}
	
	public void smsText2()
	{
		smstext2.clear();
		smstext2.sendKeys("Test2");
	}
	
	public void replyCheckbox()
	{
		replycheckbox.click();
	}
	
	public void replySMS3()
	{
		replysms3.click();
	}
	
	public void replyMMS3()
	{
		replymms3.click();
	}
	
	public void selectMMSLink3()
	{
		selectmmslink3.click();
	}
	
	public void selectMMS33()
	{
		selectmms33.click();
	}
	
	public void smsText3()
	{
		smstext3.clear();
		smstext3.sendKeys("Test3");
	}
	
	public void optinsenderCheckbox()
	{
		optinsendercheckbox.click();
	}
	
	public void selectcampaign()
	{
		Select sc = new Select(selectcampaign1);
		
		sc.selectByValue("5269");
	}
	
	public void optingin()
	{
		Select sc = new Select(optingin);
		
		sc.selectByValue("double");
	}
	
	public void mmsInboxSubmit1()
	{
		mmsinboxsubmit.click();
	}
	
	public void editMMSInbox()
	{
		editmmsinbox.click();
	}
	
	public void viewMessages()
	{
		viewmessages.click();
	}
	
	public void dateFilter()
	{
        Select sc = new Select(datefilter);
		
		sc.selectByValue("2022_05");
	}
	
	public void enterPhone()
	{
		enterphone.sendKeys("6178389328");
	}
	
	public void Search()
	{
		search.click();
	}
	
	public void Stats()
	{
        stats.click();
	}
	
	public void Year()
	{
        Select sc = new Select(year);
		
		sc.selectByValue("2022");
	}
	
	public void Month()
	{
        Select sc = new Select(month);
		
		sc.selectByValue("05");
	}
	
	public void Day()
	{
        Select sc = new Select(day);
		
		sc.selectByValue("20");
	}
	
	public void mmsInboxSubmit2()
	{
		mmsinboxsubmit2.click();
	}
	
	
}
