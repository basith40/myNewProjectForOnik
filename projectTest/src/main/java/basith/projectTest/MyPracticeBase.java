package basith.projectTest;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyPracticeBase {
  public WebDriver driver;
  public Properties prop;
  public void screenShot(String testcasename, WebDriver driver) throws IOException {
	  TakesScreenshot tss = (TakesScreenshot)driver;
	  File origin = tss.getScreenshotAs(OutputType.FILE);
	  String location = System.getProperty("user.dir")+"//reports//"+testcasename+".png";
	  FileUtils.copyDirectory(origin, new File(location));

  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  prop = new Properties();
	  FileInputStream stream = new FileInputStream("/Users/chowdhury/eclipse/projectTest/src/main/java/basith/projectTest/MyPractice.properties");
	  prop.load(stream);
	  prop.getProperty("browser");
	  String myURL = prop.getProperty("url");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(myURL);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
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

}
