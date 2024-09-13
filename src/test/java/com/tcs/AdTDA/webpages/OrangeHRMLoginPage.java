package com.tcs.AdTDA.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage 
{
	//var declaration
	@FindBy(xpath =".//input[@name='username']" ) private WebElement username;
	@FindBy(xpath =".//input[@name='password']") private WebElement password;
	@FindBy(xpath=".//button[text()=' Login ']")  private WebElement loginbutton;
	@FindBy(xpath=".//p[text()='Forgot your password? ']") private WebElement forgotpwd;
	@FindBy(xpath=".//p[text()='Invalid credentials']")  private WebElement errormsg;
	
	//var intialization
	public OrangeHRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//var utilization
	public void setCredentials(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
	public void clickOnForgotPasswordLink()
	{
		forgotpwd.click();
	}
	public boolean verifyErrormsgDisplayed()
	{
		return errormsg.isDisplayed();
	}
	
	
	
	
	
	
}
