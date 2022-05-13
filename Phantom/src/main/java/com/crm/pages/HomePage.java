package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;


public class HomePage {
@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath = "//a[text()='Contacts']") private WebElement contactsTab;
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	
	PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getLeadsTab() {
		return leadsTab;
	}

	public void setLeadsTab(WebElement leadsTab) {
		this.leadsTab = leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
		
		
	}
	public WebElement getAccountsTab() {
		return contactsTab;
	}

	public void setContactsTab(WebElement contactsTab) {
		this.contactsTab = contactsTab;
	}
	public void clickAccountsTab()
	{
		accountsTab.click();
	}
	public WebElement getContactsTab() {
		return accountsTab;
	}

	public void setAccountsTab(WebElement accountsTab) {
		this.accountsTab = accountsTab;
	}
	public void clickContactsTab()
	{
		contactsTab.click();
	}

}
