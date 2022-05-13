package com.trunkilCRM.validateaccounts;

import org.testng.annotations.Test;

import com.Trunkil.Leads.ValidLoginTest;
import com.Trunkil.genericLib.BaseTest;
import com.Trunkil.genericLib.FileLib;
import com.Trunkil.genericLib.WebDriverCommonLib;
import com.actitime.Pages.ContactsPage;
import com.actitime.Pages.CreateContacts;
import com.actitime.Pages.HomePage;

public class ValidateContacts extends BaseTest {

@Test
public void verifyContacts() throws Throwable
{
	
	ValidLoginTest vl=new ValidLoginTest();
	vl.loginToApp();
	
	HomePage hp=new HomePage();
	hp.clickContactsTab();
	
	Thread.sleep(5000);
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	ContactsPage cp=new ContactsPage();
	Thread.sleep(5000);
	wb.elementDisplayed(cp.getcontactsTextAddress(), "contcts page");
	cp.clickOnNewContactsTab();
	
	
	CreateContacts cc=new CreateContacts();
	 FileLib fl=new FileLib();
String	firstName= fl.readExcelData(EXCEL_PATH, "Contacts",0,1);
String firstnametxt=fl.readExcelData(EXCEL_PATH,"Contacts",1,1);
String leadsrc=fl.readExcelData(EXCEL_PATH, "Contacts",2,1);
String lastname=fl.readExcelData(EXCEL_PATH, "Contacts",3,1);
String accname=fl.readExcelData(EXCEL_PATH, "Contacts",4,1);
String emailtext=fl.readExcelData(EXCEL_PATH, "contacts", 5, 1);

cc.createNewAccount(firstName,firstnametxt,leadsrc,lastname,accname,emailtext);

cc.clickOnSaveButton();

}//test

}//class
