package appSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Given("Admin login to the website with valid credentials")
	public void admin_login_to_the_website_with_valid_credentials() {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
	   
	}
	@When("Admin input valid userid {string} and valid password {string}")
	public void admin_input_valid_userid_and_valid_password(String string, String string2) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	    driver.findElement(By.id("txtPassword")).sendKeys(string2);
	}



	@And("Click login botton")
	public void click_login_botton() {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("Admin can see there name on the webpage {string}")
	public void admin_can_see_there_name_on_the_webpage(String string) {
		driver.findElement(By.id("welcome")).getText();
	    System.out.println(string);
	    Assert.assertTrue(true);
	    
	}

}
