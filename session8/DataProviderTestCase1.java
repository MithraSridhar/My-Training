package session8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCase1 extends GenericWrappers {
	
	@Test(dataProvider="fetchData")
	public void testCase1(String CN, String FN, String LN,String PN) {
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", CN);
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", LN);
		selectIndexById("createLeadForm_dataSourceId", 2);
		selectIndexById("createLeadForm_marketingCampaignId", 2);
		enterById("createLeadForm_primaryPhoneNumber", PN);
		enterById("createLeadForm_primaryEmail", "mithugopal30@gmail.com");
		clickByXpathNoSnap("//input[@class='smallSubmit']");
		System.out.println(getTextById("viewLead_companyName_sp"));
		closeBrowser();
		closeAllBrowsers();
	}
	
	@DataProvider(name="fetchData",parallel=true)
	//@DataProvider(name="fetchData")
	public String[][] getData() {
		String[][] data = new String[3][4];
		data[0][0]="ABC";
		data[0][1]="ADE";
		data[0][2]="J";
		data[0][3]="9551308775";
		
		data[1][0]="XYZ";
		data[1][1]="WXK";
		data[1][2]="M";
		data[1][3]="9003565443";
		
		data[2][0]="XYZ";
		data[2][1]="WXK";
		data[2][2]="M";
		data[2][3]="9003565443";		
		return data;		
	}	
	
}
