package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KeywordsPage {

	WebDriver ldriver;
	
	public KeywordsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tr_0\"]/div[6]/div[2]/a")
	WebElement keywordslink;
	
	@FindBy(id="key_4")
	WebElement keywordstab;
	
	@FindBy(xpath = "//a[@title='Add Keyword']")
	WebElement addkeyword;
	
	@FindBy(xpath = "//select[@id='keycode_country']")
	WebElement selectcountry;
	
	@FindBy(xpath = "//input[@placeholder='Please enter the Keyword']")
	WebElement typekeyword;
	
	@FindBy(id="save")
	WebElement savekeyword;
	
	@FindBy(xpath = "//*[@id=\"row_index_1\"]/div/div[5]/div[2]/a")
	WebElement deletekeyword;
	
	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement deleteConfirm;
	
	
	
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
	
	public void selectCountry()
	{
		Select sc = new Select(selectcountry);
		sc.selectByValue("7");
	}
	
	public void typeKeyword(String kw)
	{
		typekeyword.sendKeys(kw);
	}
	
	public void saveKeyword()
	{
		savekeyword.click();
	}
	
	public void deleteKeyword()
	{
		deletekeyword.click();
	}
	
	public void deleteConfirm()
	{
		deleteConfirm.click();
	}
	
	
	
	
	
	
}
