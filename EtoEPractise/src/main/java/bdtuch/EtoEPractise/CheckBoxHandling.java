package bdtuch.EtoEPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement checkBox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		Assert.assertTrue(true);
		int box = driver.findElements(By.cssSelector("*[type='checkbox']")).size();
		System.out.println(box);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
