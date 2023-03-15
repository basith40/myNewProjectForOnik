package basith301.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports getExtentReport() {
		
		String path = System.getProperty("user.dir")+"//testReport/indet.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);
		sparkReporter.config().setReportName("OrderSubmitReport");
		sparkReporter.config().setDocumentTitle("MY Test Report");
		
		ExtentReports eReports = new ExtentReports();
		eReports.attachReporter(sparkReporter);
		eReports.setSystemInfo("Tester", "Abdul Basith Chowdhury");
		eReports.createTest(path);
		return eReports;
	}

}
