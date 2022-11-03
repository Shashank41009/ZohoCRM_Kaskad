package com.zohocrm.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.zohocrm.pom.ZohoCrmHomePage;
import com.zohocrm.pom.ZohoCrmSignIn;

public class BaseClass {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static WebDriver driver;
	
	FileLib f= new FileLib();	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(f.getPropertyData("url"));
		
		
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		ZohoCrmSignIn z = new ZohoCrmSignIn(driver);
		z.setusntbx(un);
		z.setpwdtbx(pwd);
		z.setlogibtn();
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ZohoCrmHomePage z = new ZohoCrmHomePage(driver);
		z.setlogout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
