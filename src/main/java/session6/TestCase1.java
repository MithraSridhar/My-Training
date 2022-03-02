package session6;

import org.testng.annotations.Test;

public class TestCase1 extends GenericWrappers {
	
	@Test	
	public void testCase1() {
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "AonHewitt");
		enterById("createLeadForm_firstName", "Mithra");
		enterById("createLeadForm_lastName", "Sridhar");
		selectIndexById("createLeadForm_dataSourceId", 2);
		selectIndexById("createLeadForm_marketingCampaignId", 2);
		enterById("createLeadForm_primaryPhoneNumber", "9551308775");
		enterById("createLeadForm_primaryEmail", "mithugopal30@gmail.com");
		clickByXpathNoSnap("//input[@class='smallSubmit']");
		System.out.println(getTextById("viewLead_companyName_sp"));
		closeBrowser();
		closeAllBrowsers();
	}
	
	@Test	
	public void testCase2() {
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "AonHewitt");
		enterById("createLeadForm_firstName", "Mithra");
		enterById("createLeadForm_lastName", "Sridhar");
		selectIndexById("createLeadForm_dataSourceId", 2);
		selectIndexById("createLeadForm_marketingCampaignId", 2);
		enterById("createLeadForm_primaryPhoneNumber", "9551308775");
		enterById("createLeadForm_primaryEmail", "mithugopal30@gmail.com");
		clickByXpathNoSnap("//input[@class='smallSubmit']");
		System.out.println(getTextById("viewLead_companyName_sp"));
		closeBrowser();
		closeAllBrowsers();
	}
}
