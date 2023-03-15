package sauce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.SaucePageBase;

public class ChackoutInformationPage {
	public WebDriver driver;

	public ChackoutInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	By buyerFirstName = By.id("first-name");
	By buyerLastName = By.id("last-name");
	By zipcode = By.id("postal-code");
	By continueButton = By.cssSelector("#continue");
	
	
	public WebElement firstName() {
		return driver.findElement(buyerFirstName);
	}
	public WebElement lastName() {
		return driver.findElement(buyerLastName);
	}
	public WebElement myZip() {
		return driver.findElement(zipcode);
	}
	public WebElement conButton() {
		return driver.findElement(continueButton);
	}

}
