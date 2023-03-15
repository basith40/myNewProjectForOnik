package Chowdhury;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class OrangeHraTest {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login("admin", "admin123", "btnLogin");
		user("menu_admin_viewAdminModule");
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		Select select = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("1");
		Thread.sleep(2000);
		WebElement src =  driver.findElement(By.id("searchBtn"));
		src.click();
		performance("menu__Performance", "menu_performance_Configure");
		Select select2 = new Select(driver.findElement(By.id("menu_performance_addPerformanceTracker")));
		Thread.sleep(2000);
		select2.selectByVisibleText("Trackers");
		

	}

	public static void login(String username, String password, String click) throws Exception {
		Thread.sleep(1000);
		WebElement id = driver.findElement(By.id("txtUsername"));
		id.sendKeys(username);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);
		WebElement put = driver.findElement(By.id("btnLogin"));
		put.click();
	}
	public static void user(String admin) throws Exception {
		Thread.sleep(1000);
		WebElement ad = driver.findElement(By.id("menu_admin_viewAdminModule"));
		ad.click();
	}
	public static void performance(String seperformance, String sel) throws Exception {
		Thread.sleep(2000);
		WebElement per = driver.findElement(By.id("menu__Performance"));
		per.click();
		Thread.sleep(2000);
		WebElement se = driver.findElement(By.id("menu_performance_Configure"));
		se.click();
	}

}
