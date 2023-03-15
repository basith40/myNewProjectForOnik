package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import PageObjests.Base;
import PageObjests.LandingPage;
import PageObjests.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base{
	WebDriver driver;
	@Given("Website initialize with chrome browser")
	public void website_initialize_with_chrome_browser() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		//driver = new ChromeDriver();
		driver = initalizeDriver();
	}

	@When("Navigate to the {string} site")
	public void navigate_to_the_site(String string) {
		driver.get(string);
	}

	

	@And("^Admin input userid (.+) and user password (.+) and Click login botton$")
    public void admin_input_userid_and_user_password_and_click_login_botton(String username, String password) throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.userid().sendKeys(username);
		login.password().sendKeys(password);
		login.loginClick().click();
    }

	@Then("Admin can see there homepage with his name")
	public void admin_can_see_there_homepage_with_his_name() {
		LandingPage lPage = new LandingPage(driver);
		Assert.assertEquals(lPage.getdTitle().getText(), "Dashboard");
		Assert.assertTrue(lPage.manu().isDisplayed());
	}
	@Then("close driver")
	public void close_driver() {
	    driver.quit();
	}

}
