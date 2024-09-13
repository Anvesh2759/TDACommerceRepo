package com.tcs.AdTDA.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tcs.AdTDA.webpages.OrangeHRMLoginPage;



public class OrangeHRMLogin extends BaseClass
{
	@DataProvider
	public Object[][] loginTestData()
	{
		Object[][] rv=new String[2][2];
		rv[0][0]="Admin123";
		rv[0][1]="admin123";
		rv[1][0]="Admin";
		rv[1][1]="admin123";
		
		return rv;
	}
	@Test(dataProvider = "loginTestData")
	public void loginToOrangeHRM(String un,String pwd)
	{
		
		//enter un and pwd-----> loginpage <----- instance of Loginpage---->executing const
		OrangeHRMLoginPage loginpage=new OrangeHRMLoginPage(driver);
		//PageFactory.initElements(driver, loginpage);
		loginpage.setCredentials(un, pwd);
		loginpage.clickOnLoginButton();
		boolean value = loginpage.verifyErrormsgDisplayed();
		Assert.assertTrue(value);
	
	}
}
