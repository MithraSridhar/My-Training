package session6;

import org.testng.annotations.Test;

public class TestCase4 extends GenericWrappers{
	
	@Test
	public void m1() {
		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "ABC");
		enterById("createLeadForm_firstName", "BHN");
		enterById("createLeadForm_lastName", "NJK");
		selectIndexById("createLeadForm_dataSourceId", 3);
		selectIndexById("createLeadForm_marketingCampaignId", 4);
		enterById("createLeadForm_primaryPhoneNumber", "7865789098");
		enterById("createLeadForm_primaryEmail", "dhek@gmail.com");
		clickByXpathNoSnap("//input[@class='smallSubmit']");
		getTextById("viewLead_companyName_sp");
		closeBrowser();
	}

}
