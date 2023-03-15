package basith.projectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hats for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread .sleep(3000);
		driver.findElement(By.xpath("//*[contains(@class,'s-main-slot')]/div[3] ")).click();
		driver.findElement(By.cssSelector(".a-dropdown-label")).click();

	}

}
