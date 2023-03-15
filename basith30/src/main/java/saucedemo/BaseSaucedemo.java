package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseSaucedemo {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";
		data[1][0] = "ocked_out_user";
		data[1][1] = "secret_sauce";
		data[2][0] = "problem_user";
		data[2][1] = "secret_sauce";
		data[3][0] = "performance_glitch_user";
		data[3][1] = "secret_sauce";
		return data;
	}

	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {

	}

	@BeforeTest
	public void beforeTest() {
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {

	}

	@BeforeSuite
	public void beforeSuite() {
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
