package com.tcs.AdTDA.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMPasswordResetPage
{
	private WebElement username;
	private WebElement cancelbutton;
	private WebElement resetbutton;
	
	public OrangeHRMPasswordResetPage(WebDriver driver)
	{
		username=driver.findElement(By.xpath(".//input[@name='username']"));
		resetbutton=driver.findElement(By.xpath(".//button[text()=' Reset Password ']"));
		cancelbutton=driver.findElement(By.xpath(".//button[text()=' Cancel ']"));
	}
	public void enterUsername(String un)
	{
		username.sendKeys(un);
	}
	public void clickOnResetPasswordButton()
	{
		resetbutton.click();
	}
	public void clickOnCancelButton()
	{
		cancelbutton.click();
	}

}
