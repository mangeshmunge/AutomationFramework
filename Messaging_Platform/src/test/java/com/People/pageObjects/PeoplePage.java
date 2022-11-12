package com.People.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PeoplePage {

	WebDriver driver;
	
	public PeoplePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"sidemenu-list\"]/li[4]")
	WebElement peoplemodule;
	
	@FindBy(xpath = "//*[@id=\"people-submenu\"]/li[2]/a/span")
	WebElement peoplemenu;
	
	@FindBy(name="phoneNumber")
	WebElement enterphonenumber1;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchbutton1;
	
	
	
	//**********************************      Upload People Bulk Data using CSV     ************************************//
	
	
	
	@FindBy(xpath = "//button[@title='Import People Bulk Data']")
	WebElement importpeoplebulkdata;
	
	@FindBy(xpath = "//input[@id='dataToUpload']")
	WebElement uploadpeoplecsv;
	
	@FindBy(xpath = "//select[@name='standard_column[0]']")
	WebElement csvcolumn1;
	
	@FindBy(xpath = "//select[@name='standard_column[1]']")
	WebElement csvcolumn2;
	
	@FindBy(xpath = "//select[@name='standard_column[2]']")
	WebElement csvcolumn3;
	
	@FindBy(xpath = "//label[@for='skip_firstrow']")
	WebElement skipfirstrow;
	
	@FindBy(xpath = "//button[text() = 'Import Data']")
	WebElement importdata;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel my import')]")
	WebElement cancelimport;
	
	
	
	//******************************     View and Update Personal Information      *********************************//

	
	
	@FindBy(xpath = "//a[@href='person-details.php?phoneNumber=11111111111']")
	WebElement personaldatalink;
	
	@FindBy(xpath = "//input[@name='Phone']")
	WebElement updatephone;
	
	@FindBy(xpath = "//input[@name='Email']")
	WebElement updateemail;
	
	@FindBy(xpath = "//input[@name='FullAddress']")
	WebElement updatefulladdress;
	
	@FindBy(xpath = "//input[@name='FullName']")
	WebElement updatefullname;
	
	@FindBy(xpath = "//input[@name='Custom1']")
	WebElement updatecustom1;
	
	@FindBy(xpath = "//input[@name='Custom2']")
	WebElement updatecustom2;
	
	@FindBy(xpath = "//button[@name='update']")
	WebElement updatepersoninfo;
	
	
	
	//******************************   Create, Edit, Delete Merge Tag      ****************************//
	
	
	
	@FindBy(xpath = "//button[@title='Create Merge Tag']")
	WebElement createmergetag;
	
	@FindBy(xpath = "//button[@title='Add New Tag']")
	WebElement addnewtag;
	
	@FindBy(xpath = "//input[@name='tag[5][name]']")
	WebElement entermergetagname;
	
	@FindBy(xpath = "//select[@name='tag[5][mapping]']")
	WebElement selectmappingtags;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	
	
	//**************************************    View, Export Additional Data    ***********************************//
	
	
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/a")
	WebElement additionaldatalink;
	
	@FindBy(xpath = "//select[@name='campaignID']")
	WebElement mmscampaign;
	
	@FindBy(name="phoneNumber")
	WebElement enterphonenumber2;
	
	@FindBy(id="from")
	WebElement from;
	
	@FindBy(id="to")
	WebElement to;
	
	@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchbutton2;
	
	@FindBy(xpath = "//button[text()='Export Additional Data']")
	WebElement exportadditionaldata;
	
	
	
	//**************************************       Check Opt-in Lists      ************************************//
	
	
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/a")
	WebElement optinlistslink;
	
	@FindBy(name="phoneNumber")
	WebElement enterphonenumber3;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchbutton3;
	
	
	
	public void peopleModule()
	{
		peoplemodule.click();
	}
	
	public void peopleMenu()
	{
		peoplemenu.click();
	}
	
	public void enterPhoneNumber1()
	{
		enterphonenumber1.sendKeys("16178389328");
	}
	
	public void searchButton1()
	{
		searchbutton1.click();
	}
	
	
	//**********************************      Upload People Bulk Data using CSV     ************************************//
	
	
	
	public void importPeopleBulkData()
	{
		importpeoplebulkdata.click();
	}
	
	public void uploadPeopleCSV()
	{
		uploadpeoplecsv.sendKeys("/home/mangeshmunge/Mangesh - Testing/CSV/People - Import Bulk Data.csv");
	}
	
	public void csvcolumn1()
	{
		Select s = new Select(csvcolumn1);
		
		s.selectByValue("FullName");
	}
	
	public void csvcolumn2()
	{
		Select s = new Select(csvcolumn2);
		
		s.selectByValue("email");
	}
	
	public void csvcolumn3()
	{
		Select s = new Select(csvcolumn3);
		
		s.selectByValue("phonenumber");
	}
	
	public void skipFirstRow()
	{
		skipfirstrow.click();
	}
	
	public void importData()
	{
		importdata.click();
	}
	
	public void cancelImport()
	{
		cancelimport.click();
	}
	
	
	
	//******************************     View and Update Personal Information      *********************************//
	
	
	
	public void personalDataLink()
	{
		personaldatalink.click();
	}
	
	public void updatePhone(String phone)
	{
		updatephone.clear();
		updatephone.sendKeys(phone);
	}
	
	public void updateEmail(String email)
	{
		updateemail.clear();
		updateemail.sendKeys(email);
	}
	
	public void updateFullAddress(String fulladdress)
	{
		updatefulladdress.clear();
		updatefulladdress.sendKeys(fulladdress);
	}
	
	public void updateFullName(String fullname)
	{
		updatefullname.clear();
		updatefullname.sendKeys(fullname);
	}
	
	public void updateCustom1(String custom1)
	{
		updatecustom1.clear();
		updatecustom1.sendKeys(custom1);
	}
	
	public void updateCustom2(String custom2)
	{
		updatecustom2.clear();
		updatecustom2.sendKeys(custom2);
	}
	
	public void updatePersonInfo()
	{
		updatepersoninfo.click();
	}
	
	
	
	// Create, Edit, Delete Merge Tag
	
	
	
	public void createMergeTag()
	{
		createmergetag.click();
	}
	
	public void addNewTag()
	{
		addnewtag.click();
	}
	
	public void enterMergeTagName()
	{
		entermergetagname.sendKeys("Gender");
	}
	
	public void selectMappingTags()
	{
		Select s = new Select(selectmappingtags);
		
		s.selectByValue("Gender");
	}
	
	public void save()
	{
		save.click();
	}
	
	
	
	// View, Export Additional Data
	
	
	
	public void additionalDataLink()
	{
		additionaldatalink.click();
	}
	
	public void mmsCampaign()
	{
		Select s = new Select(mmscampaign);
		
		s.selectByValue("5269");
	}
	
	public void enterPhoneNumber2()
	{
		enterphonenumber2.clear();
		enterphonenumber2.sendKeys("11112222333");
	}
	
	public void from()
	{
		from.click();
	}
	
	public void to()
	{
		to.click();
	}
	
	public void clickonwebpage()
	{
		clickonwebpage.click();
	}
	
	public void searchButton2()
	{
		searchbutton2.click();
	}
	
	public void exportAdditionalData()
	{
		exportadditionaldata.click();
	}
	
	
	
	// Check Opt-in Lists for particular number
	
	
	public void optinListsLink()
	{
		optinlistslink.click();
	}
	
	public void enterPhoneNumber3()
	{
		enterphonenumber3.sendKeys("16178389328");
	}
	
	public void searchButton3()
	{
		searchbutton3.click();
	}
	
	
}
