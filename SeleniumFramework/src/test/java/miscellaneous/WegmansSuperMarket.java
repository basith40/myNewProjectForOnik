package miscellaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WegmansSuperMarket {
	@Test
	public void shoppingWegmans() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://shop.wegmans.com/shop/categories/75");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id*='close-click']")));
		driver.findElement(By.cssSelector("button[id*='close-click']")).click();
		driver.findElement(By.cssSelector("#xClose")).click();
		List<WebElement> fruits = driver.findElements(By.cssSelector("div[data-test='product-cell']"));
		for (WebElement mFruit : fruits) {
			String name = mFruit.findElement(By.cssSelector(".css-1ylu0bo button div")).getText();
			System.out.println(name);
		}
		driver.close();
	}

}
