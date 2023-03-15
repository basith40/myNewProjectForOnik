package sauce.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.SaucePageBase;

public class SauceLoginPage extends SaucePageBase{
	public SauceLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#user-name")
	WebElement userName;
	@FindBy(css="#password")
	WebElement uPassword;
	@FindBy(css="#login-button")
	WebElement login;
	
	
	public WebElement id() {
		return userName;
	}
	public WebElement pass() {
		return uPassword;
	}
	public WebElement click() {
		return login;
	}

}
