package basith301BasePageTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import basith301.AppPage.LandingPage;

public class BasePageTest {

	public WebDriver driver;
	public LandingPage lPage;
	public Properties prop;
	public FileInputStream fis;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") 
				+ "/src/main/java/basith301/resources/GlobalData.properties");
		prop.load(fis);
		String browserName =  System.getProperty("browser")!=null ? 
				System.getProperty("browser") :prop.getProperty("browser");
		
		if (browserName.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless")) {
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1440, 900));
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		//driver.get(prop.getProperty("wabsite"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}
	public List<HashMap<String,String>> getjsonDataToMap(String filePath) throws IOException {		
		String jsonContent = FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);				
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
		});
		return data;
		
		}
	

	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ss =  (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"/reports/"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"/reports/"+testCaseName+".png";

	}

	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();
		lPage = new LandingPage(driver);
		lPage.goTo();
		return lPage;
	}

	@AfterMethod(alwaysRun = true)
	public void driverClose() {
		driver.close();
	}

}
