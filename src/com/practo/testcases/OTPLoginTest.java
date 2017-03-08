package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OTPLoginTest {
	
	@Test
	public void loginTest()
	{
		System.out.println("IN otp login test");
	}

	
	@AfterMethod
	public void quit()
	{
		System.out.println("Quitting OTP login test");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=null;
		System.out.println("In get data of OTP login Test");
		return data;
		
	}
}
