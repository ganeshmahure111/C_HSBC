package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ytp_professional_detail {
	
	//============================================================= Professional Detail =======================================================================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidetextbox_5086025___widget']")
	private WebElement pincodeZip;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidetextbox_8873140___widget']")
	private WebElement addressLine1;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidetextbox_4120755___widget']")
	private WebElement orgnizationCity;
	
	//========= Nature of Industry =========
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-panel_1582561159_cop-guidetextbox_3274117___widget']")
	private WebElement providDatail;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidenumericbox_copy___widget']")
	private WebElement percetageOfDuties;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1596012425612-guidedatepicker___widget']")
	private WebElement dateOfEntry;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel1597128853592-guidetextbox_1705342___widget']")
	private WebElement industryName;
	
	//======================

	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-guideradiobutton_176__-2_widget']")
	private WebElement natureOfWork_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-guideradiobutton_176__-1_widget']")
	private WebElement natureOfWork_YES;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel_822373141-guidetextbox___widget']")
	private WebElement provideDetails;
	
	//============================
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-guideradiobutton__-2_widget']")
	private WebElement rickAssociate_NO;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-guideradiobutton__-1_widget']")
	private WebElement rickAssociate_YES;

	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel-panel_2056177492-guidetextbox_8793144___widget']")
	private WebElement provideDetail_1;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
	private WebElement proceed;
	
	//========================================================= Get Method =========================================================

	public WebElement picodeZip () {
		return pincodeZip;
	}
	
	public WebElement addressLine1 () {
		return addressLine1;
	}

	public WebElement orgnizationCity () {
		return orgnizationCity;
	}
	
	//========= Nature of Industry =========
	
	public WebElement providDatail () {
		return providDatail;
	}
	
	public WebElement percetageOfDuties () {
		return percetageOfDuties;
	}
	
	public WebElement dateOfEntry () {
		return dateOfEntry;
	}
	
	public WebElement industryName () {
		return industryName;
	}
	
	//======================
	public WebElement natureOfWork_NO () {
		return natureOfWork_NO;
	}
	
	public WebElement natureOfWork_YES () {
		return natureOfWork_YES;
	}
	
	public WebElement provideDetails () {
		return provideDetails;
	}
	
	//======================
	
	public WebElement rickAssociate_NO () {
		return rickAssociate_NO;
	}
	
	public WebElement rickAssociate_YES () {
		return rickAssociate_YES;
	}
	
	public WebElement provideDetail_1 () {
		return provideDetail_1;
	}
	
	public WebElement proceed () {
		return proceed;
	}
	
//========================================================================  CONTACT DETAIL ====================================================================================

		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel1593588426711-guidetextbox___widget']")
		private WebElement address;
		 
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guidetextbox_copy___widget']")
		private WebElement cityOfBirth;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guideradiobutton_827903078__-2_widget']")
		private WebElement residenceInJapan_NO;
		
		@FindBy (xpath ="//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guideradiobutton_843015416__-1_widget']")
		private WebElement E_Insurance_Account_YES;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-guideradiobutton_843015416__-2_widget']")
		private WebElement E_Insurance_Account_NO;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_735158120-panel_439365724-guidetextbox_9914797___widget']")
		private WebElement insurance_Account_Num;
		
//		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
//		                  //button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']
//		private WebElement proceed_1;
		
		//========================================================= Get Method =========================================================
		
		public WebElement address() {
			return address;
		}
		
		public WebElement cityOfBirth() {
			return cityOfBirth;
		}
		
		public WebElement residenceInJapan_NO() {
			return residenceInJapan_NO;
		}
		
		public WebElement E_Insurance_Account_YES() {
			return E_Insurance_Account_YES;
		}
		
		public WebElement E_Insurance_Account_NO() {
			return E_Insurance_Account_NO;
		}
		
		public WebElement insurance_Account_Num() {
			return insurance_Account_Num;
		}
		
//		public WebElement proceed() {
//			return proceed;
//		}
		
//========================================================================  INSURANCE DETAIL ====================================================================================
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-guideradiobutton__-1_widget']")
		private WebElement activePolicies_YES;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-guideradiobutton__-2_widget']")
		private WebElement activePolicies_NO;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-panel1596188640785-table-Row1-tableItem-guidetextbox_1532865-guidenumericbox___widget']")
		private WebElement sumAssured;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_681636374-guideradiobutton_cop__-2_widget']")
		private WebElement modifiedTerms;
		
//		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
//		private WebElement proceed_1;
		
		//========================================================= Get Method =========================================================
		
		public WebElement activePolicies_YES() {
			return activePolicies_YES;
		}
		
		public WebElement activePolicies_NO() {
			return activePolicies_NO;
		}
		
		public WebElement sumAssured() {
			return sumAssured;
		}
		
		public WebElement modifiedTerms() {
			return modifiedTerms;
		}
		
//		public WebElement proceed_1() {
//			return proceed_1;
//		}

//========================================================================  NOMINEE DETAIL ====================================================================================

	@FindBy(xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidetextbox-guidetextbox___widget']")
	private WebElement nomineeFirstName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guidetextbox-guidetextbox_copy_69___widget']")
	private WebElement nomineeLastName;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-panel-guidedatepicker___widget']")
	private WebElement nomineeDOB;
	
	@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment laGender choice-radio-field'])[1]")
	private WebElement nomineeMale;
	
	@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment laGender choice-radio-field'])[2]")
	private WebElement nomineeFemale;
	
	@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment laGender choice-radio-field'])[3]")
	private WebElement nomineeTransgender;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-panel_1074690186-guidenumericbox___widget']")
	private WebElement nomineeMobileNum;
	
	@FindBy (xpath = "//input[@id='guideContainer-rootPanel-panel-panel1598249905601-panel-panel_962090328-table_1713745906-Row1-headerItem1603270315889-panel_1034133646-guideemail-guideemail___widget']")
	private WebElement nomineeEmailID;
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1598249905601-guidebutton___widget']")
	private WebElement proceedbtn;
	
	
	//========================================================= Get Method =========================================================

	public WebElement nomineeFirstName() {
		return nomineeFirstName;
	}
	
	public WebElement nomineeLastName() {
		return nomineeLastName;
	}
	
	public WebElement nomineeDOB() {
		return nomineeDOB;
	}
	
	public WebElement nomineeMale() {
		return nomineeMale;
	}
	
	public WebElement nomineeFemale() {
		return nomineeFemale;
	}
	
	public WebElement nomineeTransgender() {
		return nomineeTransgender;
	}
	
	public WebElement nomineeMobileNum() {
		return nomineeMobileNum;
	}
	
	public WebElement nomineeEmailID() {
		return nomineeEmailID;
	}
	
	public WebElement proceedbtn() {
		return proceedbtn;
	}
	
	
	
}
