package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Enable_2_fa {

	@Test
	public void enable()
	{
		System.out.println("In Enable 2 fa test");
	}

	@AfterMethod
	public void quit()
	{
		
		System.out.println("Quitting enable 2 fa test");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=null;
		System.out.println("In data provider of enable 2 fa test");
		return data;
		
	}
	
}

