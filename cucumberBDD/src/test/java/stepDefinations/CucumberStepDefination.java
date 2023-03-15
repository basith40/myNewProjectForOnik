package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CucumberStepDefination {
	WebDriver driver;

	@Given("^User is on online website login page$")
	public void user_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	}

	@When("^User submit there userid and password$")
	public void user_input_id_and_password() {
		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("basithj@yahoo.com");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Shammi");
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		
		
	}

	@Then("^User can see the user homepage$")
	public void user_homepage() throws InterruptedException {
		Thread.sleep(3000);
		String text = driver.findElement(By.cssSelector("#auth-error-message-box")).getText();
		System.out.println(text);
		

	}

	@And("^User information detales$")
	public void user_information() {
		System.out.println("This is my Information");
	}

}
