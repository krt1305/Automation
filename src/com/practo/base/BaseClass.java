package com.practo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public void openBrowser(String browser)
	{
		if(browser.equals("FF"))
		{
			
			driver=new FirefoxDriver();	
			
		}
		else if(browser.equals("Chrome"))
		{
			
		}
		
		if(prop==null)
		{
			prop=new Properties();
			try 
			{
				FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/config.properties");
			} 
			catch (FileNotFoundException e) 
			{
		
				e.printStackTrace();
			}
		}
		
	}
	
	public void navigate(String url)
	{
		driver.get(url);
	}
	
	
	
/*******************************************validations********************************
 * 
 */
	public boolean verifyTitle()
	{
		return false;
		
	}
	public boolean isElementPresent()
	{
		return false;
		
	}
	
	
	/*******************************************Reporting********************************
	 * 
	 */
	
	
	

}
