package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.generic.BaseClass;

public class ZohoCrmSignIn extends BaseClass{

	@FindBy(id="userName")
	private WebElement usntbx;
	
	
	@FindBy(id="passWord")
	private WebElement pwdtbx;
	
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement loginbtn;
	
	public ZohoCrmSignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void setusntbx(String name)
	{
		usntbx.sendKeys(name);
	}
	
	public void setpwdtbx(String pwd)
	{
		pwdtbx.sendKeys(pwd);
	}
	
	public void setlogibtn()
	{
		loginbtn.click();
	}
	
	
}
