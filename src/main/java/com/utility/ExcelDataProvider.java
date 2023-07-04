package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider () throws Exception 
	{	
	//	String filepath = "C:\\Users\\30007473\\eclipse-workspace\\C_HSBC_Insurance\\TestData\\Data.xlsx";
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";

		
		FileInputStream fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);	
	}
	
	public String getStringData(String SheetName, int row, int cell) 
	{
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
	public XSSFSheet getSheet(String SheetName) 
	{
		return wb.getSheet(SheetName);
	}
	

}
