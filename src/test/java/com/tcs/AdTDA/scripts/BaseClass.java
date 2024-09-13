package com.tcs.AdTDA.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

public class BaseClass
{
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeClass
	public void openBrowser(String browsername)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void openApp()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterMethod
	public void testmethodexecutionstatus(ITestResult result)
	{

	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
