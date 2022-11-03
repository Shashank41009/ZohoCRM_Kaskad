package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoCrmHomePage {
	
	
	@FindBy(xpath="//a[@href=\"/crm/logout.sas\"]")
	private WebElement logoutbtn;
	
	@FindBy(linkText = "Home")
	private WebElement hometab;
	
	@FindBy(linkText = "Leads")
	private WebElement leadtab;
	
	@FindBy(linkText = "Accounts")
	private WebElement accounttab;
	
	@FindBy(linkText = "Contacts")
	private WebElement contacttab;
	
	@FindBy(linkText ="Potentials")
	private WebElement potentialtab;
	
	
	
	@FindBy(linkText ="Campaigns")
	private WebElement campaigntab;
	
	
	
	@FindBy(linkText ="Vendors")
	private WebElement vendortab;
	
	
	
	

	@FindBy(linkText ="Sales Orders")
	private WebElement salesOrdertab;
	
	
	@FindBy(linkText ="Purchase Orders")
	private WebElement purchaseOrdertab;
	
	

	@FindBy(linkText ="Invoices")
	private WebElement invoicetab;
	
	
	
	
	
	
	

	/**
	 * @param hometab the hometab to set
	 */
	public void setHometab() {
		 hometab.click();
	}

	/**
	 * @param leadtab the leadtab to set
	 */
	public void setLeadtab() {
		leadtab.click();
	}

	/**
	 * @param accounttab the accounttab to set
	 */
	public void setAccounttab() {
		accounttab.click();
	}

	/**
	 * @param contacttab the contacttab to set
	 */
	public void setContacttab() {
		 contacttab.click();
	}

	/**
	 * @param potentialtab the potentialtab to set
	 */
	public void setPotentialtab() {
		potentialtab.click();
	}

	/**
	 * @param campaigntab the campaigntab to set
	 */
	public void setCampaigntab() {
		campaigntab.click();
	}

	/**
	 * @param vendortab the vendortab to set
	 */
	public void setVendortab() {
		vendortab.click();
	}

	/**
	 * @param salesOrdertab the salesOrdertab to set
	 */
	public void setSalesOrdertab() {
		 salesOrdertab.click();;
	}

	/**
	 * @param purchaseOrdertab the purchaseOrdertab to set
	 */
	public void setPurchaseOrdertab() {
	 purchaseOrdertab.click();
	}

	/**
	 * @param invoicetab the invoicetab to set
	 */
	public void setInvoicetab() {
		 invoicetab.click();
	}

	public ZohoCrmHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogout()
	{
		logoutbtn.click();
	}
	
	
	
	
	

}
