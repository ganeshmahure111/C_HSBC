package com.Test;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.gfp_journey;

import com.utility.Base_Class;
import com.utility.Library;
@Listeners(com.utility.Listner.class) 

public class TC_gfp  extends Base_Class {
	
	@DataProvider(name="excelData")
	public Object[][] testExcel() throws IOException {
		String filepath = System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("GFP");
		int rowCount=sheet.getLastRowNum();
		
		Object[][] dataObj= new Object[rowCount][18];
		
		for(int i=1;i<=rowCount;i++) {
			Row row=sheet.getRow(i);
			int colCount=9;
			for(int j=0;j<colCount;j++) {
				int rowNum=i;rowNum--;
				dataObj[rowNum][j]=row.getCell(j).toString();
			
			}
		}
		return dataObj;
	}
	
	

	@Test (dataProvider ="excelData")
	public void verify_gfp_journey (String TC_ID,   String First_Name, String Middle_Name, String Last_Name, String Email_ID,String Mobile_Number, 
									String Gender,  String Dob,        String consume_tobacco,      String occu,      String edu,     String annualIncome, 
									String Emp,     String sum,        String policy_term, String pay,       String Payment_Term, 
									String Life_cover) 
	throws Exception {	
		
//=============================================================================================================================================================
		
		log.info("================= || GUARANTED FUTURE PLAN JOURNEY || ===================");
		
		log.info("==================== ||   TEST CASE START || ====================");
		
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
		r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		gfp_journey gfp=PageFactory.initElements(driver, gfp_journey.class);
		
		Library.Custom_SendKeys(gfp.getfirstName(), First_Name,"First_Name "+ First_Name );
		Library.Custom_SendKeys(gfp.getmidddleName(), Middle_Name,"Middle_Name " +Middle_Name);
		Library.Custom_SendKeys(gfp.getlastName(), Last_Name,"Last_Name "+ Last_Name);
		Library.Custom_SendKeys(gfp.getemail(), Email_ID, "Email_ID " + Email_ID );
		Library.Custom_SendKeys(gfp.getmobileNumber(), Mobile_Number, "Mobile_Number " + Mobile_Number );
		Library.Custom_Click(gfp.getcontinuebtn(), "Continue - 1");

		
		
	
																						
		log.info("================== || TEST SUCCESSFULLY EXECUTE ||================");


		
		

	}	
}
