package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class ContactsPage {
@FindBy(xpath = "//a[@id='Contactstab']") private WebElement contactsTab;

public ContactsPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getContactsTab() {
	return contactsTab;
}

public void setContactsTab(WebElement contactsTab) {
	this.contactsTab = contactsTab;
}

}
