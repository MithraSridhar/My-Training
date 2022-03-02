package session6;

import org.testng.annotations.Test;

public class TestCase3 extends GenericWrappers{
	@Test
	public void testCase3() throws InterruptedException{
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		Thread.sleep(3000);
		enterByXpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']//input)[13]","9551308775");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		String leadID = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		System.out.println("Lead ID is "+leadID+"");
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		Thread.sleep(3000);
		clickByClassName("subMenuButtonDangerous");
		Thread.sleep(3000);
		clickByLink("Find Leads");
		Thread.sleep(3000);
		enterByXpath("(//div[@class='x-form-element']//input)[22]", leadID);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		closeBrowser();
	}

}
