package actionsInSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleInselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement page1 = driver.findElement(By.cssSelector(".blinkingText"));
		page1.click();
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String window1 = it.next();
		String window2 = it.next();
		driver.switchTo().window(window2);
		String id = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(id);
		driver.switchTo().window(window1);
		driver.findElement(By.cssSelector("#username")).sendKeys(id);

	}

}
