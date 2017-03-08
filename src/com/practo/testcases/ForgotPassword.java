package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ForgotPassword 
{

	@Test
	public void forgotPasswordTest()
	{
		System.out.println("In forgot password test");
	}
	
	
	@AfterMethod
	public void quit()
	{
		System.out.println("In quit method of forgot password test");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=null;
		System.out.println("In getdata of forgot password test");
		return data;
		
	}
	
}

