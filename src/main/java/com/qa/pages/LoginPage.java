package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement uname;
	
	
	@FindBy(name="password")
	WebElement psw;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public LoginPage() throws IOException
	{
        super();
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitleOfAppl()
	{
		return driver.getTitle();
	}
	
	public String getURLofAppl()
	{
		return driver.getCurrentUrl();
	}
	 
	public void loginUser(String userName, String passWord) throws InterruptedException
	{
		Thread.sleep(2000);
		uname.sendKeys(userName);
		psw.sendKeys(passWord);
		loginBtn.click();
		//return new AddToCart();
	}
	

}
