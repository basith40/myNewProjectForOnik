package arifProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ArifPageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

}
