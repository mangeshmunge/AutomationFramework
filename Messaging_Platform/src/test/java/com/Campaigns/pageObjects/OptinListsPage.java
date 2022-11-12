package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OptinListsPage {

	WebDriver ldriver;
	
	public OptinListsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	//copy x path
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[2]/div[2]/a")
	WebElement optinlistlink;
	
	@FindBy(id="key_2")
	WebElement optinlisttab;
	
	//Enter optin list name in xpath
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[1]/div[2]/a")
	WebElement selectoptinlist;
	
	@FindBy(xpath = "//a[@title='Subscribed']")
	WebElement subscribed;
	
	@FindBy(xpath = "//a[@title='Unconfirmed']")
	WebElement unconfirmed;
	
	@FindBy(xpath = "//a[@title='Add/Import Numbers']")
	WebElement addimportnum;
	
	@FindBy(xpath = "//button[@value='Add Number']")
	WebElement addnumber;
	
	@FindBy(xpath = "//input[@name='save_num']")
	WebElement enternumber;
	
	@FindBy(xpath = "//button[@name='Add_Number']")
	WebElement addbutton;
	
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
	
	@FindBy(xpath = "//*[contains(text(),'TestList1')]")
	WebElement verifyoptinlist;
	
	
	public void optinListLink()
	{
		optinlistlink.click();
	}
	
	public void optinListTab()
	{
		optinlisttab.click();
	}
	
	public void selectOptinList()
	{
		selectoptinlist.click();
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
	
	public void uploadCSVfile(String csv)
	{
		uploadcsv.sendKeys(csv);
	}
	
	public void verifyOptinList()
	{
		verifyoptinlist.click();
	}
	
	
	
	
}
