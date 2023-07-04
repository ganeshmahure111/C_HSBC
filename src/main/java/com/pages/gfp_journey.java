package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gfp_journey {
	
	//============================================================================  WEBPAGE 1  ===================================================================\\

		@FindBy (xpath ="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox___widget']")
		private WebElement firstName;
		
		@FindBy (xpath ="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox_copy___widget']")
		private WebElement middleName;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550630773-guidetextbox_copy_69___widget']")
		private WebElement lastName;
		
		@FindBy (xpath ="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550875187-panel-guideemail___widget']")
		private WebElement email;
		
		@FindBy (xpath="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076608266-panel-panel1599550875187-panel_1853872727-guidenumericbox___widget']")
		private WebElement mobileNumber;
				
		@FindBy (xpath="//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")	
		private WebElement continue1;
		
		//================================================= GET METHOD ================================================\\

		public WebElement getfirstName() {
			return firstName;
		}
		
		public WebElement getmidddleName() {
			return middleName;
		}
		
		public WebElement getlastName() {
			
			return lastName;
		}
		
		public WebElement getemail() {
			return email;
		}
		
		public WebElement getmobileNumber() {
			return mobileNumber;
		}
		
		public WebElement getcontinuebtn() {
			return continue1;
		}
		
//============================================================================  WEBPAGE 2  ===================================================================\\
		
		@FindBy (xpath = "(//input[@aria-label='Male'])[1]")
		private WebElement male;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-guideradiobutton_113848271__-2_widget']")
		private WebElement female;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-panel1593610481480-panel-guidedatepicker___widget']")
		private WebElement DOB;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593076844140-panel-guidetextbox___widget']")
		private WebElement pindcode;
		
		//================================================= GET METHOD ================================================\\

		public WebElement male () {
			return male;
		}
		
		public WebElement female () {
			return female;
		}
		
		public WebElement DOB() {
			return DOB;
		}
		
		public WebElement getpincode () {
			return pindcode;
		}
		
//============================================================================  WEBPAGE 3  ===================================================================\\

		@FindBy (xpath = "(//input[@aria-label='Annual Income'])[1]")
		private WebElement annualIncome;
		
		@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment poChoiceEmployee choice-radio-field lead-radio-container choiceEmployee'])[1]")
		private WebElement empYes;
		
		@FindBy (xpath = "(//div[@class='guideRadioButtonItem afRadioButtonItem guideFieldHorizontalAlignment poChoiceEmployee choice-radio-field lead-radio-container choiceEmployee'])[2]")
		private WebElement empNo;
		
		
		//================================================= GET METHOD ================================================\\
		
		public WebElement getannualIncome () {
			return annualIncome;
		}
		
		public WebElement empYes () {
			return empYes;
		}
		
		public WebElement empNo () {
			return empNo;
		}
	
	
		//============================================================================  WEBPAGE 4  ===================================================================\\
		
		//======== Invest For =========== 

		@FindBy(xpath  = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-1_widget']")
		private WebElement self;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-2_widget']")
		private WebElement spouse;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-3_widget']")
		private WebElement child;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-4_widget']")
		private WebElement grandChild;
		
		// ========= Name ===========
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel-guidetextbox___widget']")
		private WebElement spouseFirstName;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel-guidetextbox_copy___widget']")
		private WebElement spouseMiddleName;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel-guidetextbox_copy_11888536___widget']")
		private WebElement spouseLastName;
		
		// ======= Spouse Detail =======
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-guideradiobutton__-1_widget']")
		private WebElement spouseMale;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-guideradiobutton__-2_widget']")
		private WebElement spouseFemale;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-guideradiobutton__-1_widget']")
		private WebElement spouseTransgender;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-guidedatepicker___widget']")
		private WebElement spouseDob;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-guideemail___widget']")
		private WebElement spouseEmailId;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1139186743-panel-guidenumericbox___widget']")
		private WebElement spouseMobileNumber;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_1720780087-guidetextbox___widget']")
		private WebElement spousePincode;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_1051985890-panel_514457067-guidenumericbox_5100___widget']")
		private WebElement spouseAnnualIncome;
		
		// Premium Payment Frequency
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-1_widget']")
		private WebElement annually;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-2_widget']")
		private WebElement halfYearly;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-3_widget']")
		private WebElement quarterly;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-4_widget']")
		private WebElement monthly;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-5_widget']")
		private WebElement single;
		
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-panel-guidenumericbox___widget']")
		private WebElement amountInvest;
		
		//================================================= GET METHOD ================================================\\
		
		public WebElement self () {
			return self;
		}
		
		public WebElement spouse () {
			return spouse;
		}
		
		public WebElement child () {
			return child;
		}
		
		public WebElement grandChild () {
			return grandChild;
		}
		
		//===== Name ======
		
		public WebElement spouseFirstName () {
			return spouseFirstName;
		}
		
		public WebElement spouseMiddleName () {
			return spouseMiddleName;
		}
		
		public WebElement spouseLastName () {
			return spouseLastName;
		}
		
		//======= Spouse Detail =======
		
		public WebElement spouseMale () {
			return spouseMale;
		}
		
		public WebElement spouseFemale () {
			return spouseFemale;
		}
		
		public WebElement spouseTransgender () {
			return spouseTransgender;
		}
		
		public WebElement spouseDob () {
			return spouseDob;
		}
		
		public WebElement spouseEmailId () {
			return spouseEmailId;
		}
		
		public WebElement spouseMobileNumber () {
			return spouseMobileNumber;
		}
		
		public WebElement spousePincode () {
			return spousePincode;
		}
		
		public WebElement spouseAnnualIncome () {
			return spouseAnnualIncome;
		}
		
		//========== PPF =============
		
		public WebElement annually () {
			return annually;
		}
		
		public WebElement halfYearly () {
			return halfYearly;
		}
		
		public WebElement quarterly () {
			return quarterly;
		}
		
		public WebElement monthly () {
			return monthly;
		}
		
		public WebElement single () {
			return single;
		}
		
		
		public WebElement amountInvest () {
			return amountInvest;
		}

//============================================================================  WEBPAGE 5  ===================================================================\\

		// Benefit Type
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel_1995255909-panel-guideradiobutton_113848271__-1_widget']")
		private WebElement lumpsump;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel_1995255909-panel-guideradiobutton_113848271__-2_widget']")
		private WebElement regularIncome;
	
		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
		private WebElement getQuote;
		
		//================================================= GET METHOD ================================================\\

		public WebElement lumpsump () {
			return lumpsump;
		}
		
		public WebElement regularIncome () {
			return regularIncome;
		}
		
		public WebElement getQuote () {
			return getQuote;
		}
		
//============================================================================  WEBPAGE 6  ===================================================================\\
		
	// Endowment Benefit
		
	@FindBy (xpath = "//div[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel-panel1686751506034-panel_776881033-panel1594291407024-panel-panel1594291495754_c_1031117886__']")
	private WebElement endowmentBenefit_Second;
	
	@FindBy (xpath = "//label[text()='Payor Premium Protection Cover']")
	private WebElement ebPPPC_check;
	
	// Income Benefit
	
	@FindBy (xpath = "//li[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel-panel1686751506034-panel_776881033-panel1602832081639___guide-item-nav']")
	private WebElement incomeBenefit;
	
	@FindBy (xpath = "//div[@id='guideContainer-rootPanel-panel-panel1602840994127-panel-panel_2030159564-panel-panel1686751506034-panel_776881033-panel1602832081639-panel-panel1594291495754_c_827377756__']")
	private WebElement incomeBenefit_Second;
	
	@FindBy (xpath = "//label[text()='Payor Premium Protection Cover.']")
	private WebElement ibPPPC_check;
	
	
	@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton___widget']")
	private WebElement proceed;
	
	
	
	
	
	//================================================= GET METHOD ================================================\\

	
	public WebElement endowmentBenefit_Second () {
		return endowmentBenefit_Second;
	}
	
	public WebElement ebPPPC_check () {
		return ebPPPC_check;
	}
	
	
	public WebElement incomeBenefit () {
		return incomeBenefit;
	}
	
	public WebElement incomeBenefit_Second () {
		return incomeBenefit_Second;
	}
	
	
	public WebElement ibPPPC_check () {
		return ibPPPC_check;
	}
	
	public WebElement proceed () {
		return proceed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}