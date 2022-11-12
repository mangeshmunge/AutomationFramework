package com.Account.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {

	WebDriver driver;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidemenu-list\"]/li[6]/ul/li[1]")
	WebElement accountmodule;
	
	public void accountmodule()
	{
		accountmodule.click();
	}
	
	
	//***********************************  Update Account Info   ******************************************//
	
	
	@FindBy(xpath = "//a[@title='Account Info']")
	WebElement accountinfo;
	
	@FindBy(xpath = "//select[@id='timezone']")
	WebElement timezone;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement country1;
	
	@FindBy(id="data_retention_days")
	WebElement csvdataretention;
	
	@FindBy(name="company")
	WebElement brandname;
	
	@FindBy(name="zipcode")
	WebElement zipcode;
	
	@FindBy(name="phone")
	WebElement EUsupportphone;
	
	@FindBy(name="email")
	WebElement EUsupportemail;
	
	@FindBy(name="website")
	WebElement supportwebsite;
	
	@FindBy(xpath = "//label[@for='authentication-on']")
	WebElement twoFAON;
	
	@FindBy(xpath = "//label[@for='authentication-off']")
	WebElement twoFAOFF;
	
	@FindBy(xpath = "//button[@title='Update']")
	WebElement update;
	
	
	public void accountInfo()
	{
		accountinfo.click();
	}
	
	public void timezone()
	{
		Select s = new Select(timezone);
		s.selectByValue("372");
	}
	
	public void country1()
	{
		Select s = new Select(country1);
		s.selectByValue("7");
	}
	
	public void csvDataRetention(String csvretention)
	{
		csvdataretention.clear();
		csvdataretention.sendKeys(csvretention);
	}
	
	public void brandName(String brand)
	{
		brandname.clear();
		brandname.sendKeys(brand);
	}
	
	public void zipCode(String zip)
	{
		zipcode.clear();
		zipcode.sendKeys(zip);
	}
	
	public void EUsupportPhone(String phone)
	{
		EUsupportphone.clear();
		EUsupportphone.sendKeys(phone);
	}
	
	public void EUsupportEmail(String email)
	{
		EUsupportemail.clear();
		EUsupportemail.sendKeys(email);
	}
	
	public void supportWebsite(String website)
	{
		supportwebsite.clear();
		supportwebsite.sendKeys(website);
	}
	
	public void twoFAON()
	{
		twoFAON.click();
	}
	
	public void twoFAOFF()
	{
		twoFAOFF.click();
	}
	
	public void update()
	{
		update.click();
	}
	
	
	
	
	//***********************************  Update Brand Info   ******************************************//
	
	
	@FindBy(xpath = "//a[@title='Brand Info']")
	WebElement brandinfo;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement country2;
	
	/*FindBy(name="company")
	WebElement brandname;
	
	@FindBy(name="zipcode")
	WebElement zipcode;
	
	@FindBy(name="phone")
	WebElement EUsupportphone;
	
	@FindBy(name="email")
	WebElement EUsupportemail;
	
	@FindBy(name="website")
	WebElement supportwebsite;
	
	@FindBy(xpath = "//button[@title='Update']")
	WebElement update;*/
	
	
	
	public void brandInfo()
	{
		brandinfo.click();
	}
	
	public void country2()
	{
		Select s = new Select(country1);
		s.selectByValue("5");
	}
	
	
	//***********************************  Update My Profile   ******************************************//
	
	
	@FindBy(xpath ="//a[@title='My Profile']")
	WebElement myprofile;
	
	@FindBy(name="fname")
	WebElement firstname;
	
	@FindBy(name="lname")
	WebElement lastname;
	
	@FindBy(id="curr_cred")
	WebElement currentpassword;
	
	@FindBy(id="cred")
	WebElement newpassword;
	
	@FindBy(id="confirm_cred")
	WebElement confirmpassword;
	
	/*@FindBy(xpath = "//button[@title='Update']")
	WebElement update;*/
	
	
	public void myProfile()
	{
		myprofile.click();
	}
	
	public void firstName(String name)
	{
		firstname.clear();
		firstname.sendKeys(name);
	}
	
	public void lastName(String surname)
	{
		lastname.clear();
		lastname.sendKeys(surname);
	}
	
	public void currentpassword(String currentpass)
	{
		currentpassword.clear();
		currentpassword.sendKeys(currentpass);
	}
	
	public void newpassword(String newpass)
	{
		newpassword.clear();
		newpassword.sendKeys(newpass);
	}
	
	public void confirmpassword(String confirmpass)
	{
		confirmpassword.clear();
		confirmpassword.sendKeys(confirmpass);
	}
	
	
	//***********************************  Users   ******************************************//
	
	
	@FindBy(xpath ="//a[@title=' Users']")
	WebElement usersmenu;
	
	@FindBy(name="invite_email")
	WebElement inviteemail;
	
	@FindBy(name="invite_user")
	WebElement inviteuser;
	
	@FindBy(xpath = "//*[@id=\"row_index_0\"]/div/div[4]/div[2]/button")
	WebElement resendbutton1;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement deletecheckbox;
	
	@FindBy(xpath = "//button[@title='Delete']")
	WebElement deletebutton;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement deleteconfirm;
	
	
	
	public void usersMenu()
	{
		usersmenu.click();
	}
	
	public void inviteemail(String email)
	{
		inviteemail.clear();
		inviteemail.sendKeys(email);
	}
	
	public void inviteuser()
	{
		inviteuser.click();
	}
	
	public void resend1()
	{
		resendbutton1.click();
	}
	
	public void deletecheckbox()
	{
		deletecheckbox.click();
	}
	
	public void deleteButton()
	{
		deletebutton.click();
	}
	
	public void deleteconfirm()
	{
		deleteconfirm.click();
	}
	
	
	//***********************************  CSV Exports   ******************************************//
	
	
	@FindBy(xpath ="//a[@title='CSV Exports']")
	WebElement csvexportsmenu;
	
	@FindBy(xpath ="(//a[@title='Download'])[1]") // Use index to download the file
	WebElement downloadfile;
	
	@FindBy(xpath ="(//a[@title='Delete'])[1]") // Use index to delete the file
	WebElement deletefile;
	
	//@FindBy(xpath = "//button[text()='Yes']")
	//WebElement deleteconfirm;
	
	@FindBy(xpath ="(//a[@title='Retry'])[1]") // Use index to retry
	WebElement retry;
	
	@FindBy(xpath ="//a[text()='Next']") 
	WebElement next;
	
	@FindBy(xpath ="//a[text()='Previous']") 
	WebElement previous;
	
	
	public void csvExportsMenu()
	{
		csvexportsmenu.click();          
	}
	
	public void downloadFile()
	{
		downloadfile.click();
	}
	
	public void deleteFile()
	{
		deletefile.click();
	}
	
	/*public void deleteconfirm()
	{
		deleteconfirm.click();
	}*/
	
	public void retry()
	{
		retry.click();
	}
	
	public void next()
	{
		next.click();
	}
	
	public void previous()
	{
		previous.click();
	}
	
	
	//***********************************  CSV Exports   ******************************************//
	
	
	@FindBy(xpath ="//a[@title='CSV Imports']")
	WebElement csvimportsmenu;
	
	/*@FindBy(xpath ="(//a[@title='Download'])[1]") // Use index to download the file
	WebElement downloadfile;
	
	@FindBy(xpath ="(//a[@title='Delete'])[1]") // Use index to delete the file
	WebElement deletefile;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement deleteconfirm;*/
	
	@FindBy(xpath ="//*[@id=\"messagingPreview\"]/div[2]/div/div/div[6]/div[2]/div/a")
	WebElement errorreport;
	
	@FindBy(xpath ="(//a[text()='Expand'])[1]")
	WebElement expand;
	
	@FindBy(xpath ="(//a[text()='Collapse'])[1]")
	WebElement collapse;
	
	/*@FindBy(xpath ="//a[text()='Next']") 
	WebElement next;
	
	@FindBy(xpath ="//a[text()='Previous']") 
	WebElement previous;*/
	
	
	
	public void csvImportsMenu()
	{
		csvimportsmenu.click();          
	}
	
	/*public void downloadFile()
	{
		downloadfile.click();
	}
	
	public void deleteFile()
	{
		deletefile.click();
	}
	
	public void deleteconfirm()
	{
		deleteconfirm.click();
	}*/
	
	public void errorReport()
	{
		errorreport.click();          
	}
	
	public void expand()
	{
		expand.click();          
	}
	
	public void collapse()
	{
		collapse.click();          
	}
	
	/*public void next()
	{
		next.click();
	}
	
	public void previous()
	{
		previous.click();
	}*/
	
	
	
}
