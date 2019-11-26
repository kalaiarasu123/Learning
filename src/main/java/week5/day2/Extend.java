package week5.day2;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extend {
	public ExtentReports report;
	public ExtentTest test;
	public void startreport() {
		Date d = new Date();
		//String s1 = d.toString().replace("-", "_")+".html";
		report = new ExtentReports(System.getProperty("user.dir")+"\\Report\\one.html",true,DisplayOrder.NEWEST_FIRST);
		test = report.startTest("Generate Extent Report");
		test.log(LogStatus.INFO, "Test1");
		test.log(LogStatus.PASS, "Test1");
		test.log(LogStatus.FAIL, "Test1");
		test.log(LogStatus.ERROR, "Test1");
		test.log(LogStatus.FATAL, "Test1");
		report.flush();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extend ex =new Extend();
		ex.startreport();

	}

}
