package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdtuch.EProject.PageBase;
import bsh.This;

public class LoginPageUserName extends PageBase{

	public LoginPageUserName(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "ap_email")
	WebElement email;
	@FindBy(id = "continue")
	WebElement next;
	
	public WebElement id() {
		return email;
	}
	public WebElement pageNext() {
		return next;
	}

}
