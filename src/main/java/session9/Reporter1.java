package session9;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporter1 {
	
	 ExtentReports extent;
	
	 ExtentTest test;
	 String testCaseName,testDescription;
	 
	 public ExtentReports startResult() {
		 extent = new ExtentReports("./reports/result.html",true);
		 extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
		 return extent;
	 }
	 
	 public ExtentTest startTest(String testCaseName, String testDescription ) {
		 test=extent.startTest(testCaseName, testDescription);
		 return test;
	 }
	 
	 public void reportStep(String status, String testDescription) {
		 long snapnumber=takeSnap();
		 
		 if(status.equalsIgnoreCase("PASS")) {
			 test.log(LogStatus.PASS, testDescription+test.addScreenCapture("./reports/images/"+snapnumber+".jpg"));
		 }
		 
		 else if(status.equalsIgnoreCase("FAIL")) {
			 test.log(LogStatus.FAIL, testDescription+test.addScreenCapture("./reports/images/"+snapnumber+".jpg"));
		 }
	 }
	 
	public abstract long takeSnap();
	
	public void endTest() {
		extent.endTest(test);
	}
	
	public void endResult() {
		extent.flush();
	}

}
