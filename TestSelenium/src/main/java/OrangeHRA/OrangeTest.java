package OrangeHRA;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeTest {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		login("admin", "admin123", "btnLogin");
		
		admin("Admin", "menu_admin_viewSystemUsers");
		


	}
	public static void login(String userid,String passward, String clic) {
		WebElement id = driver.findElement(By.id("txtUsername"));
		id.sendKeys(userid);
		WebElement pass = driver.findElement(By.id("txtPassword")); 
		pass.sendKeys(passward);
		WebElement pos = driver.findElement(By.id("btnLogin"));
		pos.click();
			 
	}
	public static void admin(String manu, String subManu) {
		WebElement main = driver.findElement(By.linkText(manu));
		main.click();
		WebElement sub = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		sub.click();
	}

}
