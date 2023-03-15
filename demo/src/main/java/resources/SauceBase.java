package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceBase {
	public WebDriver driver;
	public Properties prop;
	public WebDriver getBrowser() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/sauce.properties");
		prop.load(fis);
		//String myBrowser = System.getProperty("browser");
		String myBrowser = prop.getProperty("browser");
		if(myBrowser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		else if(myBrowser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			if(myBrowser.contains("headless")) {

				option.addArguments("headless");
			}
			driver = new ChromeDriver(option);

		}
		else if(myBrowser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fOption = new FirefoxOptions();
			if(myBrowser.contains("headless")) {
				fOption.addArguments("headless");
			}
			driver = new FirefoxDriver(fOption);
		}
		String myURL = prop.getProperty("url");
		driver.get(myURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		return driver;	
	}
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("usir.dir")+"//reports//"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}
}


