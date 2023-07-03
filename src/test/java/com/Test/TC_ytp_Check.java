package com.Test;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.ytp_HealthForm;
import com.pages.ytp_journey_1;
import com.pages.ytp_personnel_detail;
import com.pages.ytp_professional_detail;
import com.utility.Base_Class;
import com.utility.Library;


@Listeners(com.utility.Listner.class) 

public class TC_ytp_Check  extends Base_Class {

	@DataProvider(name="excelData")
	public Object[][] testExcel() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("YTP");
		int rowCount=sheet.getLastRowNum();
		int colCount=113;
		Object[][] dataObj= new Object[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				int rowNum=i;rowNum--;
				dataObj[rowNum][j]=row.getCell(j).toString();
			}
		}
		return dataObj;
	}
	

	@Test(dataProvider ="excelData")
	public void verify_ytp_journey
		(
			//Basic Detail
			String TC_ID,  String First_Name, String Middle_Name, String Last_Name, String Email_ID, String Mobile_Number, 
			String Gender, String Dob,        String consume_tobacco, 
			String occu,   String edu,        String annualIncome, 
			String Emp, 
			//Sum Assured
			String sum,    String policy_term,String pay, String Payment_Term, String rop ,
			//Life Secure
			String Life_cover , String Payout_Type, String Monthly_Income, String Proportion, String MIO ,
			//Rider
			String CI_PPPChecked, String ci_ppp,String CI_PPChecked, String ADBChecked, String adb, String ATPD_PPPChecked, String atpd_PPP,  String ATPD_PPChecked,  String TI_Checked , String TI, String BYP_Checked , String Percentage,  String CCB_Checked , String ccb , 
			
			String pan,    String pincode, String NauturOfDuty,
			String payment,
			
			//Proposal  [ Personal Detail ]
			String adhar, String fatherName,  String middleName,   String lastName,  String motherName,  String middleName1,  String lastName1,  String martialStatus, String mobileNum, String  politically_Exposed_Person, String Person_Exposed_Politically, String Relation_With_Person, 
			String  Source_Of_Income, String Name_Of_Political_Party, String Role_Of_Person, String Any_Crminial_Case, String criminal_Charges,  String  ageProof,String VP_num, String Vp_Exp_Date, String VID_4digit, String VDL_Num, String VDL_Exp_date, String IdProof, 
			String VP_Id_Proof_Num, String VP_Id_Proof_Exp_Date, String VID_Id_Proof_4digit, String NREGA, String VDL_Id_Proof_Num, String VDL_Exp_Date, String Voter_Id,
			
			//Proposal [ Professional Detail ]
			String Orgnization_Name, String pincode_zip, String state_List, String adress, String Orgnization_City, String Nature_OF_Duty, String Exact_Nature_OF_Duty, String Provide_Detail, String Exact_Nature_Of_Job_Title ,String Percentage_Of_Duties_Manual,
			String typeOfVesselWork, String DateOfEntry, String CountriesDockIn, String CurrentEmpWithinIndia, String Industry_Name, String Nature_OF_Work, String Provide_Details, String rickAssocite, String Provide_Details_1,
		
			//Contact Detail
			String address, String addressProof, String cityOfBirth , String insurance, String Account_Num, String insuranceRepository,
			
			//INSURANCE DETAIL
			String activePolicies, String insuranceCompany, String sumAssured, String Status,
			
			//Nominee Detail
			String Nomine_FirstName, String Nomine_LastName, String Nominee_DOB, String Nominee_Gender, String Nominee_MobNum, String Nominee_Email, String Relationship, String sharePercent,
			
			//Lifestyle & Health 
			String Height, String Weight, String Consumption_Qty, String Consumption_Year
			
		) throws Exception {
		
		
//=======================================================================================================================================================
//Lead Page 1	
		
		
		log.info("================== || YOUNG TERM PLAN JOURNEY || ===================");
		log.info("==================== ||   TEST CASE START || ====================");
		
		
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
		r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}

		ytp_journey_1 ytp = PageFactory.initElements(driver, ytp_journey_1.class);
		
		Library.custom_print("Test Case ID - " + TC_ID);
		Library.Custom_SendKeys(ytp.getFirst_Name(), First_Name, First_Name );
		Library.Custom_SendKeys(ytp.getMiddle_Name(), Middle_Name, Middle_Name);
		Library.Custom_SendKeys(ytp.getLast_Name(), Last_Name, Last_Name);
		Library.Custom_SendKeys(ytp.getEmail_Id(), Email_ID, Email_ID );
		Library.Custom_SendKeys(ytp.getMobile_number(), Mobile_Number, Mobile_Number );
		Library.Custom_Click(ytp.getContinue_1(), "Continue - 1");
		
