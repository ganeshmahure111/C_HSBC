package com.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

@Listeners(com.utility.Listner.class) 
public class Library extends Base_Class {
	
	public static ExtentTest test;
	
	public static void Custom_SendKeys(WebElement element, String value, String fieldName)
	{
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldName+"==Value Succesfully Send " + value);
			log.info("Value Succesfully Send " +fieldName );
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			log.error("Unable to send value " + fieldName);
		}
	}
	
	public static void Custom_Click(WebElement element, String fieldName)
	{
		try {
			element.click();
			test.log(Status.PASS,fieldName+ "==Click Succesfully ");
			log.info("Click Succesfully " + fieldName);
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			log.error("Unable to click " + fieldName);
		}
	}
	
	public static void custom_HandleDrpDown(WebElement element,String text) 
	{
		try {
			Select select=new Select(element);
			select.selectByVisibleText(text);
			test.log(Status.PASS,text+ "==Click Succesfully ");
			log.info("Click Succesfully " + text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			test.log(Status.FAIL, e.getMessage());
			log.error("Unable to click "+ text);
		}	
	}
	
	public static void custom_clear(WebElement element, String fieldName) {
		try{
			element.clear();
			log.info("Click to clear"+ fieldName);
		}catch (Exception e) {
			log.error("Unable to clear"+ fieldName);
		}
	}
	
	public static void custom_Screenshot_SumAssured(String name) throws Exception 
	{
									
		String capture1=System.getProperty("user.dir")+"\\capture\\1_Sum_Assured\\"+ name  + ".png";
		TakesScreenshot scr1 =((TakesScreenshot)driver);
	    File SrcFile=scr1.getScreenshotAs(OutputType.FILE);
	    File DestFile=new File(capture1);
	    FileHandler.copy(SrcFile, DestFile);
	}
	
	public static void custom_Screenshot_ChoicePlan(String name) throws Exception 
	{
		String capture2=System.getProperty("user.dir")+"\\capture\\2_Choice_Plan\\" + name +".png";
		TakesScreenshot scr2 =((TakesScreenshot)driver);
	    File SrcFile2=scr2.getScreenshotAs(OutputType.FILE);
	    File DestFile2=new File(capture2);
	    FileHandler.copy(SrcFile2, DestFile2);
	}
	
	public static void custom_Screenshot_Rider(String name) throws Exception 
	{	
		String capture3=System.getProperty("user.dir")+"\\capture\\3_Rider\\" + name +".png";
		TakesScreenshot scr3 =((TakesScreenshot)driver);
	    File SrcFile3=scr3.getScreenshotAs(OutputType.FILE);
	    File DestFile3=new File(capture3);
	    FileHandler.copy(SrcFile3, DestFile3);
	}
	
	public static void custom_Screenshot_Rider_1(String name) throws Exception 
	{	
		String capture4=System.getProperty("user.dir")+"\\capture\\3_Rider\\CI_ADB\\" + name +".png";
		TakesScreenshot scr4 =((TakesScreenshot)driver);
	    File SrcFile4=scr4.getScreenshotAs(OutputType.FILE);
	    File DestFile4=new File(capture4);
	    FileHandler.copy(SrcFile4, DestFile4);
	}
	
	public static void custom_Screenshot_Rider_2(String name) throws Exception 
	{	
		String capture5=System.getProperty("user.dir")+"\\capture\\3_Rider\\ATPD_PPP\\" + name +".png";
		TakesScreenshot scr5 =((TakesScreenshot)driver);
	    File SrcFile5=scr5.getScreenshotAs(OutputType.FILE);
	    File DestFile5=new File(capture5);
	    FileHandler.copy(SrcFile5, DestFile5);
	}
	
	public static void custom_Screenshot_Payment(String name) throws Exception 
	{	
		String capture6=System.getProperty("user.dir")+"\\capture\\4_Payment\\" + name +".png";
		TakesScreenshot scr6 =((TakesScreenshot)driver);
	    File SrcFile6=scr6.getScreenshotAs(OutputType.FILE);
	    File DestFile6=new File(capture6);
	    FileHandler.copy(SrcFile6, DestFile6);
	}
	
	
	public static void custom_print_premium (WebElement element, String rupees) 
	{
			test.log(Status.INFO,rupees + "Total Premium");
			log.info("Total Premium is RS = " + rupees);
	}
	
	public static void custom_print( String fieldName) 
	{
		test.log(Status.INFO, fieldName);
		log.info( fieldName);
	}
			
	
	

}

