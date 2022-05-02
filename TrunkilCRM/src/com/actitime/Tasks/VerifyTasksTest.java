//package com.actitime.Tasks;
//
//import org.testng.Assert;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.Trunkil.Leads.ValidLoginTest;
//import com.Trunkil.genericLib.BaseTest;
//import com.Trunkil.genericLib.FileLib;
//import com.Trunkil.genericLib.WebDriverCommonLib;
//import com.acti time.Pages.HomePage;
////Open the browser enter the test URL 
////Verify Login Page
//@Listeners(com.Trunkil.genericLib.MyListeners.class)
//public class VerifyTasksTest extends BaseTest{
//
//	@Test
//	public void verifyTasks() throws Throwable
//	{
//		//Login to App
//		//Verify Home page
//		ValidLoginTest vl=new ValidLoginTest();
//		vl.loginToApp();
//		//Click on tasks Tab
//		HomePage et=new HomePage();
//		et.clickTasksTab();
//		
//		Assert.fail();
//		//Verify tasks page
//		WebDriverCommonLib wlib=new WebDriverCommonLib();
//		FileLib flib=new FileLib();
//		wlib.verify(flib.readPropertyData(PROP_PATH, "taskTitle"),
//				wlib.getPageTitle(),
//				"Tasks List Page");
//		
//		
//	}
//}
