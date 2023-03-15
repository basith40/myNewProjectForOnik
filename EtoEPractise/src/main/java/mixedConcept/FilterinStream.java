package mixedConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterinStream {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("search-field")).sendKeys("Potato");
		List<WebElement>vagis = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>newVagi = vagis.stream().filter(vagi->vagi.getText().contains("Potato")).collect(Collectors.toList());
		Assert.assertEquals(vagis.size(), newVagi.size());

	}

}
