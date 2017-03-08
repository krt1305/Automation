package com.practo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChangePassword {

	
	
	@Test
	public void changePassword()
	{
		System.out.println("In Change Password test");
	}
	
	
	@AfterMethod
	public void quit()
	{
		System.out.println("Quitting change password test");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return null;
		
	}
	
}
	