//=======================================================================================================================================================	
//Lead Page 2 	
		
		if(Gender.equalsIgnoreCase("Female")) {
			Library.Custom_Click(ytp.female(), Gender);
		}else if(Gender=="Male") {
			Library.custom_print(Gender);
		}else if(Gender.equalsIgnoreCase("Transgender")){
			Library.Custom_Click(ytp.transgender(), Gender);
		}	
		
		Library.Custom_SendKeys(ytp.getdateOfBirth(), Dob, Dob);
		if(consume_tobacco.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp.tobaco_yes(), "Consume tobaco "+ consume_tobacco);
		}
		else if (consume_tobacco=="No") {
			System.out.println("Consume tobaco "+ consume_tobacco);
		}
		Library.Custom_Click(ytp.getcontinue_2(), "Continue - 2");
		
//=======================================================================================================================================================
//		Lead Page 3
		
		WebElement occupation = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guideradiobutton___widget']"));
		Select sel = new Select(occupation);
		sel.selectByVisibleText(occu);
		Library.custom_print("Click successfully " + occu);
		
		WebElement education = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guidedropdownlist___widget']"));
		Select list= new Select(education);
		list.selectByVisibleText(edu);
		Library.custom_print("Click successfully " + edu);
		
		Library.Custom_SendKeys(ytp.getannualIncome(), annualIncome,  annualIncome );
		Library.Custom_Click(ytp.getcontinue_3(), "Continue - 3");
		
//=======================================================================================================================================================		
//		Lead Page 4 - Check Premium
		
		if (Emp.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp.emp_yes(), "Employee " + Emp);
		}else if (Emp == "No") {
			Library.Custom_Click(ytp.emp_no(), "Employee " + Emp);
		}
		
		Library.Custom_Click(ytp.getcheck_premium(), "Check Premium");
		
