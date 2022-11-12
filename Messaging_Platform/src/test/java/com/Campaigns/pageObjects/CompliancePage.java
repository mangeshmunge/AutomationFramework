package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompliancePage {

	
	WebDriver driver;
	
	public CompliancePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="key_6")
	WebElement compliancetab;
	
	public void complianceTab()
	{
		compliancetab.click();
	}
	
}
