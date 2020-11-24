package com.facebook.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass 
{
	WebDriver driver;
	
	public WebDriver startFb(WebDriver driver,String Browser,String appUrl) throws Exception
	{
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dude\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();	
		}
		else if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Browser Not Supported..");
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		Thread.sleep(2000);
	
		return driver;
}

	
}
