package shopping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AcctionClassTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wegmans.com");
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//a[text()='Bakery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-delete")).click();
		driver.findElement(By.cssSelector("a[title='Breakfast']")).click();
		driver.findElement(By.cssSelector("img[id='xClose']")).click();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector("input[aria-haspopup='listbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("bagle").build().perform();
		ac.moveToElement(driver.findElement(By.cssSelector(".dropdown-toggle"))).build().perform();

	}

}
