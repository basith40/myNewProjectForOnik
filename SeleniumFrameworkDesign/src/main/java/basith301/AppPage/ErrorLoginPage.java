package basith301.AppPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basith301.AbstractComponents.AbstractComponents;

public class ErrorLoginPage extends AbstractComponents{
	WebDriver driver;
	public ErrorLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(css="#userEmail")
	WebElement userEmail;
	@FindBy(css="#userPassword")
	WebElement userPassword;
	@FindBy(css="#login")
	WebElement loginButton;
	@FindBy(css = "div[class*='toast-error']")
	WebElement errorMessage;
	
	public void loginto(String myEmail, String myPassword) {
		userEmail.sendKeys(myEmail);
		userPassword.sendKeys(myPassword);
		loginButton.click();
		
	}
	public String message() {
		waitForElementToAppearp(errorMessage);
		String emessage = errorMessage.getText();
		return emessage;
	}

}
