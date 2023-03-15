package websiteInspect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AppleTest {
	String pathString ;
	ExtentReports reports;
	@BeforeTest
	public void report() {
		pathString  = System.getProperty("user.dir")+"/report/ta.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(pathString);
		reporter.config().setDocumentTitle("Apple Report");
		reporter.config().setReportName("Apple");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "Maisha Chowdhury");
	}
	@AfterTest
	public void end() {
		reports.flush();
	}
	@Test

	public void apple() throws InterruptedException {
		ExtentTest test = reports.createTest("Apple");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://www.apple.com/");
		driver.findElement(By.id("globalnav-menubutton-link-bag")).click();
		driver.findElement(By.cssSelector("[data-autom='sign-in']")).click();
		driver.close();
		test.addScreenCaptureFromBase64String(pathString);
		
	}

}