//=================================================================  CREATE YOUR OWN PLAN  ===============================================================		
		
		JavascriptExecutor scroll =  (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement total1 = driver.findElement(By.xpath("//p[@class='btm-premiumAmount']"));
		
		String rs1 = total1.getText();
		Library.custom_print_premium(ytp.total_premium(), rs1);
		
		Library.Custom_SendKeys(ytp.getsum_assured(),Keys.CONTROL + "a", null );
		Library.Custom_SendKeys(ytp.getsum_assured(), sum, "Sum Assured "+sum);
		
		Thread.sleep(2000);
		WebElement policy = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel_776881033-panel1602832081639-guidedropdownlist_16___widget']"));
		Select list1= new Select(policy);
		
		list1.selectByVisibleText(policy_term);
		Library.custom_print("Click successfully Policy Term " + policy_term );
		
		//================== Pay Every ===============
		
		if(pay.equalsIgnoreCase("3 Month")) {
			Library.Custom_Click(ytp.three_month(),"Pay_Every "+ pay);
		}else if(pay.equalsIgnoreCase("6 Month")){
			Library.Custom_Click(ytp.getsix_Month(),"Pay_Every "+ pay );
		}else if(pay.equalsIgnoreCase("Year")){
			Library.Custom_Click(ytp.year(), "Pay_Every "+pay);
		}else if(pay.equalsIgnoreCase("Month")) {
			Library.custom_print("Click Sucecsfully Pay_Every " + pay);
		}
		
		//=============== Premium payment Term =========	

		 if (Payment_Term.equalsIgnoreCase("five")) {
			Library.Custom_Click(ytp.getfive_year(), "Premium_Payment_Term "+ Payment_Term );
		}else if (Payment_Term.equalsIgnoreCase("ten")) {
			Library.Custom_Click(ytp.ten_year(), "Premium_Payment_Term "+Payment_Term);
		}else if (Payment_Term.equalsIgnoreCase("fifteen")) {
			Library.Custom_Click(ytp.fifty_year(), "Premium_Payment_Term "+Payment_Term);
		}else if (Payment_Term.equalsIgnoreCase("Upto_sixty")) {
			Library.Custom_Click(ytp.sixty_year(),"Premium_Payment_Term "+Payment_Term);
		}else if (Payment_Term ==("Regular")) {
			Library.Custom_Click(ytp.regular(),"Premium_Payment_Term "+ Payment_Term);
		}
		
		 
		// ROP
		if(rop.equalsIgnoreCase("Y")) {
			Thread.sleep(2000);
			scroll.executeScript("window.scrollBy(0,100)", "");
			Library.Custom_Click(ytp.rop_Checked(), "Rop Select");
		} else if (rop.equalsIgnoreCase("N")) {
			// Nothing
		}
	
		Library.Custom_Click(ytp.getrecalculate_Quate_1(), "Recalculate Quate");
		 
		WebElement total2 = driver.findElement(By.xpath("//p[@class='btm-premiumAmount']"));	
		String rs2 = total2.getText();
		Library.custom_print_premium(ytp.total_premium(), rs2);
		
		String name = TC_ID;
		
		Thread.sleep(2000);
		Library.custom_Screenshot_SumAssured(name);
		Library.Custom_Click(ytp.getproceed_1(), "Proceed");
		
//================================================================ CHOOSE A PLAN OPTION ====================================================================
		
		//Quote Page 2
		WebElement total3 = driver.findElement(By.xpath("//p[@class='btm-premiumAmount']"));											
		String rs3 = total3.getText();
		Library.custom_print_premium(ytp.total_premium(), "Before Recalculate "+ rs3);
		
		scroll.executeScript("window.scrollBy(0,700)", "");
		
		if (Life_cover.equalsIgnoreCase("increasing")) {
    		Library.Custom_Click(ytp.increasing(), Life_cover);
    	} else if (Life_cover.equalsIgnoreCase("level")){
    		Library.Custom_Click(ytp.level(), Life_cover);
    	}
		
		
		//Part Lumpsum & Part Monthly Income
		if (Payout_Type.equalsIgnoreCase("Monthly Income")) {
			Library.Custom_Click(ytp.monthlyIncome(), "Monthly Income ");
			scroll.executeScript("window.scrollBy(0,100)", "");
			
			Thread.sleep(2000);
			WebElement monthly = driver.findElement(By.xpath("//select[@name='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_1130119198-panel-guidedropdownlist_1075910158___jqName']"));
			Select monthIncome = new Select (monthly);
			monthIncome.selectByVisibleText(Monthly_Income);

		} else if (Payout_Type.equalsIgnoreCase("Part Lumpsum & Part Monthly Income")) {
			Library.Custom_Click(ytp.partLumpsumAndMonthlyIncome(), "Part Lumpsume & Part Monthly Income ");
			scroll.executeScript("window.scrollBy(0,500)", "");
			
			WebElement propotion = driver.findElement(By.xpath("//select[@name='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_1130119198-panel-guidedropdownlist___jqName']"));
			Select proportionList = new Select (propotion);
	//		proportionList.selectByVisibleText(Proportion);
			
			Thread.sleep(2000);
			WebElement mio = driver.findElement(By.xpath("//select[@name='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_1130119198-panel-guidedropdownlist_1075910158___jqName']"));
			Select mioList = new Select (mio);
			mioList.selectByVisibleText(MIO);
		}
		
			if (Life_cover.equalsIgnoreCase("increasing")) {
			Library.Custom_Click(ytp.getrecalculate_Quate_2(), "Recalculate Quate");
			} else if (Life_cover.equalsIgnoreCase("level")) {
			Library.Custom_Click(ytp.getproceed_2(), "Proceed");
			}
		
		
		WebElement after = driver.findElement(By.xpath("//p[@class='btm-premiumAmount']"));											
		String rs4 = after.getText();
		Library.custom_print_premium(ytp.total_premium(), "After Recalculate "+ rs4);
		
		Library.custom_Screenshot_ChoicePlan(name);		

//================================================================ CHOOSE ADDITIONAL BENEFITS [RIDERS] ====================================================================
		
		scroll.executeScript("window.scrollBy(0,500)", "");
		Actions act = new Actions(driver);
		
		
		WebElement Before = driver.findElement(By.xpath("//p[@class='btm-premiumAmount']"));
		String rs5 = Before.getText();
		Library.custom_print_premium(ytp.total_premium(), rs5);
		
		//CI-PPP & CI-PP	
		if(CI_PPPChecked.equalsIgnoreCase("y") && CI_PPChecked.equalsIgnoreCase("n")) {
//			Library.Custom_Click(ytp.cippp_select(), "CIPPP");
			Library.Custom_SendKeys(ytp.cippp(),Keys.CONTROL + "a", null );
			Thread.sleep(2000);
			Library.Custom_SendKeys(ytp.cippp(), ci_ppp, "CIPPP - " + ci_ppp);
			Thread.sleep(1000);
			Library.Custom_Click(ytp.cippp_select(), "CIPPP");
		}else if (CI_PPPChecked.equalsIgnoreCase("n") && CI_PPChecked.equalsIgnoreCase("y")) {
			Thread.sleep(2000);
			Library.Custom_Click(ytp.cipp(), "CIPP");		
		}else if(CI_PPChecked.equalsIgnoreCase("y") && CI_PPPChecked.equalsIgnoreCase("y")) {
			Library.custom_print("Both CI Variants cannot be selected, Ignoring the rider.");
		} 
		else {
			Library.custom_print("CI Rider not opted.");
		}
		
		//ADB
		if(ADBChecked.equalsIgnoreCase("y")) {	
			Library.Custom_SendKeys(ytp.adb(),Keys.CONTROL + "a", null );
			Library.Custom_SendKeys(ytp.adb(), adb, "adb "+adb);
			Thread.sleep(2000);
			Library.Custom_Click(ytp.adb_select(), "ADB Select");
		}
		Thread.sleep(2000);
		Library.custom_Screenshot_Rider_1(name);
		
		
		//ATPD-PP  &  ATPD-PPP
		
		if (ATPD_PPChecked.equalsIgnoreCase("Y") || ATPD_PPPChecked.equalsIgnoreCase("Y")  || TI_Checked.equalsIgnoreCase("Y")) {
			Library.Custom_Click(ytp.arrow(), "Arrow btn");
		} 
			
		if(ATPD_PPChecked.equalsIgnoreCase("Y") && ATPD_PPPChecked.equalsIgnoreCase("N") ) {
			Thread.sleep(2000);
//			Library.Custom_Click(ytp.arrow(), "Arrow");
			Library.Custom_Click(ytp.atpd_PP(), "ATPD-PP");
			Thread.sleep(2000);
			Library.custom_Screenshot_Rider_2(name);
		}
 		else if(ATPD_PPChecked.equalsIgnoreCase("N") && ATPD_PPPChecked.equalsIgnoreCase("Y")) {
//			Library.Custom_Click(ytp.arrow(), "Arrow");
			Thread.sleep(2000);
			Library.Custom_SendKeys(ytp.atpd_PPP(),Keys.CONTROL + "a", null );
			Library.Custom_SendKeys(ytp.atpd_PPP(), atpd_PPP, "ATPD-PPP " + atpd_PPP);
			Thread.sleep(2000);
			Library.Custom_Click(ytp.atpd_PPP_select(),"ATPD-PPP " );
		} 
		else if (ATPD_PPChecked.equalsIgnoreCase("N") && ATPD_PPPChecked.equalsIgnoreCase("Y")){
			Library.custom_print("ATPD Rider not opted.");
		}
		
		
		if (TI_Checked.equalsIgnoreCase("Y")) {
//			Library.Custom_Click(ytp.arrow(), "arrow-2");
			Thread.sleep(2000);
			Library.Custom_Click(ytp.terminalIllness_Select(), "TI Select");
		}	
		
		
		// BYP & CCB 
		if (ATPD_PPChecked.equalsIgnoreCase("N") || ATPD_PPPChecked.equalsIgnoreCase("N")  || TI_Checked.equalsIgnoreCase("N")) {
			Library.Custom_Click(ytp.arrow(), "Arrrow btn");
			
			if (BYP_Checked.equalsIgnoreCase("Y") || CCB_Checked.equalsIgnoreCase("Y") ) 
			{   Library.Custom_Click(ytp.arrow(), "Arrrow btn");  }
			
		}
			
		if (BYP_Checked.equalsIgnoreCase("Y")) {
			Thread.sleep(3000);
//			Library.Custom_Click(ytp.arrow(), "arrow-2");
			Library.Custom_Click(ytp.blockYourPremium(), "Block Your Premium ");
			
				if(Percentage.equalsIgnoreCase("25%")) {
					Thread.sleep(2000);
					Library.Custom_Click(ytp.byp25(), "BYP 25%");
				} else if (Percentage.equalsIgnoreCase("75%")) {
					Thread.sleep(2000);
					Library.Custom_Click(ytp.byp75(), "BYP 75");
				} else if (Percentage.equalsIgnoreCase("100%")) {
					Thread.sleep(2000);
					Library.Custom_Click(ytp.byp100(), "BYP 100%");
				} else if (Percentage.equalsIgnoreCase("50%")) {
					Thread.sleep(2000);
					Library.Custom_Click(ytp.byp50(), "BYP 50%");
				}	
		}
		
		if (CCB_Checked.equalsIgnoreCase("Y")) {
			
			Library.Custom_SendKeys(ytp.ccb(),Keys.CONTROL + "a", null );
			Thread.sleep(2000);
			Library.Custom_SendKeys(ytp.ccb(), ccb, "CCB Sumassured" + ccb);
			Library.Custom_Click(ytp.ccb_Checked(), "CCB Select");
			Library.Custom_SendKeys(ytp.ccbDob(), "20/04/2022", "CCB DOB");
			Library.Custom_Click(ytp.ccbMale(), "CCB Male");
		}
		
		Library.Custom_Click(ytp.getrecalculate_Quate_3(), "Recalculate Quate - 3 ");
		Thread.sleep(6000);
		Library.Custom_Click(ytp.getproceed_3(), "Proceed - 3");
		
//=================================================================  Policy Premium Detail  ==============================================================

		Library.Custom_SendKeys(ytp.pan(), pan, "Pancard " + pan);
		Library.Custom_SendKeys(ytp.pincode(), pincode, "Pincode " + pincode);
		
		WebElement natureOfDuty = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel_1080226036-panel_1173209043-panel_1712664342-panel_379119756-guidedropdownlist___widget']"));
		Select dutyList = new Select (natureOfDuty);
		Thread.sleep(3000);
		dutyList.selectByVisibleText(NauturOfDuty);
		Library.Custom_Click(ytp.proceed_4(), "Procees - 4");
		
//=================================================================  Payment Detail  ==============================================================	
		if (payment.equalsIgnoreCase("Pay Later")) {
			Library.Custom_Click(ytp.payLater(), "Pay Later");
		} else if (payment == ("Pay Now")) {
			Library.Custom_Click(ytp.payNow(), "Pay Now");
		}	
		Library.custom_Screenshot_Payment(name);
		Library.Custom_Click(ytp.next(), "Next");
		
//=================================================================   Proposal Form  ======================================================================
		
		ytp_personnel_detail ytp1 = PageFactory.initElements(driver, ytp_personnel_detail.class);

		Library.Custom_SendKeys(ytp1.Adhar(), adhar, "Adhar Number - " + adhar);
		Library.Custom_SendKeys(ytp1.FatherName(), fatherName, "Father Name "+ fatherName);
		Library.Custom_SendKeys(ytp1.MiddleName(), middleName, "Middle Name - "+ middleName);
		Library.Custom_SendKeys(ytp1.LastName(),   lastName, "Last Name - "+ lastName);
		Library.Custom_SendKeys(ytp1.MotherName(), motherName, "Mother Name - "+ motherName);
		Library.Custom_SendKeys(ytp1.MiddleName1(), middleName1, "Middle Name - "+ middleName1);
		Library.Custom_SendKeys(ytp1.LastName1(), lastName1, "Last Name - "+ lastName1);
		
		Thread.sleep(2000);
		if (martialStatus.equalsIgnoreCase("single")) {
			Library.Custom_Click(ytp1.single(), "Martial Status - " +martialStatus);
		}else if (martialStatus.equalsIgnoreCase("married")) {
			Library.Custom_Click(ytp1.married(), "Martial Status - " +martialStatus);
		}else if (martialStatus.equalsIgnoreCase("divorced")) {
			Library.Custom_Click(ytp1.divorced(), "Martial Status - " +martialStatus);
		}else if (martialStatus.equalsIgnoreCase("widowed")) {
			Library.Custom_Click(ytp1.windowed(), "Martial Status - " +martialStatus);
		}
		
		Library.Custom_SendKeys(ytp1.mobileNum(), mobileNum, "Mobile Number -  " + mobileNum);
		
		if (politically_Exposed_Person.equalsIgnoreCase("Y")) {
			Library.Custom_Click(ytp1.political(), " SELECT - Politically Exposed Person ");
			Library.Custom_Click(ytp1.criminal(), "Criminal Charges ");
	
			Library.Custom_SendKeys(ytp1.politicalExposed(), Person_Exposed_Politically, "Person_Exposed_Politically - " + Person_Exposed_Politically);
			Library.Custom_SendKeys(ytp1.relationshipWithPerson(), Relation_With_Person, "Relation_With_Person - " + Relation_With_Person);
			Library.Custom_SendKeys(ytp1.sourceOfIncome(), Source_Of_Income, "Source_Of_Income - " + Source_Of_Income);
			Library.Custom_SendKeys(ytp1.politicalPartyAsociated(), Name_Of_Political_Party, "Name_Of_Political_Party - "+Name_Of_Political_Party);
			Library.Custom_SendKeys(ytp1.roleOfPerson(), Role_Of_Person, "Role_Of_Person" + Role_Of_Person);
			Library.Custom_SendKeys(ytp1.anyCriminalCase(), Any_Crminial_Case, "Any_Crminial_Case" + Any_Crminial_Case);
			
		} 
		
		if (criminal_Charges.equalsIgnoreCase("Y")) {
			Library.Custom_Click(ytp1.criminal(), "Criminal Charges ");
			Library.Custom_SendKeys(ytp1.anyCriminalCase(), Any_Crminial_Case, "Any_Crminial_Case - "+Any_Crminial_Case);
		}
		
		//==============  Age Proof ==============
		
		WebElement age = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidedropdownlist___widget']"));
		Select list3= new Select(age);
		Thread.sleep(2000);
		list3.selectByVisibleText(ageProof);
		
		if (ageProof.equalsIgnoreCase("Valid Passport")) {
			Library.Custom_SendKeys(ytp1.Vp_number(), VP_num, "ID Num for Age Proof - "+ VP_num);
			Library.Custom_SendKeys(ytp1.Vp_Exp_Date(), Vp_Exp_Date, "Expiray Date - "+Vp_Exp_Date);
		} else if (ageProof.equalsIgnoreCase("Virtual Identification (VID)/ Aadhaar card")) {
			Library.Custom_SendKeys(ytp1.VID_4digit(), VID_4digit, "VID Last 4 Digit Number - "+ VID_4digit);
		} else if (ageProof.equalsIgnoreCase("Valid Driving license")) {
			Library.Custom_SendKeys(ytp1.VDL_number(), VDL_Num, "Valid Driving Licen Number - "+VDL_Num);
			Library.Custom_SendKeys(ytp1.VDL_Exp_date(), VDL_Exp_date, "Valid Driving Licen Exp Date - "+VDL_Exp_date);
		}
		
		//==============  ID Proof =================
		
		WebElement idProof =driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_861845168-guidedropdownlist___widget']"));
		Select idProofList = new Select(idProof);
		idProofList.selectByVisibleText(IdProof);
		
		if (IdProof.equalsIgnoreCase("Valid Passport")) {
			Library.Custom_SendKeys(ytp1.Id_num_for_id_proof(), VP_Id_Proof_Num, "VP ID Proof Number - "+VP_Id_Proof_Num);
			Library.Custom_SendKeys(ytp1.ExpDate(), VP_Id_Proof_Exp_Date, "VP ID Proof Exp Date - "+VP_Id_Proof_Exp_Date);
		} else if (IdProof.equalsIgnoreCase("Virtual Identification (VID)/ Aadhaar card")) {
			Library.Custom_SendKeys(ytp1.Id_num_for_id_proof(), VID_Id_Proof_4digit, "VID Four Digit Number - "+VID_Id_Proof_4digit );
		} else if (IdProof.equalsIgnoreCase("Job Card by NREGA")) {
			Library.Custom_SendKeys(ytp1.Id_num_for_id_proof(), NREGA, "Job Card by NREGA - " + NREGA);
		} else if (IdProof.equalsIgnoreCase("Valid Driving license")) {
			Library.Custom_SendKeys(ytp1.Id_num_for_id_proof(),VDL_Id_Proof_Num , "VDL Number - "+ VDL_Id_Proof_Num);
			Library.Custom_SendKeys(ytp1.ExpDate(), VDL_Exp_Date, "VDL Expiry Date - "+ VDL_Exp_Date);
		} else if (IdProof.equalsIgnoreCase("Voter ID")) {
			Library.Custom_SendKeys(ytp1.Id_num_for_id_proof(), Voter_Id, "Voter ID Number - " + Voter_Id);
		}
		
		Library.Custom_Click(ytp1.proceed(),"Proceed");
		
//=============================================================================== Professional Detail =================================================================================
		
		ytp_professional_detail ytp2 = PageFactory.initElements(driver, ytp_professional_detail.class);
		
		WebElement orgniazation=driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidedropdownlist_1801249494___widget']"));
		Select orgnizationlist=  new Select(orgniazation);
		Thread.sleep(2000);
		orgnizationlist.selectByVisibleText(Orgnization_Name);
		
		Library.Custom_SendKeys(ytp2.picodeZip(), pincode_zip, "Pincode/Zipcode (Occupation) - " + pincode_zip);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidedropdownlist_20___widget']"));
		Select stateList = new Select (state);
		stateList.selectByVisibleText(state_List);
		
		Library.Custom_SendKeys(ytp2.addressLine1(), adress, "Address Line 1 - "+adress );
		Library.Custom_SendKeys(ytp2.orgnizationCity(), Orgnization_City, "Orgnization_City - "+ Orgnization_City);
		
		WebElement natureOfDuty1 = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidedropdownlist___widget']"));	
		Select natureOfDutyList= new Select(natureOfDuty1);
		natureOfDutyList.selectByVisibleText(Nature_OF_Duty);
		
		if (Nature_OF_Duty.equalsIgnoreCase("Merchant Marine")) 
		{
			WebElement exactNatureOfDuty= driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidedropdownlist_71___widget']"));
			
			Select exactNatureOfDutyList= new Select (exactNatureOfDuty);
			exactNatureOfDutyList.selectByVisibleText(Exact_Nature_OF_Duty);
			
			Library.Custom_SendKeys(ytp2.providDatail(), Provide_Detail, "Provide Detail - " +Provide_Detail);
			
			WebElement exactNatureOfJobTitle=driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidedropdownlist_14___widget']"));
			Select exactNatureOfJobTitleList= new Select (exactNatureOfJobTitle);
			exactNatureOfJobTitleList.selectByVisibleText(Exact_Nature_Of_Job_Title);
			
			Library.Custom_SendKeys(ytp2.percetageOfDuties(), Percentage_Of_Duties_Manual, "Percentage_Of_Duties_Manual - "+ Percentage_Of_Duties_Manual);
			
			WebElement typeOfVessle=driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidedropdownlist_548071348___widget']"));
			
			Select typeOfVessleList= new Select(typeOfVessle);
			Thread.sleep(2000);
			typeOfVessleList.selectByVisibleText(typeOfVesselWork);
			
			Library.Custom_SendKeys(ytp2.dateOfEntry(), DateOfEntry, "Date Of Entry to India - " + DateOfEntry); 
			
			WebElement countriesDockIn = driver.findElement(By.xpath("//select[@class='multiDropdown select2-hidden-accessible']"));
			Select countriesDockInList = new Select (countriesDockIn);
			countriesDockInList.selectByVisibleText(CountriesDockIn);
			
			WebElement currentEmpWithinIndia= driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidedropdownlist_279947742___widget']"));
			Select currentEmpWithinIndiaList = new Select (currentEmpWithinIndia);
			currentEmpWithinIndiaList.selectByVisibleText(CurrentEmpWithinIndia);	
		} else if (Nature_OF_Duty.equalsIgnoreCase("Others")) {
			Library.Custom_SendKeys(ytp2.industryName(), Industry_Name, "Industry_Name - " + Industry_Name);
		}
		
		// Nature of Work	
		if (Nature_OF_Work.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp2.natureOfWork_YES(), "Nature of Work - " + Nature_OF_Work);
			Library.Custom_SendKeys(ytp2.provideDetails(), Provide_Details, "Provide_Details - "+ Provide_Details);
		} else if(Nature_OF_Work.equalsIgnoreCase("No")){
			Library.Custom_Click(ytp2.natureOfWork_NO(), "Nature_OF_Work - " + Nature_OF_Work);
		}
		
		// Rick Associate with occupation
		
		if (rickAssocite.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp2.rickAssociate_YES(), "Rick Associate with ocuupation - "+rickAssocite );
			Library.Custom_SendKeys(ytp2.provideDetail_1(), Provide_Details_1, "Provide_Details_1 - " + Provide_Details_1);
		}else if (rickAssocite.equalsIgnoreCase("No")) {
			Library.Custom_Click(ytp2.rickAssociate_NO(), "Rick Associate with ocuupation - "+rickAssocite );
		}
		
		Library.Custom_Click(ytp2.proceed(), "Proceed");
		
		
