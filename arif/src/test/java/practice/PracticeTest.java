package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class PracticeTest {

	WebDriver driver;

	@Test
	public void myTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// landing site.
		driver.get("https://www.amazon.com");
		// item searching.
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hats for men");
		// item searching select.
		driver.findElement(By.id("nav-search-submit-button")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("img[alt=\"Carhartt Men's Knit Cuffed Beanie\"]")));
		// selected item page
		driver.findElement(By.cssSelector("img[alt=\"Carhartt Men's Knit Cuffed Beanie\"]")).click();
		// item quantity button.
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#a-autoid-0 .a-button-inner")).click();
		// item quantity select.
		List<WebElement> pees = driver.findElements(By.xpath("//div[@class='a-popover-wrapper']/div/ul/li"));
		pees.get(1).click();
		// item add to cart.
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		// check the right item.
		String cart = driver.findElement(By.cssSelector("#nav-cart-count-container")).getText();
		AssertJUnit.assertEquals(cart, "2");
		// go to the cart page.
		driver.findElement(By.cssSelector("#nav-cart")).click();
		// item price check.
		String total = driver.findElement(By.xpath("//div[@data-name='Subtotals']")).getText();
		AssertJUnit.assertEquals(total, "Subtotal (2 items): $39.98");
		// change item quantity.
		driver.findElement(By.xpath("//span[@data-a-class='quantity']")).click();
		List<WebElement> peesl = driver.findElements(By.xpath("//div[@class='a-popover-wrapper']/div/ul/li"));
		peesl.get(1).click();
		// check final price.
		Thread.sleep(3000);
		String ntotal = driver.findElement(By.xpath("//div[@data-name='Subtotals']")).getText();
		AssertJUnit.assertEquals(ntotal, "Subtotal (1 item): $19.99");
		driver.close();
	}

}
