package VerifyLeadsTest;

import org.testng.annotations.Test;

import com.crm.LoginPage.CrmvalidLoginTest;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.genericLib.WebDriverCommonLib;
import com.crm.pages.HomePage;
import com.crm.pages.LeadsPage;
import com.crm.pages.LoginPage;

public class verifyleadsTest extends BaseTest {

	@Test
	public void vverifyleadstest() throws Throwable
	{
		CrmvalidLoginTest cvr=new CrmvalidLoginTest();
	cvr.LoginToApp();
	
	HomePage hp=new HomePage();
	hp.clickLeadsTab();
	
	LeadsPage lp=new LeadsPage();
	WebDriverCommonLib wl=new WebDriverCommonLib();
	wl.elementDisplayed(lp.getLeadsTextAddr(), "leadspage");
	}
	

	
	
}
