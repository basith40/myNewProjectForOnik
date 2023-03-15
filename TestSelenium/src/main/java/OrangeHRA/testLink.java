package OrangeHRA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class testLink {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, Exception {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
//		driver.findElement(By.id("txtUsername")).sendKeys("admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		List<WebElement> links = driver.findElements(By.cssSelector("div[id='nav-xshop'] a"));
		SoftAssert sAssert = new SoftAssert();

		for (WebElement pagelink : links) {
			String url = pagelink.getAttribute("href");
			System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();

			System.out.println(respCode);
			sAssert.assertTrue(respCode < 400,
					"The link with text " + pagelink.getText() + "the link is brokin" + respCode);

		}
		sAssert.assertAll();

	}
	//("div[id='nav-xshop']")
	// li[class*="main"]
	// <a href="/index.php/recruitment/viewRecruitmentModule"
	// id="menu_recruitment_viewRecruitmentModule"
	// class="firstLevelMenu"><b>Recruitment</b></a>

}
