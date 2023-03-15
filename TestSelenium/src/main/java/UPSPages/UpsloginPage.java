package UPSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsloginPage extends PageBaseUPS{

	public UpsloginPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement log = driver.findElement(By.xpath("//*[@id=\"ups-navigation-container\"]/nav[1]/ul/li[4]/a"));
	public void log() throws Exception {
		Thread.sleep(1000);
		log.click();
	}
			

}
