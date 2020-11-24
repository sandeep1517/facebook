package com.facebook.mainRun;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.facebook.BaseClass.DriverClass;
import com.facebook.PageAction.LoginPage;
import com.facebook.Utility.confiqFile;
import com.facebook.pageObject.loginPageObject;

public class MainProRun
{

   static WebDriver driver;
   @Test(priority=1)
	public void start() throws Exception 
	{
	    DriverClass df=new DriverClass();
	    confiqFile con=new confiqFile();
	    df.startFb(driver,con.getbrowser(),con.getappUrl());
	    
  	}
   @Test(priority=2)
   public void login() throws Exception
   {
	   LoginPage l=new LoginPage();
   }
  
  
}
