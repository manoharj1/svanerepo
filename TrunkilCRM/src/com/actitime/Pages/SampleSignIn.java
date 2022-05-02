package com.actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSignIn {

	@Test
public void 	sampleSignInMethod()
	{
		
		System.setProperty("webdriver.chrome.driver", "Z:\\chrome driver 98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.233.128:8080/");
String title=driver.getTitle();
System.out.println(title);
	}
	
	
	
	
	
}
