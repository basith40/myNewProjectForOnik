package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SauceExtentReports {
	static ExtentReports extent;
	public static ExtentReports saucereport() {
		String reportLocation = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter esr = new ExtentSparkReporter(reportLocation);
		esr.config().setReportName("Automation Test");
		esr.config().setDocumentTitle("Sauce Test Result");
		extent = new ExtentReports();
		extent.attachReporter(esr);
		extent.setSystemInfo("Tester", "Abdul Chowdhury");
		return extent;
	}

}