//=========================================================================== Contact Detail ========================================================================================	
		
		Library.Custom_SendKeys(ytp2.address(), address, "Address - "+ address);
		
		WebElement address1= driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel_695616694-guidedropdownlist___widget']"));
		Select addressproodList = new Select(address1);
		addressproodList.selectByVisibleText(addressProof);
		
		Library.Custom_SendKeys(ytp2.cityOfBirth(), cityOfBirth, "City of Birth - "+ cityOfBirth);
		Library.Custom_Click(ytp2.residenceInJapan_NO(), "Residence In Japan - NO");
		
		if (insurance.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp2.E_Insurance_Account_YES(), "E-Insurance Account - "+insurance );
			Library.Custom_SendKeys(ytp2.insurance_Account_Num(), Account_Num, "E- Insurance Account Number - " +Account_Num);
		} else if (insurance.equalsIgnoreCase("No")) {
			Library.Custom_Click(ytp2.E_Insurance_Account_NO(), "E-Insurance Account - "+insurance);
		}
		
		WebElement repository = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guidedropdownlist_co___widget']"));
		Select repositoryList = new Select(repository);
		Thread.sleep(2000);
		repositoryList.selectByVisibleText(insuranceRepository);
		Library.custom_print("Click Successfuly Insurance Repository  - "+insuranceRepository);
		
		Library.Custom_Click(ytp2.proceed(), "Proceed");
	
