package PageObjests;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initalizeDriver() throws Exception {
	FileInputStream stream = new FileInputStream("/Users/chowdhury/eclipse-workspace/E2EProject/src/main/java/Resources/data.Propertise");
    prop = new Properties();
    prop.load(stream);
    prop.getProperty("url");
    String browserName = prop.getProperty("browser");
    if (browserName.equalsIgnoreCase("chrome")) {
    	System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
        driver = new ChromeDriver();
	}
    else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.firefox.driver", " ");
		driver = new FirefoxDriver();
	}
    else if (browserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", " ");
		driver = new InternetExplorerDriver();
	}  
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    return driver;
	
    }
	
}
