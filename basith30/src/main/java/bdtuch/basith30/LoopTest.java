package bdtuch.basith30;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.target.com/c/grocery-deals/-/N-k4uyq");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] myItems = { "Blueberries", "Driscoll's Raspberries", "Dasani Purified Water" };
		List<WebElement> items = driver.findElements(By.cssSelector("a[data-test='product-title']"));

		for (int i = 0; i < items.size(); i++) {
			String[] itemsneeded = items.get(i).getText().split("-");
			String product = itemsneeded[0].trim();
			List<String> myListonbjs = Arrays.asList(myItems);

			if (myListonbjs.contains(product)) {
				driver.findElement(By.cssSelector("button[data-test='quantity-picker-atc-button']")).click();
			}

		}

	}

}
