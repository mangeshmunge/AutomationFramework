package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCampaignPage {

	
	WebDriver ldriver;
	
	public SearchCampaignPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="search")
	WebElement searchcampaign;
	
	@FindBy(xpath = "//input[@title='Search']") //No ID Attribute Present
	WebElement clicksearch;
	
	
	
	public void searchCampaign()
	{
		searchcampaign.sendKeys("Test Campaign - 1");
	}
	
	public void clickSearch()
	{
		clicksearch.click();
	}
}
