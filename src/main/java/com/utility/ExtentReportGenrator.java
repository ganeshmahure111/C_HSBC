package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String path=System.getProperty("user.dir")+"\\Reports\\Index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("AUTOMATION REPORTS");
		reporter.config().setReportName("Canara HSBC Life Insurance");
		reporter.config().setTheme(Theme.DARK);
	
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("PROJECT_NAME", "Canara HSBC Life Insurance");
		extent.setSystemInfo("TESTING",      "Automation Testing");
		extent.setSystemInfo("TOOL",         "Selenium");
		extent.setSystemInfo("QA_NAME",      "Ganesh_Mahure");
	
		return extent;
		
		
		
		
	}

}
