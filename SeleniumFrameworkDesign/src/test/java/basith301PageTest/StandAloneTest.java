package basith301PageTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAloneTest {
	public static void main(String[] args) {
		String myShopping = "IPHONE 13 PRO";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("basith301@yahoo.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("301Basith");
		driver.findElement(By.cssSelector("#login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".row .mb-3"))));
		List<WebElement> items = driver.findElements(By.cssSelector(".row .mb-3"));
		WebElement myItem = items.stream()
				.filter(item -> item.findElement(By.cssSelector("b")).getText().contains(myShopping)).findFirst()
				.orElse(null);
		myItem.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".overlay-container"))));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
		List<WebElement> myCart = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean mach = myCart.stream().anyMatch(product -> product.getText().equalsIgnoreCase(myShopping));
		Assert.assertTrue(mach);
		driver.findElement(By.cssSelector("ul[style*='none'] .btn.btn-primary")).click();
		Actions ac = new Actions(driver);
		ac.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "aus").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-group .ta-results")));
		driver.findElement(By.xpath("//*[text()=' Australia']")).click();
		driver.findElement(By.cssSelector("a[class*='action__submit']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".hero-primary")).getText(), "THANKYOU FOR THE ORDER.");
		driver.close();

	}

}
