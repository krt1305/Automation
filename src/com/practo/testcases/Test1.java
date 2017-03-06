package com.practo.testcases;
import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.practo.base.BaseClass;
import com.practo.util.ExtentManager;
import com.qtpselenium.hybrid.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 extends BaseClass{
	
	
	@BeforeMethod
	public void init()
	{
	}
	
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
	
	@DataProvider
	public Object[][] getData()
	{
		
		Xls_Reader xls =new Xls_Reader("/Users/rabiatabassum/Desktop/testing.xlsx");
		int rows=xls.getRowCount("Sheet1");
		System.out.println("Total no of rows "+rows);
		int cols=xls.getColumnCount("Sheet1");
		System.out.println("Total no of cols "+cols);
		
		xls.setCellData("Sheet1", "c", 1, "abc");
		
		String sheet="Data";
		String testcaseName="TestA";
		
		int testStartNum=1;
		while(!xls.getCellData("Data", 0, testStartNum).equals(testcaseName))
		{
			testStartNum++;
		}

		System.out.println("Test starts at"+ testStartNum);
		
		int dataStartRowNum=testStartNum+2;
		int columnStartNum=testStartNum+1;
		System.out.println("Data starts at "+dataStartRowNum);
		System.out.println("Column starts at"+columnStartNum);
		
		//Calcualte total no of rows in the test
		int totalRows = 0;
	
		
		System.out.println("Data "+xls.getCellData("Data",1 , dataStartRowNum));
		while(!xls.getCellData("Data", 1, dataStartRowNum).equals(""))
		{
			System.out.println("Inside while");
			totalRows=totalRows+1;
		}
	
		//Calcualte total no of cols in the test
		int totalCols=0;
		while(xls.getCellData("Data", 1, dataStartRowNum)!= "")
		{
			System.out.println("Inside while");
			totalRows=totalRows+1;
		}
		
		System.out.println("Total number of rows in the test are"+totalRows);
		int dataRow=0;
		Object [][] data=new Object[rows][1];
		Hashtable <String,String> table=null;
		for(int r=dataStartRowNum;r<=dataStartRowNum+rows;r++)
		{
			table=new Hashtable();
			for(int c=0;c<totalCols;c++)
			{
				String key=xls.getCellData("Data", c, columnStartNum);
				String value=xls.getCellData("Data", c, r);
			}
			
		}
		data[dataRow][0]=table;
		dataRow++;
		
		return data;
		
	}
}
