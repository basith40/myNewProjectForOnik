package uberPagesTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StandAlon2Test {
	@Test
	public void uberpages() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uber.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Eat']")));
		driver.findElement(By.xpath("//span[text()='Eat']")).click();
		driver.findElement(By.cssSelector("[text='Order now']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		it.next();
		String childUrl = it.next();
		driver.switchTo().window(childUrl);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got it']")));
		driver.findElement(By.xpath("//button[text()='Got it']")).click();
		List<WebElement> country = driver.findElements(By.cssSelector(".h6"));
		WebElement dCountry = country.stream()
				.filter(myCountry -> myCountry.findElement(By.cssSelector("span")).getText().equals("Canada")).findAny()
				.orElse(null);
		dCountry.findElement(By.cssSelector("span")).click();
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.cssSelector("#location-typeahead-home-input")), "jamaica avenue").build()
				.perform();
	}

}
