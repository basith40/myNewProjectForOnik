package bdtuch.EtoEPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement suggestiveDropdown = driver.findElement(By.id("autosuggest"));
		suggestiveDropdown.sendKeys("us");
		Thread.sleep(3000);
		List<WebElement> cuntry = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement mycuntry : cuntry) {
			if(mycuntry.getText().equalsIgnoreCase("Cyprus")) {
				mycuntry.click();
			}			
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
