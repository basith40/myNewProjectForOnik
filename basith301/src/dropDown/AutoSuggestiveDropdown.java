package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("me");
		List<WebElement> options = driver.findElements(By.cssSelector("#nav-flyout-searchAjax div"));
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("mens socks")) {
				option.click();
			}
				
			}
		}
		//driver.findElement(By.cssSelector(".nav-search-submit.nav-sprite")).click();

	}


