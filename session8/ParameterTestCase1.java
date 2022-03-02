package session8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestCase1 extends GenericWrappers {
	@Parameters({"URL","Username","Password"})
	@Test
	public void testCase1(String url,String UN,String PW) {
		invokeApp("Chrome", url);
		enterById("username", UN);
		enterById("password", PW);
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
