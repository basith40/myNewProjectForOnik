package bdTech.E2EProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTest {
	public static void main (String []args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://applications.labor.ny.gov/IndividualReg/");
		driver.findElement(By.cssSelector(".menu-3571.first")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> chang = window.iterator();
		String original = chang.next();
		String duplicate = chang.next();
		driver.switchTo().window(duplicate);
		System.out.println(driver.getTitle());
	}

}
