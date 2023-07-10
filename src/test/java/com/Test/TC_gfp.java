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

import com.pages.gfp_journey_1;
import com.pages.gfp_journey_proposal_2;


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
		int colCount = 31;
		Object[][] dataObj = new Object[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				int rowNum = i;
				rowNum--;
				dataObj[rowNum][j] = row.getCell(j).toString();	
			}
		}
		return dataObj;
	}

	@Test (dataProvider ="excelData")
	public void verify_gfp_journey (
									// Basic Details
									String TC_ID,   String First_Name, String Middle_Name, String Last_Name, String Email_ID, String Mobile_Number, 
									String Gender,String Dob,String Country, String Pincode,  String Education, String Occupation, String anuualIncome, String Employee,
									
									// Invest For 
									String Invest_For , String InvestForGender , String Gender_DOB,String LA_Country, String LA_Pincode, String Gender_Education , String Gender_Ocupation , 
									String Gender_Annual_Income, String PPF , String Amount_Invest , String PPT , String Benefit_Type ,
								
									// Benefit 
									String Endowment_Benifit , String EB_PPPC , String Income_Benefit , String IB_PPPC,
									
									//Personnel Info
									String Maritial_Status
									
									
									) 
	throws Exception {	
		
//=============================================================================================================================================================
		
		log.info("================= || GUARANTED FUTURE PLAN JOURNEY || ===================");
		
		log.info("==================== ||   TEST CASE START || ====================");
		
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
		r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		gfp_journey_1 gfp=PageFactory.initElements(driver, gfp_journey_1.class);
		
//=============================================================================================================================================================
		//=================== Lead Page 1 ===================
		Library.Custom_SendKeys(gfp.getfirstName(), First_Name,"First_Name "+ First_Name );
		Library.Custom_SendKeys(gfp.getmidddleName(), Middle_Name,"Middle_Name " +Middle_Name);
		Library.Custom_SendKeys(gfp.getlastName(), Last_Name,"Last_Name "+ Last_Name);
		Library.Custom_SendKeys(gfp.getemail(), Email_ID, "Email_ID " + Email_ID );
		Library.Custom_SendKeys(gfp.getmobileNumber(), Mobile_Number, "Mobile_Number " + Mobile_Number );
		Library.Custom_Click(gfp.getcontinuebtn(), "Continue - 1");
		
		
		//=================== Lead Page 2 ===================
		//Gender
		if (Gender.equalsIgnoreCase("Female")) {
			Library.Custom_Click(gfp.female(), "Female");
		} else if (Gender ==("Male")){
			Library.custom_print("Click Successfully " + Gender);
		}
		
		Library.Custom_SendKeys(gfp.DOB(),Dob , Dob);
		
		Select countryList = new Select (gfp.country());
		Thread.sleep(2000);
		countryList.selectByVisibleText(Country);
		
		Library.Custom_SendKeys(gfp.getpincode(), Pincode, "Pincode " + Pincode);
		Thread.sleep(3000);
	//	Library.Custom_Click(gfp.getcontinuebtn(), "Continue ");
		Library.Custom_Click(gfp.getcontinuebtn(), "Continue - 2");
		
		WebElement edu = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guidedropdownlist___widget']"));
		Select educationList = new Select(edu);
		Thread.sleep(3000);
		educationList.selectByVisibleText(Education);
		
		WebElement occu = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guideradiobutton___widget']"));
		Select occupationList = new Select (occu);
		Thread.sleep(3000);
		occupationList.selectByVisibleText(Occupation);
		
		Library.Custom_SendKeys(gfp.getannualIncome(), anuualIncome, "Anuual Income " + anuualIncome );
		
		
		if (Employee.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(gfp.empYes(), "Employee " + Employee);
		} else if (Employee.equalsIgnoreCase("No")) {
			Library.custom_print("Click Successfully " + Employee);
		}

		Library.Custom_Click(gfp.getcontinuebtn(), "Continue ");
		
		//=================== Lead Page 3 ===================
		
		if (Invest_For.equalsIgnoreCase("Spouse")) {
			Library.Custom_Click(gfp.spouse(), "Spouse");
			Library.Custom_SendKeys(gfp.spouseFirstName(), "FirstName", "First Name");
			Library.Custom_SendKeys(gfp.spouseMiddleName(), "MiddleName", "Middle Name");
			Library.Custom_SendKeys(gfp.spouseLastName(), "LastName", "Last Name");
			Library.Custom_Click(gfp.getcontinuebtn(), "Continue");
			
			if (InvestForGender.equalsIgnoreCase("Male")) {
				Library.Custom_Click(gfp.spouseMale(), "InvestForGender - " + "Male");
			} else if (InvestForGender.equalsIgnoreCase("Female")) {
				Library.Custom_Click(gfp.spouseFemale(), "InvestForGender - " + "Female");
			} else if (InvestForGender.equalsIgnoreCase("Transgender")) {
				Library.Custom_Click(gfp.spouseTransgender(), "InvestForGender - " + "Transgender");
			}

			Library.Custom_SendKeys(gfp.spouseDob(), Gender_DOB , "DOB " + Gender_DOB);
			Library.Custom_SendKeys(gfp.spouseEmailId(), "abc.12@gmail.com", "Gender Email - abc.12@gmail.com ");
			Library.Custom_SendKeys(gfp.spouseMobileNumber(), "9158949494", "Gender MOB - 9158949494");
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
			Select laCountryList = new Select(gfp.spouseCountry());
			laCountryList.selectByVisibleText(LA_Country);
			
			Library.Custom_SendKeys(gfp.spousePincode(), LA_Pincode, "Pincode - " + LA_Pincode);
			
			WebElement education = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1825705384-guidedropdownlist_99___widget']"));
			Select genderEducationList = new Select(education);
			genderEducationList.selectByVisibleText(Gender_Education);
			
			WebElement ocupation = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_514457067-guideradiobutton_869___widget']"));
			Select ocupationList = new Select(ocupation);
			ocupationList.selectByVisibleText(Gender_Ocupation);
			
			Library.Custom_SendKeys(gfp.spouseAnnualIncome(), Gender_Annual_Income, "Gender Annual Income " + Gender_Annual_Income);
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
		} else if (Invest_For.equalsIgnoreCase("Child")) {
			Library.Custom_Click(gfp.child(), "Child ");
			Library.Custom_SendKeys(gfp.spouseFirstName(), "FirstName", "First Name");
			Library.Custom_SendKeys(gfp.spouseMiddleName(), "MiddleName", "Middle Name");
			Library.Custom_SendKeys(gfp.spouseLastName(), "LastName", "Last Name");
			Library.Custom_Click(gfp.getcontinuebtn(), "Continue");
			
			if (InvestForGender.equalsIgnoreCase("Male")) {
				Library.Custom_Click(gfp.spouseMale(), "InvestForGender - " + "Male");
			} else if (InvestForGender.equalsIgnoreCase("Female")) {
				Library.Custom_Click(gfp.spouseFemale(), "InvestForGender - " + "Female");
			} else if (InvestForGender.equalsIgnoreCase("Transgender")) {
				Library.Custom_Click(gfp.spouseTransgender(), "InvestForGender - " + "Transgender");
			}

			Library.Custom_SendKeys(gfp.spouseDob(), Gender_DOB , "DOB " + Gender_DOB);
			Library.Custom_SendKeys(gfp.spouseEmailId(), "abc.12@gmail.com", "Gender Email - abc.12@gmail.com ");
			Library.Custom_SendKeys(gfp.spouseMobileNumber(), "9158949494", "Gender MOB - 9158949494");
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
			Select laCountryList = new Select(gfp.spouseCountry());
			laCountryList.selectByVisibleText(LA_Country);
			
			Library.Custom_SendKeys(gfp.spousePincode(), LA_Pincode, "Pincode - " + LA_Pincode);
			
			WebElement education = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1825705384-guidedropdownlist_99___widget']"));
			Select genderEducationList = new Select(education);
			genderEducationList.selectByVisibleText(Gender_Education);
			
			WebElement ocupation = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_514457067-guideradiobutton_869___widget']"));
			Select ocupationList = new Select(ocupation);
			ocupationList.selectByVisibleText(Gender_Ocupation);
			
			Library.Custom_SendKeys(gfp.spouseAnnualIncome(), Gender_Annual_Income, "Gender Annual Income " + Gender_Annual_Income);
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
		} else if (Invest_For.equalsIgnoreCase("Grandchild")) {
			Library.Custom_Click(gfp.grandChild(), "Grandchild ");
			Library.Custom_SendKeys(gfp.spouseFirstName(), "FirstName", "First Name");
			Library.Custom_SendKeys(gfp.spouseMiddleName(), "MiddleName", "Middle Name");
			Library.Custom_SendKeys(gfp.spouseLastName(), "LastName", "Last Name");
			Library.Custom_Click(gfp.getcontinuebtn(), "Continue");
			
			if (InvestForGender.equalsIgnoreCase("Male")) {
				Library.Custom_Click(gfp.spouseMale(), "InvestForGender - " + "Male");
			} else if (InvestForGender.equalsIgnoreCase("Female")) {
				Library.Custom_Click(gfp.spouseFemale(), "InvestForGender - " + "Female");
			} else if (InvestForGender.equalsIgnoreCase("Transgender")) {
				Library.Custom_Click(gfp.spouseTransgender(), "InvestForGender - " + "Transgender");
			}

			Library.Custom_SendKeys(gfp.spouseDob(), Gender_DOB , "DOB " + Gender_DOB);
			Library.Custom_SendKeys(gfp.spouseEmailId(), "abc.12@gmail.com", "Gender Email - abc.12@gmail.com ");
			Library.Custom_SendKeys(gfp.spouseMobileNumber(), "9158949494", "Gender MOB - 9158949494");
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
			
			Select laCountryList = new Select(gfp.spouseCountry());
			laCountryList.selectByVisibleText(LA_Country);
			
			Library.Custom_SendKeys(gfp.spousePincode(), LA_Pincode, "Pincode - " + LA_Pincode);
			
			WebElement education = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1825705384-guidedropdownlist_99___widget']"));
			Select genderEducationList = new Select(education);
			genderEducationList.selectByVisibleText(Gender_Education);
			
			WebElement ocupation = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_514457067-guideradiobutton_869___widget']"));
			Select ocupationList = new Select(ocupation);
			ocupationList.selectByVisibleText(Gender_Ocupation);
			
			Library.Custom_SendKeys(gfp.spouseAnnualIncome(), Gender_Annual_Income, "Gender Annual Income " + Gender_Annual_Income);
			Library.Custom_Click(gfp.getcontinuebtn(), "Conitinue ");
			
		} else if (Invest_For.equalsIgnoreCase("Self")) {
			Library.custom_print("Click Successfully " + Invest_For);
		}
							
		//===== PPF =====
		
		if (PPF.equalsIgnoreCase("Half_Yearly")) {
			Library.Custom_Click(gfp.halfYearly(), "Half-Yearly");
		} else if (PPF.equalsIgnoreCase("Quarterly")) {
			Library.Custom_Click(gfp.quarterly(), "Quarterly");
		} else if (PPF.equalsIgnoreCase("Monthly")) {
			Library.Custom_Click(gfp.monthly(), "Monthly");
		} else if (PPF.equalsIgnoreCase("Single")) {
			Library.Custom_Click(gfp.single(), "Single");
		} else if (PPF.equalsIgnoreCase("Annually")) {
			Library.custom_print("Click Successfully " + PPF);
		}
		
		Library.Custom_SendKeys(gfp.amountInvest(), Amount_Invest, "Amount_Invest -" + Amount_Invest );
		
		WebElement ppt = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guidedropdownlist___widget']"));
		Select pptList = new Select(ppt);
		pptList.selectByVisibleText(PPT);
		
		Library.Custom_Click(gfp.getcontinuebtn(), "Continue");
		
		//=================== Lead Page 4 ===================
		
		if (Benefit_Type.equalsIgnoreCase("Regular Income")) {
			Library.Custom_Click(gfp.regularIncome(), "Regular Income");
		} else if(Benefit_Type.equalsIgnoreCase("Lumpsum(Endowment)")) {
			Library.custom_print("Click Successfully " + Benefit_Type);
		}
		
		Library.Custom_Click(gfp.getQuote(), "GET QUOTE");
		
	//==================================================================================================================================================================================	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Endowment Benefit
		if (Endowment_Benifit.equalsIgnoreCase("Second Plan")) {
			Library.Custom_Click(gfp.endowmentBenefit_Second(), "Endowment Benefit ");
		} 
		
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		if (EB_PPPC.equalsIgnoreCase("Y")) {
			Library.Custom_Click(gfp.ebPPPC_check(), "EB PPPC Checked");
		}
		
		// Income Benefit
		if (Income_Benefit.equalsIgnoreCase("Second Plan")) {
			Library.Custom_Click(gfp.incomeBenefit(), "Income Benefit");
			Library.Custom_Click(gfp.incomeBenefit_Second(), "Income Benefit Second");
		}
		
		js.executeScript("window.scrollBy(0,250)", "");
		if (IB_PPPC.equalsIgnoreCase("Y")) {
			Library.Custom_Click(gfp.ibPPPC_check(), "IB PPPC Checked");
		}
	
		Thread.sleep(4000);
		Library.custom_Screenshot_GFP_Benfits(TC_ID);
		
		Library.Custom_Click(gfp.proceed(), "Proceed ");
	
		Thread.sleep(3000);
		Library.Custom_Click(gfp.paylater(), "Pay Later");
		
		Library.Custom_Click(gfp.next(), "NEXT");
		
//============================================================================ Personal Detail  ===================================================================\\

//		gfp_journey_proposal_2  gfp2 =PageFactory.initElements(driver, gfp_journey_proposal_2.class);
//		
//		Library.Custom_SendKeys(gfp2.pancard(), "ERLPP1010A" , "Pancard");
//		Library.Custom_SendKeys(gfp2.fatherName(), "ABC", "Father Name");
//		Library.Custom_SendKeys(gfp2.lastName(), "xyz", "Last Name");
//		Library.Custom_SendKeys(gfp2.motherName(), "ABC", "Mother Name");
//		Library.Custom_SendKeys(gfp2.lastName1(), "xyz", "last Name");
//		
//		// Martial Status
//		if (Maritial_Status.equalsIgnoreCase("Single")) {
//			Library.Custom_Click(gfp2.single(), "Single");
//		} else if (Maritial_Status.equalsIgnoreCase("Married")) {
//			Library.Custom_Click(gfp2.married(), "Married");
//		} else if (Maritial_Status.equalsIgnoreCase("Divorced")) {
//			Library.Custom_Click(gfp2.divorced(), "Divorced");
//		} else if (Maritial_Status.equalsIgnoreCase("Widowed")) {
//			Library.Custom_Click(gfp2.divorced(), "Widowed");
//		}
//		
//		Library.Custom_SendKeys(gfp2.mobileNumber(), "7874514412", "Mobile Number");
//		
//		Select ageProofList = new Select(gfp2.ageProof());
//		ageProofList.selectByVisibleText("PAN card");
//		
//		
//		Select idProofList = new Select(gfp2.idProof());
//		idProofList.selectByVisibleText("Ration Card");
//		
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		
////============================================================================ PROFESSIONAL DETAIL  ===================================================================\\
//
//	
//		Thread.sleep(2000);
//		Select natureOfDutyList = new Select(gfp2.natureOfDuty());
//		Thread.sleep(4000);
//		natureOfDutyList.selectByVisibleText("Others");
//		
//		Library.Custom_SendKeys(gfp2.provideDetail(), "ABC", "Provide Detail");
//		Library.Custom_SendKeys(gfp2.orgnizationName(), "abc", "Orgnization Name - Canara_HSBC_LIFE_Insurance");
//		Library.Custom_SendKeys(gfp2.pincode(), "431003", "Pincode");
//		Library.Custom_SendKeys(gfp2.address(), "Aurangabad", "Address");
//		Library.Custom_SendKeys(gfp2.orgnizationCity(), "Gurgaon", "Ognization City - Gurgaon");
//		Library.Custom_Click(gfp2.moneyServiceBusiness_No(), "Money Service Business - NO");
//		Library.Custom_Click(gfp2.riskAssociate_No(), "Risk Associate - NO");
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		
////============================================================================ CONTACT DETAIL  ===================================================================\\
//		
//		Library.Custom_SendKeys(gfp2.addressLine(), "ABC", "Address Line");
//		
//		Select cAddProof = new Select(gfp2.currentAddProof());
//		cAddProof.selectByVisibleText("Ration Card");
//		
//		Library.Custom_Click(gfp2.residenceInJapan_NO(), "Residence In Japan - NO");
//		Library.Custom_Click(gfp2.eInsurance(), "E-insurance Account - NO");
//		Library.Custom_SendKeys(gfp2.cityOfBirth(), "Gurgaon", "City Of Birth - Gurgaon");
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		
////============================================================================ Insurance Detail  ===================================================================\\
//		
//		Library.Custom_Click(gfp2.policiesFiveYr_No(), "policies since last 5 years - NO");
//		Library.Custom_Click(gfp2.modifiedTerms_NO(), "accepted with modified terms - NO");
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		
////============================================================================ Nominee Detail  ===================================================================\\
//
//		Library.Custom_SendKeys(gfp2.nomineFirstName(), "Dilip", "Nomine First Name - Dilip");
//		Library.Custom_SendKeys(gfp2.nomineLastName(), "M", "Nomine First Name - M ");
//		Library.Custom_SendKeys(gfp2.nomineDOB(), "28/09/1999", "Nominee DOB - 28/09/1999");
//		Library.Custom_Click(gfp2.nomineMale(), "Gender - Male");
//		Library.Custom_SendKeys(gfp2.nomineMobileNumber(), "7878747472", "Noimee Mob Num. - 7878747472 ");
//		Library.Custom_SendKeys(gfp2.nomineEmail(), "abc.12@gmail.com", "Nominee Email - abc.12@gmail.com");
//		
//		Select nomineRelationList = new Select(gfp2.nomineRelation());
//		nomineRelationList.selectByVisibleText("Brother");
//		
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		Thread.sleep(2000);
//		Library.Custom_Click(gfp2.proceed(), "Proceed");
//		
////============================================================================ Bank Detail  ===================================================================\\
//		
//		Library.Custom_SendKeys(gfp2.accountNo(), "123456123456", "Account No - 123456123456");
//		Library.Custom_SendKeys(gfp2.reenterAccountNo(), "123456123456", "Re-enter Account No - 123456123456");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		log.info("================== || TEST SUCCESSFULLY EXECUTE ||================");

	
		
		

	}	
}
