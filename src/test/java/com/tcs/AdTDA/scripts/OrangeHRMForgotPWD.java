package com.tcs.AdTDA.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.tcs.AdTDA.webpages.OrangeHRMLoginPage;
import com.tcs.AdTDA.webpages.OrangeHRMPasswordResetPage;





public class OrangeHRMForgotPWD extends BaseClass
{
	@Test
	public void forgotPWD()
	{
		
		//click on forgotpwd link---->Loginpage<---- Loginpage instance
		OrangeHRMLoginPage loginpage=new OrangeHRMLoginPage(driver);
		loginpage.clickOnForgotPasswordLink();
		//enter username----> resetpage----->restpage instance
		OrangeHRMPasswordResetPage restpage=new OrangeHRMPasswordResetPage(driver);
		restpage.enterUsername("Anvesh");
		restpage.clickOnResetPasswordButton();
		
	}

}
