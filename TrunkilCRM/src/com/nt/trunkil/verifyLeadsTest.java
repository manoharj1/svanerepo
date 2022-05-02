package com.nt.trunkil;

import org.testng.annotations.Test;

import com.Trunkil.Leads.ValidLoginTest;
import com.Trunkil.genericLib.BaseTest;
import com.Trunkil.genericLib.WebDriverCommonLib;
import com.actitime.Pages.HomePage;
import com.actitime.Pages.LeadsPage;

public class verifyLeadsTest extends BaseTest {

@Test
public void verifyleadstext() throws Throwable{
	
	ValidLoginTest vl=new ValidLoginTest();
	vl.loginToApp();
	
	HomePage hp=new HomePage();
	hp.clickLeadsButton();
	
	
	LeadsPage lp=new LeadsPage();
	WebDriverCommonLib wcd=new WebDriverCommonLib();
	wcd.elementDisplayed(lp.getleadsTextAddrs(), "leadspage");
	
	
	
}










}
