package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Trunkil.genericLib.BaseTest;

public class LeadsPage {

@FindBy(xpath="//td[contains(text(),'Leads: ')]") private WebElement leadsText;

public LeadsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
	
	
	}

public WebElement getleadsTextAddrs()
{
	return leadsText;
	
}






}
