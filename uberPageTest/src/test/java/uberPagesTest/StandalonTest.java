package uberPagesTest;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StandalonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ubereats.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.xpath("//span[text()='Eat']")).click();
//		driver.findElement(By.cssSelector("[text='Order now']")).click();
		driver.findElement(By.xpath("//button[text()='Got it']")).click();
		List<WebElement> country = driver.findElements(By.cssSelector(".h6"));
		WebElement dCountry = country.stream()
				.filter(myCountry -> myCountry.findElement(By.cssSelector("span")).getText().equals("Canada")).findAny()
				.orElse(null);
		dCountry.findElement(By.cssSelector("span")).click();
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.cssSelector("#location-typeahead-home-input")), "jamaica avenue").build()
				.perform();
		// uber();
		
		 driver.close();
		
		
	}

	public static void uber() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uber.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-cDENyl")));
		driver.findElement(By.cssSelector(".css-cDENyl")).click();
		List<WebElement> headerManu = driver.findElements(By.cssSelector("ul li.css-bjyRXz"));
		WebElement manu = headerManu.stream()
				.filter(myManu -> myManu.findElement(By.cssSelector("button")).getText().equals("Company")).findAny()
				.orElse(null);
		manu.findElement(By.cssSelector(".css-cVUGbb")).click();

	}
	

	

}
