package com.MMS_Templates.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.messaging_platform.utilities.ReadConfig;

public class CreateMMSTemplatePage {

	WebDriver driver;
	
	public CreateMMSTemplatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
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
	
	@FindBy(xpath = "//*[@id=\"1821-39894\"]")
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
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement deleteconfirm;
	
	@FindBy(xpath="//*[@id=\"mmsPreview\"]/div/div/div[2]/label/span")
	WebElement preview;
	
	
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
		templatename.clear();
		templatename.sendKeys("All Content MMS");
	}
	
	public void templateName2()
	{
		templatename.clear();
		templatename.sendKeys("All Content MMS Edited");
	
	}
	
	public void templateSubject1()
	{
		templatesubject.clear();
		templatesubject.sendKeys("Test Subject");
	}
	
	public void templateSubject2()
	{
		templatesubject.clear();
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
		fallbacksmstext.clear();
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
	
	public void deleteConfirmation()
	{
		deleteconfirm.click();
	}
	
	public void Preview()
	{
		preview.click();
	}
	
	
	
	
	
	
	
}
