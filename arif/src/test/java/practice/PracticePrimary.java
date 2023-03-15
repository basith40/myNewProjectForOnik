package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePrimary {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hat for man");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector(".a-spacing-base")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}
}
