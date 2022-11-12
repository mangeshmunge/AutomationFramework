package com.MMS_Inboxes.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MMSInboxesMenuPage {

	 WebDriver ldriver;
		
		public MMSInboxesMenuPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[9]/a/span")
		WebElement mmsinboxesmenu;
		
		@FindBy(xpath = "//button[text()='Create MMS Inbox']")
		WebElement createmmsinbox;
		
		@FindBy(id="campaign_name")
		WebElement inboxname;
		
		// Add/remove keywords
		
		@FindBy(xpath = "//button[text()='Add Keyword/Sender']")
		WebElement addkeywordshortcode;
		
		@FindBy(xpath = "//html")
		WebElement clickonwebpage;
		
		@FindBy(id="kw_add_1")
		WebElement enterkeyword;
		
		@FindBy(xpath = "//select[@id='country_add_1']")
		WebElement selectcountry;
		
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
		WebElement selectcampaign;
		
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
		
		@FindBy(xpath = "//*[@id=\"mmsSelect7\"]/div/div/div[1]/button/span") 
		WebElement closemms2;
		
		@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[3]/div[2]/a") 
		WebElement viewkeywords;
		
		
		
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
			inboxname.clear();
			inboxname.sendKeys(inbox);
		}
		
		public void addKeywordShortcode()
		{
			addkeywordshortcode.click();
		}
		
		public void clickonwebpage()
		{
			clickonwebpage.click();
		}
		
		public void enterKeyword(String keyword)
		{
			enterkeyword.sendKeys(keyword);
		}
		
		public void selectcountry()
		{
			Select sc = new Select(selectcountry);
			
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
		
		public void smsText1(String smstext11)
		{
			smstext1.clear();
			smstext1.sendKeys(smstext11);
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
		
		public void expression(String expression1)
		{
			expression.clear();
			expression.sendKeys(expression1);
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
		
		public void smsText2(String smstext22)
		{
			smstext2.clear();
			smstext2.sendKeys(smstext22);
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
		
		public void smsText3(String smstext33)
		{
			smstext3.clear();
			smstext3.sendKeys(smstext33);
		}
		
		public void optinsenderCheckbox()
		{
			optinsendercheckbox.click();
		}
		
		public void selectcampaign()
		{
			Select sc = new Select(selectcampaign);
			
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
		
		public void closeMMS2()
		{
			closemms2.click();
		}
		
		public void viewKeywords()
		{
			viewkeywords.click();
		}
		
		
		
		
		
		
				
		
				
}
