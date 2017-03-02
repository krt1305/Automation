package com.practo.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.practo.base.BaseClass;
import com.practo.util.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 extends BaseClass{
	
	@Test
	public void function1()
	{
		test=rep.startTest("Started test");
		test.log(LogStatus.INFO, "Started Test C");
		test.log(LogStatus.FAIL, "Failed Test C");
		System.out.println("Hello");
	}
	
	@AfterMethod
	public void quit()
	{
		rep.endTest(test);
		rep.flush();
	}
}
