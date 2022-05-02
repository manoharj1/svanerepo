package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.Trunkil.genericLib.BaseTest;

public class LoginPage {
 @FindBy(id="userName") private WebElement untb;
     @FindBy(id="passWord") private WebElement pwtb;
     @FindBy(xpath = "//input[@title='Sign In']") private WebElement signinBtn;
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		signinBtn.click();
	}
	
	public WebElement getuntb()
	{
		return untb;
	}
	
	public WebElement getpwtb()
	{
		return pwtb;
	}
	
	public WebElement getLoginBtn()
	{
		return signinBtn;
	}
/*	
	public void typeUn(String un)
	{
		untb.sendKeys(un);
	}
	
	public void typePw(String pwd)
	{
		pwtb.sendKeys(pwd);*/
	//}
	
	public void clickLoginBtn()
	{
		signinBtn.click();
	}
	
	
	
	
}
