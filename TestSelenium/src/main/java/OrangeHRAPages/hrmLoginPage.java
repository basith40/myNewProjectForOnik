package OrangeHRAPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hrmLoginPage extends PageBasse{
	
		public hrmLoginPage(WebDriver driver) {
		super(driver);
		
	}

		WebElement id = driver.findElement(By.id("txtUsername"));
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		
		WebElement put = driver.findElement(By.id("btnLogin"));
		
		public void id() throws Exception {
			Thread.sleep(1000);
			id.sendKeys("Admin");
		}
		public void pass() throws Exception {
			Thread.sleep(1000);
			pass.sendKeys("admin123");
		}
		public void put() throws Exception {
			Thread.sleep(1000);
			put.click();
		}
		public void login() throws Exception {
			id();
			pass();
			put();
		}
	

	

}
