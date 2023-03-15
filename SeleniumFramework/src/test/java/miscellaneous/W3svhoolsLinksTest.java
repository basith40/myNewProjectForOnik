package miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3svhoolsLinksTest {
	@Test
	public void nycPortal() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://portal.311.nyc.gov/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.cssSelector("ul[class='footerLinks']"));
		footer.findElements(By.tagName("a"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		for (int i = 0; i < footer.findElements(By.tagName("a")).size(); i++) {
			String clickonlinks = Keys.chord(Keys.COMMAND, Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
		}
		Set<String> wnSet = driver.getWindowHandles();
		Iterator<String> it = wnSet.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		driver.quit();

	}

}
