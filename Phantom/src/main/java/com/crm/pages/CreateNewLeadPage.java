package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommonLib;

public class CreateNewLeadPage
{
@FindBy(xpath = "//select[@name='property(saltName)']") private WebElement SalutationDDAddr;
@FindBy(xpath = "//input[@name='property(Company)']") private WebElement CompanyName;
@FindBy(xpath = "//input[@name='property(Last Name)']") private WebElement LastName;
@FindBy(xpath = "//select[@name='property(Lead Source)']") private WebElement LeadSourceDDAddr;
@FindBy(xpath ="(//input[@value='Save'])[1]" ) private WebElement saveBtn;

public WebElement getSaveBtn() {
	return saveBtn;
}

public void setSaveBtn(WebElement saveBtn) {
	this.saveBtn = saveBtn;
}

public CreateNewLeadPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getSalutationDDAddr() {
	return SalutationDDAddr;
}
public void setSalutationDDAddr(WebElement salutationDDAddr) {
	SalutationDDAddr = salutationDDAddr;
}
public WebElement getCompanyName() {
	return CompanyName;
}
public void setCompanyName(WebElement companyName) {
	CompanyName = companyName;
}
public WebElement getLastName() {
	return LastName;
}
public void setLastName(WebElement lastName) {
	LastName = lastName;
}
public WebElement getLeadSourceDDAddr() {
	return LeadSourceDDAddr;
}
public void setLeadSourceDDAddr(WebElement leadSourceDDAddr) {
	LeadSourceDDAddr = leadSourceDDAddr;
}

public void createLead(String saltext,String company,String lastname,String leadtext)
{
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.selectOption(saltext,SalutationDDAddr );
	CompanyName.sendKeys(company);
	LastName.sendKeys(lastname);
	wlib.selectOption(leadtext, LeadSourceDDAddr);
	saveBtn.click();
}

}
