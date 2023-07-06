package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gfp_journey_proposal_2 {
	
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
	
	public WebElement proceed () {
		return proceed;	
	}
}
