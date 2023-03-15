package websiteInspect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test

	public void amazon() throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ap_email")));
		driver.findElement(By.id("ap_email")).sendKeys("67482341");
		driver.findElement(By.className("a-button-input")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("li span")));
		System.out.println(driver.findElement(By.cssSelector("li span")).getText());
		driver.findElement(By.cssSelector("a[data-action='a-expander-toggle']")).click();
		driver.findElement(By.cssSelector("#auth-fpp-link-bottom")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("form p")));
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		// Assert.assertEquals(driver.findElement(By.cssSelector("form
		// p")).getText(),"Enter the email address or mobile phone number associated
		// with your Amazon account.");
		driver.close();
		// driver.findElement(By.className("hm-icon nav-sprite")).click();
		// driver.findElement(By.cssSelector(".hm-icon.nav-sprite")).click();
		// driver.findElement(By.cssSelector("#nav-search-dropdown-card")).click();
		// driver.quit();

	}

}
