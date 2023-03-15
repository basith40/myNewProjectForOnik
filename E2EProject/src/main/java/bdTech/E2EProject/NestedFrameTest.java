package bdTech.E2EProject;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NestedFrameTest {
	WebDriver driver;

	@Test
	public void neatedFrame() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.id("navFooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footercolumn = driver
				.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());

		for (int i = 1; i < footercolumn.findElements(By.tagName("a")).size(); i++) {
			String keybord = Keys.chord(Keys.COMMAND, Keys.RETURN);
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(keybord);
			Thread.sleep(4000);
		}
		Set<String> linkSet = driver.getWindowHandles();
		Iterator<String> lPages = linkSet.iterator();
		while (lPages.hasNext()) {
			driver.switchTo().window(lPages.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();

	}

}
