package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoogleBase {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fStream;

	public WebDriver browserAndWebsiteSelect() throws IOException {
		prop = new Properties();
		fStream = new FileInputStream(System.getProperty("user.dir")
				+"/src/main/java/resource/data.properties");
		prop.load(fStream);
		String browserName = System.getProperty("browser")!=null ?
				System.getProperty("browser") : prop.getProperty("browser");
		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if (browserName.equalsIgnoreCase("safari")) {
			driver =new SafariDriver();
		}
		driver.get(prop.getProperty("website"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
				
	}
	@BeforeMethod(alwaysRun = true)
	public void initializeDriverAndBrowser() throws IOException {
		driver = browserAndWebsiteSelect();
		
		
	}
	@AfterMethod(alwaysRun = true)
	public void browserClose() {
		driver.quit();
	}
	
	
	
		
	

}
