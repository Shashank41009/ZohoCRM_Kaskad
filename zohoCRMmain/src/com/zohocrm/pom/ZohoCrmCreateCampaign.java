package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZohoCrmCreateCampaign {
	
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campignnametbx;
	
	@FindBy(name ="property(Type)")
	private WebElement textdropdown;
	
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement savebtn;
	
	
	public ZohoCrmCreateCampaign(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	/**
	 * @param campignnametbx the campignnametbx to set
	 */
	public void setCampignnametbx(String name) {
		 campignnametbx.sendKeys(name);;
	}


	/**
	 * @param textdropdown the textdropdown to set
	 */
	public void setTextdropdown(String text) {
		 textdropdown.click();
		 
		 Select s = new Select(textdropdown);
		 s.selectByVisibleText(text);
	}



	

	/**
	 * @param savebtn the savebtn to set
	 */
	public void setSavebtn() {
		savebtn.click();
	}
	
	
	
	
	
	
	
	

}
