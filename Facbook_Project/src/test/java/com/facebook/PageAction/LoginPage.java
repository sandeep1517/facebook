package com.facebook.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	public WebDriver driver;
	
	public LoginPage() throws Exception
	{
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sandeep");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sanddeep");
         driver.findElement(By.xpath("//button[@name='login']")).click();
	
         
	}
	
	
	
}
