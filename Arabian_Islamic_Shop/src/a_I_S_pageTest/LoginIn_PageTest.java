package a_I_S_pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginIn_PageTest {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://arabianshoppingzone.com");
		driver.findElement(By.className("site-header__account")).click();
		driver.findElement(By.id("CustomerEmail")).sendKeys("ma@yahoo.com");
		driver.findElement(By.name("customer[password]")).sendKeys("Sylhet23");
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".shopify-challenge__button")).click();
		System.out.println(driver.findElement(By.cssSelector(".errors")).getText());
		driver.findElement(By.cssSelector(".site-header__logo-image")).click();
	    driver.quit();

	}

}
