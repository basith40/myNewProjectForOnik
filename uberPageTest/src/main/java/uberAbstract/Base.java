package uberAbstract;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver getBrowser() throws IOException {
		prop = new Properties();
		FileInputStream stream = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/uberGlobleProperties/data.properties");
		prop.load(stream);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	public void screenshot(String testCaseName) throws IOException {
		File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot, new File(System.getProperty("user.dir") + "/reports/" + testCaseName + ".png"));
	}

	@BeforeMethod(alwaysRun = true)
	public void initializeDriver() throws IOException {
		getBrowser();
	}

	@AfterMethod(alwaysRun = true)
	public void browserClose() {
	    driver.quit();
	}

}
