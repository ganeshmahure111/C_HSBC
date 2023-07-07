package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gfp_journey_proposal_2 {
	
//============================================================================ Personal Detail  ===================================================================\\

	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel-panel1602577800125-guidetextbox___widget']")
	private WebElement pancard;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy-guidetextbox___widget']")
	private WebElement fatherName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy-guidetextbox_copy_69___widget']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy_1093347168-guidetextbox___widget']")
	private WebElement motherName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guidetextbox_copy_1093347168-guidetextbox_copy_69___widget']")
	private WebElement lastName1;
	
	// Martial Status
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-1_widget']")
	private WebElement single;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-2_widget']")
	private WebElement married;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-3_widget']")
	private WebElement divorced;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-guideradiobutton_725271308__-4_widget']")
	private WebElement widowed;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_1853872727_cop-guidenumericbox___widget']")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_525613555_copy-guidetextbox_copy_10-guidedropdownlist___widget']")
	private WebElement ageProof;
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1593583406033-panel_525613555_copy-panel-guidedropdownlist_12___widget']")
	private WebElement idProof;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
	private WebElement proceed;
	
	//================================================= GET METHOD ================================================\\

	public WebElement pancard () {
		return pancard;
	}
	
	public WebElement fatherName () {
		return fatherName;
	}
	
	public WebElement lastName () {
		return lastName;
	}
	
	public WebElement motherName () {
		return motherName;
	}
	
	public WebElement lastName1 () {
		return lastName1;
	}
	
	
	// Martial Status
	public WebElement single () {
		return single;
	}
	
	public WebElement married () {
		return married;
	}
	
	public WebElement divorced () {
		return divorced;
	}
	
	public WebElement widowed () {
		return widowed;
	}
	
	public WebElement mobileNumber () {
		return mobileNumber;	
	}
	
	public WebElement ageProof () {
		return ageProof;	
	}
	
	public WebElement idProof () {
		return idProof;	
	}
	
	public WebElement proceed () {
		return proceed;	
	}
	
//============================================================================ Professional Detail  ===================================================================\\
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidedropdownlist_21___widget']")
	private WebElement natureOfDuty;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidetextbox___widget']")
	private WebElement provideDetail;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidetextbox_1074905___widget']")
	private WebElement orgnizationName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidedropdownlist_68_2108064215___widget']")
	private WebElement pincode;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidetextbox_copy___widget']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guidetextbox_copy_19_1201537817___widget']")
	private WebElement orgnizationCity;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel-guideradiobutton_176__-2_widget']")
	private WebElement moneyServiceBusiness_No;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-guideradiobutton__-2_widget']")
	private WebElement riskAssociate_No;
	
	
	//================================================= GET METHOD ================================================\\

	public WebElement natureOfDuty () {
		return natureOfDuty;	
	}
	
	public WebElement provideDetail () {
		return provideDetail;	
	}
	
	public WebElement orgnizationName () {
		return orgnizationName;	
	}
	
	public WebElement pincode () {
		return pincode;	
	}
	
	public WebElement address () {
		return address;	
	}
	
	public WebElement orgnizationCity () {
		return orgnizationCity;	
	}
	
	public WebElement moneyServiceBusiness_No () {
		return moneyServiceBusiness_No;	
	}
	
	public WebElement riskAssociate_No () {
		return riskAssociate_No;	
	}
	
//============================================================================ Contact Detail  ===================================================================\\

	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel1593588426711-guidetextbox___widget']")
	private WebElement addressLine;
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel_970735099_copy_172341377-guidedropdownlist_10___widget']")
	private WebElement currentAddProof;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guideradiobutton_827903078__-2_widget']")
	private WebElement residenceInJapan_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guideradiobutton_843015416__-2_widget']")
	private WebElement eInsurance;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel1658817837089-guidetextbox_copy___widget']")
	private WebElement cityOfBirth;
	
	
	//================================================= GET METHOD ================================================\\

	public WebElement addressLine () {
		return addressLine;	
	}
	
	public WebElement currentAddProof () {
		return currentAddProof;	
	}
	
	public WebElement residenceInJapan_NO () {
		return residenceInJapan_NO;	
	}
	
	public WebElement eInsurance () {
		return eInsurance;	
	}
	
	public WebElement cityOfBirth () {
		return cityOfBirth;	
	}
	
//============================================================================ Insurance Detail  ===================================================================\\

	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-guideradiobutton__-2_widget']")
	private WebElement policiesFiveYr_No;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-guideradiobutton_cop__-2_widget']")
	private WebElement modifiedTerms_NO;
	
	//================================================= GET METHOD ================================================\\
	
	public WebElement policiesFiveYr_No () {
		return policiesFiveYr_No;	
	}
	
	public WebElement modifiedTerms_NO () {
		return modifiedTerms_NO;	
	}
	
//============================================================================ Nominee Detail  ===================================================================\\

	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidetextbox-guidetextbox___widget']")
	private WebElement nomineFirstName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidetextbox-guidetextbox_copy_69___widget']")
	private WebElement nomineLastName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-panel-guidedatepicker___widget']")
	private WebElement nomineDOB;
	
	@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment nomineeGender choice-radio-field'])[1]")
	private WebElement nomineMale;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-panel_1074690186-guidenumericbox___widget']")
	private WebElement nomineMobileNumber;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guideemail-guideemail___widget']")
	private WebElement nomineEmail;
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidedropdownlist___widget']")
	private WebElement nomineRelation;
	
	
	//================================================= GET METHOD ================================================\\

	public WebElement nomineFirstName () {
		return nomineFirstName;	
	}
	
	public WebElement nomineLastName () {
		return nomineLastName;	
	}
	
	public WebElement nomineDOB () {
		return nomineDOB;	
	}
	
	public WebElement nomineMale () {
		return nomineMale;	
	}
	
	public WebElement nomineMobileNumber () {
		return nomineMobileNumber;	
	}
	
	public WebElement nomineEmail () {
		return nomineEmail;	
	}
	
	public WebElement nomineRelation () {
		return nomineRelation;	
	}
	
	
//============================================================================ AML Detail  ===================================================================\\

	
	//================================================= GET METHOD ================================================\\

	
//============================================================================ Bank Detail  ===================================================================\\

	@FindBy (xpath ="//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1606893350767-panel_1357403253-panel-guidenumericbox___widget']")
	private WebElement accountNo;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1606893350767-panel_1357403253-panel-guidepasswordbox___widget']")
	private WebElement reenterAccountNo;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1606893350767-panel_1357403253-panel-guidetextbox___widget']")
	private WebElement accountHoleder;
	
	@FindBy (xpath = "//select[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel1606893350767-panel_1357403253-panel-guidetextbox_1444365___widget']")
	private WebElement bankName;
	
	
	//================================================= GET METHOD ================================================\\

	public WebElement accountNo () {
		return accountNo;	
	}
	
	public WebElement reenterAccountNo () {
		return reenterAccountNo;	
	}
	
	public WebElement accountHoleder () {
		return accountHoleder;	
	}
	
	public WebElement bankName () {
		return bankName;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
