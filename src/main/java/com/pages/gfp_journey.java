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
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guidecheckbox__-1_widget']")
		private WebElement empYes;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576-panel-guidecheckbox__-2_widget']")
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
		
		@FindBy(xpath="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-1_widget']")
		private WebElement self;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-guideradiobutton__-2_widget']")
		private WebElement spouse;
		
		@FindBy (xpath = "//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guideradiobutton__-4_widget']")
		private WebElement month;
		
		@FindBy (xpath ="//input[@id='guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-panel-guidenumericbox___widget']")
		private WebElement amountInvest;

		@FindBy (xpath = "(//label[text()='Premium Payment Term'])[1]")
		private WebElement premium_payment;
		
		@FindBy (xpath = "//li[text()='5 Years']")
		private WebElement Five_Year;
		
		@FindBy (xpath = "//li[@id='select2-guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guidedropdownlist___jqName-5w-result-wsi0-7']")
		private WebElement seven_year;
			
		@FindBy (xpath= "//*[@id=\"guideContainer-rootPanel-leadFormPanels-panel-panel1593077199576_c-panel-panel_443878357-panel_129979636-guidedropdownlist__\"]/div[2]/span[1]")	 	
		private WebElement premiumAmount;
		
		@FindBy (xpath = "//li[text()='5 Years']")
		private WebElement five_Year;
		
		@FindBy (xpath ="//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
		private WebElement contine4;
		
//		
		//================================================= GET METHOD ================================================\\
		
		public WebElement getself () {
			return self;
		}
		
		public WebElement getspouse () {
			return spouse;
		}
		
		public WebElement getmonth () {
			return month;
		}
		
		public WebElement getamountInvest () {
			return amountInvest;
		}
		

		public WebElement getpremium_payment() {
			return premium_payment;
		}
		
		public WebElement get_Five_Year() {
			return Five_Year;
		}
		
		public WebElement getseven_year() {
			return seven_year;
		}

//============================================================================  WEBPAGE 5  ===================================================================\\

		
	
		
		@FindBy (xpath = "//button[@id='guideContainer-rootPanel-leadFormPanels-guidebutton___widget']")
		private WebElement get_Quote;
		
		//================================================= GET METHOD ================================================\\


		public WebElement getpremiumAmount() {
			return premiumAmount;
		}
		
		public WebElement getfive_Year() {
			return five_Year;
		}
		
		public WebElement getcontine4() {
			return contine4;
		}
		
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
