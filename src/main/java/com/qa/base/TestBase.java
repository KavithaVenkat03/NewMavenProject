package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	FileInputStream fis;
	public  TestBase() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\kavit\\EclipseProject\\POM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
	}
	
	public void launchbrowser()
	{
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
	}
	
	public void basicSetUp() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
	

}
