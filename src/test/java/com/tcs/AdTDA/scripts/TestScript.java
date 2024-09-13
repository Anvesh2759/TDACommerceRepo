package com.tcs.AdTDA.scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestScript
{
	@Test
	public void executeScript()
	{
		//@before test
		ExtentSparkReporter report=new ExtentSparkReporter("../AdTDA/reports/extentreport.html");
		report.config().setDocumentTitle("SampleReport");
		report.config().setReportName("AdTDA Report");
		report.config().setTheme(Theme.DARK);
		
		ExtentReports ex=new ExtentReports();
		ex.attachReporter(report);
		
		//After Method
		ExtentTest test = ex.createTest("Sample Test");
		test.log(Status.PASS, "Script pass");
		
		//After test
		ex.flush();
		
	}

}
