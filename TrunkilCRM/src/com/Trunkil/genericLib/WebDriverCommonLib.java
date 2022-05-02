package com.Trunkil.genericLib;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib {

	public String getPageTitle() {
		String title = BaseTest.driver.getTitle();
		return title;
	}

	public void verify(String expected, String actual, String page) {
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed, PASS",true);

	}

	public void waitForPageTitle(String title) 
	//zoho crm homepage
	{
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, 20);
	
		wait.until(ExpectedConditions.titleContains(title));
		
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void selectOption(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element, String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOption(String text, WebElement element ) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void switchToFrame(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		BaseTest.driver.switchTo().frame(element);
	}
	
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}
	
	
	public void rightClick(WebElement element) {
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
	
	
	
	
	public void getFullScreenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void executeJavaScript(String script)
	{
		JavascriptExecutor jse = (JavascriptExecutor)BaseTest.driver;
		jse.executeScript(script);
	}
	
	
	
	public void elementDisplayed(WebElement element, String elementName)
	{
		if(element.isDisplayed())
		{
			Assert.assertTrue(true);
			Reporter.log(elementName+" is Displayed",true );
		}
		else 
		{
			Reporter.log(elementName+"is not Displayed",true );
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
