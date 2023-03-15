package basith301.SeleniumFramework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.wegmans.com/");
		String link = driver.findElement(By.cssSelector("a[href*='events']")).getAttribute("href");	
		HttpURLConnection huc = (HttpURLConnection)new URL(link).openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();
		int num = huc.getResponseCode();
		System.out.println(num);
		driver.quit();

	}

}
