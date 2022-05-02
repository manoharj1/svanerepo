package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Trunkil.genericLib.BaseTest;

public class HomePage {

	//@FindBy(xpath = "//a[contains(text(),'Leads')]") private WebElement leadsButton;
	@FindBy(xpath="//a[contains(text(),'Contacts')]") private WebElement contactsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
		
	}
	
public void clickLeadsButton()
{
	//leadsButton.click();
}
	
	public void clickContactsTab()
	{
		contactsTab.click();
	}
	
	
}
