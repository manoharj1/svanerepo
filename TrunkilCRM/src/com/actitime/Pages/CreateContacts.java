package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Trunkil.genericLib.BaseTest;
import com.Trunkil.genericLib.WebDriverCommonLib;

public class CreateContacts {

	@FindBy(xpath="//select[@name='property(saltName)']") private WebElement firstNameDrp;
	@FindBy(name="property(First Name)") private WebElement firstNameText;
	@FindBy(name="property(Lead Source)") private WebElement leadsourceDrp;
	@FindBy(name="property(Last Name)") private WebElement lastNameText;
	@FindBy(name="property(Account Name)") private WebElement accountName;
    @FindBy(xpath="//input[@name='property(Email)']") private WebElement emailText;
    
	@FindBy(xpath="//input[@value='Save']" ) private WebElement saveButton;
	
	public CreateContacts() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(BaseTest.driver, this);
	
	}
	
	//cc.createNewAccount(firstName,firstnametxt,leadsrc,lastname,accname);
	public void createNewAccount(String firstName,String firstnametxt,String leadsrc,String lastname,String accname,String emailtext )
	{
		WebDriverCommonLib wbl=new WebDriverCommonLib();
		wbl.selectOption(firstName,firstNameDrp);
		firstNameText.sendKeys(firstnametxt);
		wbl.selectOption(leadsrc, leadsourceDrp);
		lastNameText.sendKeys(lastname);
		accountName.sendKeys(accname);
		emailText.sendKeys(emailtext);
		
	}//createnewAccount 
	
public void	clickOnSaveButton()
	{
		saveButton.click();
	}//clickonsavebutton
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
