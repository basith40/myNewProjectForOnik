package amazonAbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AmazonBasePage {
    public WebDriver driver;
    public Properties prop;
    public WebDriver browser() throws IOException {
        prop = new Properties();
        FileInputStream stream = new FileInputStream(System.getProperty("user.dir")
                +"/src/main/java/amazonResources/GlobalData.properties");
        prop.load(stream);
        String browserName = System.getProperty("browser")!=null?
                System.getProperty("browser"): prop.getProperty("browser");
        if(browserName.contains("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.contains("safari")) {
            driver = new SafariDriver();
        }
        driver.get(prop.getProperty("page"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
    @BeforeMethod(alwaysRun = true)
    public void landingpage() throws IOException {
        browser();
    }
    @AfterMethod(alwaysRun = true)
    public void appClose(){
        driver.close();
    }
}
