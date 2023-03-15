package miscellaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarPage {
	@Test
	public  void calendar() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.kayak.com/flights");
		driver.findElement(By.cssSelector("span[aria-label='Start date calendar input'] span.sR_k-prefixIcon")).click();
		while(!driver.findElement(By.cssSelector(".wHSr-monthName")).getText().contains("June")) {
			driver.findElement(By.cssSelector(".ATGJ-next-month .Iqt3-button-content")).click();
		}
		List<WebElement>departureday = driver.findElements(By.cssSelector(".mkUa"));		
		for(int i = 0; i< departureday.size(); i++) {
			if (departureday.get(i).getText().equalsIgnoreCase("4")) {
				departureday.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("span[aria-label='End date calendar input'] span.sR_k-prefixIcon")).click();
		while(!driver.findElement(By.cssSelector(".wHSr-monthName")).getText().contains("September")) {
			driver.findElement(By.cssSelector(".ATGJ-next-month .Iqt3-button-content")).click();
		}
		List<WebElement>arriveday = driver.findElements(By.cssSelector(".mkUa"));
		for(int i = 0; i< arriveday.size(); i++) {
			if (arriveday.get(i).getText().equalsIgnoreCase("30")) {
				arriveday.get(i).click();
				break;
			}
		}
		driver.close();

	}

}
