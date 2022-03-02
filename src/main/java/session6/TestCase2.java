package session6;

import org.testng.annotations.Test;

public class TestCase2 extends GenericWrappers {
	@Test
	public void testCase2() throws InterruptedException {
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//input[@id='ext-gen248']", "Mithra");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		Thread.sleep(3000);
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		Thread.sleep(3000);
		enterById("updateLeadForm_companyName", "AW");
		clickByClassName("smallSubmit");
		Thread.sleep(3000);
		verifyTextById("viewLead_companyName_sp", "AW");
		closeBrowser();
	}
}
