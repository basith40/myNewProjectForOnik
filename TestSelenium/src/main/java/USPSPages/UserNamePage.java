package USPSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.UspsLoginPage;

public class UserNamePage extends PageBaseUSPS{
	UspsLoginPage usps = new UspsLoginPage();

	public UserNamePage(WebDriver driver) {
		super(driver);
		
	}
	WebElement id = driver.findElement(By.id("username"));
	WebElement pass = driver.findElement(By.id("password"));
	WebElement put = driver.findElement(By.id("btn-submit"));
	
	public void id() throws Exception {
		Thread.sleep(1000);
		id.sendKeys(usps.get("username"));
	}
	
	public void pass() throws Exception {
		Thread.sleep(1000);
		pass.sendKeys(usps.get("password"));
	}
	
	public void put() throws Exception {
		Thread.sleep(1000);
		put.click();
	}
	
	public void login1() throws Exception {
		id();
		pass();
		put();
	}
   
		
	

}
