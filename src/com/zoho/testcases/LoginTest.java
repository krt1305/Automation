package com.zoho.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.practo.util.DataUtil;
import com.qtpselenium.hybrid.util.Xls_Reader;

public class LoginTest {
	
	
	String testCaseName="LoginTest";
	SoftAssert softAssert;
	Xls_Reader xls;
	
	@Test(dataProvider="getData")
	public void Test1(Hashtable <String,String> data)	
	{
		//test=rep.sstartTest("Dummy test");
		//test.log(LogStatus.INFO, "Starting the test ");
		if(!(DataUtil.isRunnable(testCaseName, xls)) || data.get("Runmode").equals("N"))
		{
			System.out.println("Skipping test");
			throw new SkipException("Skipping the test as runmode is N");
		}
		else
		{
			System.out.println("Not skipping the test");
		}
			
	}
	@AfterMethod
	public void quit()
	{
		
		try
		{
			softAssert.assertAll();
		}
		catch(Error e)
		{ 
		
		}
		//rep.endTest(test);
		//rep.flush();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		xls =new Xls_Reader("/Users/rabiatabassum/Desktop/testing.xlsx");
		return DataUtil.getTestData(xls, testCaseName);
	}	

}
