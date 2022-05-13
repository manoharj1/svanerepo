package VerifyContactsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.LoginPage.CrmvalidLoginTest;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.WebDriverCommonLib;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
public class verifycontactstest extends BaseTest
{
	@Test
	public void verifycontactstext() throws Throwable
	{
		CrmvalidLoginTest vlt= new CrmvalidLoginTest();
		vlt.LoginToApp();
		HomePage hp= new HomePage();
		hp.clickContactsTab();
		ContactsPage cp=new ContactsPage();
		Thread.sleep(3000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getContactsTab(), "contacts page");
		
		
	}
	
}
