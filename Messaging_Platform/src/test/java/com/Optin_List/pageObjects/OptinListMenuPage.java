package com.Optin_List.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OptinListMenuPage {

	WebDriver driver;
	
	public OptinListMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
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
	
	@FindBy(name="update")
	WebElement submit;
	
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
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	@FindBy(xpath="//select[@id='shortcode']")
	WebElement sender;
	
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
	WebElement importdata;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel my import')]")
	WebElement cancelimport;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement cancelimportYes;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/div/a")
	WebElement subscriberslink;
	
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
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[7]/div[2]/div/label")
	WebElement optoutnotify;
		
	//Enter the number as per index (Index and number should match)
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[8]/div[2]/button")
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
	
	public void searchOptinList(String searchlist)
	{
		searchoptinlist.sendKeys(searchlist);
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	public void editOptinList()
	{
		editoptinlist.click();
	}
	
	public void editListName(String editname)
	{
		editlistname.clear();
		editlistname.sendKeys(editname);
	}
	
	public void Submit()
	{
		submit.click();
	}
	
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
	
	public void selectCountry()
	{
		Select sc = new Select(country);
		
		sc.selectByValue("7");
	}
	
	public void selectSender()
	{
        Select sc = new Select(sender);
		
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
		enternumber.sendKeys("6178389328");
	}
	
	public void addButton()
	{
		addbutton.click();
	}
	
	public void uploadCSV()
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
	
	public void importData()
	{
		importdata.click();
	}
	
	public void cancelImport()
	{
		cancelimport.click();
	}
	
	public void cancelImportYes()
	{
		cancelimportYes.click();
	}
	
	public void subscribersLink()
	{
		subscriberslink.click();
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
		searchphonenumber.sendKeys("16178389328");
	}
	
	public void clearPhoneNumber()
	{
		searchphonenumber.clear();
	}
	
	public void selectTimeZone()
	{
		Select stz = new Select(selecttimezone);
	    stz.selectByValue("362");
	}
	
	public void clearTimeZone()
	{
		Select stz = new Select(selecttimezone);
	    stz.selectByVisibleText("- All Timezones -");
	}
	
	public void selectCarrier()
	{
		Select sc = new Select(selectcarrier);
	    sc.selectByValue("Sprint");
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
	
}
