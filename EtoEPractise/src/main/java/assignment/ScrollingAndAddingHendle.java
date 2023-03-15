package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAndAddingHendle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		jse.executeScript("document.querySelector('.table-display').bgColor");
		WebElement table = driver.findElement(By.id("product"));
		System.out.println("Table Rows is: "+table.findElements(By.tagName("tr")).size());
		System.out.println("Table column is: "+table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		System.out.println("Table text is: "+table.findElements(By.tagName("tr")).get(4).getText());
		

	}

}
