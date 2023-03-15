package bdTuch.extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTest {
	ExtentReports er;
	ExtentTest test;

	@BeforeTest
	public void config() {
		// ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir") + "/reports/index.html";
		ExtentSparkReporter esr = new ExtentSparkReporter(path);
		esr.config().setReportName("Basith Enterprise reports");
		esr.config().setDocumentTitle("Test Result");
		
		er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Tester", "Abdul Basith Chowdhury");
	}

	@Test
	public void saucedemoTest() {
		test = er.createTest("saucedemo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		System.out.println(driver.getTitle());
		driver.close();
		er.flush();
	}

}
