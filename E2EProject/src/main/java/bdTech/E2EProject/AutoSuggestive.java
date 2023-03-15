package bdTech.E2EProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.delta.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"toAirportName\"]/span[1]")).click();
	driver.findElement(By.id("search_input")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement>options = driver.findElements(By.cssSelector("li[class*='airport-list'] a"));
		Thread.sleep(2000);
		for (WebElement option : options) {
			if(option.getText().equalsIgnoreCase("DEL")) {
				option.click();
				
			}
			
		}

	}

}
