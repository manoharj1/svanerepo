package com.crm.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListeners implements ITestListener{

	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
//		Reporter.log(result.getName()+" method started",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" is started", ExtentColor.BLUE));
	}

	public void onTestSuccess(ITestResult result) {
//		Reporter.log(result.getName()+" method passed",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" is PASSED", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
//		Reporter.log(result.getName()+" method failed",true);
//		WebDriverCommonLib wlib=new WebDriverCommonLib();
//		wlib.getFullScreenshot("./screenshots/"+result.getName()+".jpg");
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" is FAILED", ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {
//		Reporter.log(result.getName()+" method skipped",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" is SKIPPED", ExtentColor.ORANGE));
	}

	public void onStart(ITestContext context) {
//		Reporter.log(context.getName()+" started",true);
		 spark = new ExtentSparkReporter(
				IAutoConsts.REPORT_PATH);
		 extent = new ExtentReports();
		// give settings of the report
		spark.config().setDocumentTitle("CRM report");
		spark.config().setReportName("Extent report");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
	}

	public void onFinish(ITestContext context) {
//		Reporter.log(context.getName()+" ended",true);
		extent.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	
}
