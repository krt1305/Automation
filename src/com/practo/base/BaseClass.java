package com.practo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.practo.util.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class BaseClass {
	
	public ExtentReports rep=ExtentManager.getInstance();
	public ExtentTest test;
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
	
	
	public void reportPass(String msg)
	{
		test.log(LogStatus.PASS, msg);
	}
	
	public void reportFail(String msg)
	{
		test.log(LogStatus.FAIL, msg);
		takesScreenShot();
	
	}
	
	public void takesScreenShot()
	{
		
	}
	
	
	
	public boolean isElementpresent(String xpath)
	{
		
		List <WebElement> elem=driver.findElements(By.xpath(xpath));
		if(elem.size() >0)
			return true;
		else
		    return false;
		
	}
	

}
