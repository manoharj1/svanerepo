package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Trunkil.genericLib.BaseTest;

public class ContactsPage {

	
@FindBy(xpath="//td[contains(text(),'Contacts: ')]") private WebElement contactsText;
@FindBy(xpath="//input[@value='New Contact']") private WebElement newContactsTab;

public ContactsPage() {
	// TODO Auto-generated constructor stub

PageFactory.initElements(BaseTest.driver,this);

}

public WebElement getcontactsTextAddress()
{
	return contactsText;
	
	}

public void clickOnNewContactsTab()
{
	newContactsTab.click();
}




}
