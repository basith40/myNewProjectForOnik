package bdtuch.EProject;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class Base {
  public WebDriver driver;
  public Properties prop;
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  prop = new Properties();
	  FileInputStream stream = new FileInputStream("/Users/chowdhury/eclipse-workspace/EProject/src/main/java/properties/data.properties");
	  prop.load(stream);
	  String appBrowser = prop.getProperty("browser");
	  
	  if (appBrowser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
	}
	  else if (appBrowser.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", "//Users/chowdhury//Downloads//geckodriver");
		driver = new FirefoxDriver();				
	}
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  @DataProvider
  public Object[][] getData() {
	   Object[][]data =  new Object[1][2];
	   data[0][0]= "Admin";
	   data[0][1]= "admin123";
//	   data[1][0]= "basith301@yahoo.com";
//	   data[1][1]= "785bast";
	   return data;
  }

}
