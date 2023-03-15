package swagLabsGlobalProperties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	
	public static ExtentReports report() {
		String path = System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter sReporter = new ExtentSparkReporter(path);
		sReporter.config().setReportName("Web Automation Result");
		sReporter.config().setDocumentTitle("SwagLabs Test Result");
		ExtentReports exReports = new ExtentReports();
		exReports.attachReporter(sReporter);
		exReports.setSystemInfo("Tester", "Abdul BasithØ");
		return exReports;
		
	}

}
