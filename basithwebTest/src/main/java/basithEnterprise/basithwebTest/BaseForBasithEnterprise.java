package basithEnterprise.basithwebTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseForBasithEnterprise {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.zillow.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
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