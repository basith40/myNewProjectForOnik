package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leson3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shukronline.com");
		/*driver.findElement(By.xpath("//*[@id=\'CustomerEmail\']")).sendKeys("basith301@yahoo");
		driver.findElement(By.xpath("//*[@id=\'CustomerPassword\']")).sendKeys("Shammi1982!");
		driver.findElement(By.xpath("//*[@id=\'customer_login\']//div//input")).click();
		driver.findElement(By.xpath("//*[@id=\'header__account-btn\']/span")).click();*/
		driver.findElement(By.cssSelector("span[class*='label']")).click();
		driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("basith301");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("3823Sylhet");
		driver.findElement(By.cssSelector("button[title*='Sign in']")).click();

	}

}
