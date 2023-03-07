package bdTech.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MobilTest {
	@Test
	public void application() {
		System.out.println("application");
		System.out.println("for git");
	}
	@Test
	public void start() {
		System.out.println("start");
		WebDriver driver = new ChromeDriver();
		driver.get("https//:youtube.com");
	}


}
