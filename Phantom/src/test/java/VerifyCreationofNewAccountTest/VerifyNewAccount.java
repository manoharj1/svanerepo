package VerifyCreationofNewAccountTest;

import org.testng.annotations.Test;

import com.crm.LoginPage.CrmvalidLoginTest;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.pages.AccountsPage;
import com.crm.pages.CreateNewAccountPage;
import com.crm.pages.HomePage;

public class VerifyNewAccount extends BaseTest{
	@Test
	public void verifyNewAccountCreation() throws Throwable 
	{
	CrmvalidLoginTest clt=new CrmvalidLoginTest();
	clt.LoginToApp();
	HomePage hp= new HomePage();
	Thread.sleep(2000);
	hp.clickAccountsTab();
	Thread.sleep(3000);
	AccountsPage ap=new AccountsPage();
	ap.clicknewAccountsbtn();
	Thread.sleep(2000);
	CreateNewAccountPage cnap=new CreateNewAccountPage();
	Thread.sleep(5000);
	FileLib flib= new FileLib();
	String accname=flib.readExcelData(EXCEL_PATH, "Accounts", 0, 1);
	String rating=flib.readExcelData(EXCEL_PATH, "Accounts", 1, 1);		
	String accsite=flib.readExcelData(EXCEL_PATH, "Accounts", 2, 1);
	String phn=flib.readExcelData(EXCEL_PATH, "Accounts", 3, 1);
	String industry=flib.readExcelData(EXCEL_PATH, "Accounts", 4, 1);
	cnap.createAccount(accname, rating, accsite, phn, industry);
	}

}
