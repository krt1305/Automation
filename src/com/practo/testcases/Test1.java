package com.practo.testcases;
import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.practo.base.BaseClass;
import com.practo.util.DataUtil;
import com.practo.util.ExtentManager;
import com.qtpselenium.hybrid.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 extends BaseClass{

	String testCaseName="TestA";
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
