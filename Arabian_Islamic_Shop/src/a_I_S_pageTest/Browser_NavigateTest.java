package a_I_S_pageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_NavigateTest {
	@Test
	public void pageNavigate() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.ajmalperfume.com/uae_en/");
		driver.navigate().to("https://arabianshoppingzone.com");
		driver.navigate().back();
		driver.close();

	}

}
