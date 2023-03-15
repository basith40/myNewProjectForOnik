package basith301;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestChrome {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/basith301/Downloads/chromedriver");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new SafariDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
	

	}

}
