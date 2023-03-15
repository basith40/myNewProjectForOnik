package UPSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiginPage extends PageBaseUPS{

	public SiginPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement userName = driver.findElement(By.id("email"));
	WebElement passWord = driver.findElement(By.name("password"));
	WebElement click = driver.findElement(By.cssSelector("*[type='submit']"));
	
	public void userName() throws Exception {
		Thread.sleep(1000);
		userName.sendKeys("basith301");
	}
	public void passWord() throws Exception {
		Thread.sleep(1000);
		passWord.sendKeys("302Basith");
	}
	
	public void click() throws Exception {
		Thread.sleep(1000);
		click.click();
	}
	public void sigin() throws Exception {
		userName();
		passWord();
		click();
	}

}
