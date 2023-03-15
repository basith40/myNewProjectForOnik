package USPSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UspsloginPage extends PageBaseUSPS{
	
	public UspsloginPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement sign = driver.findElement(By.id("login-register-header"));
	public void sing() {
		sign.click();
	}

	
	 

}
