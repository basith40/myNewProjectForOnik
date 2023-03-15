package OrangeHRAPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HraVerifyPage extends PageBasse{

	public HraVerifyPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement verify = driver.findElement(By.xpath("//*[@id=\"confirm_password\"]"));
	WebElement verifyclick = driver.findElement(By.xpath("//*[@type='password']"));
	public void verify() throws Exception {
		Thread.sleep(1000);
		verify.sendKeys("admin123");
	}
	public void verifyclick() throws Exception {
		Thread.sleep(1000);
		verifyclick.click();
	}
	public void verifyMain() throws Exception {
		verify();
		verifyclick();
	}

}
