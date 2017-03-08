package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Disable_2_fa {
	
	@Test
	public void disable()
	{
		System.out.println("In disable 2 fa");
	}
	
	@Test
	public void disable1()
	{
		System.out.println("In disable 1 funtion of disable 2 fa ");
	}
	
	@Test
	public void disable2()
	{
		System.out.println("In disable2 funtion oof disable 2 fa");
	}
	
	@AfterMethod
	public void quit()
	{
		System.out.println("In quit method of disable 2fa");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=null;
		System.out.println("In data provider of disable 2 fa test");
		return data;
		
	}

}
