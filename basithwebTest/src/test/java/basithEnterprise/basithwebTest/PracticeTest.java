package basithEnterprise.basithwebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;public class PracticeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement footerTabs = driver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		System.out.println(footerTabs.findElements(By.tagName("a")).size());
		for(int i = 1; i<footerTabs.findElements(By.tagName("a")).size(); i++) {
			String tabsClick = Keys.chord(Keys.COMMAND,Keys.RETURN);
			footerTabs.findElements(By.tagName("a")).get(i).sendKeys(tabsClick);
		}

		

	}

}
