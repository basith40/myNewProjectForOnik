package Chowdhury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SchoolTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement chackBoxElement = driver.findElement(By.id("checkBoxOption1"));
		chackBoxElement.click();
		Thread.sleep(2000);
		System.out.println(chackBoxElement.isSelected());
		WebElement unChackBoxElement = driver.findElement(By.id("checkBoxOption1"));
		unChackBoxElement.click();
		System.out.println(unChackBoxElement.isSelected());
		System.out.println(driver.findElements(By.cssSelector("div[id='checkbox-example'] label")).size());

	}
	
}