//========================================================================  INSURANCE DETAIL ====================================================================================

		if (activePolicies.equalsIgnoreCase("Yes")) {
			Library.Custom_Click(ytp2.activePolicies_YES(), "Acticve/Lapsed policies from 5 Year - "+ activePolicies);
			
			WebElement company = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-panel1596188640785-table-Row1-tableItem-guidedropdownlist_1942648506___widget']"));
			Select companyList= new Select(company);
			companyList.selectByVisibleText(insuranceCompany);
	
			Library.Custom_SendKeys(ytp2.sumAssured(), sumAssured, "Sum Assured - "+ sumAssured);
			
			WebElement status = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-panel1596188640785-table-Row1-tableItem-guidedropdownlist___widget']"));
			Select statusList= new Select(status);
			statusList.selectByVisibleText(Status);
			
		} else if (activePolicies.equalsIgnoreCase("No")) {
			Library.Custom_Click(ytp2.activePolicies_NO(), "Acticve/Lapsed policies from 5 Year - "+ activePolicies);
		}
		
		Library.Custom_Click(ytp2.modifiedTerms(), "Modified Term - NO");
		Library.Custom_Click(ytp2.proceed(), "Proceed - 1");
		
//========================================================================  NOMINEE DETAIL ====================================================================================

		Library.Custom_SendKeys(ytp2.nomineeFirstName(), Nomine_FirstName, "Nomine_FirstName - "+ Nomine_FirstName );
		Library.Custom_SendKeys(ytp2.nomineeLastName(), Nomine_LastName, "Nomine_LastName - " + Nomine_LastName);
		Library.Custom_SendKeys(ytp2.nomineeDOB(), Nominee_DOB, "Nominee_DOB - "+ Nominee_DOB);
		
		if (Nominee_Gender.equalsIgnoreCase("Male")) {
			Library.Custom_Click(ytp2.nomineeMale(), "Gender - "+Nominee_Gender );
		} else if (Nominee_Gender.equalsIgnoreCase("Female")) {
			Library.Custom_Click(ytp2.nomineeFemale(), "Gender - "+Nominee_Gender );
		} else if  (Nominee_Gender.equalsIgnoreCase("Female")) {
			Library.Custom_Click(ytp2.nomineeTransgender(), "Gender - "+Nominee_Gender );
		}
		
		Library.Custom_SendKeys(ytp2.nomineeMobileNum(), Nominee_MobNum, "Nominee_MobNum - "+ Nominee_MobNum);
		Library.Custom_SendKeys(ytp2.nomineeEmailID(), Nominee_Email, "Nominee_Email - "+ Nominee_Email);
		
		WebElement relation = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidedropdownlist___widget']"));
		Select relationList = new Select (relation);
		relationList.selectByVisibleText(Relationship);
		Library.custom_print("Click Successfully - "+ Relationship);
		
