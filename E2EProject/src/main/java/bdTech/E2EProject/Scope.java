package bdTech.E2EProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footeer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footeer.findElements(By.tagName("a")).size());
		WebElement footerColmun = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(footerColmun.findElements(By.tagName("a")).size());
		
		for (int i = 1; i < footerColmun.findElements(By.tagName("a")).size(); i++) {
			String tab = Keys.chord(Keys.COMMAND,Keys.RETURN);
			footerColmun.findElements(By.tagName("a")).get(i).sendKeys(tab);			
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
