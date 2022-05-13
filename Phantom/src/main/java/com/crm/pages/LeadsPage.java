package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class LeadsPage {
	@FindBy(xpath = "//td[contains(text(),'Leads: ')]") private WebElement leadstext;
	@FindBy(xpath = "//input[@value='New Lead']") private WebElement newLeadbtn;
	
	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	
	}
	public WebElement getLeadsTextAddr()
	{
		return leadstext;
	
	}
	public WebElement getnewLeadbtn()
	{
		return newLeadbtn;
		
	}
public void clicknewleadbtn()
{
	newLeadbtn.click();
}
}
