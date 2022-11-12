package com.Tools.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToolsPage {

	WebDriver driver;
	
	public ToolsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//**********************************  Map File Builder   *****************************//
	
	
	@FindBy(xpath ="//*[@id=\"sidemenu-list\"]/li[5]")
	WebElement toolsmodule;
	
	@FindBy(xpath ="//a[@title='Map File Builder']") 
	WebElement mapfilebuildermenu;
	
	@FindBy(id="location_name") 
	WebElement locationname;
	
	@FindBy(xpath ="//label[@for='entrOption1']") 
	WebElement latlongoption;
	
	@FindBy(xpath ="//label[@for='entrOption2']") 
	WebElement addressoption;
	
	@FindBy(id="location_lat") 
	WebElement enterlatitude1;
	
	@FindBy(id="location_long") 
	WebElement enterlongitude1;
	
	@FindBy(id="formatted_address") 
	WebElement enteraddress;
	
	@FindBy(name="create_map") 
	WebElement createmapfile;
	
	@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	
	
	
	
	
	public void toolsModule()
	{
		toolsmodule.click();
	}
	
	public void mapFileBuilderMenu()
	{
		mapfilebuildermenu.click();
	}
	
	public void locationName(String location)
	{
		locationname.sendKeys(location);
	}
	
	public void latlongOption()
	{
		latlongoption.click();
	}
	
	public void addressOption()
	{
		addressoption.click();
	}
	
	public void enterLatitude1(String latitude)
	{
		enterlatitude1.sendKeys(latitude);
	}
	
	public void enterLongitude1(String longitude)
	{
		enterlongitude1.sendKeys(longitude);
	}
	
	public void enterAddress(String address)
	{
		enteraddress.clear();
		enteraddress.sendKeys(address);
	}
	
	public void createMapFile()
	{
		createmapfile.click();
	}
	
	public void clickonwebpage()
	{
		clickonwebpage.click();
	}
	
	
	//**********************************  Create VCard   *****************************//
	
	
	@FindBy(xpath ="//a[@title='Create vCard']") 
	WebElement createvcardmenu;
	
	@FindBy(id="firstname") 
	WebElement fname;
	
	@FindBy(id="lastname") 
	WebElement lname;
	
	@FindBy(id="organization") 
	WebElement orgname;
	
	@FindBy(id="title") 
	WebElement vcardtitle;
	
	@FindBy(id="note") 
	WebElement note;
	
	@FindBy(xpath ="//input[@id='image-upload']") 
	WebElement uploadphoto;
	
	@FindBy(id="photourl") 
	WebElement photourl;
	
	
	
	public void createVCardMenu()
	{
		createvcardmenu.click();
	}
	
	public void firstName(String firstname)
	{
		fname.sendKeys(firstname);
	}
	
	public void lastName(String lastname)
	{
		lname.sendKeys(lastname);
	}
	
	public void orgName(String organizationname)
	{
		orgname.sendKeys(organizationname);
	}
	
	public void vCardTitle(String cardtitle)
	{
		vcardtitle.sendKeys(cardtitle);
	}
	
	public void note(String samplenote)
	{
		note.sendKeys(samplenote);
	}
	
	public void uploadphoto()
	{
		uploadphoto.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Images/image1.png");
	}

	public void photoURL(String photoURL)
	{
		photourl.sendKeys(photoURL);
	}
	
	
	//******** PHONE NUMBER  **********//
	
	
	@FindBy(xpath ="//input[@placeholder='Phone number 1']") 
	WebElement phonenumber1;
	
	@FindBy(xpath = "//select[@name='phone[0][label]']") 
	WebElement numbertype1;
	
	@FindBy(id="create-text-block1") 
	WebElement addnewnumber;
	
	@FindBy(xpath ="//input[@placeholder='Phone number 2']") 
	WebElement phonenumber2;
	
	@FindBy(xpath = "//select[@name='phone[1][label]']") 
	WebElement numbertype2;
	
	@FindBy(xpath ="//input[@placeholder='Phone number 3']") 
	WebElement phonenumber3;
	
	@FindBy(xpath = "//select[@name='phone[2][label]']") 
	WebElement numbertype3;
	
	@FindBy(xpath ="//input[@placeholder='Phone number 4']") 
	WebElement phonenumber4;
	
	@FindBy(xpath = "//select[@name='phone[3][label]']") 
	WebElement numbertype4;
	
	@FindBy(xpath ="(//button[@id='remove-text-block1'])[2]") 
	WebElement removephonenumber2;
	
	@FindBy(xpath ="(//button[@id='remove-text-block1'])[3]") 
	WebElement removephonenumber3;
	
	@FindBy(xpath ="(//button[@id='remove-text-block1'])[4]") 
	WebElement removephonenumber4;
	
	
	
	public void phoneNumber1(String phnumber1)
	{
		phonenumber1.sendKeys(phnumber1);
	}
	
	public void phoneNumber2(String phnumber2)
	{
		phonenumber2.sendKeys(phnumber2);
	}
	
	public void phoneNumber3(String phnumber3)
	{
		phonenumber3.sendKeys(phnumber3);
	}
	
	public void phoneNumber4(String phnumber4)
	{
		phonenumber4.sendKeys(phnumber4);
	}
	
	public void numberType1()
	{
		Select s = new Select(numbertype1);
		
		s.selectByVisibleText("Work");
	}
	
	public void numberType2()
	{
		Select s = new Select(numbertype2);
		
		s.selectByVisibleText("Home");
	}
	
	public void numberType3()
	{
		Select s = new Select(numbertype3);
		
		s.selectByVisibleText("Work");
	}
	
	public void numberType4()
	{
		Select s = new Select(numbertype4);
		
		s.selectByVisibleText("Home");
	}
	
	public void addNewNumber()
	{
		addnewnumber.click();
	}

	public void removePhoneNumber2()
	{
		removephonenumber2.click();
	}
	
	public void removePhoneNumber3()
	{
		removephonenumber3.click();
	}
	
	public void removePhoneNumber4()
	{
		removephonenumber4.click();
	}
	
	
	//******** EMAIL  **********//
	
	
	@FindBy(xpath ="//input[@placeholder='Email Id 1']") 
	WebElement email1;
	
	@FindBy(xpath = "//select[@name='email[0][label]']") 
	WebElement emailtype1;
	
	@FindBy(id="create-text-block2") 
	WebElement addnewemail;
	
	@FindBy(xpath ="//input[@placeholder='Email Id 2']") 
	WebElement email2;
	
	@FindBy(xpath = "//select[@name='email[1][label]']") 
	WebElement emailtype2;
	
	@FindBy(xpath ="//input[@placeholder='Email Id 3']") 
	WebElement email3;
	
	@FindBy(xpath = "//select[@name='email[2][label]']") 
	WebElement emailtype3;
	
	@FindBy(xpath ="//input[@placeholder='Email Id 4']") 
	WebElement email4;
	
	@FindBy(xpath = "//select[@name='email[3][label]']") 
	WebElement emailtype4;
	
	@FindBy(xpath ="(//button[@id='remove-text-block2'])[2]") 
	WebElement removeemail2;
	
	@FindBy(xpath ="(//button[@id='remove-text-block2'])[3]") 
	WebElement removeemail3;
	
	@FindBy(xpath ="(//button[@id='remove-text-block2'])[4]") 
	WebElement removeemail4;
	
	
	
	public void email1(String mailid1)
	{
		email1.sendKeys(mailid1);
	}
	
	public void email2(String mailid2)
	{
		email2.sendKeys(mailid2);
	}
	
	public void email3(String mailid3)
	{
		email3.sendKeys(mailid3);
	}
	
	public void email4(String mailid4)
	{
		email4.sendKeys(mailid4);
	}
	
	public void emailType1()
	{
		Select s = new Select(emailtype1);
		
		s.selectByVisibleText("Work");
	}
	
	public void emailType2()
	{
		Select s = new Select(emailtype2);
		
		s.selectByVisibleText("Home");
	}
	
	public void emailType3()
	{
		Select s = new Select(emailtype3);
		
		s.selectByVisibleText("Work");
	}
	
	public void emailType4()
	{
		Select s = new Select(emailtype4);
		
		s.selectByVisibleText("Home");
	}
	
	public void addNewEmail()
	{
		addnewemail.click();
	}
	
	public void removeEmail2()
	{
		removeemail2.click();
	}
	
	public void removeEmail3()
	{
		removeemail3.click();
	}
	
	public void removeEmail4()
	{
		removeemail4.click();
	}
	
	
	//******** ADDRESS  **********//
	
	
	@FindBy(xpath ="//textarea[@placeholder='Address 1']") 
	WebElement address1;
	
	@FindBy(xpath = "//select[@name='physicaladdress[0][label]']") 
	WebElement addresstype1;
	
	@FindBy(id="create-text-block3") 
	WebElement addnewaddress;
	
	@FindBy(xpath ="//textarea[@placeholder='Address 2']") 
	WebElement address2;
	
	@FindBy(xpath = "//select[@name='physicaladdress[1][label]']") 
	WebElement addresstype2;
	
	@FindBy(xpath ="//textarea[@placeholder='Address 3']") 
	WebElement address3;
	
	@FindBy(xpath = "//select[@name='physicaladdress[2][label]']") 
	WebElement addresstype3;
	
	@FindBy(xpath ="//textarea[@placeholder='Address 4']") 
	WebElement address4;
	
	@FindBy(xpath = "//select[@name='physicaladdress[3][label]']") 
	WebElement addresstype4;
	
	@FindBy(xpath ="(//button[@id='remove-text-block3'])[2]") 
	WebElement removeaddress2;
	
	@FindBy(xpath ="(//button[@id='remove-text-block3'])[3]") 
	WebElement removeaddress3;
	
	@FindBy(xpath ="(//button[@id='remove-text-block3'])[4]") 
	WebElement removeaddress4;
	
	
	
	public void address1(String add1)
	{
		address1.sendKeys(add1);
	}
	
	public void address2(String add2)
	{
		address2.sendKeys(add2);
	}
	
	public void address3(String add3)
	{
		address3.sendKeys(add3);
	}
	
	public void address4(String add4)
	{
		address4.sendKeys(add4);
	}
	
	public void addressType1()
	{
		Select s = new Select(addresstype1);
		
		s.selectByVisibleText("Work");
	}
	
	public void addressType2()
	{
		Select s = new Select(addresstype2);
		
		s.selectByVisibleText("Home");
	}
	
	public void addressType3()
	{
		Select s = new Select(addresstype3);
		
		s.selectByVisibleText("Work");
	}
	
	public void addressType4()
	{
		Select s = new Select(addresstype4);
		
		s.selectByVisibleText("Home");
	}
	
	public void addNewAddress()
	{
		addnewaddress.click();
	}
	
	public void removeaddress2()
	{
		removeaddress2.click();
	}
	
	public void removeaddress3()
	{
		removeaddress3.click();
	}
	
	public void removeaddress4()
	{
		removeaddress4.click();
	}
	
	
	//********  WEBSITE  **********//
	
	
	@FindBy(xpath ="//input[@placeholder='Website Url 1']") 
	WebElement website1;
	
	@FindBy(name="website[0][label]") 
	WebElement websitelabel1;
	
	@FindBy(id="create-text-block4") 
	WebElement addnewwebsite;
	
	@FindBy(xpath ="//input[@placeholder='Website Url 2']") 
	WebElement website2;
	
	@FindBy(name="website[1][label]") 
	WebElement websitelabel2;
	
	@FindBy(xpath ="//input[@placeholder='Website Url 3']") 
	WebElement website3;
	
	@FindBy(name="website[2][label]") 
	WebElement websitelabel3;
	
	@FindBy(xpath ="//input[@placeholder='Website Url 4']") 
	WebElement website4;
	
	@FindBy(name="website[3][label]") 
	WebElement websitelabel4;
	
	@FindBy(xpath ="(//button[@id='remove-text-block4'])[2]") 
	WebElement removewebsite2;
	
	@FindBy(xpath ="(//button[@id='remove-text-block4'])[3]") 
	WebElement removewebsite3;
	
	@FindBy(xpath ="(//button[@id='remove-text-block4'])[4]") 
	WebElement removewebsite4;
	
	@FindBy(name="submit-form") 
	WebElement create;
	
	
	
	public void website1(String url1)
	{
		website1.sendKeys(url1);
	}
	
	public void website2(String url2)
	{
		website2.sendKeys(url2);
	}
	
	public void website3(String url3)
	{
		website3.sendKeys(url3);
	}
	
	public void website4(String url4)
	{
		website4.sendKeys(url4);
	}
	
	public void websiteLabel1(String label1)
	{
		websitelabel1.sendKeys(label1);
	}
	
	public void websiteLabel2(String label2)
	{
		websitelabel2.sendKeys(label2);
	}
	
	public void websiteLabel3(String label3)
	{
		websitelabel3.sendKeys(label3);
	}
	
	public void websiteLabel4(String label4)
	{
		websitelabel4.sendKeys(label4);
	}
	
	public void addNewWebsite()
	{
		addnewwebsite.click();
	}
	
	public void removewebsite2()
	{
		removewebsite2.click();
	}
	
	public void removewebsite3()
	{
		removewebsite3.click();
	}
	
	public void removewebsite4()
	{
		removewebsite4.click();
	}
	
	public void create()
	{
		create.click();
	}
	
	
	//**********************************  Create ICalendar   *****************************//
	
	
	@FindBy(xpath ="//a[@title='Create iCalendar']") 
	WebElement createicalmenu;
	
	@FindBy(id="event_title") 
	WebElement eventtitle;
	
	@FindBy(id="event_startdate") 
	WebElement eventstartdate;
	
	@FindBy(xpath = "//select[@id='event_start_hour']") 
	WebElement eventstarttime;
	
	@FindBy(id="event_enddate") 
	WebElement eventenddate;
	
	@FindBy(xpath = "//select[@id='event_end_hour']") 
	WebElement eventendtime;
	
	@FindBy(xpath = "//select[@id='event_timezone']") 
	WebElement timezone;
	
	@FindBy(xpath = "//label[@for='event_frequency-one-time']") 
	WebElement onetimeevent;
	
	@FindBy(xpath = "//label[@for='lasts_all_day']") 
	WebElement lastsallday;
	
	@FindBy(id="event_location") 
	WebElement eventlocation;
	
	@FindBy(id="event_desc") 
	WebElement eventdescription;
	
	//@FindBy(name="submit-form") 
	//WebElement create;
	
	
	public void createiCalMenu()
	{
		createicalmenu.click();
	}
	
	public void eventtitle(String eventname)
	{
		eventtitle.sendKeys(eventname);
	}
	
	
	public void eventStartDate()
	{
		eventstartdate.click();
	}
	
	public void eventStartTime()
	{
		Select s1 = new Select(eventstarttime);
		
		s1.selectByValue("10:00:00");
	}
	
	public void eventEndDate()
	{
		eventenddate.click();
	}
	
	public void eventEndTime()
	{
		Select s1 = new Select(eventendtime);
		
		s1.selectByValue("17:00:00");
	}
	
	public void timezone()
	{
		Select s1 = new Select(timezone);
		
		s1.selectByValue("Indian/Kerguelen");
	}
	
	public void oneTimeEvent()
	{
		onetimeevent.click();
	}
	
	public void lastsAllDay()
	{
		lastsallday.click();
	}
	
	public void eventlocation(String location)
	{
		eventlocation.sendKeys(location);
	}
	
	public void eventdescription(String eventdesc)
	{
		eventdescription.sendKeys(eventdesc);
	}
	
	/*public void create()
	{
		create.click();
	}*/
	
	
	//**********************************  Address Lookup   *****************************//
	
	
	@FindBy(xpath ="//a[@title='Address Lookup']") 
	WebElement addresslookupmenu;
	
	@FindBy(id="location_lat") 
	WebElement enterlatitude2;
	
	@FindBy(id="location_lng") 
	WebElement enterlongitude2;
	
	/*@FindBy(id="formatted_address") 
	WebElement enteraddress;*/
	
	@FindBy(xpath ="//button[text()='Search for address on Google']") 
	WebElement searchforaddress;
	
	@FindBy(xpath ="(//button[text()='Show on Google Maps'])[1]") 
	WebElement showongooglemaps1;
	
	@FindBy(xpath ="//button[text()='Search for co-ordinates on Google']") 
	WebElement searchforcoordinates;
	
	@FindBy(xpath ="(//button[text()='Show on Google Maps'])[2]") 
	WebElement showongooglemaps2;
	
	
	public void addressLookupMenu()
	{
		addresslookupmenu.click();
	}
	
	public void enterLatitude2(String latitude2)
	{
		enterlatitude2.sendKeys(latitude2);
	}
	
	public void enterLongitude2(String longitude2)
	{
		enterlongitude2.sendKeys(longitude2);
	}
	
	
	/*public void enterAddress(String address)
	{
		enteraddress.sendKeys(address);
	}*/
	
	public void searchforaddress()
	{
		searchforaddress.click();
	}
	
	public void showongooglemaps1()
	{
		showongooglemaps1.click();
	}
	
	public void searchforcoordinates()
	{
		searchforcoordinates.click();
	}
	
	public void showongooglemaps2()
	{
		showongooglemaps2.click();
	}
	
	
	//**********************************  Image Templates   *****************************//
	
	
	@FindBy(xpath ="//a[@title='Image Templates']") 
	WebElement imagetemplatesmenu;
	
	@FindBy(xpath ="//button[@title='Create Image Template']") 
	WebElement createimagetemplate;
	
	@FindBy(id="metadata") 
	WebElement metadatatab;
	
	@FindBy(id="name") 
	WebElement templatename;
	
	@FindBy(id="reference_id") 
	WebElement templateid;
	
	@FindBy(xpath ="//label[@for='data_source_imported_data']") 
	WebElement dsimporteddata;
	
	@FindBy(xpath ="//label[@for='data_source_api']") 
	WebElement dsapi;
	
	@FindBy(xpath ="//label[@for='data_source_personal/collected_data']") 
	WebElement dspersonalcollecteddata;
	
	@FindBy(xpath ="//button[@title='Save Template']") 
	WebElement savetemplate;
	
	@FindBy(id="bgImage") 
	WebElement backgroundimagetab;
	
	@FindBy(xpath ="//input[@id='image-upload']") 
	WebElement uploadbgimage;
	
	@FindBy(id="barcode") 
	WebElement barcodetab;
	
	@FindBy(xpath ="//label[@for='show_code']") 
	WebElement addbarcode;
	
	@FindBy(xpath ="//textarea[@placeholder='Barcode Value']") 
	WebElement barcodevalue;
	
	@FindBy(xpath ="//label[@for='jwt_option']") 
	WebElement enablejwt;
	
	@FindBy(id="jwt_payload") 
	WebElement jwtpayload;
	
	@FindBy(id="jwt_public_key") 
	WebElement publickey;
	
	@FindBy(id="jwt_private_key") 
	WebElement privatekey;
	
	@FindBy(xpath ="//input[@name='code_options_x']") 
	WebElement barcodexposition;
	
	@FindBy(xpath ="//input[@name='code_options_y']") 
	WebElement barcodeyposition;
	
	@FindBy(xpath ="//input[@name='code_options_width']") 
	WebElement barcodewidth;
	
	@FindBy(xpath ="//input[@name='code_options_height']") 
	WebElement barcodeheight;
	
	@FindBy(xpath ="//input[@name='code_options_fg']") 
	WebElement foreground;
	
	@FindBy(xpath ="//input[@name='code_options_fg']") 
	WebElement selectforegroundcolour;
	
	@FindBy(xpath ="//input[@name='code_options_color']") 
	WebElement selectbackgroundcolour;
	
	@FindBy(name="code_options_border")
	WebElement barcodeborder;
	
	@FindBy(xpath = "//select[@name='code_options_transparent']")
	WebElement barcodetransparent;
	
	@FindBy(xpath = "//select[@name='code_options_type']")
	WebElement barcodetype;
	
	@FindBy(xpath = "//select[@name='code_options_hidetext']")
	WebElement hidebarcodetext;
	
	@FindBy(xpath = "//select[@name='code_options_font']")
	WebElement barcodetextfont;
	
	@FindBy(xpath = "//select[@name='code_options_fontsize']")
	WebElement barcodetextfontsize;
	
	@FindBy(xpath = "//select[@name='code_options_align']")
	WebElement barcodealignment;
	
	@FindBy(xpath = "//select[@name='code_options_rotate']")
	WebElement barcoderotation;
	
	@FindBy(id="textTime")
	WebElement texttab;
	
	@FindBy(xpath ="//label[@for='show_text']") 
	WebElement enabletextarea;
	
	@FindBy(xpath ="//textarea[@name='text_1_text']") 
	WebElement textarea1;
	
	@FindBy(xpath ="//select[@name='text_1_font']") 
	WebElement text1font;
	
	@FindBy(xpath ="//select[@name='text_1_fontsize']") 
	WebElement text1fontsize;
	
	@FindBy(id="text_1_x") 
	WebElement text1xposition;
	
	@FindBy(id="text_1_y") 
	WebElement text1yposition;
	
	@FindBy(xpath ="//input[@name='text_1_color']") 
	WebElement selecttext1colour;
	
	@FindBy(id="text_1_textwidth") 
	WebElement text1width;
	
	@FindBy(id="create-text-block") 
	WebElement addnewtextarea;
	
	@FindBy(xpath ="//textarea[@name='text_2_text']") 
	WebElement textarea2;
	
	@FindBy(xpath ="//select[@name='text_2_font']") 
	WebElement text2font;
	
	@FindBy(xpath ="//select[@name='text_2_fontsize']") 
	WebElement text2fontsize;
	
	@FindBy(id="text_2_x") 
	WebElement text2xposition;
	
	@FindBy(id="text_2_y") 
	WebElement text2yposition;
	
	@FindBy(xpath ="//input[@name='text_2_color']") 
	WebElement selecttext2colour;
	
	@FindBy(id="text_2_textwidth") 
	WebElement text2width;
	
	
	
	public void imageTemplatesMenu()
	{
		imagetemplatesmenu.click();
	}
	
	public void createImageTemplate()
	{
		createimagetemplate.click();
	}
	
	public void metadataTab()
	{
		metadatatab.click();
	}
	
	public void templateName(String name)
	{
		templatename.sendKeys(name);
	}
	
	public void templateId(String id)
	{
		templateid.sendKeys(id);
	}
	
	public void importedData()
	{
		dsimporteddata.click();
	}
	
	public void API()
	{
		 dsapi.click();
	}
	
	public void personalCollecteddData()
	{
		dspersonalcollecteddata.click();
	}
	
	public void saveTemplate()
	{
		savetemplate.click();
	}
	
	public void backgroundImageTab()
	{
		backgroundimagetab.click();
	}
	
	public void uploadBGImage()
	{
		uploadbgimage.sendKeys("/home/mangeshmunge/Mangesh - Testing/MMS Template Data/Images/download.jpeg");
	}
	
	public void barcodeTab()
	{
		barcodetab.click();
	}
	
	public void addBarcode()
	{
		addbarcode.click();
	}
	
	public void barcodevalue(String barcodeval)
	{
		barcodevalue.sendKeys(barcodeval);
	}
	
	public void enableJWT()
	{
		enablejwt.click();
	}
	
	public void jwtPayload(String payload)
	{
		jwtpayload.sendKeys(payload);
	}
	
	public void publicKey(String pubkey)
	{
		publickey.sendKeys(pubkey);
	}
	
	public void privateKey(String prikey)
	{
		privatekey.sendKeys(prikey);
	}
	
	public void barcodeXPosition(String barcodex)
	{
		barcodexposition.clear();
		barcodexposition.sendKeys(barcodex);
	}
	
	public void barcodeYPosition(String barcodey)
	{
		barcodeyposition.clear();
		barcodeyposition.sendKeys(barcodey);
	}
	
	public void barcodeWidth(String width)
	{
		barcodewidth.clear();
		barcodewidth.sendKeys(width);
	}
	
	public void barcodeHeight(String height)
	{
		barcodeheight.clear();
		barcodeheight.sendKeys(height);
	}
	
	public void selectForegroundColour(String fgcolour)
	{
		selectforegroundcolour.clear();
		selectforegroundcolour.sendKeys(fgcolour);
	}
	
	public void selectBackgroundColour(String bgcolour)
	{
		selectbackgroundcolour.clear();
		selectbackgroundcolour.sendKeys(bgcolour);
	}
	
	public void barcodeBorder(String border)
	{
		barcodeborder.clear();
		barcodeborder.sendKeys(border);
	}
	
	public void barcodeTransparent()
	{
		Select s1 = new Select(barcodetransparent);
		
		s1.selectByValue("No");
	}
	
	public void barcodeType()
	{
		Select s1 = new Select(barcodetype);
		
		s1.selectByValue("58");
	}
	
	public void hideBarcodeText()
	{
		Select s1 = new Select(hidebarcodetext);
		
		s1.selectByValue("No");
	}
	
	public void barcodeTextFont()
	{
		Select s1 = new Select(barcodetextfont);
		
		s1.selectByValue("Arvo");
	}
	
	public void barcodeTextFontSize()
	{
		Select s1 = new Select(barcodetextfontsize);
		
		s1.selectByValue("28");
	}
	
	public void barcodeAlignment()
	{
		Select s1 = new Select(barcodealignment);
		
		s1.selectByValue("Center");
	}
	
	public void barcodeRotation()
	{
		Select s1 = new Select(barcoderotation);
		
		s1.selectByValue("0");
	}
	
	public void textTab()
	{
		texttab.click();
	}
	
	public void enableTextarea()
	{
		enabletextarea.click();
	}
	
	public void textarea1(String text1)
	{
		textarea1.clear();
		textarea1.sendKeys(text1);
	}
	
	public void text1font()
	{
		Select s1 = new Select(text1font);
		
		s1.selectByValue("Arvo");
	}
	
	public void text1fontsize()
	{
		Select s1 = new Select(text1fontsize);
		
		s1.selectByValue("34");
	}
	
	public void text1xposition(String text1x)
	{
		text1xposition.clear();
		text1xposition.sendKeys(text1x);
	}
	
	public void text1yposition(String text1y)
	{
		text1yposition.clear();
		text1yposition.sendKeys(text1y);
	}
	
	public void selecttext1colour(String text1colour)
	{
		selecttext1colour.clear();
		selecttext1colour.sendKeys(text1colour);
	}
	
	public void text1width(String textwidth1)
	{
		text1width.clear();
		text1width.sendKeys(textwidth1);
	}
	
	public void addnewtextarea()
	{
		addnewtextarea.click();
	}
	
	public void textarea2(String text2)
	{
		textarea2.clear();
		textarea2.sendKeys(text2);
	}
	
	public void text2font()
	{
		Select s1 = new Select(text2font);
		
		s1.selectByValue("Arvo");
	}
	
	public void text2fontsize()
	{
		Select s1 = new Select(text2fontsize);
		
		s1.selectByValue("34");
	}
	
	public void text2xposition(String text2x)
	{
		text2xposition.clear();
		text2xposition.sendKeys(text2x);
	}
	
	public void text2yposition(String text2y)
	{
		text2yposition.clear();
		text2yposition.sendKeys(text2y);
	}
	
	public void selecttext2colour(String text2colour)
	{
		selecttext2colour.clear();
		selecttext2colour.sendKeys(text2colour);
	}
	
	public void text2width(String textwidth2)
	{
		text2width.clear();
		text2width.sendKeys(textwidth2);
	}
	
}
