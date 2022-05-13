package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;

public class LoginPage {
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]") private WebElement signinbtn;
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void login(String un,String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		signinbtn.click();
	}
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
}
