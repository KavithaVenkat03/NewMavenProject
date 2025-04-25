package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage lp;
	
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		launchbrowser();
		basicSetUp();
		lp = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateTitle()
	{
		String title = lp.getTitleOfAppl();
		Assert.assertEquals(title, "Swag Labs");
		
	}
	@Test(priority=2)
	public void validateURL()
	{
		String URL = lp.getURLofAppl();
		Assert.assertEquals(URL, prop.getProperty("url"));
	}
	
	@Test(priority=3)
	public void loginUser() throws InterruptedException
	{
		lp.loginUser(prop.getProperty("uname"), prop.getProperty("psw"));
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
