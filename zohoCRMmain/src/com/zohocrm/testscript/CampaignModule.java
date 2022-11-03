package com.zohocrm.testscript;

import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.ZohoCrmCreateCampaign;
import com.zohocrm.pom.ZohoCrmDisplayingCustomViewDetails;
import com.zohocrm.pom.ZohoCrmHomePage;

public class CampaignModule extends BaseClass {
	
	
	@Test
	
	public void testCreateCampign() {
		ZohoCrmHomePage zh =new ZohoCrmHomePage(driver);
		
		zh.setCampaigntab();
		ZohoCrmDisplayingCustomViewDetails zd=new ZohoCrmDisplayingCustomViewDetails(driver);
		zd.setNewcampaignbtn();
		ZohoCrmCreateCampaign z = new ZohoCrmCreateCampaign(driver);
		z.setCampignnametbx("alexa");
		z.setTextdropdown("Advertisement");
		z.setSavebtn();
		
		zh.setCampaigntab();
		zd.setEdit2btn("alexa");
		
		
		
		
	}

}
