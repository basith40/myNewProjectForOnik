package a_I_S_pageTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_I_S_dropdownTest {
	@Test
	public void arabianShappong() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://arabianshoppingzone.com");
		driver.findElement(By.cssSelector(".doubly-wrapper")).click();
		driver.findElement(By.cssSelector("li[data-value='SAR']")).click();
		driver.close();

	}

}
