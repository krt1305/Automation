package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginTest()
	{
		System.out.println("In login test");
	}
	
	@AfterMethod
	public void quit()
	{
		System.out.println("After quitting Login");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		System.out.println("In get data function");
		return null;
	}

}
