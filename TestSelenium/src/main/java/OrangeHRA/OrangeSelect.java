package OrangeHRA;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeSelect {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login("admin", "admin123", "btnLogin");
		user("menu_admin_viewAdminModule", "menu_admin_viewSystemUsers");
		

	}
	public static void login(String name, String password, String click) throws Exception {
		
		Thread.sleep(2000);
		WebElement id = driver.findElement(By.id("txtUsername"));
		id.sendKeys(name);
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);
		
		Thread.sleep(2000);
		WebElement run = driver.findElement(By.id("btnLogin"));
		run.click();
		
		
	}
	public static void user(String admin, String owner) throws Exception {
		Thread.sleep(2000);
		WebElement ad = driver.findElement(By.id("menu_admin_viewAdminModule"));
		ad.click();
		Thread.sleep(2000);
		WebElement own = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		own.click();
	}
	

}
