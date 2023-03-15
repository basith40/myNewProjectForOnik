package Chowdhury;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safariDriverTest {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.safari.driver", "/Users/chowdhury");
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		

	}

}
