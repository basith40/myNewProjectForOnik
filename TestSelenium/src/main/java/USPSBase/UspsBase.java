package USPSBase;
import org.testng.annotations.Test;
import Utilities.UspsLoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
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

public class UspsBase {
	public WebDriver driver;
	UspsLoginPage usps = new UspsLoginPage();
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
	  driver = new ChromeDriver();
	  driver.get(usps.get("url"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  public void signin(String click) {
		WebElement sign = driver.findElement(By.id("login-register-header"));
		sign.click();
	}
//  public void search(String qTools, String location) throws Exception {
//	  Thread.sleep(1000);
//	  WebElement sElement = driver.findElement(By.xpath("//*[@id=\"g-navigation\"]/div/nav/ul/li[1]/a[2]"));
//	  sElement.click();
//	  Thread.sleep(1000);
//	  WebElement locElement = driver.findElement(By.xpath("//*[@id=\"g-navigation\"]/div/nav/ul/li[1]/div/ul/li[3]/a"));
//	  locElement.click();
//  }
  public void login(String username, String password, String click) throws Exception {
		Thread.sleep(1000);
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys(username);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
		WebElement put = driver.findElement(By.id("btn-submit"));
		put.click();
	}
  public void recovery(String recov) throws Exception {
		Thread.sleep(1000);
		WebElement rec = driver.findElement(By.className("style-guide"));
		rec.click();
	}
  public void email(String mEmail, String conti) {
		WebElement memail = driver.findElement(By.id("temail"));
		memail.sendKeys(mEmail);
		WebElement click = driver.findElement(By.id("btn-submit"));
		click.click();
	}

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(1000);
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
