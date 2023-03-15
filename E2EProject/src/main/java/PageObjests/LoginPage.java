package PageObjests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}

	By userid = By.id("txtUsername");
	By password = By.cssSelector("#txtPassword");
	By loginClick = By.xpath("//*[@value='LOGIN']");

	public WebElement userid() {
		return driver.findElement(userid);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement loginClick() {
		return driver.findElement(loginClick);
	}



}
