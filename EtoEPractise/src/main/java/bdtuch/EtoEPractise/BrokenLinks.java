package bdtuch.EtoEPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert sa = new SoftAssert();
		for(WebElement link: links) {
			String ml = link.getAttribute("href");
			HttpURLConnection hC = (HttpURLConnection)new URL(ml).openConnection();
			hC.setRequestMethod("HEAD");
			hC.connect();
			int linkCode = hC.getResponseCode();
			System.out.println(linkCode);
			sa.assertTrue(linkCode<400, "the link text "+link.getText()+" is broken code "+linkCode);
			
		}
		sa.assertAll();

	}

}
