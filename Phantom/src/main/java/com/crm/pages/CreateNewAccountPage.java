package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommonLib;

public class CreateNewAccountPage {
	@FindBy(xpath = "//input[@name=\"property(Account Name)\"]") private WebElement accountNameTb;
	@FindBy(xpath = "//select[@name='property(Rating)']") private WebElement ratingDDAddr;
	@FindBy(xpath = "//input[@name='property(Account Site)']") private WebElement accountSiteTb;
	@FindBy(xpath = "//input[@name='property(Phone)']") private WebElement phoneTb;
	@FindBy(xpath = "//select[@name='property(Industry)']") private WebElement industryDDAddr;
	@FindBy(xpath = "(//input[@value='Save'])[1]") private WebElement Savebtn;
	 public WebElement getSavebtn() {
		return Savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		Savebtn = savebtn;
	}

	public CreateNewAccountPage()
	 {
		PageFactory.initElements(BaseTest.driver, this); 
	 }

	public WebElement getAccountNameTb() {
		return accountNameTb;
	}

	public void setAccountNameTb(WebElement accountNameTb) {
		this.accountNameTb = accountNameTb;
	}

	public WebElement getRatingDDAddr() {
		return ratingDDAddr;
	}

	public void setRatingDDAddr(WebElement ratingDDAddr) {
		this.ratingDDAddr = ratingDDAddr;
	}

	public WebElement getAccountSiteTb() {
		return accountSiteTb;
	}

	public void setAccountSiteTb(WebElement accountSiteTb) {
		this.accountSiteTb = accountSiteTb;
	}

	public WebElement getPhoneTb() {
		return phoneTb;
	}

	public void setPhoneTb(WebElement phoneTb) {
		this.phoneTb = phoneTb;
	}

	public WebElement getIndustryDDAddr() {
		return industryDDAddr;
	}

	public void setIndustryDDAddr(WebElement industryDDAddr) {
		this.industryDDAddr = industryDDAddr;
	}
	
public void createAccount(String accname,String rating,String accsite,String phn,String industry) 
{
WebDriverCommonLib wlib=new WebDriverCommonLib();
accountNameTb.sendKeys(accname);
wlib.selectOption(rating,ratingDDAddr );
accountSiteTb.sendKeys(accsite);
phoneTb.sendKeys(phn);
wlib.selectOption(industry, industryDDAddr);
Savebtn.click();
	
}

}
