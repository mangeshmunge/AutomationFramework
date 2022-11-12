package com.Optout_List.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OptoutListMenuPage {

	WebDriver driver;
	
	public OptoutListMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[8]/a/span")
	WebElement optoutlistmenu;
	
	@FindBy(id="number")
	WebElement searchbynumber;
	
	@FindBy(name="sender")
	WebElement searchbysender;
	
	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[6]/div[2]/div/label/span")
	WebElement blacklistnumber;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[7]/div[2]/a/i")
	WebElement deletenumber;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deletenumberconfirm;
	
	@FindBy(xpath = "//button[text()='Add a number']")
	WebElement addnumberbutton;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	@FindBy(name="phoneNumber")
	WebElement enterphonenumber;
	
	@FindBy(name="addShortcode")
	WebElement entersender;
	
	@FindBy(xpath = "//button[text()='Add Number']")
	WebElement addnumber;
	
	@FindBy(xpath = "//button[text()='Import Numbers']")
	WebElement importnumbers;
	
	@FindBy(xpath = "//input[@id='dataToUpload']")
	WebElement uploadcsv;
	
	@FindBy(xpath = "//button[@title='None selected']")
	WebElement selectdropdown;

	@FindBy(xpath = "//label[text()='00060856 (United States)']")
	WebElement selectcountryshortcode;
	
	@FindBy(xpath = "//html")
	WebElement clickonwebpage;
	
	@FindBy(id="submit_import")
	WebElement importdata;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel my import')]")
	WebElement cancelimport;
	
	
	
	
	
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
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	public void blacklistNumber()
	{
		blacklistnumber.click();
	}
	
	public void deleteNumber()
	{
		deletenumber.click();
	}
	
	public void deleteNumberConfirm()
	{
		deletenumberconfirm.click();
	}
	
	public void addNumberButton()
	{
		addnumberbutton.click();
	}
	
	public void selectCountry()
	{
		Select sc = new Select(country);
		
		sc.selectByValue("7__1");
	}
	
	public void enterPhoneNumber()
	{
		enterphonenumber.sendKeys("16178389328");
	}
	
	public void enterSender()
	{
		entersender.sendKeys("00060856");
	}
	
	public void addNumber()
	{
		addnumber.click();
	}
	
	public void importNumbers()
	{
		importnumbers.click();
	}
	
	public void uploadCSV()
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
	
	public void clickonwebpage()
	{
		clickonwebpage.click();
	}
	
	public void importData()
	{
		importdata.click();
	}
	
	public void cancelImport()
	{
		cancelimport.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
