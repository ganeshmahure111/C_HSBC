package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ytp_HealthForm {

	//================================================================== LIFESTYLE & HEALTH ==============================================================================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-panel_copy-guidenumericbox_6088___widget']")
	private WebElement height;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-panel_copy-guidenumericbox_1519___widget']")
	private WebElement Weight;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-guideradiobutton__-2_widget']")
	private WebElement weightreduced_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-panel1595390155524-guidenumericbox___widget']")
	private WebElement conusmptionQty;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-panel1595390155524-guidenumericbox_383749075___widget']")
	private WebElement consumptionYear;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-guideradiobutton_1064349886__-2_widget']")
	private WebElement consumeAlchohol_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-guideradiobutton_1080319032__-2_widget']")
	private WebElement conusmeNarocotics_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel-guideradiobutton_753293711__-2_widget']")
	private WebElement participate_NO;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249999953-guidebutton___widget']")
	private WebElement proceed_2;
	
	//========================================================= Get Method =========================================================

	public WebElement height() {
		return height;
	}
	
	public WebElement Weight() {
		return Weight;
	}
	
	public WebElement weightreduced_NO() {
		return weightreduced_NO;
	}
	
	public WebElement conusmptionQty() {
		return conusmptionQty;
	}
	
	public WebElement consumptionYear() {
		return consumptionYear;
	}
	
	public WebElement consumeAlchohol_NO() {
		return consumeAlchohol_NO;
	}
	
	public WebElement conusmeNarocotics_NO() {
		return conusmeNarocotics_NO;
	}
	
	public WebElement participate_NO() {
		return participate_NO;
	}
	
	public WebElement proceed_2() {
		return proceed_2;
	}
	
//==================================================================  Medical Detail  ==============================================================================

	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem medicalMedicalDetailsNota guideFieldHorizontalAlignment choice-check-box']")
	private WebElement noneOfAbove_1;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249999953-guidebutton___widget']")
	private WebElement proceed_3;
	
	//========================================================= Get Method =========================================================

	public WebElement noneOfAbove_1() {
		return noneOfAbove_1;
	}
	
	public WebElement proceed_3() {
		return proceed_3;
	}
	
//==================================================================  Medical Condition  ==============================================================================
	
	@FindBy (xpath = "//div[@class='guideCheckBoxItem afCheckBoxItem medicalMedicalCondtionsNota guideFieldHorizontalAlignment choice-check-box']")
	private WebElement noneOfAbove_2;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1168082105-panel1595482857070-panel_432030312_copy-guideradiobutton__-2_widget']")
	private WebElement pregnant;
	
	//========================================================= Get Method =========================================================

	public WebElement noneOfAbove_2() {
		return noneOfAbove_2;
	}
	
	public WebElement pregnant() {
		return pregnant;
	}

//==================================================================  COVID-19 Question  ==============================================================================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton__-2_widget']")
	private WebElement trvelOutSideINDIA_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_1567075758__-2_widget']")
	private WebElement lockdown_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_269435651__-2_widget']")
	private WebElement coronavirus_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_1314836233__-2_widget']")
	private WebElement medicalAdivice_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_313311526__-2_widget']")
	private WebElement covide19Test_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_1688448899__-2_widget']")
	private WebElement healthcareProcfessional_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_211__-2_widget']")
	private WebElement vaccinatedForCovid19_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel_1725547108-guideradiobutton_148__-2_widget']")
	private WebElement postVaccination_NO;
	
	//========================================================= Get Method =========================================================
	
	public WebElement trvelOutSideINDIA_NO() {
		return trvelOutSideINDIA_NO;
	}
	
	public WebElement lockdown_NO() {
		return lockdown_NO;
	}
	
	public WebElement coronavirus_NO() {
		return coronavirus_NO;
	}
	
	public WebElement medicalAdivice_NO() {
		return medicalAdivice_NO;
	}
	
	public WebElement covide19Test_NO() {
		return covide19Test_NO;
	}
	
	public WebElement healthcareProcfessional_NO() {
		return healthcareProcfessional_NO;
	}
	
	public WebElement vaccinatedForCovid19_NO() {
		return vaccinatedForCovid19_NO;
	}
	
	public WebElement postVaccination_NO() {
		return postVaccination_NO;
	}
	
//================================================================== Declaration and Authorization ==============================================================================

	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601_c-panel-panel_1425973399_cop-panel-guidebutton___widget']")
	private WebElement accept;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601_c-panel-panel_1425973399_cop-panel_1469188250-panel1598633241969-panel1597743178026-guidetextbox___widget']")
	private WebElement otp;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601_c-panel-panel_1425973399_cop-panel_1469188250-guidebutton_1067071897___widget']")
	private WebElement verifyAndProceed;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel1605081727223-panel-panel-panel1593779195034-panel1593780270581-guidebutton_19836339___widget']")
	private WebElement next;
	
	@FindBy (xpath = "(//a[@class='list-group-item card-name-font'])[2]")
	private WebElement netBanking;
	
	@FindBy (xpath = "//label[text()=' I agree to pay my future/renewal premiums through credit card as per the Terms and Conditions mentioned with respect to the set up of Standing Instructions on my credit card.']")
	private WebElement deselect;
	
	@FindBy (xpath = "(//button[text()='Pay Now'])[1]")
	private WebElement payNow;
	//========================================================= Get Method =========================================================

	
	public WebElement accept() {
		return accept;
	}
	
	public WebElement otp() {
		return otp;
	}
	public WebElement verifyAndProceed() {
		return verifyAndProceed;
	}
	
	public WebElement next() {
		return next;
	}
	
	public WebElement netBanking() {
		return netBanking;
	}
	
	public WebElement deselect() {
		return deselect;
	}
	
	public WebElement payNow() {
		return payNow;
	}
	
	//================================== Payment ========================
	
	@FindBy (xpath =  "//button[@id='SubmitForm']")
	private WebElement sumbit;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249999953-panel1596441461404-panel1605768118886-panel-panel1597299280683-guidebutton___widget']")
	private WebElement proceedAndUploadDoc;
	
	
	//============================== Get Method ============================

	
	
	public WebElement sumbit() {
		return sumbit;
	}
	
	public WebElement proceedAndUploadDoc() {
		return proceedAndUploadDoc;
	}
	
	
	//==================================================================================== Document Upload ===================================================================================
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel-panel-panel1600771677415-panel_848999015-panel1598017408743-panel1595850552983-guidebutton___widget']")
	private WebElement panUpload;
	
	@FindBy (xpath = "//button[@class='button-default button-medium guide-fu-attach-button']")
	private WebElement select;
	
	@FindBy (xpath = "")
	private WebElement idProofFront;

	@FindBy (xpath = "")
	private WebElement idProofBack;
	
	@FindBy (xpath = "")
	private WebElement DobProof;
	
	@FindBy (xpath = "")
	private WebElement currentAddProof_Front;
	
	@FindBy (xpath = "")
	private WebElement currentAddProof_Back;
	
	
	
	
	
	
	//============================== Get Method ============================

	public WebElement panUpload() {
		return panUpload;
	}
	
	public WebElement select() {
		return select;
	}
	
	
	
	
	
	
}
