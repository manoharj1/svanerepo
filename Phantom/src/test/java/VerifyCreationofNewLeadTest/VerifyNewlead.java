package VerifyCreationofNewLeadTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.LoginPage.CrmvalidLoginTest;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.pages.CreateNewLeadPage;
import com.crm.pages.HomePage;
import com.crm.pages.LeadsPage;

@Listeners(com.crm.genericLib.MyListeners.class)
public class VerifyNewlead extends BaseTest {

	@Test
	public void verifyLeadCreation() throws Throwable {
		CrmvalidLoginTest clt = new CrmvalidLoginTest();
		clt.LoginToApp();
		HomePage hp= new HomePage();
		hp.clickLeadsTab();
		Thread.sleep(3000);
		LeadsPage lp = new LeadsPage();;
		lp.clicknewleadbtn();
		CreateNewLeadPage cnl = new CreateNewLeadPage();
		FileLib flib = new FileLib();
		String sal = flib.readExcelData(EXCEL_PATH, "Leads", 0, 1);
		String comp = flib.readExcelData(EXCEL_PATH, "Leads", 1, 1);
		String last = flib.readExcelData(EXCEL_PATH, "Leads", 2, 1);
		String leadsrc = flib.readExcelData(EXCEL_PATH, "Leads", 3, 1);
		cnl.createLead(sal,comp,last,leadsrc);
	}
}