//		WebElement share = driver.findElement(By.xpath("//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidenumericbox___widget']"));
//		Select shareList = new Select (share);
//		shareList.selectByVisibleText(sharePercent);
//		Library.custom_print("Click Successfully - "+ sharePercent);
		
		Library.Custom_Click(ytp2.proceedbtn(), "Proceed");
		
//================================================================== LIFESTYLE & HEALTH ==============================================================================

		ytp_HealthForm ytp3= PageFactory.initElements(driver, ytp_HealthForm.class);
		
		Library.Custom_SendKeys(ytp3.height(), Height, "Height - "+Height);
		Library.Custom_SendKeys(ytp3.Weight(), Weight, "Weight - "+ Weight);
		Library.Custom_Click(ytp3.weightreduced_NO(), "Weight icresed/reduced 5 kg - NO");
		Library.Custom_SendKeys(ytp3.conusmptionQty(), Consumption_Qty, "Consumption_Qty - "+Consumption_Qty);
		Library.Custom_SendKeys(ytp3.consumptionYear(), Consumption_Year, "Consumption_Year - "+ Consumption_Year);
		
		Library.Custom_Click(ytp3.consumeAlchohol_NO(), "Conusme Alchohol - NO");
		Library.Custom_Click(ytp3.conusmeNarocotics_NO(), "Consume Narcotics - NO");
		Library.Custom_Click(ytp3.participate_NO(), "Participate in hobbies/Sport - NO");
		Library.Custom_Click(ytp3.proceed_2(), "Proceed - 2");
		
