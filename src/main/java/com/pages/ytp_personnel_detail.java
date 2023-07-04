package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ytp_personnel_detail {
	
//=================================================================== Proposal Form ====================================================================================
	
	
	//====================================================================== Personnel Details ===============================================================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_copy-guidetextbox___widget']")
	private WebElement adhar;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy-guidetextbox___widget']")
	private WebElement fatherName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy-guidetextbox_copy___widget']")
	private WebElement middleName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy-guidetextbox_copy_69___widget']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy_1093347168-guidetextbox___widget']")
	private WebElement motherName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy_1093347168-guidetextbox_copy___widget']")
	private WebElement middleName1;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy_1093347168-guidetextbox_copy_69___widget']")
	private WebElement lastName1;
	
	//======= Martial status =======
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-1_widget']")
	private WebElement single;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-2_widget']")
	private WebElement married;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-3_widget']")
	private WebElement divorced;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-4_widget']")
	private WebElement windowed;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_1836779483-guidenumericbox___widget']")
	private WebElement mobileNum;
	
	//==================== politics ====================
	
	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem proposalPoliticalLink guideFieldHorizontalAlignment']")
	private WebElement political;
	
	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem proposalCriminalCharges guideFieldHorizontalAlignment']")
	private WebElement criminal;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_168558364-guidetextbox_5872742___widget']")
	private WebElement politicalExposed;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_168558364-guidetextbox_2842176___widget']")
	private WebElement relationshipWithPerson;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_168558364-guidetextbox_1345492___widget']")
	private WebElement sourceOfIncome;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_168558364-guidetextbox_1677756___widget']")
	private WebElement politicalPartyAsociated;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_168558364-guidetextbox_1633213___widget']")
	private WebElement roleOfPerson;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_1002649794-guidetextbox_1396791___widget']")
	private WebElement anyCriminalCase;
	
	//==================== Age Proof =====================
		
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidetextbox___widget']")
	private WebElement Vp_number;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidedatepicker___widget']")
	private WebElement Vp_Exp_Date;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidetextbox___widget']")
	private WebElement VID_4digit;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidetextbox___widget']")
	private WebElement VDL_number;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_748141532-guidedatepicker___widget']")
	private WebElement VDL_Exp_date;
	
	//==================== Age Proof =====================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_861845168-guidetextbox___widget']")
	private WebElement Id_num_for_id_proof;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_753636304-panel_861845168-guidedatepicker___widget']")	  
	private WebElement ExpDate;

	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
	private WebElement proceed;
	
	//========================================================= Get Method =========================================================
	
	
	//========================== Personnel Details ==========================

	public WebElement Adhar() {
		return adhar;
	}

	public WebElement FatherName() {
		return fatherName;
	}

	public WebElement MiddleName() {
		return middleName;
	}

	public WebElement LastName() {
		return lastName;
	}

	public WebElement MotherName() {
		return motherName;
	}

	public WebElement MiddleName1() {
		return middleName1;
	}

	public WebElement LastName1() {
		return lastName1;
	}
	
	//======= Martial status =======
	
	public WebElement single() {
		return single;
	}
	
	public WebElement married() {
		return married;
	}
	
	public WebElement divorced() {
		return divorced;
	}
	
	public WebElement windowed() {
		return windowed;
	}
	
	public WebElement mobileNum() {
		return mobileNum;
	}
	
	//==================== politics ====================
	
	public WebElement political() {
		return political;
	}
	
	public WebElement criminal() {
		return criminal;
	}
	
	public WebElement politicalExposed() {
		return politicalExposed;
	}
	
	public WebElement relationshipWithPerson() {
		return relationshipWithPerson;
	}
	
	public WebElement sourceOfIncome() {
		return sourceOfIncome;
	}
	
	public WebElement politicalPartyAsociated() {
		return politicalPartyAsociated;
	}
	
	public WebElement roleOfPerson() {
		return roleOfPerson;
	}
	
	public WebElement anyCriminalCase(){
		return anyCriminalCase;
	}
	
	//==================== Age Proof =====================
	
	public WebElement Vp_number() {
		return Vp_number;
	}
	
	public WebElement Vp_Exp_Date() {
		return Vp_Exp_Date;
	}
	
	public WebElement VID_4digit() {
		return VID_4digit;
	}
	
	public WebElement VDL_number() {
		return VDL_number;
	}
	
	public WebElement VDL_Exp_date() {
		return VDL_Exp_date;
	}
	
	//==================== ID Proof =====================
	
	public WebElement Id_num_for_id_proof() {
		return Id_num_for_id_proof;
	}
	
	public WebElement ExpDate() {
		return ExpDate;
	}
	
	public WebElement proceed() {
		return proceed;
	}
	
}