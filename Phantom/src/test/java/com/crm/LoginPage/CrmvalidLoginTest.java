package com.crm.LoginPage;

import org.testng.annotations.Test;

import com.crm.genericLib.WebDriverCommonLib;
import com.crm.pages.LoginPage;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;

public class CrmvalidLoginTest extends BaseTest
{
	public void LoginToApp() throws Throwable
	{
	LoginPage lp= new LoginPage();
	FileLib flib=new FileLib();
	Thread.sleep(2000);
	lp.login(flib.readPropertyData(PROP_PATH, "username"), 
			flib.readPropertyData(PROP_PATH, "password"));
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
	wlib.verify(flib.readPropertyData(PROP_PATH, "homeTitle"),
			wlib.getPageTitle(),
			"CRM Home ");
		
	}

	

}
