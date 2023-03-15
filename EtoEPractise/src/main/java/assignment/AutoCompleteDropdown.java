package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		List<WebElement>country = driver.findElements(By.cssSelector(".ui-menu-item"));
		for(WebElement myCountry: country) {
			if(myCountry.getText().equals("United Arab Emirates")) {
				myCountry.click();
			}
		}

	}

}
