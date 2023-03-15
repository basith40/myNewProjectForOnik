package learningBase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
  public WebDriver driver;
  public Properties prop;
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  FileInputStream fis = new FileInputStream("/Users/chowdhury/eclipse/LearningProject/src/main/java/utility/projectData.utility"); 
	  prop.load(fis);
	  String appBrowser = prop.getProperty("browser");
	  prop.getProperty("url");
	  if(appBrowser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		  driver = new ChromeDriver();
	  }
	  else if(appBrowser.equals("firefox")) {
		  System.setProperty("webdriver.firefox.driver", "/Users/chowdhury/Downloads/geckodriver");
		  driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }


 
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

}
