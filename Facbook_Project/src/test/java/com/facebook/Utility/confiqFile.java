package com.facebook.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class confiqFile
{
	Properties pro;
	
	public confiqFile() throws Exception
	{
    
	File src=new File("C:\\Users\\dude\\workspace\\Facbook_Project\\Confiq\\config.Properties");
	
    FileInputStream fis=new FileInputStream(src);
	
	pro=new Properties();

	pro.load(fis);
	System.out.println("file Upload");
	}
	
	public String getbrowser() 
	{
		String data=pro.getProperty("Browser");
		return data;
    }
	public String getappUrl()
	{
		String data=pro.getProperty("appUrl");
		return data;
	}
}
