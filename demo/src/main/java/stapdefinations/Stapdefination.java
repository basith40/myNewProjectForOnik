package stapdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import resources.SauceBase;

public class Stapdefination extends SauceBase{
	WebDriver driver;
	@Given("Browse the saucedemo website")
	public void browse_the_saucedemo_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com");
	    throw new io.cucumber.java.PendingException();
	}
	@Given("login with difrent username")
	public void login_with_difrent_username() {
	    
	    throw new io.cucumber.java.PendingException();
	}
	@When("I input standard_user and secret_sauce")
	public void i_input_standard_user_and_secret_sauce() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I verify the status in step")
	public void i_verify_the_status_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
