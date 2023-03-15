package OrangeHRABase;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	public WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }
   public void login(String userid,String passward, String clic) throws Exception {
	  Thread.sleep(1000);
		WebElement id = driver.findElement(By.id("txtUsername"));
		id.sendKeys(userid);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("txtPassword")); 
		pass.sendKeys(passward);
		Thread.sleep(1000);
		WebElement pos = driver.findElement(By.id("btnLogin"));
		pos.click();
			 
	}
//  public void timeing(String time, String atendence) throws Exception {
//	  Thread.sleep(1000);
//	  WebElement mytime = driver.findElement(By.id("menu_time_viewTimeModule"));
//	  mytime.click();
//	  Thread.sleep(1000);
//	  WebElement myAtendence = driver.findElement(By.id("menu_attendance_Attendance"));
//	  myAtendence.click();
//  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(2000);
	 driver.quit(); 
	  
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
