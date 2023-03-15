package miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Booking {
	WebDriverWait wait;

	
	@Test
	public void flightBooking() throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://www.booking.com/");
		WebElement box = driver.findElement(By.cssSelector("[role='dialog'] span.b9def0936d "));
		if (box.isDisplayed()) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[role='dialog'] span.b9def0936d")));
			box.click();
		}
			WebElement footer = driver.findElement(By.cssSelector("#footer"));
			System.out.println(footer.findElements(By.tagName("a")).size());
			WebElement coulmn = footer.findElement(By.cssSelector("ul"));
			System.out.println(coulmn.findElements(By.tagName("a")).size());
			
		for (int i = 0; i < coulmn.findElements(By.tagName("a")).size(); i++) {
			String clickToLink = Keys.chord(Keys.COMMAND, Keys.ENTER);
			coulmn.findElements(By.tagName("a")).get(i).sendKeys(clickToLink);
		}
		Thread.sleep(3000);// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
	
}
	@Test
	public void pageHendle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> hendle = driver.getWindowHandles();
		Iterator<String> iterator = hendle.iterator();
		String fatherString = iterator.next();
		String childString = iterator.next();
		driver.switchTo().window(childString);
		driver.get("https://www.saucedemo.com/");
		String textString = driver.findElement(By.cssSelector(".login_password h4")).getText();
		driver.switchTo().window(fatherString);
		driver.findElement(By.cssSelector("[name='ss']")).sendKeys(textString);
		driver.quit();
	}

	
	@Test
	public void multiWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> henSet = driver.getWindowHandles();
		Iterator<String> it = henSet.iterator();
		String page1 = it.next();
		String page2 = it.next();
		driver.switchTo().window(page2);
		driver.get("https://www.saucedemo.com/");
		String id = driver.findElement(By.cssSelector(".login_password h4")).getText();
		driver.switchTo().window(page1);
		driver.findElement(By.cssSelector("[name='ss']")).sendKeys(id);
		driver.quit();
	}

	
	@Test
	public void cookidelate() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.booking.com/");
		driver.close();
	}

	
	@Test
	public void rLocator() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/");
		WebElement text = driver.findElement(By.cssSelector("p[data-testid='herobanner-subtitile']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("span")).above(text)).getText());
		driver.close();
	}

}
