package com.Manage_Keywords.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageKeywordsMenuPage {

	WebDriver ldriver;
	
	public ManageKeywordsMenuPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"message-submenu\"]/li[10]/a/span")
	WebElement managekeywordsmenu;
	
	@FindBy(id="keyword")
	WebElement enterkeyword;
	
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement searchbutton;
	
	@FindBy(xpath = "//select[@id='countryid']")
	WebElement selectcountry;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/a")
	WebElement editcampaign;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[5]/div[2]/a/i")
	WebElement deletekeyword;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deleteconfirm;
	
	
	
	
	public void manageKeywordsMenu()
	{
		managekeywordsmenu.click();
	}
	
	public void enterKeyword()
	{
		enterkeyword.sendKeys("AKEFWODA");
	}
	
	public void searchButton()
	{
		searchbutton.click();
	}
	
	
	public void selectCountry()
	{
		Select sc = new Select(selectcountry);
		
		sc.selectByValue("7");
	}
	
	public void editCampaign()
	{
		editcampaign.click();
	}
	
	public void deleteKeyword()
	{
		deletekeyword.click();
	}
	
	public void deleteConfirm()
	{
		deleteconfirm.click();
	}
	
	
	
	
	
}