//==================================================================  Medical Detail  ==============================================================================
	
		scroll.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		Library.Custom_Click(ytp3.noneOfAbove_1(), "None Of the Above - Yes");
		Library.Custom_Click(ytp3.proceed_3(), "Proceed - 3");
		
//==================================================================  Medical Condition  ==============================================================================

		scroll.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		Library.Custom_Click(ytp3.noneOfAbove_2(), "None Of the Above - Yes");
		Library.Custom_Click(ytp3.proceed_3(), "Proceed - 3");

//==================================================================  COVID-19 Question  ==============================================================================

		Library.Custom_Click(ytp3.trvelOutSideINDIA_NO(), "Travel Outside India - NO");
		Library.Custom_Click(ytp3.lockdown_NO(), "Adivice to isolate - NO");
		Library.Custom_Click(ytp3.coronavirus_NO(), "Have you come in contact any Suspected - NO");
		Library.Custom_Click(ytp3.medicalAdivice_NO(), "Awaiting test result of COVID-19 - NO");
		Library.Custom_Click(ytp3.covide19Test_NO(), "Positive COVID-19 test - NO");
		Library.Custom_Click(ytp3.healthcareProcfessional_NO(), "Healthcare Professional - NO");
		Library.Custom_Click(ytp3.vaccinatedForCovid19_NO(), "Vaccinated for COVID-19 - NO");
		Library.Custom_Click(ytp3.postVaccination_NO(), "Adverse reaction post vaccination - NO");
		Library.Custom_Click(ytp3.proceed_2(), "Proceed");
		
