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
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-2_widget']")
		private WebElement child;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-2_widget']")
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
		
		
		
		// Premium Payment Frequency
		
	
		
//		
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
		
		
		//========== PPF =============
		

//============================================================================  WEBPAGE 5  ===================================================================\\

		
	
		
		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
		private WebElement get_Quote;
		
		//================================================= GET METHOD ================================================\\


		
//============================================================================  WEBPAGE 4  ===================================================================\\

		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel_1995255909-panel-guideradiobutton_113848271__-2_widget']")
		private WebElement regular_Income;
		
		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
		private WebElement continue5;
		
		//================================================= GET METHOD ================================================\\
		

		public WebElement getregular_Income() {
			return regular_Income;
		}
		
		public WebElement getget_Quote() {
			return get_Quote;
		}
		
//============================================================================  WEBPAGE 5  ===================================================================\\

		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-panel-panel1602840994127-panel_495801424-panel1606803587832-guidebutton___widget']")
		private WebElement proceed;
		
		//================================================= GET METHOD ================================================\\
		
		public WebElement getproceed() {
			return proceed;
		}

		public WebElement getcontinue5() {
			return continue5;
		}
		

}
