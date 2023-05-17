package com.wipro.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.pages.RegistrationPage;
import com.wipro.testbase.Initialization;
import com.wipro.utilities.ExcelUtils;

public class ExcelWorking   {
	
	
	
	/*@Test(dataProvider="registrationTest")
	public void test1(String U_Name, String E_ID, String Pass) {
		System.out.println(U_Name+" | "+E_ID+" |"+Pass+"| ");
	}
	@Test(dataProvider="accDetailsTest")
	public void test2(String U_name, String Pass, String D_name) {
		System.out.println("Sheet2: "+U_name+" "+Pass+" "+D_name);
	}
	@Test(dataProvider="cartPageTest")
	public void test3(String user,String pass,String product,String first,String last,String company,String street,String apartment,String city,String pin, String email,String comment) {
		System.out.println("Sheet3: "+user+" "+pass+" "+product+" "+first+" "+last+" "+company+" "+street+" "+apartment+" "+city+" "+pin+" "+email+" "+comment);
	}
	@Test(dataProvider="cartPage1Test")
	public void test4(String U_Name,String Pass, String product) {
		System.out.println("Sheet 4: "+U_Name+" | "+Pass+" |"+product+"| ");
	}
	
   
	@DataProvider(name="registrationTest")
	public Object[][]  getData() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata";
		Object data[][] = registrationTest(excelPath,"Sheet1");
		return data;
	}
	@DataProvider(name="accDetailsTest")
	public Object[][]getData1() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata";
		Object[][] data = accDetailsTest(excelPath,"Sheet2");
		return data;
	}
	@DataProvider(name="cartPageTest")
	public Object[][]getData2() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata";
		Object[][] data = cartPageTest(excelPath,"Sheet3");
		return data;
	}
	@DataProvider(name="cartPage1Test")
	public Object[][]getData3() {
		String excelPath = "C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata";
		Object[][] data = cartPage1Test(excelPath,"Sheet4");
		return data;
	}*/
	
	public Object[][] registrationTest(String excelPath, String sheetName) {
	  //ObjRegistrationPage = new RegistrationPage (driver);
	 // ObjRegistrationPage.clickMyAccount(); 
	 ExcelUtils excelRegister = new ExcelUtils("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx","Sheet1");
	 int rowCount=  excelRegister.getRowCount();
	 int colCount = excelRegister.getColCount();
	/* System.out.println("Rows: "+rowCount);
	 System.out.println("Column: "+colCount);*/
	 
	 Object data[][] = new Object[rowCount-1][colCount];
	 
	 for(int i=1;i<rowCount;i++) {
		 for(int j=0;j<colCount;j++) {
			 String cellData = excelRegister.getCellData(i, j);
			 //System.out.println(cellData+" ");
			 data[i-1][j]=cellData;
			 
		 }
	 }
	 return data;
	 
  }
	public Object[][] accDetailsTest(String excelPath, String sheetName){
		ExcelUtils excelAccDetails = new ExcelUtils("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx","Sheet2");
		int rowCount=  excelAccDetails.getRowCount();
		int colCount = excelAccDetails.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		//System.out.println("Sheet 2:"+data);
		for(int i=1;i<rowCount;i++) {
			 for(int j=0;j<colCount;j++) {
				 String cellData = excelAccDetails.getCellData(i, j);
				 //System.out.println(cellData+" ");
				 data[i-1][j]=cellData;
				 
			 }
		 }
		 return data;	
	}
	public Object[][] cartPageTest(String excelPath,String sheetName){
		ExcelUtils excelCartPageTest = new ExcelUtils ("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx","Sheet3");
		int rowCount=  excelCartPageTest.getRowCount();
		int colCount = excelCartPageTest.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			 for(int j=0;j<colCount;j++) {
				 String cellData = excelCartPageTest.getCellData(i, j);
				 //System.out.println(cellData+" ");
				 data[i-1][j]=cellData;
				 
			 }
		 }
		 return data;
	}
	public Object[][] cartPage1Test(String excelPath, String sheetName) {
		 ExcelUtils excelcartPage1 = new ExcelUtils("C:\\Users\\Shubham Kumbhar\\eclipse-workspace\\Selenium-L2-Assignments\\src\\testdata\\ExcelData.xlsx","Sheet4");
		 int rowCount=  excelcartPage1.getRowCount();
		 int colCount = excelcartPage1.getColCount();
		 
		 Object data[][] = new Object[rowCount-1][colCount];
		 
		 for(int i=1;i<rowCount;i++) {
			 for(int j=0;j<colCount;j++) {
				 String cellData = excelcartPage1.getCellData(i, j);
				 //System.out.println(cellData+" ");
				 data[i-1][j]=cellData;
				 
			 }
		 }
		 return data;		
	}
}
