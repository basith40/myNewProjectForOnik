package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdtuch.EProject.PageBase;

public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#txtUsername")
	WebElement userId;
	@FindBy(css = "#txtPassword")
	WebElement userPassword;
	@FindBy(css = "#btnLogin")
	WebElement loginButton;
	@FindBy(css = "#welcome")
	WebElement adminHomePage;
	
	
	public WebElement id() {
		return userId;
	
	}
	public WebElement password() {
		return userPassword;
	}
	public WebElement login() {
		return loginButton;
	}
	public WebElement adminHome() {
		return adminHomePage;
	}

}
