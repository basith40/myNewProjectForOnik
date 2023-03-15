package bdTech.E2EProject;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import PageObjests.Base;
import PageObjests.LandingPage;
import PageObjests.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class E2EProjectTest extends Base{
	
	@Test(dataProvider = "getData")
	
	public void baseNavigation(String userName, String password) throws InterruptedException{		
		LoginPage login = new LoginPage(driver);
		login.userid().sendKeys(userName);
		login.password().sendKeys(password);
		login.loginClick().click();
		LandingPage lPage = new LandingPage(driver);
		AssertJUnit.assertEquals(lPage.getdTitle().getText(), "Dashboard");
		AssertJUnit.assertTrue(lPage.manu().isDisplayed());

		
		

	}
  
 

@BeforeMethod
  public void beforeMethod() throws Exception {
	driver = initalizeDriver();
	driver.get(prop.getProperty("url"));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 driver.quit();
	 Thread.sleep(4000);
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
  public Object[][] getData() {
	  Object [][] data = new Object [1][2];
	  data [0][0]= "Admin";
	  data [0][1]= "admin123";
	  
	  return data;
  }
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }

}
