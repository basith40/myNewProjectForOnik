package practice;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSplit {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String[] items = { "Sauce Labs Bolt T-Shirt", "Sauce Labs Onesie", "Sauce Labs Fleece Jacket" };
		List<WebElement> opton = driver.findElements(By.cssSelector(".inventory_item_description a"));
		for (int i = 0; i < opton.size(); i++) {
			String myopton = opton.get(i).getText();
			List<String> myitems = Arrays.asList(items);
			if (myitems.contains(myopton)) {
				driver.findElements(By.cssSelector(".pricebar button")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	}
}
