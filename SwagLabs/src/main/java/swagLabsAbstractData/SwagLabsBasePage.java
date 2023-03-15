package swagLabsAbstractData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import swagLabsmirorPages.SwagLabsLandingPage;

public class SwagLabsBasePage {
	public WebDriver driver;
	public Properties properties;
	public SwagLabsLandingPage landingPage;

	public WebDriver browser() throws IOException {
		properties = new Properties();
		FileInputStream stream = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/swagLabsGlobalProperties/globalData.properties");
		properties.load(stream);
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
				: properties.getProperty("browser");
		// String browserName = properties.getProperty("browser");
		if (browserName.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public void websiteLaunch() {
		driver.get(properties.getProperty("website"));

	}

	@BeforeMethod(alwaysRun = true)
	public SwagLabsLandingPage initializeDriver() throws IOException {
		browser();
		websiteLaunch();
		landingPage = new SwagLabsLandingPage(driver);
		return landingPage;

	}

	@AfterMethod(alwaysRun = true)
	public void websiteClose() {
		driver.close();
	}

	@DataProvider
	public Object[][] users() {
		Object[][] userData = new Object[4][2];
		userData[0][0] = "standard_user";
		userData[0][1] = "secret_sauce";

		userData[1][0] = "locked_out_user";
		userData[1][1] = "secret_sauce";

		userData[2][0] = "problem_user";
		userData[2][1] = "secret_sauce";

		userData[3][0] = "performance_glitch_user";
		userData[3][1] = "secret_sauce";
		return userData;
	}

	public List<HashMap<String, String>> readFileFromJson(String filePath) throws IOException {
		String jsondata = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsondata,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;

	}

	public String screenshot(String testName, WebDriver driver) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "/Reports/" + testName + ".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir") + "/Reports/" + testName + ".png";
	}

}
