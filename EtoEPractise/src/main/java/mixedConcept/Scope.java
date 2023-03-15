package mixedConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		Assert.assertEquals(driver.findElements(By.tagName("a")).size(), 27);
		WebElement footer = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		Assert.assertEquals(footer.findElements(By.tagName("a")).size(), 20);
		WebElement column = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		Assert.assertEquals(column.findElements(By.tagName("a")).size(), 5);
		 
		for(int i = 1; i<column.findElements(By.tagName("a")).size(); i++) {
			String linksclick = Keys.chord(Keys.COMMAND, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(linksclick);
			
		}
		Set<String>pageses = driver.getWindowHandles();
		Iterator<String>it = pageses.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
