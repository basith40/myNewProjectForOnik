package miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MiscellaneousTest {
	@Test
	public void calanderPractice() throws IOException, InterruptedException {
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("firefox");
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.174:4444"), caps);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.kayak.com/");		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[title='Sign in with Google Dialog']"))));
		driver.switchTo().frame(driver.findElement(By.cssSelector("[title='Sign in with Google Dialog']")));
		driver.findElement(By.cssSelector("#close path")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("span[aria-label='Start date calendar input']")).click();		
		while (!driver.findElement(By.cssSelector(".wHSr-monthName")).getText().contains("December")) {
			driver.findElement(By.cssSelector("button[aria-label='Next Month']")).click();
		}
		List<WebElement> date = driver.findElements(By.cssSelector(".onx_-days .mkUa"));
		for (int i = 0; i < date.size(); i++) {
			if (date.get(i).getText().equalsIgnoreCase("18")) {
				date.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("span[aria-label='End date calendar input']")).click();
		while (!driver.findElement(By.cssSelector(".wHSr-monthName")).getText().contains("January")) {
			driver.findElement(By.cssSelector("button[aria-label='Next Month']")).click();
		} 		
		List<WebElement> rDate = driver.findElements(By.cssSelector(".onx_-days .mkUa"));
		for (WebElement returnDate : rDate) {
			if (returnDate.getText().equalsIgnoreCase("25")) {
				returnDate.click();
				break;
			}
		}		
		File ssFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssFile, new File("/users/basith301/Downloads/kayak.png"));
		driver.close();
	}
}