//==================================================================  Declaration and Authorization  ==============================================================================

		
		Library.Custom_Click(ytp3.accept(), "Accept");
		
//		Thread.sleep(20000);
//		Library.Custom_Click(ytp3.verifyAndProceed(), "Verify & Proceed");
//		Thread.sleep(3000);
//		Library.Custom_Click(ytp3.next(), "Next");
//		Thread.sleep(3000);
//		Library.Custom_Click(ytp3.netBanking(), "Net Banking");
//		Thread.sleep(3000);
//		Library.Custom_Click(ytp3.deselect(), "De Select");
//		Thread.sleep(3000);
//		Library.Custom_Click(ytp3.payNow(), "Pay Now");
//		
//		
//		driver.findElement(By.className("dropdown-control")).click();
//		//Payment page 
//		
//		Thread.sleep(20000);
//		
//		WebElement payStatus = driver.findElement(By.xpath("//select[@id='BankStatus']"));
//		Select payStatusList = new Select (payStatus);
//		payStatusList.selectByVisibleText("Success");
//		
//		Library.Custom_Click(ytp3.sumbit(), "Submit");
//		Library.Custom_Click(ytp3.proceedAndUploadDoc(), "Procceed TO Document Upload ");
		
//	
//		Library.Custom_Click(ytp3.panUpload(), "Pan Upload");
//		Library.Custom_SendKeys(ytp3.select(), "C:\\Users\\30007473\\Videos\\C_HSBC_Life_Insurance\\Canara_HSBC_Life_Insurance\\Upload\\TC_01.png", "Upload");
	
		
		
		
		
		
		
		Thread.sleep(8000);		
  //  	driver.close();
		
		log.info("=============== || TEST SUCCESSFULLY EXECUTE ||================");
	
	}
}