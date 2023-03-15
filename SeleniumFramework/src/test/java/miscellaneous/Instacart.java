package miscellaneous;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Instacart {
	@Test
	public void shopping() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities(options);
		caps.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.174:4444"),caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instacart.com/store/sams-club/storefront");
		List<WebElement> allItems = driver.findElements(By.cssSelector("div[aria-label='item carousel'] ul li"));
		List<WebElement> myItem = allItems.stream().filter(item -> item.getText().contains("Chicken Bites"))
				.collect(Collectors.toList());
		myItem.forEach(b -> b.click());
		myItem.forEach(a -> System.out.println(a));
		driver.close();

	}


}
