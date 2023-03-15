package implicitAndexplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement itemSearch = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		itemSearch.sendKeys("iphone13");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		//wait.until(ExpectedConditions.titleIs("Showing results for iphone 13\n"
				//+ "Search instead for iphone13"));
	    System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-base a-spacing-top-medium']/div")).getText()
);

	}

}
