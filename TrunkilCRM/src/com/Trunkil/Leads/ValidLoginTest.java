package com.Trunkil.Leads;

import org.testng.annotations.Test;

import com.Trunkil.genericLib.BaseTest;
import com.Trunkil.genericLib.FileLib;
import com.Trunkil.genericLib.WebDriverCommonLib;
import com.actitime.Pages.LoginPage;

public class ValidLoginTest extends BaseTest{

	@Test
	public void loginToApp() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "homeTitle"),wlib.getPageTitle(),
				"CRM Home ");
		
		
		
	}
}












