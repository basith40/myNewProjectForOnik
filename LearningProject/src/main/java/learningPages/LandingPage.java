package learningPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import learningPageBase.PageBase;

public class LandingPage extends PageBase{
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	public void login() {
		WebElement singin = driver.findElement(By.id("nav_ya_signin"));
		singin.click();
	}
	

}
