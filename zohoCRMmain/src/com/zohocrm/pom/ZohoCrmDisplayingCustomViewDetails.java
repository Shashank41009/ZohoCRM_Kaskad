package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ZohoCrmDisplayingCustomViewDetails {

	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcampaignbtn;
	
	@FindBy(xpath="(//td[@class='mainLayer']//a[text()='Edit'])[2]/../../../td[3]/a")
	private WebElement edit2btn;
	
	public ZohoCrmDisplayingCustomViewDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @param newcampaignbtn the newcampaignbtn to set
	 */
	public void setNewcampaignbtn() {
		 newcampaignbtn.click();
	}

	/**
	 * @param name1 
	 * @param edit2btn the edit2btn to set
	 */
	public void setEdit2btn(String name1) {
		String name = edit2btn.getText();
		Assert.assertEquals(name, name1);
		Reporter.log("pass",true);
		
	}
	
	
	
}
