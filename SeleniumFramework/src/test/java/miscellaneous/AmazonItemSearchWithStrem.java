package miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonItemSearchWithStrem {
	@Test(enabled = true)
	public void itemSearch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Rice");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		List<WebElement> items = driver.findElements(By.cssSelector("[data-component-type='s-search-results'] h2 a"));
		items.stream().filter(rice -> rice.getText().contains("Royal Basmati")).collect(Collectors.toList())
				.forEach(b -> b.click());
		driver.close();

	}
	
	@Test
	public void wHendel() throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.TAB);		
		Set<String>handels = driver.getWindowHandles();
		Iterator<String>it = handels.iterator();
		String org = it.next();
		String ne = it.next();
		driver.switchTo().window(ne);
		driver.get("https://www.saucedemo.com/");
		String te = driver.findElement(By.cssSelector("#login_credentials h4")).getText();
		driver.switchTo().window(org);
		WebElement searchElement = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchElement.sendKeys(te);
		File screenshot = searchElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("he.png"));
		driver.quit();
		
	}

}
