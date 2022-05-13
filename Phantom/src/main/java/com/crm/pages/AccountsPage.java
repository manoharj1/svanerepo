package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class AccountsPage {

@FindBy(xpath = "//td[contains(text(),'Accounts: ')]") private WebElement accountsText;
@FindBy(xpath = "//input[@value='New Account']") private WebElement newAccountsbtn;

public WebElement getAccountsText() {
	return accountsText;
}

public void setAccountsText(WebElement accountsText) {
	this.accountsText = accountsText;
}

public WebElement getNewAccountsbtn() {
	return newAccountsbtn;
}

public void setNewAccountsbtn(WebElement newAccountsbtn) {
	this.newAccountsbtn = newAccountsbtn;
}

public AccountsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getAccountsTextAddress()
{
	return accountsText;
	
}
public void clicknewAccountsbtn()
{
	newAccountsbtn.click();
}










}
