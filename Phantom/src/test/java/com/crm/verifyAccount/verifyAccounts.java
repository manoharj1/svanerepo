package com.crm.verifyAccount;

import org.testng.annotations.Test;

import com.crm.LoginPage.CrmvalidLoginTest;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommonLib;
import com.crm.pages.AccountsPage;
import com.crm.pages.HomePage;

public class verifyAccounts extends BaseTest{

@Test

public void verifyAccountsTest() throws Throwable 
{
	
	CrmvalidLoginTest crm=new CrmvalidLoginTest();
	crm.LoginToApp();
	
	Thread.sleep(5000);
	
	HomePage hm=new HomePage();
	hm.clickAccountsTab();
	
	Thread.sleep(3000);
	
	AccountsPage ap=new AccountsPage();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.elementDisplayed(ap.getAccountsTextAddress(), "accounts");
	
}






}
