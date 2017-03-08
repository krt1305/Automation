package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register {
	
	@Test
	public void registerTest()
	{
		System.out.println("In register test");
	}
	
	@AfterMethod
	public void quit()
	{
		System.out.println("In quit method");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=null;
		System.out.println("In data provider");
		return data;
		
	}

}
