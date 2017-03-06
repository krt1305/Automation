package com.qtpselenium.hybrid.util;
import java.util.Hashtable;

public class TestReading {

	public static void main(String[] args) 
	{	
		Xls_Reader xls =new Xls_Reader("/Users/rabiatabassum/Desktop/testing.xlsx");
		int rows=xls.getRowCount("Sheet1");
		System.out.println("Total no of rows "+rows);
		int cols=xls.getColumnCount("Sheet1");
		System.out.println("Total no of cols "+cols);			
		String sheet="Data";
		String testcaseName="TestA";
	
		int testStartNum=1;
		while(!xls.getCellData("Data", 0, testStartNum).equals(testcaseName))
		{

			testStartNum++;
		}

		System.out.println("Test starts at"+ testStartNum);
		int dataStartRowNum=testStartNum+2;
		int columnStartNum=1;
		int totalRows = 0;
		int totalCols=0;
		System.out.println("Test starts at "+testStartNum);
		System.out.println("Data starts at "+dataStartRowNum);
        int dataStartCount=dataStartRowNum;
        
        //Read the total no of rows in the test        
		while(!xls.getCellData("Data", 0, dataStartCount).equals(""))
		{
			totalRows=totalRows+1;
			dataStartCount=dataStartCount+1;
		}
	
		System.out.println("Total no of rows in Test --------->" +totalRows);
	
		//Read the total no of columns in the test
		System.out.println("Column count is starting in row number "+dataStartRowNum);
		System.out.println("Col Data is ------->" +xls.getCellData("Data", 1, dataStartRowNum+1));
		int tempColumnCount=dataStartRowNum;
	    while(!xls.getCellData("Data", 0, tempColumnCount).equals(""))  	
	    {
    
	    	totalCols=totalCols+1;
	    	tempColumnCount=tempColumnCount+1;
	    	
	    }
	       
	//    System.out.println("Total no of cols in the Test -------->" +totalCols);	
	    
	    String excelData[][] = null;
	    String tempData;
	    
	   	//Reading the data	
	    System.out.println("************************************************************");
		for(int r=0;r<=totalRows;r++)
		{
			for(int c=0;c<=totalCols;c++)
			{
		
		        tempData=xls.getCellData("Data", c, dataStartRowNum);
		        System.out.println("Row no  ----> "+dataStartRowNum +"Col no  ------> "+c+ "Data---------> "+tempData);
		     //   excelData[r][c]=tempData;
				
			}
		//	System.out.println("After row "+r);
			
		}
		
		int dataRow=0;
		Object [][] data=new Object[rows][1];
		Hashtable <String,String> table=null;
			
	/*	for(int r=dataStartRowNum;r<=dataStartRowNum+rows;r++)
		{
			table=new Hashtable();
			for(int c=0;c<totalCols;c++)
			{
				String key=xls.getCellData("Data", c, columnStartNum);
				String value=xls.getCellData("Data", c, r);
				System.out.println("Key ---------> "+key + " Value -----------> "+value);
	
			}
			System.out.println("After row "+r);
			
		}
		
		*/
		System.out.println("Data start row num is "+dataStartRowNum);
		int keyRow=dataStartRowNum-1;
		System.out.println("Key row value is "+keyRow);
		System.out.println("Column start num is"+columnStartNum);
		for(int r=keyRow;r<=totalRows;r++)
		{
			
			table=new Hashtable();
			for(int c=0;c<totalCols;c++)
			{
				
				String key=xls.getCellData("Data", c, keyRow);
				String value=xls.getCellData("Data", c, dataStartRowNum);
				System.out.println("Key ---------> "+key + " Value -----------> "+value);
	
			}
			System.out.println("After row "+r);
			
		}
		
		System.out.println("Total data rows id "+dataRow);
		data[dataRow][0]=table;
		dataRow++;	
		System.out.println("Data is "+ data);
		
			
	}

}
