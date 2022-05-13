package com.crm.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {
	public static void main(String args[]) {

		// set path of report
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"C:\\Users\\91897\\Desktop\\crm\\Phantom\\ExtentReport\\myreport.html");
		ExtentReports extent = new ExtentReports();
		// give settings of the report
		spark.config().setDocumentTitle("CRM report");
		spark.config().setReportName("Extent report");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);

		// create test info reports
		ExtentTest test = extent.createTest(" crm home button is clickable").createNode("CRM").assignAuthor("Manohar Joshi").assignCategory("SmokeTests");
		// give various status of test steps
		test.info(MarkupHelper.createLabel("login page is dispalyed", ExtentColor.BLUE));
		test.pass(MarkupHelper.createLabel("element displayed", ExtentColor.GREEN));
		test.fail(MarkupHelper.createLabel("crm home button is not clickable", ExtentColor.RED));
		
		// create test info reports
				ExtentTest test1 = extent.createTest(" crm home button is clickable").createNode("CRM").assignAuthor("Manohar Joshi").assignCategory("RegrTests");
				// give various status of test steps
				test1.info(MarkupHelper.createLabel("login page is dispalyed", ExtentColor.BLUE));
				test1.pass(MarkupHelper.createLabel("element displayed", ExtentColor.GREEN));

		// save the report
		extent.flush();

	}
}
