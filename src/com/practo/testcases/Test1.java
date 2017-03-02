package com.practo.testcases;
import org.testng.annotations.Test;
import com.practo.base.BaseClass;
import com.practo.util.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Test1 extends BaseClass{

	@Test
	public void function1()
	{
		
		ExtentReports rep=ExtentManager.getInstance();
		ExtentTest test=rep.startTest("Started Test");	
		System.out.println("Hello");
	}
	
	public void frunction2()
	{
		
	}
}
